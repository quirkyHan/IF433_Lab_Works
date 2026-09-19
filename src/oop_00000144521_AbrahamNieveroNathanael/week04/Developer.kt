package oop_00000144521_AbrahamNieveroNathanael.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}