/*
* A simple program to print a lower left shaped pattern
* based on continuous integers.
*/
fun main(){
    val n = 5
    var b = 1;
    for(i in 0..<n){
        for(j in 0..i){
            print("$b ")
            b++
        }
        print("\n")
    }
}