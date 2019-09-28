;.source
.class public static compute4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100

	ldc 22.0f
	fstore 2
	fload 2
	ldc 0.0f
	fcmpl
	ifle ELSE
        ldc 10.0f
	fstore 1   ; a = 10
        goto END
ELSE:   
        fload 2    ; load 22.0 into operand stack.
        fstore 1   ; a = b
END:
        ; print the value.
        getstatic java/lang/System/out Ljava/io/PrintStream;
        fload 1
        invokevirtual java/io/PrintStream/println(F)V

        bipush 5
        newarray int
        astore 6

        aload 6
        bipush 4
        bipush 2
        iastore

	return
.end method
