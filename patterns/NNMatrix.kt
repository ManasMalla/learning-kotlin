/*
* A simple program to print a N*N matrix pattern
* of stars along border.
*/
fun main(){
    val n = 5
    for(i in 0..<n){
        print("*")
    }
    print("\n")
    for(j in 0..<n-2){
        for(i in 0..<n){
            if(i == 0 || i == n-1){
                print("*")
            }else{
                print(" ")
            }
        }
        print("\n")
    }
    for(i in 0..<n){
        print("*")
    }
    print("\n")
}