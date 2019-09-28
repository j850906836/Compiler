;.source
.class public static compute2
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10

	ldc 22.0
	fstore_2
	fload_2
	ldc 3.14
	fmul
	f2i
	istore_1

        ; print the value.
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload_1
        invokevirtual java/io/PrintStream/println(I)V

return
.end method
