/*
 * A kotlin program to print numbers from 1 to n using recursion
 */

fun main(){
    val n = 10
    functionalRecursion(1, n)
    println("")
    simpleRecursion(n)
}

/**
 * Approach 1: With seperate function
 */

fun functionalRecursion(i:Int, n: Int){
    print("$i ")
    if(i < n){
        functionalRecursion(i+1, n)
    }
}

/*
 * Approach 2: With a variable
 */
 
 var i = 1
 
 fun simpleRecursion(n: Int){
     print("$i ")
     if(i < n){
         i++
         simpleRecursion(n)
     }
 }
