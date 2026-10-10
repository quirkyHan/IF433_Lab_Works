package oop_00000144521_AbrahamNieveroNathanael.week07

object DatabaseManager{
    var connectionStatus = "Disconnected"

    fun connect(){
        connectionStatus = "Connected"
        println("Database is ready")
    }
}