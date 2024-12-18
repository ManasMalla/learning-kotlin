/*
* A simple program to print a lower third pattern
* of letters indexed row-wise.
*/
fun main(){
    val n = 5
    val s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i in 0..<n){
        for(j in 0..i){
            print(s[i%26])
        }
        print("\n")
    }
}