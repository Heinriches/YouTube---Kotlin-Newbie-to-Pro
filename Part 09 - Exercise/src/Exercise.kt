//  IF-CONDITIONS - Part 9

//  Create a program that evaluates if a string is a palindrome (a word, phrase, or sequence
//  that reads the same backward as forward. e.g. 'madam', or 'nurses run'.) or not.

fun main(){
    val word = "racecar"
    if(word == word.reversed()){
        println("The word '$word' is INDEED a palindrome.")
    }else{
        println("The word '$word' in NOT a palindrome.")
    }
}