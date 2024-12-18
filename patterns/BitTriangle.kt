/*
* A simple program to print a triangle pattern
* of alternating bits.
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..i){
            print((i+j+1)%2)
        }
        print("\n")
    }
}