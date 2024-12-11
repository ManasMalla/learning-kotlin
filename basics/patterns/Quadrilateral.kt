/*
* A simple program to print a quadrilateral pattern
* of stars
*/
fun main(){
    val n = 5
    for(i in 0..n){
        for(j in 0..n){
            print("*")
        }
        print("\n")
    }
}