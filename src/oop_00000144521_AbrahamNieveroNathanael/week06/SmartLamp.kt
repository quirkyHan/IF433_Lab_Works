package oop_00000144521_AbrahamNieveroNathanael.week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable{
    override fun turnOn(){
        println("Smart lamp berhasil dinyalakan")
    }

    override fun turnOff(){
        println("Smart lamp berhasil dimatikan")
    }
}