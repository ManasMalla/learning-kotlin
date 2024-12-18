/*
* A simple kotlin program to demonstrate the subtraction of two matrices
* to result in an identity matrix in Kotlin.

* The matrices are represented as array of arrays, i.e, list of lists in Kotlin.

* An identity matrix (Iₙₓₙ) is a square matrix of the order nxn where
* the diagonal elements are 1 and the rest of the elements are 0.

* Nested for loops are used to iterate through the elements of the matrices.
* Assume two matrices of the order mxn (eg. 2x3),
* A = |a₀₀ a₀₁ a₀₂|  B = |b₀₀ b₀₁ b₀₂|
      |a₁₀ a₁₁ a₁₂|      |b₁₀ b₁₁ b₁₂|      

* To iterate over every row of the matrix, we iterate on the range from 0 to the size of the matrix, i.e, the number of rows.
* To iterate over every element of the row, we iterate on the range from 0 to the size of the row, i.e, the number of columns.
* We can access a specific element in a specific row and column as a[i][j] where i is the row index and j is the column index.
*/

fun main(){
    val a = listOf(listOf(1,2,3),listOf(2,3,7),listOf(4,5,6))
    val b = listOf(listOf(0,2,3),listOf(2,2,7),listOf(4,5,5))
    val c = mutableListOf(mutableListOf(0,0,0),mutableListOf(0,0,0),mutableListOf(0,0,0))
    
    for(i in 0..< a.size){
      for(j in 0..< a[i].size){
        c[i][j] = a[i][j]-b[i][j]
      }
    }
    
    println(c)
  }
  