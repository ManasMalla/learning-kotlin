/**
 * A simple kotlin program to check whether the given input (number) is a palindrome or not.
 */
fun main(){
    var n = 121
    if(isPalindrome(n)){
        println("$n is a palindrome.")
    }else{
        println("$n is not a palindrome.")
    }
}

fun isPalindrome(a: Int) : Boolean {
    var n = a
    var r = 0
    while(n > 0){
        r = r * 10 + (n%10)
        n = n/10
    }
    return a == r
}