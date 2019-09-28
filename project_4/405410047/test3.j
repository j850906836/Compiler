;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 5.0f
fstore 2
ldc 10.0f
fstore 1
fload 1
fload 2
fcmpl
iflt ELSE
fload 2
fstore 0
goto END
ELSE:
fload 1
fstore 0
END:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "final C is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 0
invokevirtual java/io/PrintStream/print(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
