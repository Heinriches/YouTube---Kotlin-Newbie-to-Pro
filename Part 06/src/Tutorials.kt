// DECIMAL-NUMBERS - Part 6

fun main(){
    var x1 = 20
    var y1 = 8
    println("01 - The result of (x / y) is: ${(x1 / y1)}.")

    var x2 = 20F
    var y2 = 8F
    println("02 - The new result of (x / y) is: ${(x2 / y2)}.")

    x2 = 20.1534F
    y2 = 8F
    println("03 - Now the result of (x / y) is: ${(x2 / y2)}.")

    var x3 = 20.154362735
    var y3 = 8.34526
    println("04 - Now, using double-type, the result of (x / y) is: ${(x3 / y3)}.")
}