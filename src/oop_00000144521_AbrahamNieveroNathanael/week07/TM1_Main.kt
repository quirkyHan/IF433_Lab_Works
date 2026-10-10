package oop_00000144521_AbrahamNieveroNathanael.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance senjata legendaris: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterSword = Weapon.forgeStarterSword()

    println("Anda mendapatkan ${starterSword.item.name}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Damage: ${starterSword.item.damage}")
    println("Durability pedang: ${starterSword.durability}")
}