/*
* A simple program to check whether a given number is divisible by 2,3 or 6 using divisibility rules of 6.
*/

fun main(){
  divisbleBy6(13)
  divisbleBy6(6)
  divisbleBy6(144)
}

/*
* A simple function to check divisibility of [a] by 6
*/
fun divisbleBy6(a: Int){
  if(a % 2 == 0 && a % 3 == 0){
    println("The given number, $a is divisible by 2, 3 and hence by 6.")
  } else if(a % 2 == 0){
    println("The given number, $a is divisible by 2.")
  } else if(a % 3 == 0){
    println("The given number, $a is divisible by 3.")
  } else {
    println("The given number, $a is not divisible by 2 and 3. Hence is not divisible by 6.")
  }
}


/*     
* This way of checking condition checks all the cases and print them individually instead of assuming them to be a single case.
  
   if(a % 2 == 0 && a % 3 == 0){
       println("The given number,$a is divisible by 6")
   }
   if(a % 2 == 0){
       println("The given number,$a is divisible by 2")
   }
   if(a % 3 == 0){
       println("The given number,$a is divisible by 3")
   }else{
       println("The given number,$a is not divisible by 2 nor 3 nor 6")
   }

   Input: 6
   Output: The given number, 6 is divisible by 6.
           The given number, 6 is divisible by 2.
           The given number, 6 is divisible by 3.

*/
