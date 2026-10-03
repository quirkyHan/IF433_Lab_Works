package oop_00000144521_AbrahamNieveroNathanael.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
    }

    override fun startRecord() {
        println("Perekaman dimulai")
    }

}