/*
* A simple program to print a lower third triangle pattern
* of stars
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..i){
            print("*")
        }
        print("\n")
    }
}