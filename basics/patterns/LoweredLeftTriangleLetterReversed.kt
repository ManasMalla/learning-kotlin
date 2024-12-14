/*
* A simple program to print a lower third pattern
* of letters indexed.
*/
fun main(){
    val n = 5
    val s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i in 0..<n){
        for(j in i downTo 0){
            print(s[(n-j-1)%26])
        }
        print("\n")
    }
}