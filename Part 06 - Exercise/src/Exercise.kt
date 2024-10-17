// DECIMAL-NUMBERS - Part 6

//  Use this formula for the volume of a sphere:
//      (0.75 * pi * radius^3)

fun main(){
    val pi = 3.14
    val radius = 5.5
    var volume = 0.0

    volume = (0.75 * pi * (Math.pow(radius, 3.0)))
    println ("The volume of a sphere with radius $radius is: $volume cm³.")
}