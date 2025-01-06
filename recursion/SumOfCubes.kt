import kotlin.math.roundToInt
/**
 * A simple kotlin program to calculate the sum of the cubes of numbers till N.
 * Example: N = 5; 
 * S = 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 1 + 8 + 27 + 64 + 125 = 225
 */

 fun main(){
    val n = 7
    sumOfCubes(n)
 }
 var a = 1
 var sum: Int = 0
 fun sumOfCubes(n: Int){
    sum = sum + (Math.pow(a.toDouble(),3.0)).roundToInt()
    a++
    if(a <= n){
        sumOfCubes(n)
    }else{
        println("Sum: $sum")
    }
 }