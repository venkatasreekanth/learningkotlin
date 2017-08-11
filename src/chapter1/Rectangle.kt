package chapter1

import java.math.BigDecimal

class Rectangle(val height: BigDecimal, val width: BigDecimal){
    val isSquare: Boolean
        get() { return height.compareTo(width)==0}

    val area : BigDecimal get() { return height.multiply(width)}
}

