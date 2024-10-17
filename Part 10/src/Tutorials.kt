//  NULL-VALUES AND USER-INPUT - Part 10

fun main(){
    val userInput = readLine()
    println("You wrote: '$userInput'.")
    println("Here's your input in all uppercase-letters: '${userInput?.uppercase()}'.")

    // if (userInput != null){
    //    println(userInput.toInt() - 5)
    // }
}