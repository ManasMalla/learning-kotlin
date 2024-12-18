/*
* A simple program to print a N*N matrix pattern
* of numbers along border.
*/
fun main(){
    val n = 4
    for(i in 0..<((2*n) - 1)){
        print(n)
    }
    print("\n")
    for(j in 1..<n){
        for(i in 0..<n){
            if(i <= j){
                print(n-i)
            }else{
                print(n-j)
            }
        }
        for(i in n-2 downTo 0){
            if(i <= j){
                print(n-i)
            }else{
                print(n-j)
            }
        }
        print("\n")
    }
    for(j in n-2 downTo 1){
        for(i in 0..<n){
            if(i <= j){
                print(n-i)
            }else{
                print(n-j)
            }
        }
        for(i in n-2 downTo 0){
            if(i <= j){
                print(n-i)
            }else{
                print(n-j)
            }
        }
        print("\n")
    }
    for(i in 0..<((2*n) - 1)){
        print(n)
    }
    print("\n")
}