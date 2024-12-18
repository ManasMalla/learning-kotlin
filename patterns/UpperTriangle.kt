/*
* A simple program to print a upper first pattern
* of stars
*/
fun main(){
    val n = 5
    for(i in n-1 downTo 0){
        for(j in 0..i){
            print("*")
        }
        print("\n")
    }
}