//  FOR-LOOP - Part 13

fun main(){
    val myArray = arrayOf(1, 2, 3)
    println()
    println("1st for-loop:")
    for (i in myArray){
        println(i)
    }

    println()
    println("2nd for-loop:")
    for (x in 4..6){
        println(x)
    }

    println()
    println("3rd for-loop:")
    for (y  in 10 downTo 0){
        println(y)
    }

    println()
    println("4th for-loop:")
    for (z in 'a'..'z'){
        println(z)
    }

    println()
    println("5th for-loop:")
    val myArray2 = arrayOf(40, 50, 60, 70, 80)
    var max = myArray2[0]
    for (item in myArray2){
        if (item > max){
            max = item
        }
    }
    println("The highest number in the given array is the number $max.")

    println()
    println("6th for-loop:")
    for (letter in 'z' downTo 'a'){
        println(letter)
    }

    println()
    println("7th for-loop:")
    for(j in 10 downTo 1 step 2){
        println(j)
    }

}