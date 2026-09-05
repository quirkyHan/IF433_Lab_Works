package oop_00000144521_AbrahamNieveroNathanael.week02

import java.util.Scanner

class Hero(val name: String, val baseDamage: Int, var hp: Int = 100){

    fun attack(targetName: String){
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage

        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan nama hero: ")
    val nama = scanner.nextLine()

    print("Masukkan damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(nama, damage)
    var enemyHp = 100

    while(hero.isAlive() && enemyHp > 0){
        println("1. Serang, 2. Kabur")
        val opsi = scanner.nextInt()

        if(opsi == 1){
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa hp musuh: $enemyHp")

            if (enemyHp > 0){
                val dmgMusuh = (10..20).random()
                hero.takeDamage(dmgMusuh)
                println("Sisa hp hero ${hero.hp}")
            }
        } else {
            println("Kaburr cihuyy")
            break
        }
    }

    println("Hasil akhir:")
    if(hero.hp > enemyHp){
        println("Anda menang")
    } else if (hero.hp == enemyHp){
        println("Anda seri")
    } else {
        println("Anda kalah😭")
    }
}