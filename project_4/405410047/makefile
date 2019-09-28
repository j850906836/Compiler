target:
	@java -jar antlr-3.5.2-complete.jar myCompiler.g 
	@javac -cp antlr-3.5.2-complete.jar *.java
	@java -cp antlr-3.5.2-complete.jar:. myCompiler_test test1.c
	@java -jar jasmin.jar test1.j
	@echo "**************************"
	@java myResult
	@echo "**************************\n\n"
	@java -cp antlr-3.5.2-complete.jar:. myCompiler_test test2.c
	@java -jar jasmin.jar test2.j
	@echo "**************************"
	@java myResult
	@echo "**************************\n\n"
	@java -cp antlr-3.5.2-complete.jar:. myCompiler_test test3.c
	@java -jar jasmin.jar test3.j
	@echo "**************************"
	@java myResult
	@echo "**************************\n\n"
	@java -cp antlr-3.5.2-complete.jar:. myCompiler_test test4.c
	@java -jar jasmin.jar test4.j
	@echo "**************************"
	@java myResult
	@echo "**************************\n\n"
