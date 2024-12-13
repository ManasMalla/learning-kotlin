/*
* A simple program to print a right semi diamond pattern
* of stars.
*/
fun main(){
    val n = 5
    for(i in 1..n){
        for(j in 0..<i){
            print("*")
        }
        print("\n")
    }
    for(i in n-1 downTo 1){
        for(j in 0..<i){
            print("*")
        }
        print("\n")
    }
}