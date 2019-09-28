;.source
.class public static test5
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10

new java/util/Scanner  ; new a object and push on the stack.
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V

invokevirtual java/util/Scanner/nextInt()I

return
.end method
