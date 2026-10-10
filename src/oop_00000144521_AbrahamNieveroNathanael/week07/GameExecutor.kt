package oop_00000144521_AbrahamNieveroNathanael.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Jir ada monster: ${event.monsterName}")
            println("Bersiap untuk baku hantam")
        }

        is BattleState.LootDropped -> {
            println("Ada loot jatuh ${event.item.name} dengan rarity ${event.item.rarity}")
        }

        is BattleState.GameOver ->{
            println("Game berakhir: ${event.reason}")
        }
        is BattleState.safeZone -> {
            println("Memasuki safezone")
        }
    }
}