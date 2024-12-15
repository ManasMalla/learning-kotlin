fun main(){
    val n = 23
    var digits = mutableListOf<Int>()
    var temp = n
    while(temp > 0){
        digits.add(temp % 10)
        temp /= 10
    }
    var count = 0
    for(i in digits){
        if(i != 0 && n % i == 0){
            count++
        }
    }
    println(count)
}