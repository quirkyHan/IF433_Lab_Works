package oop_00000144521_AbrahamNieveroNathanael.week11

fun main(){
    println("=== Test Let Function ===")
    val name: String? = "Alexander"
    
    val length = name?.let{
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
    
    println("=== Test Run Function ===")
    val result = "kotlin".run{
        println("Memproses kata: ${this}")
        this.length * 2
    }
    println("Hasil kalkulasi: $result")
}