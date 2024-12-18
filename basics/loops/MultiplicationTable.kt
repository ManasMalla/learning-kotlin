/**
 * A simple program to print the multiplication table of a number uptil 10 rows in the format
 * number x i = number * i
 * Example:
 * 3 x 0 = 0
 * 3 x 1 = 3
 * 3 x 2 = 6
 * 3 x 3 = 9
 * 3 x 4 = 12
 * ...
 * 3 x 10 = 30
 */

fun main() {
    val number = 3
    for(i in 0..10)
        println("$number x $i = ${number * i}")
}