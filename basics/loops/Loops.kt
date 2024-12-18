/**
 * loop - condition based excution of a block of code over iterations
 * iteration - one cycle of excution of a given {block of code} 
 * There exists two/three kinds of loops
 * for - iterate over a collection or a known range (eg: weekday- m,t,w,th,f; 0...5)
 * while - iterate until the condition becomes false, condition checks before iteration
 * do while - check for the condition after the iteration, i.e,  
 * it run atleast 1 time even if the condition is false 
 * 
 * for(i in a..b){ 
 *    do something here 
 * } 
 * Note: a..b means a <= i <= b - in math notation
 *       a..<b means a <= i < b - in math notation
 */

fun main(){
    for(i in 0..5){
        println(i) //-----case: increment 1
    }
    println("------------")
    for(i in 5 downTo 0){
        //----- 5<=i<=0
        println(i) //-----case: decrement 1
    } 
    println("------------")
    for(i in 0..10 step 2){
        println(i) //-----case: increment x steps, i.e, here 2
    }
}