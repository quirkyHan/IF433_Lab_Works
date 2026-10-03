package oop_00000144521_AbrahamNieveroNathanael.week06

interface SmartDevice{
    abstract val id: String
    abstract val name: String
}

interface Switchable{
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable{
    abstract fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke cloud")
    }
}

