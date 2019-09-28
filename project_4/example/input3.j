;.source
.class public static input3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V

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


new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner/nextDouble()D

return
.end method
