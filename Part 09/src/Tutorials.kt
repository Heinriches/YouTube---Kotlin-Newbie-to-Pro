//  IF-CONDITIONS - Part 09

fun main() {
    var x = 5
    var y = 7
    val z = if(x + y ==14) 3 else 4
    if(x < y) {
        println("01 - The value of x ($x) is lesser than the value of y ($y).")
    }
    println("This part — which is outside the conditional-statement — will always be executed.")
    println("The value of z is: $z.")


    x = 8
    y = 7
    if(x < y){
        println("02 - The value of x ($x) is lesser than the value of y ($y).")
    }else{
        println("03 - The value of x ($x) is greater than the value of y ($y).")
    }


    x = 9
    y = 9
    if(x < y){
        println("04 - The value of x ($x) is lesser than the value of y ($y).")
    }else if(x > y){
        println("05 - The value of x ($x) is greater tan the value of y ($y).")
    }else{
        println("06 - The value of x ($x) and the value of y ($y) are the same.")
    }
}