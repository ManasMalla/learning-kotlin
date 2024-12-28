/**
 * A simple kotlin program to verify if an integer is an armstrong number or not.
 * Armstrong Number: An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits in the number: 
 * Example: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153
 */
fun main(){
    val n = 143
    var r: Int = n
    var a = 0
    val l = n.toString().length
    while(r > 0){
        a += (Math.pow((r%10).toDouble(), l.toDouble())).toInt()
        r /= 10
    }
    if(a == n){
        println("$n is an armstrong number.")
    }else{
        println("$n is not an armstrong number.")
    }
}