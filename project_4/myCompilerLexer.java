// $ANTLR 3.5.2 myCompiler.g 2019-06-21 14:12:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
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
	public static final int PRINT=16;
	public static final int RelationOP=17;
	public static final int STRING_LITERAL=18;
	public static final int VOID=19;
	public static final int WS=20;
	public static final int Words=21;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( '&' )
			// myCompiler.g:7:9: '&'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:8:7: ( '(' )
			// myCompiler.g:8:9: '('
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:9:7: ( ')' )
			// myCompiler.g:9:9: ')'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:10:7: ( '*' )
			// myCompiler.g:10:9: '*'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:11:7: ( '+' )
			// myCompiler.g:11:9: '+'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:12:7: ( ',' )
			// myCompiler.g:12:9: ','
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:13:7: ( '-' )
			// myCompiler.g:13:9: '-'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:14:7: ( '/' )
			// myCompiler.g:14:9: '/'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:15:7: ( ';' )
			// myCompiler.g:15:9: ';'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:16:7: ( '=' )
			// myCompiler.g:16:9: '='
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:17:7: ( '{' )
			// myCompiler.g:17:9: '{'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:18:7: ( '}' )
			// myCompiler.g:18:9: '}'
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
	// $ANTLR end "T__33"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:425:6: ( 'float' )
			// myCompiler.g:425:7: 'float'
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
			// myCompiler.g:426:4: ( 'int' )
			// myCompiler.g:426:5: 'int'
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:427:5: ( 'char' )
			// myCompiler.g:427:7: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:429:5: ( 'main' )
			// myCompiler.g:429:7: 'main'
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
			// myCompiler.g:430:5: ( 'void' )
			// myCompiler.g:430:7: 'void'
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
			// myCompiler.g:431:3: ( 'if' )
			// myCompiler.g:431:5: 'if'
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
			// myCompiler.g:432:5: ( 'else' )
			// myCompiler.g:432:7: 'else'
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

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:433:4: ( 'for' )
			// myCompiler.g:433:6: 'for'
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

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:434:6: ( 'printf' )
			// myCompiler.g:434:8: 'printf'
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

	// $ANTLR start "RelationOP"
	public final void mRelationOP() throws RecognitionException {
		try {
			int _type = RelationOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:436:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					alt1=2;
				}

				else {
					alt1=1;
				}

				}
				break;
			case '<':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='=') ) {
					alt1=4;
				}

				else {
					alt1=3;
				}

				}
				break;
			case '=':
				{
				alt1=5;
				}
				break;
			case '!':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// myCompiler.g:436:13: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// myCompiler.g:436:18: '>='
					{
					match(">="); 

					}
					break;
				case 3 :
					// myCompiler.g:436:25: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// myCompiler.g:436:31: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// myCompiler.g:436:38: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// myCompiler.g:436:45: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RelationOP"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:438:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myCompiler.g:438:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:438:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:
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
					break loop2;
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

	// $ANTLR start "Words"
	public final void mWords() throws RecognitionException {
		try {
			int _type = Words;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:439:6: ( '\"' ( Identifier | ' ' | '%' )* '\"' )
			// myCompiler.g:439:8: '\"' ( Identifier | ' ' | '%' )* '\"'
			{
			match('\"'); 
			// myCompiler.g:439:12: ( Identifier | ' ' | '%' )*
			loop3:
			while (true) {
				int alt3=4;
				switch ( input.LA(1) ) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case '_':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt3=1;
					}
					break;
				case ' ':
					{
					alt3=2;
					}
					break;
				case '%':
					{
					alt3=3;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// myCompiler.g:439:13: Identifier
					{
					mIdentifier(); 

					}
					break;
				case 2 :
					// myCompiler.g:439:26: ' '
					{
					match(' '); 
					}
					break;
				case 3 :
					// myCompiler.g:439:32: '%'
					{
					match('%'); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Words"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:440:17: ( ( '0' .. '9' )+ )
			// myCompiler.g:440:18: ( '0' .. '9' )+
			{
			// myCompiler.g:440:18: ( '0' .. '9' )+
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
					// myCompiler.g:
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
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:441:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myCompiler.g:441:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myCompiler.g:441:25: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// myCompiler.g:441:39: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:444:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:444:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:444:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\\') ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:444:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:444:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:447:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myCompiler.g:447:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// myCompiler.g:448:8: ( '/*' ( . )* '*/' )
			// myCompiler.g:448:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:448:14: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:448:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
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

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:454:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:454:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | PRINT | RelationOP | Identifier | Words | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT )
		int alt9=29;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// myCompiler.g:1:10: T__22
				{
				mT__22(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: T__23
				{
				mT__23(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:22: T__24
				{
				mT__24(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:28: T__25
				{
				mT__25(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:34: T__26
				{
				mT__26(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:40: T__27
				{
				mT__27(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:46: T__28
				{
				mT__28(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: T__29
				{
				mT__29(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:58: T__30
				{
				mT__30(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:64: T__31
				{
				mT__31(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:70: T__32
				{
				mT__32(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:76: T__33
				{
				mT__33(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:82: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:88: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:92: CHAR
				{
				mCHAR(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:97: MAIN
				{
				mMAIN(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:102: VOID
				{
				mVOID(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:107: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:110: ELSE
				{
				mELSE(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:115: FOR
				{
				mFOR(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:119: PRINT
				{
				mPRINT(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:125: RelationOP
				{
				mRelationOP(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:136: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:147: Words
				{
				mWords(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:153: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:170: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:194: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:209: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:212: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\10\uffff\1\32\1\uffff\1\33\2\uffff\7\25\3\uffff\1\52\4\uffff\3\25\1\57"+
		"\5\25\7\uffff\1\25\1\71\1\72\1\uffff\5\25\3\uffff\1\25\2\uffff\1\101\1"+
		"\102\1\103\1\104\1\25\1\106\4\uffff\1\25\1\uffff\1\110\1\uffff";
	static final String DFA9_eofS =
		"\111\uffff";
	static final String DFA9_minS =
		"\1\11\7\uffff\1\52\1\uffff\1\75\2\uffff\1\154\1\146\1\150\1\141\1\157"+
		"\1\154\1\162\2\uffff\1\0\1\56\4\uffff\1\157\1\162\1\164\1\60\1\141\2\151"+
		"\1\163\1\151\3\0\4\uffff\1\141\2\60\1\uffff\1\162\1\156\1\144\1\145\1"+
		"\156\2\0\1\uffff\1\164\2\uffff\4\60\1\164\1\60\4\uffff\1\146\1\uffff\1"+
		"\60\1\uffff";
	static final String DFA9_maxS =
		"\1\175\7\uffff\1\52\1\uffff\1\75\2\uffff\1\157\1\156\1\150\1\141\1\157"+
		"\1\154\1\162\2\uffff\1\uffff\1\71\4\uffff\1\157\1\162\1\164\1\172\1\141"+
		"\2\151\1\163\1\151\3\uffff\4\uffff\1\141\2\172\1\uffff\1\162\1\156\1\144"+
		"\1\145\1\156\2\uffff\1\uffff\1\164\2\uffff\4\172\1\164\1\172\4\uffff\1"+
		"\146\1\uffff\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\uffff\1\13\1\14\7"+
		"\uffff\1\26\1\27\2\uffff\1\34\1\35\1\10\1\12\14\uffff\1\30\1\33\1\31\1"+
		"\32\3\uffff\1\22\7\uffff\1\30\1\uffff\1\24\1\16\6\uffff\1\17\1\20\1\21"+
		"\1\23\1\uffff\1\15\1\uffff\1\25";
	static final String DFA9_specialS =
		"\26\uffff\1\1\16\uffff\1\3\1\4\1\5\15\uffff\1\0\1\2\22\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\30\2\uffff\1\30\22\uffff\1\30\1\24\1\26\3\uffff\1\1\1\uffff\1\2\1"+
			"\3\1\4\1\5\1\6\1\7\1\uffff\1\10\12\27\1\uffff\1\11\1\24\1\12\1\24\2\uffff"+
			"\32\25\4\uffff\1\25\1\uffff\2\25\1\17\1\25\1\22\1\15\2\25\1\16\3\25\1"+
			"\20\2\25\1\23\5\25\1\21\4\25\1\13\1\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31",
			"",
			"\1\24",
			"",
			"",
			"\1\34\2\uffff\1\35",
			"\1\37\7\uffff\1\36",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"",
			"",
			"\40\51\1\46\1\51\1\50\2\51\1\47\33\51\32\45\4\51\1\45\1\51\32\45\uff85"+
			"\51",
			"\1\53\1\uffff\12\27",
			"",
			"",
			"",
			"",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\40\51\1\46\1\51\1\50\2\51\1\47\12\51\12\66\7\51\32\65\4\51\1\65\1\51"+
			"\32\65\uff85\51",
			"\40\51\1\46\1\51\1\50\2\51\1\47\33\51\32\45\4\51\1\45\1\51\32\45\uff85"+
			"\51",
			"\40\51\1\46\1\51\1\50\2\51\1\47\33\51\32\45\4\51\1\45\1\51\32\45\uff85"+
			"\51",
			"",
			"",
			"",
			"",
			"\1\70",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\40\51\1\46\1\51\1\50\2\51\1\47\12\51\12\66\7\51\32\65\4\51\1\65\1\51"+
			"\32\65\uff85\51",
			"\40\51\1\46\1\51\1\50\2\51\1\47\12\51\12\66\7\51\32\65\4\51\1\65\1\51"+
			"\32\65\uff85\51",
			"",
			"\1\100",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\105",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"",
			"",
			"",
			"\1\107",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | PRINT | RelationOP | Identifier | Words | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_53 = input.LA(1);
						s = -1;
						if ( (LA9_53=='\"') ) {s = 40;}
						else if ( ((LA9_53 >= 'A' && LA9_53 <= 'Z')||LA9_53=='_'||(LA9_53 >= 'a' && LA9_53 <= 'z')) ) {s = 53;}
						else if ( (LA9_53==' ') ) {s = 38;}
						else if ( (LA9_53=='%') ) {s = 39;}
						else if ( ((LA9_53 >= '0' && LA9_53 <= '9')) ) {s = 54;}
						else if ( ((LA9_53 >= '\u0000' && LA9_53 <= '\u001F')||LA9_53=='!'||(LA9_53 >= '#' && LA9_53 <= '$')||(LA9_53 >= '&' && LA9_53 <= '/')||(LA9_53 >= ':' && LA9_53 <= '@')||(LA9_53 >= '[' && LA9_53 <= '^')||LA9_53=='`'||(LA9_53 >= '{' && LA9_53 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_22 = input.LA(1);
						s = -1;
						if ( ((LA9_22 >= 'A' && LA9_22 <= 'Z')||LA9_22=='_'||(LA9_22 >= 'a' && LA9_22 <= 'z')) ) {s = 37;}
						else if ( (LA9_22==' ') ) {s = 38;}
						else if ( (LA9_22=='%') ) {s = 39;}
						else if ( (LA9_22=='\"') ) {s = 40;}
						else if ( ((LA9_22 >= '\u0000' && LA9_22 <= '\u001F')||LA9_22=='!'||(LA9_22 >= '#' && LA9_22 <= '$')||(LA9_22 >= '&' && LA9_22 <= '@')||(LA9_22 >= '[' && LA9_22 <= '^')||LA9_22=='`'||(LA9_22 >= '{' && LA9_22 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_54 = input.LA(1);
						s = -1;
						if ( (LA9_54=='\"') ) {s = 40;}
						else if ( ((LA9_54 >= 'A' && LA9_54 <= 'Z')||LA9_54=='_'||(LA9_54 >= 'a' && LA9_54 <= 'z')) ) {s = 53;}
						else if ( (LA9_54==' ') ) {s = 38;}
						else if ( (LA9_54=='%') ) {s = 39;}
						else if ( ((LA9_54 >= '0' && LA9_54 <= '9')) ) {s = 54;}
						else if ( ((LA9_54 >= '\u0000' && LA9_54 <= '\u001F')||LA9_54=='!'||(LA9_54 >= '#' && LA9_54 <= '$')||(LA9_54 >= '&' && LA9_54 <= '/')||(LA9_54 >= ':' && LA9_54 <= '@')||(LA9_54 >= '[' && LA9_54 <= '^')||LA9_54=='`'||(LA9_54 >= '{' && LA9_54 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA9_37 = input.LA(1);
						s = -1;
						if ( ((LA9_37 >= 'A' && LA9_37 <= 'Z')||LA9_37=='_'||(LA9_37 >= 'a' && LA9_37 <= 'z')) ) {s = 53;}
						else if ( (LA9_37=='\"') ) {s = 40;}
						else if ( ((LA9_37 >= '0' && LA9_37 <= '9')) ) {s = 54;}
						else if ( (LA9_37==' ') ) {s = 38;}
						else if ( (LA9_37=='%') ) {s = 39;}
						else if ( ((LA9_37 >= '\u0000' && LA9_37 <= '\u001F')||LA9_37=='!'||(LA9_37 >= '#' && LA9_37 <= '$')||(LA9_37 >= '&' && LA9_37 <= '/')||(LA9_37 >= ':' && LA9_37 <= '@')||(LA9_37 >= '[' && LA9_37 <= '^')||LA9_37=='`'||(LA9_37 >= '{' && LA9_37 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA9_38 = input.LA(1);
						s = -1;
						if ( (LA9_38=='\"') ) {s = 40;}
						else if ( ((LA9_38 >= 'A' && LA9_38 <= 'Z')||LA9_38=='_'||(LA9_38 >= 'a' && LA9_38 <= 'z')) ) {s = 37;}
						else if ( (LA9_38==' ') ) {s = 38;}
						else if ( (LA9_38=='%') ) {s = 39;}
						else if ( ((LA9_38 >= '\u0000' && LA9_38 <= '\u001F')||LA9_38=='!'||(LA9_38 >= '#' && LA9_38 <= '$')||(LA9_38 >= '&' && LA9_38 <= '@')||(LA9_38 >= '[' && LA9_38 <= '^')||LA9_38=='`'||(LA9_38 >= '{' && LA9_38 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA9_39 = input.LA(1);
						s = -1;
						if ( (LA9_39=='\"') ) {s = 40;}
						else if ( ((LA9_39 >= 'A' && LA9_39 <= 'Z')||LA9_39=='_'||(LA9_39 >= 'a' && LA9_39 <= 'z')) ) {s = 37;}
						else if ( (LA9_39==' ') ) {s = 38;}
						else if ( (LA9_39=='%') ) {s = 39;}
						else if ( ((LA9_39 >= '\u0000' && LA9_39 <= '\u001F')||LA9_39=='!'||(LA9_39 >= '#' && LA9_39 <= '$')||(LA9_39 >= '&' && LA9_39 <= '@')||(LA9_39 >= '[' && LA9_39 <= '^')||LA9_39=='`'||(LA9_39 >= '{' && LA9_39 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
