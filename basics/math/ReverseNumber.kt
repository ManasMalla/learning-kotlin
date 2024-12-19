/**
 * A simple kotlin program to reverse the given number.
 */

fun main(){
    var number = 12345
    var reverse = 0
    while(number > 0){
        val remainder = number % 10
        reverse = reverse * 10 + remainder
        number /= 10
    }
    println("Reverse of the given number is: $reverse")
}