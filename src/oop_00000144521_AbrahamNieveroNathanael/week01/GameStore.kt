package oop_00000144521_AbrahamNieveroNathanael.week01

fun main(){
    val gameTitle = "Roblox"
    val price = 150000

    printReceipt(tile = gameTitle, finalPrice = price)
    printReceipt(tile = "Elden Ring", finalPrice = 750000)
    printReceipt(tile = "Monster Hunter Wilds", finalPrice = 799000)

}

fun printReceipt(tile: String, finalPrice: Int){
    val discPrice = calculateDiscount(finalPrice)
    val userNote: String? = null

    println("Judul $tile")
    println("Real price: $finalPrice")
    println("Disc price: $discPrice")
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
    println("\n")
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 0.8 else price * 0.9