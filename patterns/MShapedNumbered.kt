/*
* A simple program to print a 'M' shaped pattern
* based on row index.
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..i){
            print(j+1)
        }
        for(j in 0..(2*(n-i-1) - 1)){
            print(" ")
        }
        for(j in i downTo 0){
            print(j+1)
        }
        print("\n")
    }
}