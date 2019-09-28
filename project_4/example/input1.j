;.source
.class public static input1
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10

;----------------------
; new a Scanner object.
;     => new Scanner(System.in)
;----------------------
new java/util/Scanner
dup

; prepare argument.
; fetch the field "in" and its class type "InputStream".
getstatic java/lang/System/in Ljava/io/InputStream;

; call constructor.
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V

; invoke nextInt() method.
invokevirtual java/util/Scanner/nextInt()I

return
.end method
