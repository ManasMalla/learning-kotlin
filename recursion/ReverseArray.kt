/**
 * A kotlin program to reverse the given array using recursion
 */

fun main(){
    var arr = mutableListOf(1,4,3,2,6,5)
    reverseNumber(arr)
    println(arr)
}
var i = 0
fun reverseNumber(arr: MutableList<Int>){
    if(i < arr.size/2){
        var m = arr[i]
        arr[i] = arr[arr.size - i - 1]
        arr[arr.size - i - 1] = m 
        i++
        reverseNumber(arr)
    }
}