grammar myCompiler;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;

    // ============================================
    // Create a symbol table.
	// ArrayList is easy to extend to add more info. into symbol table.
	//
	// The structure of symbol table:
	// <variable ID, type, memory location>
	//    - type: the variable type   (please check "enum Type")
	//    - memory location: the location (locals in VM) the variable will be stored at.
    // ============================================
    HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();

    int labelCount = 0;
	
	
	// storageIndex is used to represent/index the location (locals) in VM.
	// The first index is 0.
	int storageIndex = 0;

	String printBuffer;
    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();

    // Type information.
    public enum Type{
       INT, FLOAT, CHAR;
    }


    /*
     * Output prologue.
     */
    void prologue()
    {
       TextCode.add(";.source");
       TextCode.add(".class public static myResult");
       TextCode.add(".super java/lang/Object");
       TextCode.add(".method public static main([Ljava/lang/String;)V");

       /* The size of stack and locals should be properly set. */
       TextCode.add(".limit stack 100");
       TextCode.add(".limit locals 100");
    }
    
	
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       TextCode.add("return");
       TextCode.add(".end method");
    }
    
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getTextCode()
    {
       return TextCode;
    }			
}

program: VOID MAIN '(' ')'
        {
           /* Output function prologue */
           prologue();
        }

        '{' 
           declarations
           statements
        '}'
        {
		   if (TRACEON)
		      System.out.println("VOID MAIN () {declarations statements}");

           /* output function epilogue */	  
           epilogue();
        }
        ;


declarations: type Identifier ';' declarations
              {
			     if (TRACEON)
	                System.out.println("declarations: type Identifier : declarations");

                 if (symtab.containsKey($Identifier.text)) {
				    // variable re-declared.
                    System.out.println("Type Error: " + 
                                       $Identifier.getLine() + 
                                       ": Redeclared identifier.");
                    System.exit(0);
                 }
                 
				 /* Add ID and its attr_type into the symbol table. */
				 ArrayList the_list = new ArrayList();
				 the_list.add($type.attr_type);
				 the_list.add(storageIndex);
				 storageIndex = storageIndex + 1;
                 symtab.put($Identifier.text, the_list);
              }
            | 
		      {
			     if (TRACEON)
                    System.out.println("declarations: ");
			  }
            ;


type
returns [Type attr_type]
    : INT { if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; }
    | CHAR { if (TRACEON) System.out.println("type: CHAR"); attr_type=Type.CHAR; }
    | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; }
	;

statements:statement statements
          |
          ;

statement: assign_stmt ';'
         | if_stmt
         | func_no_return_stmt ';'
         | for_stmt
		 | print ';'
         ;

//print: PRINTF '(' strstat  {System.out.println("QQ: " + $strstat.text);}
print: PRINTF '(' Words  
					{
						printBuffer = $Words.text; 
						printBuffer = printBuffer.replaceAll("\"", "");
					}
		(',' parameter )* ')' {
						TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
						TextCode.add("ldc \""+ printBuffer + "\"");
						TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		}
	;

parameter
	:	Identifier {
			    Type tmp = (Type) symtab.get($Identifier.text).get(0);
				String tmp_str;
				int index;
				switch (tmp) {
				case INT: 
				          // load the variable into the operand stack.
						index = printBuffer.indexOf("\%d");
						tmp_str = printBuffer.substring(0, index);
						TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
						TextCode.add("ldc \"" + tmp_str + "\"");
						TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
						TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				        TextCode.add("iload " + symtab.get($Identifier.text).get(1));
						TextCode.add("invokevirtual java/io/PrintStream/print(I)V");
						printBuffer = printBuffer.substring(index + 2);
				        break;
				case FLOAT:
						index = printBuffer.indexOf("\%f");
						tmp_str = printBuffer.substring(0, index);
						TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
						TextCode.add("ldc \"" + tmp_str + "\"");
						TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
						TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				        TextCode.add("fload " + symtab.get($Identifier.text).get(1));
						TextCode.add("invokevirtual java/io/PrintStream/print(F)V");
						printBuffer = printBuffer.substring(index + 2);
				        break;
				case CHAR:
				          TextCode.add("aload " + symtab.get($Identifier.text).get(1));
				          break;
				
				}
	}
	;

for_stmt: FOR '(' assign_stmt ';'
                  cond_expression ';'
				  assign_stmt
			   ')'
			      block_stmt
        ;
		 
		 
if_stmt
            : if_then_stmt if_else_stmt {TextCode.add("END:");}
            ;

	   
if_then_stmt
            : IF '(' cond_expression 
				')' block_stmt {TextCode.add("goto END");}
            ;


if_else_stmt
            : ELSE {TextCode.add("ELSE:");} block_stmt
            |
            ;

				  
block_stmt: '{' statements '}'
	  ;


