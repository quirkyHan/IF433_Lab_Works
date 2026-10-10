package oop_00000144521_AbrahamNieveroNathanael.week07

enum class ItemRarity(val dropChance: Int){
    COMMON(70), UNCOMMON(20), RARE(10), EPIC(5), LIBRARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity){

}