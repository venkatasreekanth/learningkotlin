package chapter1

fun main(args: Array<String>){
    val name = if (args.size>0) args[0] else "kotlin"

    print ("hello $name")
    //complext expresson with in {}
    print("\$ ${args[0]}")

    // double quotes inside expression is allowed

    println("hello ${if (args.size>0) args[0] else "kotlin"}")



    var venkat : Person = Person("venkat")


}