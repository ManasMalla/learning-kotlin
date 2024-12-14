/*
* A simple program to print a triangle pyramid pattern
* of letters.
*/
fun main(){
    val n = 4
    val s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i in 0..<n){
        for(j in 0..< n-i-1){
            print(" ")
        }
        for(j in 0..i){
            print(s[j%26])
        }
        for(j in i-1 downTo 0){
            print(s[j%26])
        }
        print("\n")
    }
}