// LOGICAL AND COMPARISON OPERATORS - Part 8

fun main(){
    var x = 4
    var y = 5
    println("01 - If x is: $x, and y is: $y, then is (x == y)? Answer: ${x == y}.")
    println("02 - If x is: $x, and y is: $y, then is (x != y)? Answer: ${x != y}.")
    println("03 - If x is: $x, and y is: $y, then is (x < y)? Answer: ${x < y}.")
    println("04 - If x is: $x, and y is: $y, then is (x > y)? Answer: ${x > y}.")

    val a = 6
    val b = 10
    println("05 - if x is: $x, y is: $y, a is: $a, and b is: $b, then is (x == y) AND (a == b)? Answer: ${x == y && a == b}.")
    println("06 - If x is:$x, y is: $y, a is: $a, and b is: $b, then is (x != y) AND (a != b)? Answer: ${x != y && a != b}.")

    x = 15
    y = 15
    println("07 - If x is: $x, y is: $y, a is: $a, and b is: $b, then is (x == y) OR (a == b)? Answer: ${x == y || a == b}.")
    println("08 - If x is: $x, y is: $y, a is: $a, and b is: $b, then is NOT(x == y) OR (a == b)? Answer: ${!(x == y) || a == b}.")
}