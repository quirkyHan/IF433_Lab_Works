package oop_00000144521_AbrahamNieveroNathanael.week01

fun main(args: Array<String>) {
    //Variable Definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    var area = pi * radius * radius

    // Output Concatenation
    println("Radius: $radius, Area: $area")
    // Logic check
    checkSize(area)
    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"