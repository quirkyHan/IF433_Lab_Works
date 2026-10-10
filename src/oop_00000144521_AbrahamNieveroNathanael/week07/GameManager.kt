package oop_00000144521_AbrahamNieveroNathanael.week07

object GameManager{
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning){
            println("Game sudah berjalan!\nMencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai game engine")
        }
    }
}