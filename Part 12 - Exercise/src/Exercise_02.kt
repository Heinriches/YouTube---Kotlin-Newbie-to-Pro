//  WHILE LOOP - part 12

//  Hard exercise
//  Write a program that receives two numbers from the user, then uses loops to
//  calculate the result of the first number to the power of the second-one.

fun main(){
    println("Enter the FIRST-NUMBER: ")
    val firstNumber = readln().toInt()

    println("Enter the SECOND-NUMBER: ")
    val secondNumber = readln().toInt()

    var i = secondNumber
    var total = 1

    while(i > 0){
        total *= firstNumber
        i -= 1
    }
    println("After processing your entries, we have that $firstNumber to the power of $secondNumber is equal to $total.")
}