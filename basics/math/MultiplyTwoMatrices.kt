/**
 * To multipy two matrices, 
 * the number of rows in the first matrix must be equal to the number of columns in the second matrix.
 * Let's take an example,
 * define A(i*j),B(j*k) as the two matrices and C as the solution we get when we multipy A,B
 * i - iterates the number of rows in the matrix A
 * j - iterates the number of columns in the matrix A or number the rows in B
 * k - iterates the number of columns in the matrix B
 * Algorithm:
 *      C[i][k] = A[i][j] * B[j][k] + C[i][k] (j is cancelled)
 * Order of the matrix, C is i*k
 */

fun main() {
    val a = listOf(listOf(2,4),listOf(6,8))
    val b = listOf(listOf(1,3),listOf(5,7))
    val c = mutableListOf(mutableListOf(0,0),mutableListOf(0,0))
    println(a)
    println(b)

    for(i in 0..<a.size){
        for(j in 0..<b.size){
            for(k in 0..<b[j].size){
                c[i][j]=a[i][k]*b[k][j]+c[i][j] 
            }
        } 
    }
    println(c)
}