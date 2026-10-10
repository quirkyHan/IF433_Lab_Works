package oop_00000144521_AbrahamNieveroNathanael.week07

class NetworkClient private constructor(val url: String){
    fun connect(){
        println("Connecting to $url")
    }
}