package chapter1

import java.math.BigDecimal

fun main(args: Array<String>){
    val name = if (args.size>0) args[0] else "kotlin"

    print ("hello $name")
    //complext expresson with in {}
    print("\$ ${args[0]}")

    // double quotes inside expression is allowed

    println("hello ${if (args.size>0) args[0] else "kotlin"}")



    var venkat : Person = Person("venkat",true);

    val rectangle = Rectangle( BigDecimal("10.01"),  BigDecimal("10.01"));

    println("is rectangle square ${rectangle.isSquare}")

    println("area of the rectanble ${rectangle.area}")


}