grammar myInterp;

options {
		language = Java;
}

@header {
		import java.util.Queue;
		import java.util.LinkedList;
		import java.util.Map;
		import java.util.Scanner;
		import java.util.HashMap;
}

@members {
		public enum COMPARE{EQ, GE, LE, NE, LT, GT}
		public enum OPERATOR{Add, Sub, Mul, Div}
		public class Variable{
				private String Type;
				private int type_int;
				private float type_float;
				Variable(){
						Type = "UNDEFINED";
				}
				Variable(String type){
						Type = type.toUpperCase();
				}
				Variable(int token){
						Type = "INT";
						type_int = token;
				}
				Variable(float token){
						Type = "FLOAT";
						type_float = token;
				}
				Variable(Variable a){
						if(a.getType().equals("INT")){
								Type = "INT";
								type_int = a.type_int;
						}
						else if(a.getType().equals("FLOAT")){
								Type = "FLOAT";
								type_float = a.type_float;
						}
						else{
								Type = "UNDEFINED";
						}
				}
				void OP(Variable a, OPERATOR opCode){
						if(Type.equals("FLOAT") || a.getType().equals("FLOAT")){
								switch(opCode){
										case Add:
												type_float = getFloatVal() + a.getFloatVal();
												break;
										case Sub:
												type_float = getFloatVal() - a.getFloatVal();
												break;
										case Mul:
												type_float = getFloatVal() * a.getFloatVal();
												break;
										case Div:
												type_float = getFloatVal() / a.getFloatVal();
												break; 
								}
								Type = "FLOAT";
						}
						else{
								switch(opCode){
										case Add:
												type_int = getIntVal() + a.getIntVal();
												break;
										case Sub:
												type_int = getIntVal() - a.getIntVal();
												break;
										case Mul:
												type_int = getIntVal() * a.getIntVal();
												break;
										case Div:
												type_int = getIntVal() / a.getIntVal();
												break;
								}
								Type = "INT";
						}
				}
				boolean CMP(Variable a, COMPARE cmpCode){
						switch(cmpCode){
								case EQ:
										return getIntVal() == a.getIntVal();
								case GE:
										return getIntVal() >= a.getIntVal();
								case LE:
										return getIntVal() <= a.getIntVal();
								case NE:
										return getIntVal() != a.getIntVal();
								case LT:
										return getIntVal() < a.getIntVal();
								case GT:
										return getIntVal() > a.getIntVal();
								default:
										return true;
						}
				}
				boolean CMP(int n, COMPARE cmpCode){
						switch(cmpCode){
								case EQ:
										return getIntVal() == n;
								case GE:
										return getIntVal() >= n;
								case LE:
										return getIntVal() <= n;
								case NE:
										return getIntVal() != n;
								case LT:
										return getIntVal() < n;
								case GT:
										return getIntVal() > n;
								default:
										return true;
						}
				}
				String getType(){
						return Type;
				}
				int getIntVal(){
						if(Type.equals("INT"))
								return type_int;
						else if(Type.equals("FLOAT"))
								return (int)type_float;
						else{
								System.err.println("Error, undefined variable type");
								return 0;
						}
				}
				float getFloatVal(){
						if(Type.equals("FLOAT"))
								return type_float;
						else if(Type.equals("INT"))
								return (float)type_int;
						else{
								System.err.println("Error, undefined variable type");
								return 0;
						}
				}
		}
		boolean flag = true;
		boolean TRACEON = true;
		Map<String, Variable> memory = new HashMap<String, Variable>();
		Queue<String> arg = new LinkedList<String>();
		Queue<String> id = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
}

program
:   
VOID MAIN '(' ')' '{' declarations statements '}'
;

declarations
:	type Identifier ';' declarations{if(flag) memory.put($Identifier.text, new Variable($type.text));}
|	
;

type
:INT { if (TRACEON) System.out.println("type: INT"); }
| FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
;

statements
:	statement statements
|
;

arith_expression returns [Variable result]
:	a = multExpr 	    {if(flag) $result = $a.result;} 
( '+' a = multExpr 	{if(flag) $result.OP($a.result, OPERATOR.Add);}
  | '-' a = multExpr 	{if(flag) $result.OP($a.result, OPERATOR.Sub);}
  )* 
;
multExpr returns [Variable result]
:	a = signExpr 	    {if(flag) $result = $a.result;}
( '*' a = signExpr 	{if(flag) $result.OP($a.result, OPERATOR.Mul);}
  | '/' a = signExpr 	{if(flag) $result.OP($a.result, OPERATOR.Div);}
  )* 
;

signExpr returns [Variable result]
:	a = primaryExpr         {if(flag) $result = $a.result;}
| '-' a = primaryExpr   {if(flag) $result = $a.result;}
;

primaryExpr returns [Variable result]
: Integer_constant  	        { if(flag) $result = new Variable(Integer.parseInt($Integer_constant.text)); }
| Floating_point_constant       { if(flag) $result = new Variable(Float.parseFloat($Floating_point_constant.text));}
| Identifier                    { if(flag){
		if(memory.get($Identifier.text)!=null){
				Variable value = new Variable((Variable)memory.get($Identifier.text));
				$result = value;
		}
		else System.err.println("Error, undefined variable \"" +  $Identifier.text + "\"");
}
}
| '(' a = arith_expression ')'  { if(flag) $result = $a.result;}
;

