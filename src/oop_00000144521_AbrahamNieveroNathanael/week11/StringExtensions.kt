package oop_00000144521_AbrahamNieveroNathanael.week11

fun String.addGreeting(): String{
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String{
    return this.repeat(n)
}

fun string?.isNullOrEmptyCustom(): Boolean{
    return this == null || this.isEmpty()
}
