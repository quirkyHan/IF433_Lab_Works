package oop_00000144521_AbrahamNieveroNathanael.week09

fun main(){
    println("=== Test Lambda ===")
    val sumLambda = {a: Int, b: Int -> a + b}
    println("Hasil sum ${sumLambda(5,10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("hasil square ${squareImplicit(4)}")
}