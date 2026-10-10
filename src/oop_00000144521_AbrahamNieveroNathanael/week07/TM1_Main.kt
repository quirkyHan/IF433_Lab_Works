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

    val upgradedSword = starterSword.item.copy(
        damage = 25
    )

    println("\n=== UPGRADE SENJATA BERHASIL ===")
    println("Nama senjata: ${upgradedSword.name}")
    println("Damage baru: ${upgradedSword.damage}")
    println("Rarity: ${upgradedSword.rarity}")

    println("\n=== SIMULASI BATTLE EVENT ===")

    processEvent(BattleState.safeZone)

    processEvent(BattleState.MonsterEncounter("Ambatron"))

    processEvent(BattleState.LootDropped(upgradedSword))

    processEvent(BattleState.GameOver("terkena orbital strike ambatron"))
}