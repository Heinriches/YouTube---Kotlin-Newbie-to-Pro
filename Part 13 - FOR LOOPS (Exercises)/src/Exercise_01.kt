//  FOR LOOP - Part 13

//  Easy exercise:
//  Create an array, put some numbers in, and the create a for-loop that calculates
//  and outputs the total-sum of the numbers in the array.

fun main(){
    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    var sum = 0
    for(i in myArray){
        sum += i
    }
    println("The total-sum of the values in the given array is equal to: $sum.")
}