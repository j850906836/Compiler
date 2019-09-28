// $ANTLR 3.5.2 myparser.g 2019-05-22 00:54:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myparserLexer() {} 
	public myparserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myparser.g"; }

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:7:7: ( '!' )
			// myparser.g:7:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:8:7: ( '\"' )
			// myparser.g:8:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:9:7: ( '%' )
			// myparser.g:9:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:10:7: ( '&' )
			// myparser.g:10:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:11:7: ( '(' )
			// myparser.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:12:7: ( ')' )
			// myparser.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:13:7: ( '*' )
			// myparser.g:13:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:14:7: ( '+' )
			// myparser.g:14:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:15:7: ( ',' )
			// myparser.g:15:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:16:7: ( '-' )
			// myparser.g:16:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:17:7: ( '/' )
			// myparser.g:17:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:18:7: ( ':' )
			// myparser.g:18:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:19:7: ( ';' )
			// myparser.g:19:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:20:7: ( '<' )
			// myparser.g:20:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:21:7: ( '=' )
			// myparser.g:21:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:22:7: ( '>' )
			// myparser.g:22:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:23:7: ( '{' )
			// myparser.g:23:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:24:7: ( '|' )
			// myparser.g:24:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:25:7: ( '}' )
			// myparser.g:25:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:95:6: ( 'float' )
			// myparser.g:95:7: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:96:4: ( 'int' )
			// myparser.g:96:5: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:97:5: ( 'main' )
			// myparser.g:97:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:98:5: ( 'void' )
			// myparser.g:98:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:99:3: ( 'if' )
			// myparser.g:99:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:100:5: ( 'else' )
			// myparser.g:100:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:101:6: ( 'while' )
			// myparser.g:101:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:102:3: ( 'do' )
			// myparser.g:102:5: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:103:4: ( 'for' )
			// myparser.g:103:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:104:7: ( 'switch' )
			// myparser.g:104:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:105:5: ( 'case' )
			// myparser.g:105:7: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:106:6: ( 'break' )
			// myparser.g:106:8: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:107:8: ( 'default' )
			// myparser.g:107:10: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:108:6: ( 'printf' )
			// myparser.g:108:8: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:110:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myparser.g:110:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myparser.g:110:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:111:17: ( ( '0' .. '9' )+ )
			// myparser.g:111:18: ( '0' .. '9' )+
			{
			// myparser.g:111:18: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:112:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myparser.g:112:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myparser.g:112:25: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// myparser.g:112:39: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:114:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myparser.g:114:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:115:8: ( '/*' ( . )* '*/' )
			// myparser.g:115:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myparser.g:115:14: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='*') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='/') ) {
						alt5=2;
					}
					else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myparser.g:115:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// myparser.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | FLOAT | INT | MAIN | VOID | IF | ELSE | WHILE | DO | FOR | SWITCH | CASE | BREAK | DEFAULT | PRINT | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT )
		int alt6=38;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// myparser.g:1:10: T__23
				{
				mT__23(); 

				}
				break;
			case 2 :
				// myparser.g:1:16: T__24
				{
				mT__24(); 

				}
				break;
			case 3 :
				// myparser.g:1:22: T__25
				{
				mT__25(); 

				}
				break;
			case 4 :
				// myparser.g:1:28: T__26
				{
				mT__26(); 

				}
				break;
			case 5 :
				// myparser.g:1:34: T__27
				{
				mT__27(); 

				}
				break;
			case 6 :
				// myparser.g:1:40: T__28
				{
				mT__28(); 

				}
				break;
			case 7 :
				// myparser.g:1:46: T__29
				{
				mT__29(); 

				}
				break;
			case 8 :
				// myparser.g:1:52: T__30
				{
				mT__30(); 

				}
				break;
			case 9 :
				// myparser.g:1:58: T__31
				{
				mT__31(); 

				}
				break;
			case 10 :
				// myparser.g:1:64: T__32
				{
				mT__32(); 

				}
				break;
			case 11 :
				// myparser.g:1:70: T__33
				{
				mT__33(); 

				}
				break;
			case 12 :
				// myparser.g:1:76: T__34
				{
				mT__34(); 

				}
				break;
			case 13 :
				// myparser.g:1:82: T__35
				{
				mT__35(); 

				}
				break;
			case 14 :
				// myparser.g:1:88: T__36
				{
				mT__36(); 

				}
				break;
			case 15 :
				// myparser.g:1:94: T__37
				{
				mT__37(); 

				}
				break;
			case 16 :
				// myparser.g:1:100: T__38
				{
				mT__38(); 

				}
				break;
			case 17 :
				// myparser.g:1:106: T__39
				{
				mT__39(); 

				}
				break;
			case 18 :
				// myparser.g:1:112: T__40
				{
				mT__40(); 

				}
				break;
			case 19 :
				// myparser.g:1:118: T__41
				{
				mT__41(); 

				}
				break;
			case 20 :
				// myparser.g:1:124: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 21 :
				// myparser.g:1:130: INT
				{
				mINT(); 

				}
				break;
			case 22 :
				// myparser.g:1:134: MAIN
				{
				mMAIN(); 

				}
				break;
			case 23 :
				// myparser.g:1:139: VOID
				{
				mVOID(); 

				}
				break;
			case 24 :
				// myparser.g:1:144: IF
				{
				mIF(); 

				}
				break;
			case 25 :
				// myparser.g:1:147: ELSE
				{
				mELSE(); 

				}
				break;
			case 26 :
				// myparser.g:1:152: WHILE
				{
				mWHILE(); 

				}
				break;
			case 27 :
				// myparser.g:1:158: DO
				{
				mDO(); 

				}
				break;
			case 28 :
				// myparser.g:1:161: FOR
				{
				mFOR(); 

				}
				break;
			case 29 :
				// myparser.g:1:165: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 30 :
				// myparser.g:1:172: CASE
				{
				mCASE(); 

				}
				break;
			case 31 :
				// myparser.g:1:177: BREAK
				{
				mBREAK(); 

				}
				break;
			case 32 :
				// myparser.g:1:183: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 33 :
				// myparser.g:1:191: PRINT
				{
				mPRINT(); 

				}
				break;
			case 34 :
				// myparser.g:1:197: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 35 :
				// myparser.g:1:208: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 36 :
				// myparser.g:1:225: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 37 :
				// myparser.g:1:249: WS
				{
				mWS(); 

				}
				break;
			case 38 :
				// myparser.g:1:252: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\13\uffff\1\43\10\uffff\13\37\1\uffff\1\62\3\uffff\3\37\1\67\4\37\1\74"+
		"\5\37\2\uffff\1\37\1\103\1\104\1\uffff\4\37\1\uffff\6\37\2\uffff\1\117"+
		"\1\120\1\121\3\37\1\125\2\37\1\130\3\uffff\1\131\2\37\1\uffff\1\134\1"+
		"\37\2\uffff\1\37\1\137\1\uffff\1\140\1\141\3\uffff";
	static final String DFA6_eofS =
		"\142\uffff";
	static final String DFA6_minS =
		"\1\11\12\uffff\1\52\10\uffff\1\154\1\146\1\141\1\157\1\154\1\150\1\145"+
		"\1\167\1\141\2\162\1\uffff\1\56\3\uffff\1\157\1\162\1\164\1\60\2\151\1"+
		"\163\1\151\1\60\1\146\1\151\1\163\1\145\1\151\2\uffff\1\141\2\60\1\uffff"+
		"\1\156\1\144\1\145\1\154\1\uffff\1\141\1\164\1\145\1\141\1\156\1\164\2"+
		"\uffff\3\60\1\145\1\165\1\143\1\60\1\153\1\164\1\60\3\uffff\1\60\1\154"+
		"\1\150\1\uffff\1\60\1\146\2\uffff\1\164\1\60\1\uffff\2\60\3\uffff";
	static final String DFA6_maxS =
		"\1\175\12\uffff\1\52\10\uffff\1\157\1\156\1\141\1\157\1\154\1\150\1\157"+
		"\1\167\1\141\2\162\1\uffff\1\71\3\uffff\1\157\1\162\1\164\1\172\2\151"+
		"\1\163\1\151\1\172\1\146\1\151\1\163\1\145\1\151\2\uffff\1\141\2\172\1"+
		"\uffff\1\156\1\144\1\145\1\154\1\uffff\1\141\1\164\1\145\1\141\1\156\1"+
		"\164\2\uffff\3\172\1\145\1\165\1\143\1\172\1\153\1\164\1\172\3\uffff\1"+
		"\172\1\154\1\150\1\uffff\1\172\1\146\2\uffff\1\164\1\172\1\uffff\2\172"+
		"\3\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\13\uffff\1\42\1\uffff\1\45\1\46\1\13\16"+
		"\uffff\1\43\1\44\3\uffff\1\30\4\uffff\1\33\6\uffff\1\34\1\25\12\uffff"+
		"\1\26\1\27\1\31\3\uffff\1\36\2\uffff\1\24\1\32\2\uffff\1\37\2\uffff\1"+
		"\35\1\41\1\40";
	static final String DFA6_specialS =
		"\142\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\1\1\2\2\uffff\1\3\1\4\1\uffff\1\5"+
			"\1\6\1\7\1\10\1\11\1\12\1\uffff\1\13\12\40\1\14\1\15\1\16\1\17\1\20\2"+
			"\uffff\32\37\4\uffff\1\37\1\uffff\1\37\1\35\1\34\1\32\1\30\1\24\2\37"+
			"\1\25\3\37\1\26\2\37\1\36\2\37\1\33\2\37\1\27\1\31\3\37\1\21\1\22\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\2\uffff\1\45",
			"\1\47\7\uffff\1\46",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\55\11\uffff\1\54",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"",
			"\1\63\1\uffff\12\40",
			"",
			"",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\1\102",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\122",
			"\1\123",
			"\1\124",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\126",
			"\1\127",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\132",
			"\1\133",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\135",
			"",
			"",
			"\1\136",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | FLOAT | INT | MAIN | VOID | IF | ELSE | WHILE | DO | FOR | SWITCH | CASE | BREAK | DEFAULT | PRINT | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT );";
		}
	}

}
