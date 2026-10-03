package oop_00000144521_AbrahamNieveroNathanael.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart speaker berhasil dinyalakan")
    }

    override fun turnOff() {
        println("Smart speaker berhasil dimatikan")
    }

    fun playMusic(song: String){
        println("Memutar $song dari spotify")
    }
}