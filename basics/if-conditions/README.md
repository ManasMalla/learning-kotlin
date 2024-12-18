# If Conditions

An if condition is used to execute a given block of code only if the the given condition gives true.

An optional else block can be used to execute a given block of code when the if condition/else-if condition(s) fail.

Additionally, elseIf can be used to chain a sequence of if statements to execute a given block of code when the if condition/else-if conditon(s) fail.

Eg:

```
val diceFace = Random.nextInt(6)
if(diceFace == 6){
    println("You have rolled a six. Roll again.")
} else{
    println("You have rolled a $diceFace.")
}
```

## Learning Objectives

- What are if conditions?
- Syntax to define an if condition
- How to chain if-elseif-else conditions

## Programs

- [Introduction.kt](Introduction.kt) - A simple program in Kotlin to understand if conditions, their syntax, and power
- [IfElseIfElse.kt](IfElseIfElse.kt) - A simple program to understand how to chain if conditions using if-elseif-else conditions.
- [CheckWeekdayOrWeekend.kt](CheckWeekdayOrWeekend.kt) - A simple program to check whether a given day is a weekday, weekend or an invalid day of the week.
