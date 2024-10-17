//  NULL-VALUES AND USER-INPUT - Part 10

//  Create a program that asks and receives the user's age, then evaluates it, and then
//  displays different messages corresponding to different age-groups.

fun main(){
    println("Please type-down a number, corresponding to your age: ")
    val age = readln().toInt()

    if(age < 18){
        println("At the age of $age you are NOT an adult yet.")
    }else if (age >= 18 && age <= 65){
        println("At the age of $age you are INDEED an adult.")
    }else{
        println("You are really, really old.")
    }
}