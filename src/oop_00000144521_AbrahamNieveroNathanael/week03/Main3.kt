package oop_00000144521_AbrahamNieveroNathanael.week03

fun main(){
    val player = Player("Aramrmarmamsam")

    //player.xp
    //ku comment aja biar pas di run gk error, kalo di uncomment nanti error hehe

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
}