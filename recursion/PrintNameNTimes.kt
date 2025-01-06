/**
 * A simple Kotlin program to print a name N times.
 * Introduce a function printName that takes two inputs:
 *  - i: Iteration count
 *  - name: The name to print
 */

fun main(){
    val name = "Kavya"
    printName(10, name)
}

fun printName(i: Int, name: String){
    print("$name ")
    if(i > 0){
        printName(i-1, name)
    }
}