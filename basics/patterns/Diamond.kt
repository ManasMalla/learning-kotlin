/*
* A simple program to print a diamond pattern
* of stars.
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..< n-i-1){
            print(" ")
        }
        for(j in 0..<((2*i)+1)){
            print("*")
        }
        print("\n")
    }
    for(i in n-1 downTo 0){
        for(j in 0..< n-i-1){
            print(" ")
        }
        for(j in 0..<((2*i)+1)){
            print("*")
        }
        print("\n")
    }
}