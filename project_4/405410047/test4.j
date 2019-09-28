;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 5
istore 2
ldc 10
istore 1
iload 1
iload 2
if_icmpne ELSE
iload 2
istore 0
goto END
ELSE:
iload 1
istore 0
END:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "final C is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
