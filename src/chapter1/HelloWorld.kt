package chapter1

fun main(args : Array<String>){
    println("Hello Venkata")

    println("max of 10, 12 is "+ max(10,12))
}
//function with block body
fun max(a: Int, b: Int): Int{
    return if(a>b) a else b// 'if' can return a value. except for for while do while control sturctures return value
}
//function with expression body
fun maxInline(a: Int, b: Int): Int = if (a>b) a else b

val question = "the answer to everything"
val test = 20








