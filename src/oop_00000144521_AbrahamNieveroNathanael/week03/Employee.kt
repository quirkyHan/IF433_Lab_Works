package oop_00000144521_AbrahamNieveroNathanael.week03

class Employee(name: String){
    var salary: Int = 0
        set(value){
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}