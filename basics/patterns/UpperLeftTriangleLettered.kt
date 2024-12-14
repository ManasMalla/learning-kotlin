/*
* A simple program to print a upper second pattern
* of letters indexed.
*/
fun main(){
    val n = 5
    val s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i in n-1 downTo 0){
        for(j in 0..i){
            print(s[j%26])
        }
        print("\n")
    }
}