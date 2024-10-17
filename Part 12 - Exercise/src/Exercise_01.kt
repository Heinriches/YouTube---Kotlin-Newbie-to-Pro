//  WHILE LOOP - Part 12

//  Easy exercise:
//  Write a program that takes a number as user-input, then counts-down
//  to zero from that number.

fun main(){
    println("Please inform the number from which the program should start counting-down: ")
    var userInput = readln().toInt()

    println("Let's count-down from $userInput to 0.")

    while(userInput >= 0){
        println(userInput)
        userInput -= 1
    }
    println("And we're done!")
}