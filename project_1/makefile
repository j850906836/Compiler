all:
	java -jar antlr-3.5.2-complete.jar
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool mylexer.g
	javac -cp ./antlr-3.5.2-complete.jar testLexer.java mylexer.java
	java -cp ./antlr-3.5.2-complete.jar:. testLexer test_Prog_A.c > lexer_result_A.txt 
	java -cp ./antlr-3.5.2-complete.jar:. testLexer test_Prog_B.c > lexer_result_B.txt
	java -cp ./antlr-3.5.2-complete.jar:. testLexer test_Prog_C.c > lexer_result_C.txt

clean:
	rm mylexer.java
	rm mylexer.tokens
	rm mylexer.class
	rm testLexer.class
	rm lexer_result_A.txt
	rm lexer_result_B.txt
	rm lexer_result_C.txt
	rm *DFA*.class	 
