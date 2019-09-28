all:
	java -cp antlr-3.5.2-complete.jar \org.antlr.Tool myInterp.g
	javac -cp antlr-3.5.2-complete.jar:. myInterp_test.java
	java -cp antlr-3.5.2-complete.jar:. myInterp_test  test1.c 
	java -cp antlr-3.5.2-complete.jar:. myInterp_test  test2.c 
	java -cp antlr-3.5.2-complete.jar:. myInterp_test  test3.c 
clean:
	rm myInterp.tokens
	rm myInterp_test.class
	rm myInterpParser*
	rm myInterpLexer*
