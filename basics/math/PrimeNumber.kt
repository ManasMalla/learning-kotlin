/**
 * A simple program to check whether a number is a prime number or not.
 * 
 * Prime Number
 * A number, n, is said to be prime if the greatest common divisor
 * of the number, n, is only 1. 
 * Example: 2 is a prime number.
 *          s10 is not a prime number.
 */
fun main(){
    val n = 2
    if(isPrime(n)){
        println("$n is a prime number.")
    }else{
        println("$n is not a prime number.")
    }
}

fun isPrime(n: Int): Boolean {
    var c = true
    for(i in 2..<n){
        if(n % i == 0){
            c = false
        }
    }
    return c
}