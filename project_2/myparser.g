grammar myparser;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

program:VOID MAIN '(' ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};

declarations:type Identifier (','Identifier)* ';' declarations
             { if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
           | { if (TRACEON) System.out.println("declarations: ");} ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); };

block:statement | '{'statements '}';				
statements:statement statements
        |;

arith_expression: multExpr
                  ( '+' multExpr
				  | '-' multExpr
				  | '>' multExpr
				  | '<' multExpr
				  | '=''=' multExpr						//新增判斷的operator
				  | '>''=' multExpr
				  | '<''=' multExpr
				  | '!''=' multExpr
				  | '+''=' multExpr
				  | '+''+' multExpr
				  | '-''=' multExpr
				  | '*''=' multExpr
				  | '/''=' multExpr
				  | '|''|' multExpr
				  | '&''&' multExpr
				  )*
                  ;

multExpr: signExpr
          ( '*' signExpr
          | '/' signExpr
		  )*
		  ;

signExpr: primaryExpr
        | '-' primaryExpr
		;
primaryExpr: Integer_constant
           | Floating_point_constant
           | Identifier
		   | '(' arith_expression ')'
           ;

statement: Identifier '=' arith_expression ';'
         | IF condition_block (ELSE stat_block)?{ if (TRACEON) System.out.println("if_then_condition");}	
		 | WHILE '(' arith_expression ')' while_then_statements
		 | DO do_while_then_statements WHILE '(' arith_expression ')' ';'
		 | for_statement 
		 | print_statement
		 | switch_case_statement
		 ;
		 
for_statement: FOR '('((Identifier)|(Identifier '=' Integer_constant)|(Identifier '=' Floating_point_constant))* (',' (Identifier '=' Integer_constant)|(Identifier '=' Floating_point_constant))*';'((',')*Identifier ('<'|'>'|'<''='|'>''='|'!''='|'=''=') Integer_constant|Floating_point_constant)* ';'((',')*Identifier ('+''+'|'-''-'))* ')' stat_block{ if (TRACEON) System.out.println("for loop");};

condition_block: '(' arith_expression ')' stat_block
			   ;
stat_block: '(' block ')'
		  | '{' '}'
		  | '{' statement '}'
		  | statement
		  ;

print_statement: PRINT '(''"'Identifier* Integer_constant* Floating_point_constant* ('%'Integer_constant Identifier)*|('%' Floating_point_constant Identifier)* Identifier* '"' (','Identifier)* ')' ';'{ if (TRACEON) System.out.println("PRINT");};

switch_case_statement: SWITCH '(' Identifier ')' '{' (CASE Integer_constant ':' stat_block BREAK ';')* DEFAULT ':' stat_block '}'{ if (TRACEON) System.out.println("switch_case");};

while_then_statements: statement
                  | '{' statements '}'{ if (TRACEON) System.out.println("while loop");}
				  ;

do_while_then_statements: statement
					| '{' statements '}'{ if (TRACEON) System.out.println("do_while loop");}
					;

/* description of the tokens */
FLOAT:'float';
INT:'int';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
DEFAULT: 'default';
PRINT: 'printf';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