statement
:	Identifier '=' a = arith_expression ';'	 { if(flag){
		if(memory.get($Identifier.text)==null) System.err.println("Error, undefined variable \"" +  $Identifier.text + "\"");
		else memory.put($Identifier.text, new Variable($a.result));
}
}
| IF '(' cond = condition_statements ')' {if($cond.b == true){flag = true;} else{flag = false;}}
if_then_statements  			 {if($cond.b == false)flag = true;else flag = false;} 
| ELSE if_then_statements {flag = true;} 
| PRINT '('  STRING {   if(flag){
		int i = 0;
		while(i!=-1){
				i = $STRING.text.indexOf("\%", i);
				if(i==-1) break;
				arg.add($STRING.text.substring(i, i+2));
				i+=2;
		}
}   
}
(',' Identifier {if(flag)id.add($Identifier.text);})* ')' ';'
{
		if(flag){
				String reset = $STRING.text;
				reset = reset.replaceAll("\"", "");
				reset = reset.replaceAll("\\\\n", "\n");
				if(arg.size()!=id.size()){
						System.err.println("Error, printf argument");
						arg.clear();
						id.clear();
				}
				else{
						while(!arg.isEmpty()&&!id.isEmpty()){
								String sarg = arg.poll();
								String sid = id.poll();
								if(sarg.equals("\%d")){
										Variable vi = (Variable)memory.get(sid);
										reset = reset.replaceFirst("\%d", Integer.toString(vi.getIntVal()));
								}
								else{
										Variable vi = (Variable)memory.get(sid);
										reset = reset.replaceFirst("\%f", Float.toString(vi.getFloatVal()));
								}
						}
						System.out.printf(reset);
				}
		}
}
| SCANF '(' STRING  {   int i = 0;
		while(i!=-1){
				i = $STRING.text.indexOf("\%", i);
				if(i==-1) break;
				arg.add($STRING.text.substring(i, i+2));
				i+=2;
		}
}  
(',' '&' Identifier {if(flag)id.add($Identifier.text);})+')' ';'
{
		if(flag){
				if(arg.size()!=id.size()){
						System.err.println("\nError, scanf argument");
						arg.clear();
						id.clear();
				}
				else{
						while(!arg.isEmpty()&&!id.isEmpty()){
								String sarg = arg.poll();
								String sid = id.poll();
								if(sarg.equals("\%d")){
										int ival = scanner.nextInt();
										Variable vi = new Variable(ival);
										memory.put(sid, vi);
								}
								else{
										float fval = scanner.nextFloat();
										Variable vf = new Variable(fval);
										memory.put(sid, vf);
								}
						}
				}
		}
}
;


condition_statements returns [boolean b]
:

id1 = Identifier op = compare_statements    (  id2 = Identifier   {  Variable v1 = (Variable)memory.get($id1.text);
				Variable v2 = (Variable)memory.get($id2.text);
				if ( v1!=null && v2!=null) $b = v1.CMP(v2, $op.cmpCode);
				else System.err.println("undefined variable");}
				|  Integer_constant   { Variable v1 = (Variable)memory.get($id1.text);
				int n = Integer.parseInt($Integer_constant.text);
				if ( v1!=null) $b = v1.CMP(n, $op.cmpCode);
				else System.err.println("undefined variable");}
				)
;

if_then_statements
: 	statement
| '{' declarations statements '}'
;

loop_statements
:	statement
| '{' declarations statements '}'
;

for_loop_condition_statements
:
(declarations | statement)
		cond = condition_statements ';'    {if($cond.b==true){flag = true;} else{flag = false;}}
		((Identifier (ADD_ONE | SUB_ONE)) | Identifier '=' arith_expression)
		;
		/*
		   switch_case_statements
		   :
		   CASE primaryExpr ':' declarations statements BREAK ';' switch_case_statements	//{ if (TRACEON) System.out.println("switch_case"); }
		   | DEFAULT ':' declarations statements BREAK ';' 
		   ;
		 */
		compare_statements  returns [COMPARE cmpCode]
		: CMP_EQ    {$cmpCode = COMPARE.EQ;}
		| CMP_GE    {$cmpCode = COMPARE.GE;}
		| CMP_LE    {$cmpCode = COMPARE.LE;}
		| CMP_NE    {$cmpCode = COMPARE.NE;}
		| CMP_LT    {$cmpCode = COMPARE.LT;}
		| CMP_GT    {$cmpCode = COMPARE.GT;}
		;

/* description of the tokens */
FLOAT	:	'float';
INT		:	'int';
MAIN	:	'main';
VOID	:	'void';
IF		:	'if';
ELSE	:	'else';
CHAR	:	'char';	
WHILE	:	'while';
FOR		:	'for';
AND		:	'&&';
OR		:	'||';
ADD_ONE	:	'++';
SUB_ONE :	'--';
SCANF   :   'scanf';
PRINT	:	'printf';
PRINT_TYPE:	'%'('d'|'c'|'f'|'s');
SWITCH	:	'switch';
CASE	:	'case';
DO		:	'do';
BREAK	:	'break';
DEFAULT	:	'default';


CMP_EQ	:	'==';
CMP_GE	:	'>=';
CMP_LE	:	'<=';
CMP_NE	:	'!=';
CMP_LT	:	'<';
CMP_GT	:	'>';


Identifier
:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant
:	'0'..'9'+;
Floating_point_constant
:	'0'..'9'+ '.' '0'..'9'+;
STRING
:  '"' ( ESC_SEQ | ~('\\'|'"'))* '"';
ESC_SEQ
:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

WS	:	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT	:	'/*' .* '*/' {$channel=HIDDEN;};
