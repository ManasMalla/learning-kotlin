// Check whether the given day is a weekday or weekend

fun main(){ 
    checkDays("monday")
    checkDays("tuesday")
    checkDays("sunday")
    checkDays("kavya")
}

// bad programming convention of a function to check the given day is a weekday or weekend
fun checkDays_BadConvention(a:String){
    if(a=="sunday"){
        println("the given day,$a is weekend")
    }else if(a=="saturday"){
        println("the given day,$a is weekend")
    }else if(a=="monday"){
        println("the given day,$a is weekday")
    }else if(a=="tuesday"){
        println("the given day,$a is weekday")
    }else if(a=="thursday"){
        println("the given day,$a is weekday")
    }else if(a=="friday"){
        println("the given day,$a is weekday")
    }else if(a=="wednesday"){
        println("the given day,$a is weekday")
    }else{
        println("invalid input")
    }
}

// a better convention to check the given day is a weekday or weekend
fun checkDays(a:String){
    if(a == "sunday" || a == "saturday"){
        println("the given day,$a is weekend")
    }else if( a == "monday" || a == "tuesday" || a=="wednesday" || a == "thursday" || a == "friday"){
        println("the given day,$a is weekday")
    }else{
        println("invalid input")
    }
}

// the best convention to check the given day is a weekday or weekend using when
fun checkDays_When(a:String){
    when(a){
        "sunday","saturday" -> println("the given day,$a is weekend")
        "monday","tuesday","wednesday","thursday","friday" -> println("the given day,$a is weekday")
        else -> println("invalid input")
    }
}