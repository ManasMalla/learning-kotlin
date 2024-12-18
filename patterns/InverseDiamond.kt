/*
* A simple program to print a inverse diamond pattern
* of stars.
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..< n-i){
            print("*")
        }
        for(j in 0..< 2*i){
            print(" ")
        }
        for(j in 0..< n-i){
            print("*")
        }
        print("\n")
    }
    for(i in n-1 downTo 0){
        for(j in 0..< n-i){
            print("*")
        }
        for(j in 0..< 2*i){
            print(" ")
        }
        for(j in 0..< n-i){
            print("*")
        }
        print("\n")
    }
}