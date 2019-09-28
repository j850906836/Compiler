lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*     	  Type	        */
/*----------------------*/

INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
STRUCT	  : 'struct';
CONST	  : 'const';
DOUBLE	  : 'double';
ENUM	  : 'enum';
LONG	  : 'long';
SHORT	  : 'short';
STATIC	  : 'static';
VOLATILE  : 'volatile';

/*----------------------*/
/*     Control Flow     */
/*----------------------*/

WHILE_    : 'while';
FOR_	  : 'for';
IF		  : 'if';
ELSE	  : 'else';
BREAK	  : 'break';
CASE	  : 'case';
CONTINUE  : 'continue';
DEFAULT	  : 'default';
DO		  : 'do';
GOTO	  : 'goto';
SWITCH	  : 'switch';

/*----------------------*/
/*   Special function   */
/*----------------------*/

INCLUDE	  : 'include';
DEFINE	  : 'define';
HEADER_1  : '<stdio.h>';
HEADER_2  : '<stdlib.h>';
SCANF	  : 'scanf';
PRINT     : 'printf';
RETURN    : 'return';
NULL	  : 'null'| '\\0';
 
/*----------------------*/
/*  Singular Operators  */
/*----------------------*/

DIVIDE	: '/' ;
TIME	: '*' ;
PLUS	: '+' ;
MINUS	: '-' ;
EQ		: '=';
LTH		: '<';
GTH		: '>';
BANG	: '!';
TLIDE	: '~';
QUESTION: '?';
CARET	: '^';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

AND	  : '&&';
OR	  : '||';
PP_OP : '++';
MM_OP : '--'; 
ARROW : '->';
COLON2: '::';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN  : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
RSHIFT_OP  : '>>';
LSHIFT_OP  : '<<';
LSHIFT_ASS : '<<=';
RSHIFT_ASS : '>>=';
URSHIFT_ASS: '>>>=';

/*----------------------*/
/*  Math discrimination */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';

/*----------------------*/
/*      Number & ID     */
/*----------------------*/

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;


/*----------------------*/
/*  Character & Symbol  */
/*----------------------*/
PERCENT	: '%' ;
VERTBAR	: '|' ;
BITAND	: '&' ;
RPAREN	: ')' ;
LPAREN	: '(' ;
RBRACK	: ']' ;
LBRACK	: '[' ;
RBRACE	: '}' ;
LBRACE	: '{' ;
COLON	: ':' ;
DQUOTE	: '"' ;
SQUOTE	: '\'';
TAG		: '#' ;
SEMI	: ';';
COMMA	: ',';
DOT		: '.';
NEW_LINE: '\\n' | '\\r';
TAB		: '\\t';
ELLIPSIS: '...';

/*----------------------*/
/*      Comments        */
/*----------------------*/

ANNOTATION : '/*' (options{greedy=false;}: .)* '*/';
ANNOTATION_ONELINE : '//' (options{greedy=false;}: .)* '\n';

/*----------------------*/
/*        literal       */
/*----------------------*/

BETDQUOTE : '"' (options{greedy=false;}: .)* '"';

/*----------------------*/
/* 	 Letter & Digit     */
/*----------------------*/

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t'|'\n')+
    ;
