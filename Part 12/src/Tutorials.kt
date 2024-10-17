//  WHILE-LOOP - Part 12

fun main(){
    var x = 3
    while (x >= 0){
       println(x)
       x -= 1
    }


    val myArray = arrayOf("Hello", "guys", "whats up?")
    val arrayLength = myArray.size
    var i = 0
    while (i < arrayLength){
        println(myArray[i])
        i += 1
    }
}