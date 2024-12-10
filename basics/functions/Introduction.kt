/*
Functions
A function is an abstraction (group and hide) of a set of instructions that perform a set of tasks.
Eg: print(), goToGITAM(), callKavya()

* A simple kotlin program to demonstrate the power of functions
* A function called greet, which wishesh the user a personalized good morning.
* A simple main method has the following structure
* fun functionName(inputs:InputDataType,....): OutputReturnType {
*   // The set of instructions goes in here
* }

* fun keyword: Used to denote that we are defining a function
* functionName: written in camelCase used to uniquely identify a function
* (inputs: InputDataType): A list of the inputs used by the function for their processing. InputDataType is capitalized and can be Int, String, Boolean, etc.
* OutputReturnType: Void for instructions and other data types like Int, String, Char, Float... can be used to return the computed data out of function.
* {} - Used to denote the start and end of function
*/

fun main(){
  print("Hello, World!\n")
  greet("Manas")
  greet("Kavya")
}

/**
* A simple function that greets the user with [name] with a templated greeting - `Good Morning, __________! Have a great day.
*/
fun greet(name: String){
  println("Good Morning, $name! Have a great day.")
}
