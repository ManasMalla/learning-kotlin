/*
* A simple program to introduce if-else if-else conditions
* if condition
* used to execute a given block of code only if the the given condition gives true
* else block
* used to execute a given block of code when the if condition/else-if condition(s) fail.
* else-if 
* used to chain a sequence of if statements to execute a given block of code when the if condition/else-if conditon(s) fail.
*
* Logical operators: Used to define conditions
* <, >, ==, !=, <=, >= are a few logical operators
* Arithmetic operators: Used to perform arithmetic
* +, -, *, /, % are a few arithmetic operators
* Concatenation & Manipulative operators: Used to perform compounding of conditions
* AND (&&), OR (||), NOT(!)
* Note: Compiler ckecks conditons Left-to-Right (LTR) and stops the concatenation of logic once it reaches a true in OR conditon or false in AND conditon.
*
* Eg: if(dayOfWeek == "sunday"){
*         // do something here
*     }else if(dayOfWeek == "saturday"){
*         // do something here
*     }else{
*         // do something here
*     }
*/

fun main(){
  checkIfEvenOrOdd(128)
  checkIfEvenOrOdd(63)
}

fun checkIfEvenOrOdd(a:Int){
  if(a % 2 == 0){
    println("The given number, $a is an even number")
  }else{
    println("The given number, $a is an odd number")
  }
}
