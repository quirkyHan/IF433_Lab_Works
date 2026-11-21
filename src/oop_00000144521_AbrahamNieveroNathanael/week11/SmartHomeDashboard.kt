package oop_00000144521_AbrahamNieveroNathanael.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val lamp = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }
    homeDevices.add(lamp)

    println(homeDevices)
}