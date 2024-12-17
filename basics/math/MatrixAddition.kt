/*
* To add two matrices A,B of the order mxn, to produce C which is also of the order mxn.
*/

fun main(){
  val a = listOf(listOf(1,2,3), listOf(4,5,6))
  val b = listOf(listOf(-3,-1,2), listOf(-4,-1,0))
  val c = mutableListOf(mutableListOf(0,0,0), mutableListOf(0,0,0))

  for(i in 0..< a.size){
    for(j in 0..< a[i].size){
      c[i][j] = a[i][j]+b[i][j]
    }
  }
  println(c)
}