assign_stmt: Identifier '=' arith_expression
             {
			   Type the_type;
			   int the_mem;
			   
			   // get the ID's location and type from symtab.			   
			   the_type = (Type) symtab.get($Identifier.text).get(0);
			   //System.out.println(the_type);
			   //System.out.println($arith_expression.attr_type);
			   the_mem = (int) symtab.get($Identifier.text).get(1);
			   //System.out.println(the_mem);

			   if (the_type != $arith_expression.attr_type) {
			      System.out.println("Type error!\n");
				  System.exit(0);
			   }
			   
			   // issue store insruction:
               // => store the top element of the operand stack into the locals.
			   switch (the_type) {
			   case INT:
			              TextCode.add("istore " + the_mem);
			              break;
			   case FLOAT:
			              TextCode.add("fstore " + the_mem);
			              break;
			   case CHAR:
			              TextCode.add("astore " + the_mem);
			              break;
			   }
             }
           ;

		   
func_no_return_stmt: Identifier '(' argument ')'
                   ;


argument: arg (',' arg)*
        ;

arg: arith_expression
   | STRING_LITERAL
   ;
		   
cond_expression
returns [boolean truth]
               : a=arith_expression
			     {
				    if ($a.attr_type.ordinal() != 0)
					   truth = true;
					else
					   truth = false;
				 }
                 b=RelationOP arith_expression
				 {
					switch($a.attr_type){
                         case INT:
							 switch($b.text){
                         	  case ">":
                             	  TextCode.add("if_icmplt ELSE");
                             	  break;
 						 	  case ">=":
                             	  TextCode.add("if_icmple ELSE");
                             	  break;
                         	  case "<":
                             	  TextCode.add("if_icmpgt ELSE");
 							 	  break;
                         	  case "<=":
                             	  TextCode.add("if_icmpge ELSE");
                             	  break;
                         	  case "==":
                             	  TextCode.add("if_icmpne ELSE");
                               	  break;
                        	  case "!=":
                        	      TextCode.add("if_icmpqe ELSE");
                        	      break;
                     		 }
                             break;
                         case FLOAT:
                             TextCode.add("fcmpl");
							 switch($b.text){
                         	 case ">":
                             	 TextCode.add("iflt ELSE");
                             	 break;
 						 	 case ">=":
                             	 TextCode.add("ifle ELSE");
                             	 break;
                         	 case "<":
                             	 TextCode.add("ifgt ELSE");
 							 	 break;
                         	 case "<=":
                             	 TextCode.add("ifge ELSE");
                             	 break;
                         	 case "==":
                             	 TextCode.add("ifne ELSE");
                             	 break;
                        	 case "!=":
                        	   	 TextCode.add("ifeq ELSE");
                        	     break;
                     		}
					 		break;
					 	}
				}
               ;

			   
arith_expression
returns [Type attr_type]
                : a=multExpr { $attr_type = $a.attr_type; }
                 ( '+' b=multExpr
                       {
					      // We need to do type checking first.
						  // ...
						  
						  // code generation.
						  if (($attr_type == Type.INT) &&
						      ($b.attr_type == Type.INT))
						     TextCode.add("iadd");
						  if (($attr_type == Type.FLOAT) &&
						      ($b.attr_type == Type.FLOAT))
						     TextCode.add("fadd");
                       }
                 | '-' c=multExpr
				 	   {
						 if (($attr_type == Type.INT) && ($c.attr_type == Type.INT))
						     TextCode.add("isub");
						 if (($attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
						     TextCode.add("fsub");
				 	   }
                 )*
                 ;

multExpr
returns [Type attr_type]
          : a=signExpr { $attr_type=$a.attr_type; 
		  				//System.out.println("mulExpr " + $attr_type);
						}
          ( '*' b=signExpr
		  		{
					//System.out.println("attr: " + $attr_type + "b.attr: " + $b.attr_type);
					if (($attr_type == Type.INT) && ($b.attr_type == Type.INT))
						TextCode.add("imul");
					if (($attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
						TextCode.add("fmul");
				}
          | '/' c=signExpr
		  		{
					if (($attr_type == Type.INT) && ($c.attr_type == Type.INT))
						TextCode.add("idiv");
					if (($attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
						TextCode.add("fdiv");
				}
	  )*
	  ;

signExpr
returns [Type attr_type]
        : a=primaryExpr { $attr_type=$a.attr_type; } 
        | '-' primaryExpr
	;
		  
primaryExpr
returns [Type attr_type] 
           : Integer_constant
		     {
			    $attr_type = Type.INT;
				
				// code generation.
				// push the integer into the operand stack.
				TextCode.add("ldc " + $Integer_constant.text);
			 }
           | Floating_point_constant
		   	 {
			 	$attr_type = Type.FLOAT;
				TextCode.add("ldc " + $Floating_point_constant.text + "f");
		   	 }
           | Identifier
		     {
			    // get type information from symtab.
			    $attr_type = (Type) symtab.get($Identifier.text).get(0);
				
				switch ($attr_type) {
				case INT: 
				          // load the variable into the operand stack.
				          TextCode.add("iload " + symtab.get($Identifier.text).get(1));
				          break;
				case FLOAT:
				          TextCode.add("fload " + symtab.get($Identifier.text).get(1));
				          break;
				case CHAR:
				          TextCode.add("aload " + symtab.get($Identifier.text).get(1));
				          break;
				
				}
			 }
	   | '&' Identifier
	   | '(' a=arith_expression {$attr_type = $a.attr_type;} ')'
           ;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
PRINTF: 'printf';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Words: '"' (Identifier | ' ' | '%')* '"';
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
