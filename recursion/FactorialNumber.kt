/**
 * A simple kotlin program to print the list of factorial numbers less than or equal to the given number, n
 * Factorial: Represented as n! holds the value of
 * n! = 1*2*3*4....*n
 * Example:
 * Factorial Numbers: 1,2,6,24,...
 * Given n = 5, print, 1,2
 */

 fun main(){
    val n = 10
    printNextFactorial(n, 1)
    println("")
 }

 var i = 1

 fun printNextFactorial(n: Int, previousFactorial: Int){
    val factorial = previousFactorial * i
    if(factorial <= n){
        print("$factorial ")
        i++
        printNextFactorial(n, factorial)
    }
 }