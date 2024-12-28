/**
 * A simple kotlin program to calculate the 
 * greatest common divisor (GCD) of two numbers, a and b
 * 
 * Greatest Common Divisor (GCD):
 * the value of the greatest number which commonly divides both the numbers a and b.
 * Example: 4,6
 * Divisors of 4: 1,2,4
 * Divisors of 6: 1,2,3,6
 * Common divisors: 1,2
 * Greatest common divisor: 2
 */
fun main(){
    val a = 2
    val b = 6
    val gcd = if(a < b) calculateHCF(a,b) else calculateHCF(b,a)
    println("Greatest Common Divisor: $gcd")
}

fun calculateHCF(a:Int, b: Int): Int {
    var c = 1
    for(i in 1..b){
        if(a % i == 0 && b % i == 0 && i > c){
            c = i
        }
    }
    return c
}