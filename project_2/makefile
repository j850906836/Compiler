all:
	java -cp antlr-3.5.2-complete.jar \org.antlr.Tool myparser.g
	javac -cp antlr-3.5.2-complete.jar:. testParser.java
	java -cp antlr-3.5.2-complete.jar:. testParser test.c 
	java -cp antlr-3.5.2-complete.jar:. testParser test2.c 
	java -cp antlr-3.5.2-complete.jar:. testParser test3.c
clean:
	rm myparserLexer.class 
	rm myparserParser.class
	rm myparserLexer.java
	rm myparserParser.java
	rm myparser.tokens
	rm testParser.class
	rm myparserLexer*
