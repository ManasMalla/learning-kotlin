/*
* A simple program to print a 'M' shaped pattern
* based on row index.
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..i){
            print(i+j)
        }
        print("\n")
    }
}