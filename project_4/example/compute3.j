;.source
.class public static compute3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10

	ldc 22.0f
	fstore_2
	fload_2
	ldc 0.0f
	fcmpl
	ifle ELSE
        ldc 10.0f
	fstore_1   ; a = 10
        goto END
ELSE:   
        fload_2    ; load 22.0 into operand stack.
        fstore_1   ; a = b
END:
        ; print the value.
        getstatic java/lang/System/out Ljava/io/PrintStream;
        fload_1
        invokevirtual java/io/PrintStream/println(F)V

	return
.end method
