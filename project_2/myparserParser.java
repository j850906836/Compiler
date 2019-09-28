// $ANTLR 3.5.2 myparser.g 2019-05-22 00:54:57

    // import packages here.


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "COMMENT", "DEFAULT", 
		"DO", "ELSE", "FLOAT", "FOR", "Floating_point_constant", "IF", "INT", 
		"Identifier", "Integer_constant", "MAIN", "PRINT", "SWITCH", "VOID", "WHILE", 
		"WS", "'!'", "'\"'", "'%'", "'&'", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'/'", "':'", "';'", "'<'", "'='", "'>'", "'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int BREAK=4;
	public static final int CASE=5;
	public static final int COMMENT=6;
	public static final int DEFAULT=7;
	public static final int DO=8;
	public static final int ELSE=9;
	public static final int FLOAT=10;
	public static final int FOR=11;
	public static final int Floating_point_constant=12;
	public static final int IF=13;
	public static final int INT=14;
	public static final int Identifier=15;
	public static final int Integer_constant=16;
	public static final int MAIN=17;
	public static final int PRINT=18;
	public static final int SWITCH=19;
	public static final int VOID=20;
	public static final int WHILE=21;
	public static final int WS=22;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myparser.g:15:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myparser.g:15:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myparser.g:15:9: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program35); 
			match(input,MAIN,FOLLOW_MAIN_in_program37); 
			match(input,27,FOLLOW_27_in_program39); 
			match(input,28,FOLLOW_28_in_program41); 
			match(input,39,FOLLOW_39_in_program43); 
			pushFollow(FOLLOW_declarations_in_program45);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program47);
			statements();
			state._fsp--;

			match(input,41,FOLLOW_41_in_program49); 
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
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
	// myparser.g:18:1: declarations : ( type Identifier ( ',' Identifier )* ';' declarations |);
	public final void declarations() throws RecognitionException {
		try {
			// myparser.g:18:13: ( type Identifier ( ',' Identifier )* ';' declarations |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FLOAT||LA2_0==INT) ) {
				alt2=1;
			}
			else if ( (LA2_0==DO||LA2_0==FOR||LA2_0==IF||LA2_0==Identifier||(LA2_0 >= PRINT && LA2_0 <= SWITCH)||LA2_0==WHILE||(LA2_0 >= 24 && LA2_0 <= 25)||LA2_0==41) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myparser.g:18:14: type Identifier ( ',' Identifier )* ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations65);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations67); 
					// myparser.g:18:30: ( ',' Identifier )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==31) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myparser.g:18:31: ',' Identifier
							{
							match(input,31,FOLLOW_31_in_declarations70); 
							match(input,Identifier,FOLLOW_Identifier_in_declarations71); 
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,35,FOLLOW_35_in_declarations75); 
					pushFollow(FOLLOW_declarations_in_declarations77);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
					}
					break;
				case 2 :
					// myparser.g:20:14: 
					{
					 if (TRACEON) System.out.println("declarations: ");
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
	// myparser.g:22:1: type : ( INT | FLOAT );
	public final void type() throws RecognitionException {
		try {
			// myparser.g:22:5: ( INT | FLOAT )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INT) ) {
				alt3=1;
			}
			else if ( (LA3_0==FLOAT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myparser.g:22:6: INT
					{
					match(input,INT,FOLLOW_INT_in_type114); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myparser.g:23:6: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type123); 
					if (TRACEON) System.out.println("type: FLOAT"); 
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
	// $ANTLR end "type"



	// $ANTLR start "block"
	// myparser.g:25:1: block : ( statement | '{' statements '}' );
	public final void block() throws RecognitionException {
		try {
			// myparser.g:25:6: ( statement | '{' statements '}' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DO||LA4_0==FOR||LA4_0==IF||LA4_0==Identifier||(LA4_0 >= PRINT && LA4_0 <= SWITCH)||LA4_0==WHILE||(LA4_0 >= 24 && LA4_0 <= 25)) ) {
				alt4=1;
			}
			else if ( (LA4_0==39) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myparser.g:25:7: statement
					{
					pushFollow(FOLLOW_statement_in_block131);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:25:19: '{' statements '}'
					{
					match(input,39,FOLLOW_39_in_block135); 
					pushFollow(FOLLOW_statements_in_block136);
					statements();
					state._fsp--;

					match(input,41,FOLLOW_41_in_block138); 
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
	// $ANTLR end "block"



	// $ANTLR start "statements"
	// myparser.g:26:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myparser.g:26:11: ( statement statements |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DO||LA5_0==FOR||LA5_0==IF||LA5_0==Identifier||(LA5_0 >= PRINT && LA5_0 <= SWITCH)||LA5_0==WHILE||(LA5_0 >= 24 && LA5_0 <= 25)) ) {
				alt5=1;
			}
			else if ( (LA5_0==41) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myparser.g:26:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements147);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements149);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:27:10: 
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



	// $ANTLR start "arith_expression"
	// myparser.g:29:1: arith_expression : multExpr ( '+' multExpr | '-' multExpr | '>' multExpr | '<' multExpr | '=' '=' multExpr | '>' '=' multExpr | '<' '=' multExpr | '!' '=' multExpr | '+' '=' multExpr | '+' '+' multExpr | '-' '=' multExpr | '*' '=' multExpr | '/' '=' multExpr | '|' '|' multExpr | '&' '&' multExpr )* ;
	public final void arith_expression() throws RecognitionException {
		try {
			// myparser.g:29:17: ( multExpr ( '+' multExpr | '-' multExpr | '>' multExpr | '<' multExpr | '=' '=' multExpr | '>' '=' multExpr | '<' '=' multExpr | '!' '=' multExpr | '+' '=' multExpr | '+' '+' multExpr | '-' '=' multExpr | '*' '=' multExpr | '/' '=' multExpr | '|' '|' multExpr | '&' '&' multExpr )* )
			// myparser.g:29:19: multExpr ( '+' multExpr | '-' multExpr | '>' multExpr | '<' multExpr | '=' '=' multExpr | '>' '=' multExpr | '<' '=' multExpr | '!' '=' multExpr | '+' '=' multExpr | '+' '+' multExpr | '-' '=' multExpr | '*' '=' multExpr | '/' '=' multExpr | '|' '|' multExpr | '&' '&' multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression166);
			multExpr();
			state._fsp--;

			// myparser.g:30:19: ( '+' multExpr | '-' multExpr | '>' multExpr | '<' multExpr | '=' '=' multExpr | '>' '=' multExpr | '<' '=' multExpr | '!' '=' multExpr | '+' '=' multExpr | '+' '+' multExpr | '-' '=' multExpr | '*' '=' multExpr | '/' '=' multExpr | '|' '|' multExpr | '&' '&' multExpr )*
			loop6:
			while (true) {
				int alt6=16;
				switch ( input.LA(1) ) {
				case 30:
					{
					switch ( input.LA(2) ) {
					case 37:
						{
						alt6=9;
						}
						break;
					case 30:
						{
						alt6=10;
						}
						break;
					case Floating_point_constant:
					case Identifier:
					case Integer_constant:
					case 27:
					case 32:
						{
						alt6=1;
						}
						break;
					}
					}
					break;
				case 32:
					{
					int LA6_3 = input.LA(2);
					if ( (LA6_3==37) ) {
						alt6=11;
					}
					else if ( (LA6_3==Floating_point_constant||(LA6_3 >= Identifier && LA6_3 <= Integer_constant)||LA6_3==27||LA6_3==32) ) {
						alt6=2;
					}

					}
					break;
				case 38:
					{
					int LA6_4 = input.LA(2);
					if ( (LA6_4==37) ) {
						alt6=6;
					}
					else if ( (LA6_4==Floating_point_constant||(LA6_4 >= Identifier && LA6_4 <= Integer_constant)||LA6_4==27||LA6_4==32) ) {
						alt6=3;
					}

					}
					break;
				case 36:
					{
					int LA6_5 = input.LA(2);
					if ( (LA6_5==37) ) {
						alt6=7;
					}
					else if ( (LA6_5==Floating_point_constant||(LA6_5 >= Identifier && LA6_5 <= Integer_constant)||LA6_5==27||LA6_5==32) ) {
						alt6=4;
					}

					}
					break;
				case 37:
					{
					alt6=5;
					}
					break;
				case 23:
					{
					alt6=8;
					}
					break;
				case 29:
					{
					alt6=12;
					}
					break;
				case 33:
					{
					alt6=13;
					}
					break;
				case 40:
					{
					alt6=14;
					}
					break;
				case 26:
					{
					alt6=15;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// myparser.g:30:21: '+' multExpr
					{
					match(input,30,FOLLOW_30_in_arith_expression188); 
					pushFollow(FOLLOW_multExpr_in_arith_expression190);
					multExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:31:9: '-' multExpr
					{
					match(input,32,FOLLOW_32_in_arith_expression200); 
					pushFollow(FOLLOW_multExpr_in_arith_expression202);
					multExpr();
					state._fsp--;

					}
					break;
				case 3 :
					// myparser.g:32:9: '>' multExpr
					{
					match(input,38,FOLLOW_38_in_arith_expression212); 
					pushFollow(FOLLOW_multExpr_in_arith_expression214);
					multExpr();
					state._fsp--;

					}
					break;
				case 4 :
					// myparser.g:33:9: '<' multExpr
					{
					match(input,36,FOLLOW_36_in_arith_expression224); 
					pushFollow(FOLLOW_multExpr_in_arith_expression226);
					multExpr();
					state._fsp--;

					}
					break;
				case 5 :
					// myparser.g:34:9: '=' '=' multExpr
					{
					match(input,37,FOLLOW_37_in_arith_expression236); 
					match(input,37,FOLLOW_37_in_arith_expression237); 
					pushFollow(FOLLOW_multExpr_in_arith_expression239);
					multExpr();
					state._fsp--;

					}
					break;
				case 6 :
					// myparser.g:35:9: '>' '=' multExpr
					{
					match(input,38,FOLLOW_38_in_arith_expression255); 
					match(input,37,FOLLOW_37_in_arith_expression256); 
					pushFollow(FOLLOW_multExpr_in_arith_expression258);
					multExpr();
					state._fsp--;

					}
					break;
				case 7 :
					// myparser.g:36:9: '<' '=' multExpr
					{
					match(input,36,FOLLOW_36_in_arith_expression268); 
					match(input,37,FOLLOW_37_in_arith_expression269); 
					pushFollow(FOLLOW_multExpr_in_arith_expression271);
					multExpr();
					state._fsp--;

					}
					break;
				case 8 :
					// myparser.g:37:9: '!' '=' multExpr
					{
					match(input,23,FOLLOW_23_in_arith_expression281); 
					match(input,37,FOLLOW_37_in_arith_expression282); 
					pushFollow(FOLLOW_multExpr_in_arith_expression284);
					multExpr();
					state._fsp--;

					}
					break;
				case 9 :
					// myparser.g:38:9: '+' '=' multExpr
					{
					match(input,30,FOLLOW_30_in_arith_expression294); 
					match(input,37,FOLLOW_37_in_arith_expression295); 
					pushFollow(FOLLOW_multExpr_in_arith_expression297);
					multExpr();
					state._fsp--;

					}
					break;
				case 10 :
					// myparser.g:39:9: '+' '+' multExpr
					{
					match(input,30,FOLLOW_30_in_arith_expression307); 
					match(input,30,FOLLOW_30_in_arith_expression308); 
					pushFollow(FOLLOW_multExpr_in_arith_expression310);
					multExpr();
					state._fsp--;

					}
					break;
				case 11 :
					// myparser.g:40:9: '-' '=' multExpr
					{
					match(input,32,FOLLOW_32_in_arith_expression320); 
					match(input,37,FOLLOW_37_in_arith_expression321); 
					pushFollow(FOLLOW_multExpr_in_arith_expression323);
					multExpr();
					state._fsp--;

					}
					break;
				case 12 :
					// myparser.g:41:9: '*' '=' multExpr
					{
					match(input,29,FOLLOW_29_in_arith_expression333); 
					match(input,37,FOLLOW_37_in_arith_expression334); 
					pushFollow(FOLLOW_multExpr_in_arith_expression336);
					multExpr();
					state._fsp--;

					}
					break;
				case 13 :
					// myparser.g:42:9: '/' '=' multExpr
					{
					match(input,33,FOLLOW_33_in_arith_expression346); 
					match(input,37,FOLLOW_37_in_arith_expression347); 
					pushFollow(FOLLOW_multExpr_in_arith_expression349);
					multExpr();
					state._fsp--;

					}
					break;
				case 14 :
					// myparser.g:43:9: '|' '|' multExpr
					{
					match(input,40,FOLLOW_40_in_arith_expression359); 
					match(input,40,FOLLOW_40_in_arith_expression360); 
					pushFollow(FOLLOW_multExpr_in_arith_expression362);
					multExpr();
					state._fsp--;

					}
					break;
				case 15 :
					// myparser.g:44:9: '&' '&' multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression372); 
					match(input,26,FOLLOW_26_in_arith_expression373); 
					pushFollow(FOLLOW_multExpr_in_arith_expression375);
					multExpr();
					state._fsp--;

					}
					break;

				default :
					break loop6;
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
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myparser.g:48:1: multExpr : signExpr ( '*' signExpr | '/' signExpr )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// myparser.g:48:9: ( signExpr ( '*' signExpr | '/' signExpr )* )
			// myparser.g:48:11: signExpr ( '*' signExpr | '/' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr410);
			signExpr();
			state._fsp--;

			// myparser.g:49:11: ( '*' signExpr | '/' signExpr )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==29) ) {
					int LA7_2 = input.LA(2);
					if ( (LA7_2==Floating_point_constant||(LA7_2 >= Identifier && LA7_2 <= Integer_constant)||LA7_2==27||LA7_2==32) ) {
						alt7=1;
					}

				}
				else if ( (LA7_0==33) ) {
					int LA7_3 = input.LA(2);
					if ( (LA7_3==Floating_point_constant||(LA7_3 >= Identifier && LA7_3 <= Integer_constant)||LA7_3==27||LA7_3==32) ) {
						alt7=2;
					}

				}

				switch (alt7) {
				case 1 :
					// myparser.g:49:13: '*' signExpr
					{
					match(input,29,FOLLOW_29_in_multExpr424); 
					pushFollow(FOLLOW_signExpr_in_multExpr426);
					signExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:50:13: '/' signExpr
					{
					match(input,33,FOLLOW_33_in_multExpr440); 
					pushFollow(FOLLOW_signExpr_in_multExpr442);
					signExpr();
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
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myparser.g:54:1: signExpr : ( primaryExpr | '-' primaryExpr );
	public final void signExpr() throws RecognitionException {
		try {
			// myparser.g:54:9: ( primaryExpr | '-' primaryExpr )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Floating_point_constant||(LA8_0 >= Identifier && LA8_0 <= Integer_constant)||LA8_0==27) ) {
				alt8=1;
			}
			else if ( (LA8_0==32) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myparser.g:54:11: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr461);
					primaryExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:55:11: '-' primaryExpr
					{
					match(input,32,FOLLOW_32_in_signExpr473); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr475);
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
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myparser.g:57:1: primaryExpr : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final void primaryExpr() throws RecognitionException {
		try {
			// myparser.g:57:12: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
			int alt9=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt9=1;
				}
				break;
			case Floating_point_constant:
				{
				alt9=2;
				}
				break;
			case Identifier:
				{
				alt9=3;
				}
				break;
			case 27:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// myparser.g:57:14: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr484); 
					}
					break;
				case 2 :
					// myparser.g:58:14: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr499); 
					}
					break;
				case 3 :
					// myparser.g:59:14: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr514); 
					}
					break;
				case 4 :
					// myparser.g:60:8: '(' arith_expression ')'
					{
					match(input,27,FOLLOW_27_in_primaryExpr523); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr525);
					arith_expression();
					state._fsp--;

					match(input,28,FOLLOW_28_in_primaryExpr527); 
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
	// $ANTLR end "primaryExpr"



	// $ANTLR start "statement"
	// myparser.g:63:1: statement : ( Identifier '=' arith_expression ';' | IF condition_block ( ELSE stat_block )? | WHILE '(' arith_expression ')' while_then_statements | DO do_while_then_statements WHILE '(' arith_expression ')' ';' | for_statement | print_statement | switch_case_statement );
	public final void statement() throws RecognitionException {
		try {
			// myparser.g:63:10: ( Identifier '=' arith_expression ';' | IF condition_block ( ELSE stat_block )? | WHILE '(' arith_expression ')' while_then_statements | DO do_while_then_statements WHILE '(' arith_expression ')' ';' | for_statement | print_statement | switch_case_statement )
			int alt11=7;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA11_1 = input.LA(2);
				if ( (LA11_1==37) ) {
					alt11=1;
				}
				else if ( (LA11_1==Identifier||LA11_1==24) ) {
					alt11=6;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt11=2;
				}
				break;
			case WHILE:
				{
				alt11=3;
				}
				break;
			case DO:
				{
				alt11=4;
				}
				break;
			case FOR:
				{
				alt11=5;
				}
				break;
			case PRINT:
			case 24:
			case 25:
				{
				alt11=6;
				}
				break;
			case SWITCH:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myparser.g:63:12: Identifier '=' arith_expression ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement546); 
					match(input,37,FOLLOW_37_in_statement548); 
					pushFollow(FOLLOW_arith_expression_in_statement550);
					arith_expression();
					state._fsp--;

					match(input,35,FOLLOW_35_in_statement552); 
					}
					break;
				case 2 :
					// myparser.g:64:12: IF condition_block ( ELSE stat_block )?
					{
					match(input,IF,FOLLOW_IF_in_statement565); 
					pushFollow(FOLLOW_condition_block_in_statement567);
					condition_block();
					state._fsp--;

					// myparser.g:64:31: ( ELSE stat_block )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ELSE) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// myparser.g:64:32: ELSE stat_block
							{
							match(input,ELSE,FOLLOW_ELSE_in_statement570); 
							pushFollow(FOLLOW_stat_block_in_statement572);
							stat_block();
							state._fsp--;

							}
							break;

					}

					 if (TRACEON) System.out.println("if_then_condition");
					}
					break;
				case 3 :
					// myparser.g:65:6: WHILE '(' arith_expression ')' while_then_statements
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement583); 
					match(input,27,FOLLOW_27_in_statement585); 
					pushFollow(FOLLOW_arith_expression_in_statement587);
					arith_expression();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement589); 
					pushFollow(FOLLOW_while_then_statements_in_statement591);
					while_then_statements();
					state._fsp--;

					}
					break;
				case 4 :
					// myparser.g:66:6: DO do_while_then_statements WHILE '(' arith_expression ')' ';'
					{
					match(input,DO,FOLLOW_DO_in_statement598); 
					pushFollow(FOLLOW_do_while_then_statements_in_statement600);
					do_while_then_statements();
					state._fsp--;

					match(input,WHILE,FOLLOW_WHILE_in_statement602); 
					match(input,27,FOLLOW_27_in_statement604); 
					pushFollow(FOLLOW_arith_expression_in_statement606);
					arith_expression();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement608); 
					match(input,35,FOLLOW_35_in_statement610); 
					}
					break;
				case 5 :
					// myparser.g:67:6: for_statement
					{
					pushFollow(FOLLOW_for_statement_in_statement617);
					for_statement();
					state._fsp--;

					}
					break;
				case 6 :
					// myparser.g:68:6: print_statement
					{
					pushFollow(FOLLOW_print_statement_in_statement625);
					print_statement();
					state._fsp--;

					}
					break;
				case 7 :
					// myparser.g:69:6: switch_case_statement
					{
					pushFollow(FOLLOW_switch_case_statement_in_statement632);
					switch_case_statement();
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
	}
	// $ANTLR end "statement"



	// $ANTLR start "for_statement"
	// myparser.g:72:1: for_statement : FOR '(' ( ( Identifier ) | ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )* ( ',' ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )* ';' ( ( ',' )* Identifier ( '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=' ) Integer_constant | Floating_point_constant )* ';' ( ( ',' )* Identifier ( '+' '+' | '-' '-' ) )* ')' stat_block ;
	public final void for_statement() throws RecognitionException {
		try {
			// myparser.g:72:14: ( FOR '(' ( ( Identifier ) | ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )* ( ',' ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )* ';' ( ( ',' )* Identifier ( '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=' ) Integer_constant | Floating_point_constant )* ';' ( ( ',' )* Identifier ( '+' '+' | '-' '-' ) )* ')' stat_block )
			// myparser.g:72:16: FOR '(' ( ( Identifier ) | ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )* ( ',' ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )* ';' ( ( ',' )* Identifier ( '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=' ) Integer_constant | Floating_point_constant )* ';' ( ( ',' )* Identifier ( '+' '+' | '-' '-' ) )* ')' stat_block
			{
			match(input,FOR,FOLLOW_FOR_in_for_statement646); 
			match(input,27,FOLLOW_27_in_for_statement648); 
			// myparser.g:72:23: ( ( Identifier ) | ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )*
			loop12:
			while (true) {
				int alt12=4;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==Identifier) ) {
					int LA12_2 = input.LA(2);
					if ( (LA12_2==37) ) {
						int LA12_3 = input.LA(3);
						if ( (LA12_3==Floating_point_constant) ) {
							alt12=3;
						}
						else if ( (LA12_3==Integer_constant) ) {
							alt12=2;
						}

					}
					else if ( (LA12_2==Identifier||LA12_2==31||LA12_2==35) ) {
						alt12=1;
					}

				}

				switch (alt12) {
				case 1 :
					// myparser.g:72:24: ( Identifier )
					{
					// myparser.g:72:24: ( Identifier )
					// myparser.g:72:25: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_statement651); 
					}

					}
					break;
				case 2 :
					// myparser.g:72:37: ( Identifier '=' Integer_constant )
					{
					// myparser.g:72:37: ( Identifier '=' Integer_constant )
					// myparser.g:72:38: Identifier '=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_statement655); 
					match(input,37,FOLLOW_37_in_for_statement657); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_for_statement659); 
					}

					}
					break;
				case 3 :
					// myparser.g:72:71: ( Identifier '=' Floating_point_constant )
					{
					// myparser.g:72:71: ( Identifier '=' Floating_point_constant )
					// myparser.g:72:72: Identifier '=' Floating_point_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_statement663); 
					match(input,37,FOLLOW_37_in_for_statement665); 
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_for_statement667); 
					}

					}
					break;

				default :
					break loop12;
				}
			}

			// myparser.g:72:114: ( ',' ( Identifier '=' Integer_constant ) | ( Identifier '=' Floating_point_constant ) )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==31) ) {
					alt13=1;
				}
				else if ( (LA13_0==Identifier) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// myparser.g:72:115: ',' ( Identifier '=' Integer_constant )
					{
					match(input,31,FOLLOW_31_in_for_statement673); 
					// myparser.g:72:119: ( Identifier '=' Integer_constant )
					// myparser.g:72:120: Identifier '=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_statement676); 
					match(input,37,FOLLOW_37_in_for_statement678); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_for_statement680); 
					}

					}
					break;
				case 2 :
					// myparser.g:72:153: ( Identifier '=' Floating_point_constant )
					{
					// myparser.g:72:153: ( Identifier '=' Floating_point_constant )
					// myparser.g:72:154: Identifier '=' Floating_point_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_statement684); 
					match(input,37,FOLLOW_37_in_for_statement686); 
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_for_statement688); 
					}

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,35,FOLLOW_35_in_for_statement692); 
			// myparser.g:72:198: ( ( ',' )* Identifier ( '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=' ) Integer_constant | Floating_point_constant )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==Identifier||LA16_0==31) ) {
					alt16=1;
				}
				else if ( (LA16_0==Floating_point_constant) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// myparser.g:72:199: ( ',' )* Identifier ( '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=' ) Integer_constant
					{
					// myparser.g:72:199: ( ',' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==31) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// myparser.g:72:200: ','
							{
							match(input,31,FOLLOW_31_in_for_statement695); 
							}
							break;

						default :
							break loop14;
						}
					}

					match(input,Identifier,FOLLOW_Identifier_in_for_statement698); 
					// myparser.g:72:216: ( '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=' )
					int alt15=6;
					switch ( input.LA(1) ) {
					case 36:
						{
						int LA15_1 = input.LA(2);
						if ( (LA15_1==37) ) {
							alt15=3;
						}
						else if ( (LA15_1==Integer_constant) ) {
							alt15=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 15, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 38:
						{
						int LA15_2 = input.LA(2);
						if ( (LA15_2==37) ) {
							alt15=4;
						}
						else if ( (LA15_2==Integer_constant) ) {
							alt15=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 15, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 23:
						{
						alt15=5;
						}
						break;
					case 37:
						{
						alt15=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// myparser.g:72:217: '<'
							{
							match(input,36,FOLLOW_36_in_for_statement701); 
							}
							break;
						case 2 :
							// myparser.g:72:221: '>'
							{
							match(input,38,FOLLOW_38_in_for_statement703); 
							}
							break;
						case 3 :
							// myparser.g:72:225: '<' '='
							{
							match(input,36,FOLLOW_36_in_for_statement705); 
							match(input,37,FOLLOW_37_in_for_statement706); 
							}
							break;
						case 4 :
							// myparser.g:72:232: '>' '='
							{
							match(input,38,FOLLOW_38_in_for_statement708); 
							match(input,37,FOLLOW_37_in_for_statement709); 
							}
							break;
						case 5 :
							// myparser.g:72:239: '!' '='
							{
							match(input,23,FOLLOW_23_in_for_statement711); 
							match(input,37,FOLLOW_37_in_for_statement712); 
							}
							break;
						case 6 :
							// myparser.g:72:246: '=' '='
							{
							match(input,37,FOLLOW_37_in_for_statement714); 
							match(input,37,FOLLOW_37_in_for_statement715); 
							}
							break;

					}

					match(input,Integer_constant,FOLLOW_Integer_constant_in_for_statement718); 
					}
					break;
				case 2 :
					// myparser.g:72:271: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_for_statement720); 
					}
					break;

				default :
					break loop16;
				}
			}

			match(input,35,FOLLOW_35_in_for_statement724); 
			// myparser.g:72:300: ( ( ',' )* Identifier ( '+' '+' | '-' '-' ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Identifier||LA19_0==31) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myparser.g:72:301: ( ',' )* Identifier ( '+' '+' | '-' '-' )
					{
					// myparser.g:72:301: ( ',' )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==31) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// myparser.g:72:302: ','
							{
							match(input,31,FOLLOW_31_in_for_statement727); 
							}
							break;

						default :
							break loop17;
						}
					}

					match(input,Identifier,FOLLOW_Identifier_in_for_statement730); 
					// myparser.g:72:318: ( '+' '+' | '-' '-' )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==30) ) {
						alt18=1;
					}
					else if ( (LA18_0==32) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// myparser.g:72:319: '+' '+'
							{
							match(input,30,FOLLOW_30_in_for_statement733); 
							match(input,30,FOLLOW_30_in_for_statement734); 
							}
							break;
						case 2 :
							// myparser.g:72:326: '-' '-'
							{
							match(input,32,FOLLOW_32_in_for_statement736); 
							match(input,32,FOLLOW_32_in_for_statement737); 
							}
							break;

					}

					}
					break;

				default :
					break loop19;
				}
			}

			match(input,28,FOLLOW_28_in_for_statement742); 
			pushFollow(FOLLOW_stat_block_in_for_statement744);
			stat_block();
			state._fsp--;

			 if (TRACEON) System.out.println("for loop");
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
	// $ANTLR end "for_statement"



	// $ANTLR start "condition_block"
	// myparser.g:74:1: condition_block : '(' arith_expression ')' stat_block ;
	public final void condition_block() throws RecognitionException {
		try {
			// myparser.g:74:16: ( '(' arith_expression ')' stat_block )
			// myparser.g:74:18: '(' arith_expression ')' stat_block
			{
			match(input,27,FOLLOW_27_in_condition_block752); 
			pushFollow(FOLLOW_arith_expression_in_condition_block754);
			arith_expression();
			state._fsp--;

			match(input,28,FOLLOW_28_in_condition_block756); 
			pushFollow(FOLLOW_stat_block_in_condition_block758);
			stat_block();
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
	// $ANTLR end "condition_block"



	// $ANTLR start "stat_block"
	// myparser.g:76:1: stat_block : ( '(' block ')' | '{' '}' | '{' statement '}' | statement );
	public final void stat_block() throws RecognitionException {
		try {
			// myparser.g:76:11: ( '(' block ')' | '{' '}' | '{' statement '}' | statement )
			int alt20=4;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt20=1;
				}
				break;
			case 39:
				{
				int LA20_2 = input.LA(2);
				if ( (LA20_2==41) ) {
					alt20=2;
				}
				else if ( (LA20_2==DO||LA20_2==FOR||LA20_2==IF||LA20_2==Identifier||(LA20_2 >= PRINT && LA20_2 <= SWITCH)||LA20_2==WHILE||(LA20_2 >= 24 && LA20_2 <= 25)) ) {
					alt20=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DO:
			case FOR:
			case IF:
			case Identifier:
			case PRINT:
			case SWITCH:
			case WHILE:
			case 24:
			case 25:
				{
				alt20=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// myparser.g:76:13: '(' block ')'
					{
					match(input,27,FOLLOW_27_in_stat_block771); 
					pushFollow(FOLLOW_block_in_stat_block773);
					block();
					state._fsp--;

					match(input,28,FOLLOW_28_in_stat_block775); 
					}
					break;
				case 2 :
					// myparser.g:77:7: '{' '}'
					{
					match(input,39,FOLLOW_39_in_stat_block783); 
					match(input,41,FOLLOW_41_in_stat_block785); 
					}
					break;
				case 3 :
					// myparser.g:78:7: '{' statement '}'
					{
					match(input,39,FOLLOW_39_in_stat_block793); 
					pushFollow(FOLLOW_statement_in_stat_block795);
					statement();
					state._fsp--;

					match(input,41,FOLLOW_41_in_stat_block797); 
					}
					break;
				case 4 :
					// myparser.g:79:7: statement
					{
					pushFollow(FOLLOW_statement_in_stat_block805);
					statement();
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
	}
	// $ANTLR end "stat_block"



	// $ANTLR start "print_statement"
	// myparser.g:82:1: print_statement : ( PRINT '(' '\"' ( Identifier )* ( Integer_constant )* ( Floating_point_constant )* ( '%' Integer_constant Identifier )* | ( '%' Floating_point_constant Identifier )* ( Identifier )* '\"' ( ',' Identifier )* ')' ';' );
	public final void print_statement() throws RecognitionException {
		try {
			// myparser.g:82:16: ( PRINT '(' '\"' ( Identifier )* ( Integer_constant )* ( Floating_point_constant )* ( '%' Integer_constant Identifier )* | ( '%' Floating_point_constant Identifier )* ( Identifier )* '\"' ( ',' Identifier )* ')' ';' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==PRINT) ) {
				alt28=1;
			}
			else if ( (LA28_0==Identifier||(LA28_0 >= 24 && LA28_0 <= 25)) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// myparser.g:82:18: PRINT '(' '\"' ( Identifier )* ( Integer_constant )* ( Floating_point_constant )* ( '%' Integer_constant Identifier )*
					{
					match(input,PRINT,FOLLOW_PRINT_in_print_statement817); 
					match(input,27,FOLLOW_27_in_print_statement819); 
					match(input,24,FOLLOW_24_in_print_statement820); 
					// myparser.g:82:30: ( Identifier )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==Identifier) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// myparser.g:82:30: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_print_statement821); 
							}
							break;

						default :
							break loop21;
						}
					}

					// myparser.g:82:42: ( Integer_constant )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==Integer_constant) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// myparser.g:82:42: Integer_constant
							{
							match(input,Integer_constant,FOLLOW_Integer_constant_in_print_statement824); 
							}
							break;

						default :
							break loop22;
						}
					}

					// myparser.g:82:60: ( Floating_point_constant )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==Floating_point_constant) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// myparser.g:82:60: Floating_point_constant
							{
							match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_print_statement827); 
							}
							break;

						default :
							break loop23;
						}
					}

					// myparser.g:82:85: ( '%' Integer_constant Identifier )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==25) ) {
							int LA24_2 = input.LA(2);
							if ( (LA24_2==Integer_constant) ) {
								alt24=1;
							}

						}

						switch (alt24) {
						case 1 :
							// myparser.g:82:86: '%' Integer_constant Identifier
							{
							match(input,25,FOLLOW_25_in_print_statement831); 
							match(input,Integer_constant,FOLLOW_Integer_constant_in_print_statement832); 
							match(input,Identifier,FOLLOW_Identifier_in_print_statement834); 
							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;
				case 2 :
					// myparser.g:82:119: ( '%' Floating_point_constant Identifier )* ( Identifier )* '\"' ( ',' Identifier )* ')' ';'
					{
					// myparser.g:82:119: ( '%' Floating_point_constant Identifier )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==25) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// myparser.g:82:120: '%' Floating_point_constant Identifier
							{
							match(input,25,FOLLOW_25_in_print_statement839); 
							match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_print_statement841); 
							match(input,Identifier,FOLLOW_Identifier_in_print_statement843); 
							}
							break;

						default :
							break loop25;
						}
					}

					// myparser.g:82:161: ( Identifier )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==Identifier) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// myparser.g:82:161: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_print_statement847); 
							}
							break;

						default :
							break loop26;
						}
					}

					match(input,24,FOLLOW_24_in_print_statement850); 
					// myparser.g:82:177: ( ',' Identifier )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==31) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// myparser.g:82:178: ',' Identifier
							{
							match(input,31,FOLLOW_31_in_print_statement853); 
							match(input,Identifier,FOLLOW_Identifier_in_print_statement854); 
							}
							break;

						default :
							break loop27;
						}
					}

					match(input,28,FOLLOW_28_in_print_statement858); 
					match(input,35,FOLLOW_35_in_print_statement860); 
					 if (TRACEON) System.out.println("PRINT");
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
	// $ANTLR end "print_statement"



	// $ANTLR start "switch_case_statement"
	// myparser.g:84:1: switch_case_statement : SWITCH '(' Identifier ')' '{' ( CASE Integer_constant ':' stat_block BREAK ';' )* DEFAULT ':' stat_block '}' ;
	public final void switch_case_statement() throws RecognitionException {
		try {
			// myparser.g:84:22: ( SWITCH '(' Identifier ')' '{' ( CASE Integer_constant ':' stat_block BREAK ';' )* DEFAULT ':' stat_block '}' )
			// myparser.g:84:24: SWITCH '(' Identifier ')' '{' ( CASE Integer_constant ':' stat_block BREAK ';' )* DEFAULT ':' stat_block '}'
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switch_case_statement868); 
			match(input,27,FOLLOW_27_in_switch_case_statement870); 
			match(input,Identifier,FOLLOW_Identifier_in_switch_case_statement872); 
			match(input,28,FOLLOW_28_in_switch_case_statement874); 
			match(input,39,FOLLOW_39_in_switch_case_statement876); 
			// myparser.g:84:54: ( CASE Integer_constant ':' stat_block BREAK ';' )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==CASE) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// myparser.g:84:55: CASE Integer_constant ':' stat_block BREAK ';'
					{
					match(input,CASE,FOLLOW_CASE_in_switch_case_statement879); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_switch_case_statement881); 
					match(input,34,FOLLOW_34_in_switch_case_statement883); 
					pushFollow(FOLLOW_stat_block_in_switch_case_statement885);
					stat_block();
					state._fsp--;

					match(input,BREAK,FOLLOW_BREAK_in_switch_case_statement887); 
					match(input,35,FOLLOW_35_in_switch_case_statement889); 
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,DEFAULT,FOLLOW_DEFAULT_in_switch_case_statement893); 
			match(input,34,FOLLOW_34_in_switch_case_statement895); 
			pushFollow(FOLLOW_stat_block_in_switch_case_statement897);
			stat_block();
			state._fsp--;

			match(input,41,FOLLOW_41_in_switch_case_statement899); 
			 if (TRACEON) System.out.println("switch_case");
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
	// $ANTLR end "switch_case_statement"



	// $ANTLR start "while_then_statements"
	// myparser.g:86:1: while_then_statements : ( statement | '{' statements '}' );
	public final void while_then_statements() throws RecognitionException {
		try {
			// myparser.g:86:22: ( statement | '{' statements '}' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==DO||LA30_0==FOR||LA30_0==IF||LA30_0==Identifier||(LA30_0 >= PRINT && LA30_0 <= SWITCH)||LA30_0==WHILE||(LA30_0 >= 24 && LA30_0 <= 25)) ) {
				alt30=1;
			}
			else if ( (LA30_0==39) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// myparser.g:86:24: statement
					{
					pushFollow(FOLLOW_statement_in_while_then_statements907);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:87:21: '{' statements '}'
					{
					match(input,39,FOLLOW_39_in_while_then_statements929); 
					pushFollow(FOLLOW_statements_in_while_then_statements931);
					statements();
					state._fsp--;

					match(input,41,FOLLOW_41_in_while_then_statements933); 
					 if (TRACEON) System.out.println("while loop");
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
	// $ANTLR end "while_then_statements"



	// $ANTLR start "do_while_then_statements"
	// myparser.g:90:1: do_while_then_statements : ( statement | '{' statements '}' );
	public final void do_while_then_statements() throws RecognitionException {
		try {
			// myparser.g:90:25: ( statement | '{' statements '}' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==DO||LA31_0==FOR||LA31_0==IF||LA31_0==Identifier||(LA31_0 >= PRINT && LA31_0 <= SWITCH)||LA31_0==WHILE||(LA31_0 >= 24 && LA31_0 <= 25)) ) {
				alt31=1;
			}
			else if ( (LA31_0==39) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// myparser.g:90:27: statement
					{
					pushFollow(FOLLOW_statement_in_do_while_then_statements948);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:91:8: '{' statements '}'
					{
					match(input,39,FOLLOW_39_in_do_while_then_statements957); 
					pushFollow(FOLLOW_statements_in_do_while_then_statements959);
					statements();
					state._fsp--;

					match(input,41,FOLLOW_41_in_do_while_then_statements961); 
					 if (TRACEON) System.out.println("do_while loop");
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
	// $ANTLR end "do_while_then_statements"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program35 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_MAIN_in_program37 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_program39 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_program41 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_program43 = new BitSet(new long[]{0x00000200032CED00L});
	public static final BitSet FOLLOW_declarations_in_program45 = new BitSet(new long[]{0x00000200032CA900L});
	public static final BitSet FOLLOW_statements_in_program47 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations65 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_declarations67 = new BitSet(new long[]{0x0000000880000000L});
	public static final BitSet FOLLOW_31_in_declarations70 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_declarations71 = new BitSet(new long[]{0x0000000880000000L});
	public static final BitSet FOLLOW_35_in_declarations75 = new BitSet(new long[]{0x0000000000004400L});
	public static final BitSet FOLLOW_declarations_in_declarations77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_block135 = new BitSet(new long[]{0x00000200032CA900L});
	public static final BitSet FOLLOW_statements_in_block136 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_block138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements147 = new BitSet(new long[]{0x00000000032CA900L});
	public static final BitSet FOLLOW_statements_in_statements149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression166 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_30_in_arith_expression188 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression190 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_32_in_arith_expression200 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression202 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_38_in_arith_expression212 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression214 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_36_in_arith_expression224 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression226 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_37_in_arith_expression236 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression237 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression239 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_38_in_arith_expression255 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression256 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression258 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_36_in_arith_expression268 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression269 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression271 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_23_in_arith_expression281 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression282 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression284 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_30_in_arith_expression294 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression295 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression297 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_30_in_arith_expression307 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arith_expression308 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression310 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_32_in_arith_expression320 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression321 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression323 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_29_in_arith_expression333 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression334 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression336 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_33_in_arith_expression346 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_arith_expression347 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression349 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_40_in_arith_expression359 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_arith_expression360 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression362 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_26_in_arith_expression372 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_arith_expression373 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression375 = new BitSet(new long[]{0x0000017364800002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr410 = new BitSet(new long[]{0x0000000220000002L});
	public static final BitSet FOLLOW_29_in_multExpr424 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr426 = new BitSet(new long[]{0x0000000220000002L});
	public static final BitSet FOLLOW_33_in_multExpr440 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr442 = new BitSet(new long[]{0x0000000220000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_signExpr473 = new BitSet(new long[]{0x0000000008019000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_primaryExpr523 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr525 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_primaryExpr527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement546 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_statement548 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_arith_expression_in_statement550 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement565 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_condition_block_in_statement567 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ELSE_in_statement570 = new BitSet(new long[]{0x000000800B2CA900L});
	public static final BitSet FOLLOW_stat_block_in_statement572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement583 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_statement585 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_arith_expression_in_statement587 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement589 = new BitSet(new long[]{0x00000080032CA900L});
	public static final BitSet FOLLOW_while_then_statements_in_statement591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_statement598 = new BitSet(new long[]{0x00000080032CA900L});
	public static final BitSet FOLLOW_do_while_then_statements_in_statement600 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_WHILE_in_statement602 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_statement604 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_arith_expression_in_statement606 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement608 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_statement625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_case_statement_in_statement632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_statement646 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_for_statement648 = new BitSet(new long[]{0x0000000880008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement651 = new BitSet(new long[]{0x0000000880008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement655 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement657 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_Integer_constant_in_for_statement659 = new BitSet(new long[]{0x0000000880008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement663 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement665 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Floating_point_constant_in_for_statement667 = new BitSet(new long[]{0x0000000880008000L});
	public static final BitSet FOLLOW_31_in_for_statement673 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement676 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement678 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_Integer_constant_in_for_statement680 = new BitSet(new long[]{0x0000000880008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement684 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement686 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Floating_point_constant_in_for_statement688 = new BitSet(new long[]{0x0000000880008000L});
	public static final BitSet FOLLOW_35_in_for_statement692 = new BitSet(new long[]{0x0000000880009000L});
	public static final BitSet FOLLOW_31_in_for_statement695 = new BitSet(new long[]{0x0000000080008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement698 = new BitSet(new long[]{0x0000007000800000L});
	public static final BitSet FOLLOW_36_in_for_statement701 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_38_in_for_statement703 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_36_in_for_statement705 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement706 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_38_in_for_statement708 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement709 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_23_in_for_statement711 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement712 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_37_in_for_statement714 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_for_statement715 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_Integer_constant_in_for_statement718 = new BitSet(new long[]{0x0000000880009000L});
	public static final BitSet FOLLOW_Floating_point_constant_in_for_statement720 = new BitSet(new long[]{0x0000000880009000L});
	public static final BitSet FOLLOW_35_in_for_statement724 = new BitSet(new long[]{0x0000000090008000L});
	public static final BitSet FOLLOW_31_in_for_statement727 = new BitSet(new long[]{0x0000000080008000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement730 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_30_in_for_statement733 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_statement734 = new BitSet(new long[]{0x0000000090008000L});
	public static final BitSet FOLLOW_32_in_for_statement736 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_for_statement737 = new BitSet(new long[]{0x0000000090008000L});
	public static final BitSet FOLLOW_28_in_for_statement742 = new BitSet(new long[]{0x000000800B2CA900L});
	public static final BitSet FOLLOW_stat_block_in_for_statement744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_condition_block752 = new BitSet(new long[]{0x0000000108019000L});
	public static final BitSet FOLLOW_arith_expression_in_condition_block754 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_condition_block756 = new BitSet(new long[]{0x000000800B2CA900L});
	public static final BitSet FOLLOW_stat_block_in_condition_block758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stat_block771 = new BitSet(new long[]{0x00000080032CA900L});
	public static final BitSet FOLLOW_block_in_stat_block773 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_stat_block775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_stat_block783 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_stat_block785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_stat_block793 = new BitSet(new long[]{0x00000000032CA900L});
	public static final BitSet FOLLOW_statement_in_stat_block795 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_stat_block797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_stat_block805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement817 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_print_statement819 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_print_statement820 = new BitSet(new long[]{0x0000000002019002L});
	public static final BitSet FOLLOW_Identifier_in_print_statement821 = new BitSet(new long[]{0x0000000002019002L});
	public static final BitSet FOLLOW_Integer_constant_in_print_statement824 = new BitSet(new long[]{0x0000000002011002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_print_statement827 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_25_in_print_statement831 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_Integer_constant_in_print_statement832 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_print_statement834 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_print_statement839 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Floating_point_constant_in_print_statement841 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_print_statement843 = new BitSet(new long[]{0x0000000003008000L});
	public static final BitSet FOLLOW_Identifier_in_print_statement847 = new BitSet(new long[]{0x0000000001008000L});
	public static final BitSet FOLLOW_24_in_print_statement850 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_31_in_print_statement853 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_print_statement854 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_28_in_print_statement858 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_print_statement860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switch_case_statement868 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_switch_case_statement870 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_switch_case_statement872 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_switch_case_statement874 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_switch_case_statement876 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_CASE_in_switch_case_statement879 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_Integer_constant_in_switch_case_statement881 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_switch_case_statement883 = new BitSet(new long[]{0x000000800B2CA900L});
	public static final BitSet FOLLOW_stat_block_in_switch_case_statement885 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BREAK_in_switch_case_statement887 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_switch_case_statement889 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_DEFAULT_in_switch_case_statement893 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_switch_case_statement895 = new BitSet(new long[]{0x000000800B2CA900L});
	public static final BitSet FOLLOW_stat_block_in_switch_case_statement897 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_switch_case_statement899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_while_then_statements907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_while_then_statements929 = new BitSet(new long[]{0x00000200032CA900L});
	public static final BitSet FOLLOW_statements_in_while_then_statements931 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_while_then_statements933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_do_while_then_statements948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_do_while_then_statements957 = new BitSet(new long[]{0x00000200032CA900L});
	public static final BitSet FOLLOW_statements_in_do_while_then_statements959 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_do_while_then_statements961 = new BitSet(new long[]{0x0000000000000002L});
}
