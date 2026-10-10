package oop_00000144521_AbrahamNieveroNathanael.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object{
        fun forgeStarterSword(): Weapon{
            val item = GameItem("Pedang kayu bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }
        fun forgeEpicSword(): Weapon{
            val item = GameItem("Pedang Epik", 100, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }
}