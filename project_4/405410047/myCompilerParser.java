// $ANTLR 3.5.2 myCompiler.g 2019-06-20 14:25:49

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "EscapeSequence", 
		"FLOAT", "FOR", "Floating_point_constant", "IF", "INT", "Identifier", 
		"Integer_constant", "MAIN", "PRINTF", "RelationOP", "STRING_LITERAL", 
		"VOID", "WS", "Words", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'/'", "';'", "'='", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int EscapeSequence=7;
	public static final int FLOAT=8;
	public static final int FOR=9;
	public static final int Floating_point_constant=10;
	public static final int IF=11;
	public static final int INT=12;
	public static final int Identifier=13;
	public static final int Integer_constant=14;
	public static final int MAIN=15;
	public static final int PRINTF=16;
	public static final int RelationOP=17;
	public static final int STRING_LITERAL=18;
	public static final int VOID=19;
	public static final int WS=20;
	public static final int Words=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


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



	// $ANTLR start "program"
	// myCompiler.g:85:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:85:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myCompiler.g:85:10: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program36); 
			match(input,MAIN,FOLLOW_MAIN_in_program38); 
			match(input,23,FOLLOW_23_in_program40); 
			match(input,24,FOLLOW_24_in_program42); 

			           /* Output function prologue */
			           prologue();
			        
			match(input,32,FOLLOW_32_in_program63); 
			pushFollow(FOLLOW_declarations_in_program77);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program90);
			statements();
			state._fsp--;

			match(input,33,FOLLOW_33_in_program100); 

					   if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");

			           /* output function epilogue */	  
			           epilogue();
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// myCompiler.g:105:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// myCompiler.g:105:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR||LA1_0==FLOAT||LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==FOR||LA1_0==IF||LA1_0==Identifier||LA1_0==PRINTF||LA1_0==33) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myCompiler.g:105:15: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations127);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations129); 
					match(input,30,FOLLOW_30_in_declarations131); 
					pushFollow(FOLLOW_declarations_in_declarations133);
					declarations();
					state._fsp--;


								     if (TRACEON)
						                System.out.println("declarations: type Identifier : declarations");

					                 if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
									    // variable re-declared.
					                    System.out.println("Type Error: " + 
					                                       Identifier1.getLine() + 
					                                       ": Redeclared identifier.");
					                    System.exit(0);
					                 }
					                 
									 /* Add ID and its attr_type into the symbol table. */
									 ArrayList the_list = new ArrayList();
									 the_list.add(type2);
									 the_list.add(storageIndex);
									 storageIndex = storageIndex + 1;
					                 symtab.put((Identifier1!=null?Identifier1.getText():null), the_list);
					              
					}
					break;
				case 2 :
					// myCompiler.g:126:9: 
					{

								     if (TRACEON)
					                    System.out.println("declarations: ");
								  
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// myCompiler.g:133:1: type returns [Type attr_type] : ( INT | CHAR | FLOAT );
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// myCompiler.g:135:5: ( INT | CHAR | FLOAT )
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt2=1;
				}
				break;
			case CHAR:
				{
				alt2=2;
				}
				break;
			case FLOAT:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myCompiler.g:135:7: INT
					{
					match(input,INT,FOLLOW_INT_in_type204); 
					 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
					}
					break;
				case 2 :
					// myCompiler.g:136:7: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type214); 
					 if (TRACEON) System.out.println("type: CHAR"); attr_type=Type.CHAR; 
					}
					break;
				case 3 :
					// myCompiler.g:137:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type224); 
					if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:140:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:140:11: ( statement statements |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FOR||LA3_0==IF||LA3_0==Identifier||LA3_0==PRINTF) ) {
				alt3=1;
			}
			else if ( (LA3_0==33) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:140:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements234);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements236);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:142:11: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// myCompiler.g:144:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt | print ';' );
	public final void statement() throws RecognitionException {
		try {
			// myCompiler.g:144:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt | print ';' )
			int alt4=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==31) ) {
					alt4=1;
				}
				else if ( (LA4_1==23) ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt4=2;
				}
				break;
			case FOR:
				{
				alt4=4;
				}
				break;
			case PRINTF:
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myCompiler.g:144:12: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement266);
					assign_stmt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement268); 
					}
					break;
				case 2 :
					// myCompiler.g:145:12: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement281);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:146:12: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement294);
					func_no_return_stmt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement296); 
					}
					break;
				case 4 :
					// myCompiler.g:147:12: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement309);
					for_stmt();
					state._fsp--;

					}
					break;
				case 5 :
					// myCompiler.g:148:6: print ';'
					{
					pushFollow(FOLLOW_print_in_statement316);
					print();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement318); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "print"
	// myCompiler.g:152:1: print : PRINTF '(' Words ( ',' parameter )* ')' ;
	public final void print() throws RecognitionException {
		Token Words3=null;

		try {
			// myCompiler.g:152:6: ( PRINTF '(' Words ( ',' parameter )* ')' )
			// myCompiler.g:152:8: PRINTF '(' Words ( ',' parameter )* ')'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_print336); 
			match(input,23,FOLLOW_23_in_print338); 
			Words3=(Token)match(input,Words,FOLLOW_Words_in_print340); 

									printBuffer = (Words3!=null?Words3.getText():null); 
									printBuffer = printBuffer.replaceAll("\"", "");
								
			// myCompiler.g:157:3: ( ',' parameter )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==27) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myCompiler.g:157:4: ',' parameter
					{
					match(input,27,FOLLOW_27_in_print354); 
					pushFollow(FOLLOW_parameter_in_print356);
					parameter();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,24,FOLLOW_24_in_print361); 

									TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
									TextCode.add("ldc \""+ printBuffer + "\"");
									TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"



	// $ANTLR start "parameter"
	// myCompiler.g:164:1: parameter : Identifier ;
	public final void parameter() throws RecognitionException {
		Token Identifier4=null;

		try {
			// myCompiler.g:165:2: ( Identifier )
			// myCompiler.g:165:4: Identifier
			{
			Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_parameter374); 

						    Type tmp = (Type) symtab.get((Identifier4!=null?Identifier4.getText():null)).get(0);
							String tmp_str;
							int index;
							switch (tmp) {
							case INT: 
							          // load the variable into the operand stack.
									index = printBuffer.indexOf("%d");
									tmp_str = printBuffer.substring(0, index);
									TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
									TextCode.add("ldc \"" + tmp_str + "\"");
									TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
									TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							        TextCode.add("iload " + symtab.get((Identifier4!=null?Identifier4.getText():null)).get(1));
									TextCode.add("invokevirtual java/io/PrintStream/print(I)V");
									printBuffer = printBuffer.substring(index + 2);
							        break;
							case FLOAT:
									index = printBuffer.indexOf("%f");
									tmp_str = printBuffer.substring(0, index);
									TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
									TextCode.add("ldc \"" + tmp_str + "\"");
									TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
									TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							        TextCode.add("fload " + symtab.get((Identifier4!=null?Identifier4.getText():null)).get(1));
									TextCode.add("invokevirtual java/io/PrintStream/print(F)V");
									printBuffer = printBuffer.substring(index + 2);
							        break;
							case CHAR:
							          TextCode.add("aload " + symtab.get((Identifier4!=null?Identifier4.getText():null)).get(1));
							          break;
							
							}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameter"



	// $ANTLR start "for_stmt"
	// myCompiler.g:201:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myCompiler.g:201:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myCompiler.g:201:11: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt385); 
			match(input,23,FOLLOW_23_in_for_stmt387); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt389);
			assign_stmt();
			state._fsp--;

			match(input,30,FOLLOW_30_in_for_stmt391); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt411);
			cond_expression();
			state._fsp--;

			match(input,30,FOLLOW_30_in_for_stmt413); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt421);
			assign_stmt();
			state._fsp--;

			match(input,24,FOLLOW_24_in_for_stmt429); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt440);
			block_stmt();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_stmt"



	// $ANTLR start "if_stmt"
	// myCompiler.g:209:1: if_stmt : if_then_stmt if_else_stmt ;
	public final void if_stmt() throws RecognitionException {
		try {
			// myCompiler.g:210:13: ( if_then_stmt if_else_stmt )
			// myCompiler.g:210:15: if_then_stmt if_else_stmt
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt476);
			if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt478);
			if_else_stmt();
			state._fsp--;

			TextCode.add("END:");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "if_then_stmt"
	// myCompiler.g:214:1: if_then_stmt : IF '(' cond_expression ')' block_stmt ;
	public final void if_then_stmt() throws RecognitionException {
		try {
			// myCompiler.g:215:13: ( IF '(' cond_expression ')' block_stmt )
			// myCompiler.g:215:15: IF '(' cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt518); 
			match(input,23,FOLLOW_23_in_if_then_stmt520); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt522);
			cond_expression();
			state._fsp--;

			match(input,24,FOLLOW_24_in_if_then_stmt529); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt531);
			block_stmt();
			state._fsp--;

			TextCode.add("goto END");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// myCompiler.g:220:1: if_else_stmt : ( ELSE block_stmt |);
	public final void if_else_stmt() throws RecognitionException {
		try {
			// myCompiler.g:221:13: ( ELSE block_stmt |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSE) ) {
				alt6=1;
			}
			else if ( (LA6_0==FOR||LA6_0==IF||LA6_0==Identifier||LA6_0==PRINTF||LA6_0==33) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myCompiler.g:221:15: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt567); 
					TextCode.add("ELSE:");
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt571);
					block_stmt();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:223:13: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_else_stmt"



	// $ANTLR start "block_stmt"
	// myCompiler.g:226:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myCompiler.g:226:11: ( '{' statements '}' )
			// myCompiler.g:226:13: '{' statements '}'
			{
			match(input,32,FOLLOW_32_in_block_stmt612); 
			pushFollow(FOLLOW_statements_in_block_stmt614);
			statements();
			state._fsp--;

			match(input,33,FOLLOW_33_in_block_stmt616); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_stmt"



	// $ANTLR start "assign_stmt"
	// myCompiler.g:230:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier5=null;
		Type arith_expression6 =null;

		try {
			// myCompiler.g:230:12: ( Identifier '=' arith_expression )
			// myCompiler.g:230:14: Identifier '=' arith_expression
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt628); 
			match(input,31,FOLLOW_31_in_assign_stmt630); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt632);
			arith_expression6=arith_expression();
			state._fsp--;


						   Type the_type;
						   int the_mem;
						   
						   // get the ID's location and type from symtab.			   
						   the_type = (Type) symtab.get((Identifier5!=null?Identifier5.getText():null)).get(0);
						   //System.out.println(the_type);
						   //System.out.println(arith_expression6);
						   the_mem = (int) symtab.get((Identifier5!=null?Identifier5.getText():null)).get(1);
						   //System.out.println(the_mem);

						   if (the_type != arith_expression6) {
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_stmt"



	// $ANTLR start "func_no_return_stmt"
	// myCompiler.g:264:1: func_no_return_stmt : Identifier '(' argument ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		try {
			// myCompiler.g:264:20: ( Identifier '(' argument ')' )
			// myCompiler.g:264:22: Identifier '(' argument ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt672); 
			match(input,23,FOLLOW_23_in_func_no_return_stmt674); 
			pushFollow(FOLLOW_argument_in_func_no_return_stmt676);
			argument();
			state._fsp--;

			match(input,24,FOLLOW_24_in_func_no_return_stmt678); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_no_return_stmt"



	// $ANTLR start "argument"
	// myCompiler.g:268:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// myCompiler.g:268:9: ( arg ( ',' arg )* )
			// myCompiler.g:268:11: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument706);
			arg();
			state._fsp--;

			// myCompiler.g:268:15: ( ',' arg )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==27) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:268:16: ',' arg
					{
					match(input,27,FOLLOW_27_in_argument709); 
					pushFollow(FOLLOW_arg_in_argument711);
					arg();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argument"



	// $ANTLR start "arg"
	// myCompiler.g:271:1: arg : ( arith_expression | STRING_LITERAL );
	public final void arg() throws RecognitionException {
		try {
			// myCompiler.g:271:4: ( arith_expression | STRING_LITERAL )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Floating_point_constant||(LA8_0 >= Identifier && LA8_0 <= Integer_constant)||(LA8_0 >= 22 && LA8_0 <= 23)||LA8_0==28) ) {
				alt8=1;
			}
			else if ( (LA8_0==STRING_LITERAL) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myCompiler.g:271:6: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg729);
					arith_expression();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:272:6: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_arg736); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myCompiler.g:275:1: cond_expression returns [boolean truth] : a= arith_expression b= RelationOP arith_expression ;
	public final boolean cond_expression() throws RecognitionException {
		boolean truth = false;


		Token b=null;
		Type a =null;

		try {
			// myCompiler.g:277:16: (a= arith_expression b= RelationOP arith_expression )
			// myCompiler.g:277:18: a= arith_expression b= RelationOP arith_expression
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression774);
			a=arith_expression();
			state._fsp--;


							    if (a.ordinal() != 0)
								   truth = true;
								else
								   truth = false;
							 
			b=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression805); 
			pushFollow(FOLLOW_arith_expression_in_cond_expression807);
			arith_expression();
			state._fsp--;


								switch(a){
			                         case INT:
										 switch((b!=null?b.getText():null)){
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
										 switch((b!=null?b.getText():null)){
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return truth;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myCompiler.g:337:1: arith_expression returns [Type attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Type arith_expression() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:339:17: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:339:19: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression867);
			a=multExpr();
			state._fsp--;

			 attr_type = a; 
			// myCompiler.g:340:18: ( '+' b= multExpr | '-' c= multExpr )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==26) ) {
					alt9=1;
				}
				else if ( (LA9_0==28) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:340:20: '+' b= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression890); 
					pushFollow(FOLLOW_multExpr_in_arith_expression894);
					b=multExpr();
					state._fsp--;


										      // We need to do type checking first.
											  // ...
											  
											  // code generation.
											  if ((attr_type == Type.INT) &&
											      (b == Type.INT))
											     TextCode.add("iadd");
											  if ((attr_type == Type.FLOAT) &&
											      (b == Type.FLOAT))
											     TextCode.add("fadd");
					                       
					}
					break;
				case 2 :
					// myCompiler.g:353:20: '-' c= multExpr
					{
					match(input,28,FOLLOW_28_in_arith_expression940); 
					pushFollow(FOLLOW_multExpr_in_arith_expression944);
					c=multExpr();
					state._fsp--;


											 if ((attr_type == Type.INT) && (c == Type.INT))
											     TextCode.add("isub");
											 if ((attr_type == Type.FLOAT) && (c == Type.FLOAT))
											     TextCode.add("fsub");
									 	   
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myCompiler.g:363:1: multExpr returns [Type attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Type multExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:365:11: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:365:13: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr1017);
			a=signExpr();
			state._fsp--;

			 attr_type =a; 
					  				//System.out.println("mulExpr " + attr_type);
									
			// myCompiler.g:368:11: ( '*' b= signExpr | '/' c= signExpr )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==25) ) {
					alt10=1;
				}
				else if ( (LA10_0==29) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// myCompiler.g:368:13: '*' b= signExpr
					{
					match(input,25,FOLLOW_25_in_multExpr1033); 
					pushFollow(FOLLOW_signExpr_in_multExpr1037);
					b=signExpr();
					state._fsp--;


										//System.out.println("attr: " + attr_type + "b.attr: " + b);
										if ((attr_type == Type.INT) && (b == Type.INT))
											TextCode.add("imul");
										if ((attr_type == Type.FLOAT) && (b == Type.FLOAT))
											TextCode.add("fmul");
									
					}
					break;
				case 2 :
					// myCompiler.g:376:13: '/' c= signExpr
					{
					match(input,29,FOLLOW_29_in_multExpr1059); 
					pushFollow(FOLLOW_signExpr_in_multExpr1063);
					c=signExpr();
					state._fsp--;


										if ((attr_type == Type.INT) && (c == Type.INT))
											TextCode.add("idiv");
										if ((attr_type == Type.FLOAT) && (c == Type.FLOAT))
											TextCode.add("fdiv");
									
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myCompiler.g:386:1: signExpr returns [Type attr_type] : (a= primaryExpr | '-' primaryExpr );
	public final Type signExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;

		try {
			// myCompiler.g:388:9: (a= primaryExpr | '-' primaryExpr )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Floating_point_constant||(LA11_0 >= Identifier && LA11_0 <= Integer_constant)||(LA11_0 >= 22 && LA11_0 <= 23)) ) {
				alt11=1;
			}
			else if ( (LA11_0==28) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myCompiler.g:388:11: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr1103);
					a=primaryExpr();
					state._fsp--;

					 attr_type =a; 
					}
					break;
				case 2 :
					// myCompiler.g:389:11: '-' primaryExpr
					{
					match(input,28,FOLLOW_28_in_signExpr1118); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr1120);
					primaryExpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myCompiler.g:392:1: primaryExpr returns [Type attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' a= arith_expression ')' );
	public final Type primaryExpr() throws RecognitionException {
		Type attr_type = null;


		Token Integer_constant7=null;
		Token Floating_point_constant8=null;
		Token Identifier9=null;
		Type a =null;

		try {
			// myCompiler.g:394:12: ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' a= arith_expression ')' )
			int alt12=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt12=1;
				}
				break;
			case Floating_point_constant:
				{
				alt12=2;
				}
				break;
			case Identifier:
				{
				alt12=3;
				}
				break;
			case 22:
				{
				alt12=4;
				}
				break;
			case 23:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myCompiler.g:394:14: Integer_constant
					{
					Integer_constant7=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr1150); 

								    attr_type = Type.INT;
									
									// code generation.
									// push the integer into the operand stack.
									TextCode.add("ldc " + (Integer_constant7!=null?Integer_constant7.getText():null));
								 
					}
					break;
				case 2 :
					// myCompiler.g:402:14: Floating_point_constant
					{
					Floating_point_constant8=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr1174); 

								 	attr_type = Type.FLOAT;
									TextCode.add("ldc " + (Floating_point_constant8!=null?Floating_point_constant8.getText():null) + "f");
							   	 
					}
					break;
				case 3 :
					// myCompiler.g:407:14: Identifier
					{
					Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1198); 

								    // get type information from symtab.
								    attr_type = (Type) symtab.get((Identifier9!=null?Identifier9.getText():null)).get(0);
									
									switch (attr_type) {
									case INT: 
									          // load the variable into the operand stack.
									          TextCode.add("iload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
									          break;
									case FLOAT:
									          TextCode.add("fload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
									          break;
									case CHAR:
									          TextCode.add("aload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
									          break;
									
									}
								 
					}
					break;
				case 4 :
					// myCompiler.g:426:7: '&' Identifier
					{
					match(input,22,FOLLOW_22_in_primaryExpr1215); 
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1217); 
					}
					break;
				case 5 :
					// myCompiler.g:427:7: '(' a= arith_expression ')'
					{
					match(input,23,FOLLOW_23_in_primaryExpr1225); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr1229);
					a=arith_expression();
					state._fsp--;

					attr_type = a;
					match(input,24,FOLLOW_24_in_primaryExpr1233); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "primaryExpr"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program36 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MAIN_in_program38 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program40 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_program42 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_program63 = new BitSet(new long[]{0x0000000200013B10L});
	public static final BitSet FOLLOW_declarations_in_program77 = new BitSet(new long[]{0x0000000200012A00L});
	public static final BitSet FOLLOW_statements_in_program90 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_program100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations127 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations129 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declarations131 = new BitSet(new long[]{0x0000000000001110L});
	public static final BitSet FOLLOW_declarations_in_declarations133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements234 = new BitSet(new long[]{0x0000000000012A00L});
	public static final BitSet FOLLOW_statements_in_statements236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement266 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement294 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement316 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_print336 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_print338 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Words_in_print340 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_27_in_print354 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_parameter_in_print356 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_24_in_print361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_parameter374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt385 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_for_stmt387 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt389 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_stmt391 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt411 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_stmt413 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt421 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_for_stmt429 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt476 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt518 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_if_then_stmt520 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt522 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_if_then_stmt529 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt567 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_block_stmt612 = new BitSet(new long[]{0x0000000200012A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt614 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_block_stmt616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt628 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_assign_stmt630 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt672 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_func_no_return_stmt674 = new BitSet(new long[]{0x0000000010C46400L});
	public static final BitSet FOLLOW_argument_in_func_no_return_stmt676 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_func_no_return_stmt678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument706 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_argument709 = new BitSet(new long[]{0x0000000010C46400L});
	public static final BitSet FOLLOW_arg_in_argument711 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_arg736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression774 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression805 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression867 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_26_in_arith_expression890 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression894 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_28_in_arith_expression940 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression944 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1017 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_25_in_multExpr1033 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1037 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_29_in_multExpr1059 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1063 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_signExpr1118 = new BitSet(new long[]{0x0000000000C06400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primaryExpr1215 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primaryExpr1225 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr1229 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_primaryExpr1233 = new BitSet(new long[]{0x0000000000000002L});
}
