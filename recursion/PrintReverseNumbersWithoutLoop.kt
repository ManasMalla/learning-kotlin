/**
 * A simple kotlin program to print numbers from N to 1 without loops.
 * Example: N = 5
 * 5 4 3 2 1
 */

 fun main(){
    val n = 5
    printNum(n)
 }

 fun printNum(a: Int){
    println("$a")
    if(a > 0){
        printNum(a-1)
    }
 }
