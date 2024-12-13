/*
* A simple program to print a lower third pattern
* of numbers indexed on their column
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        for(j in 0..i){
            print(j+1)
        }
        print("\n")
    }
}