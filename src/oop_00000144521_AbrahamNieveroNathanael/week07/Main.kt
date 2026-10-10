package oop_00000144521_AbrahamNieveroNathanael.week07

import javax.xml.crypto.Data

fun main(){
    println("Test singleton")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}