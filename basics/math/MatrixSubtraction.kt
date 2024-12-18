/*
* The matrices are represented as array of arrays, i.e, list of lists in Kotlin.
* Nested for loops are used to iterate through the elements of the matrices.
* Assume two matrices of the order mxn (eg. 2x3),
* A = |a₀₀ a₀₁ a₀₂|  B = |b₀₀ b₀₁ b₀₂|
      |a₁₀ a₁₁ a₁₂|      |b₁₀ b₁₁ b₁₂|      
* Note: To subtract two matrices, the matrices should have the same order.
* To subtract the two matrices, the elements with corresponding indices are subtracted, i.e, a₀₀-b₀₀, a₀₁-b₀₁, a₀₂-b₀₂.
* The result is stored in a new matrix C at the corresponding index.
* To iterate over every row of the matrix, we iterate on the range from 0 to the size of the matrix, i.e, the number of rows.
* To iterate over every element of the row, we iterate on the range from 0 to the size of the row, i.e, the number of columns.
* We can access a specific element in a specific row and column as a[i][j] where i is the row index and j is the column index.
*/

fun main(){
    val a = listOf(listOf(1,2,3),listOf(4,5,6))
    val b = listOf(listOf(0,-1,3),listOf(-1,-4,5))
    val c = mutableListOf(mutableListOf(0,0,0),mutableListOf(0,0,0))
    
    for(i in 0..< a.size){
      for(j in 0..< a[i].size){
        c[i][j] = a[i][j]-b[i][j]
      }
    }
    
    println(c)
  }
  