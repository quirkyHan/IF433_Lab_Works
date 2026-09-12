package oop_00000144521_AbrahamNieveroNathanael.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
           if (value < 0){
               print("Error: Gaji tidak boleh negatif! Di set ke-0.")
               field = 0
           } else {
               field = value
           }
        }
}