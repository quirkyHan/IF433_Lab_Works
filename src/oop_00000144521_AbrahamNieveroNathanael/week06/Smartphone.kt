package oop_00000144521_AbrahamNieveroNathanael.week06

class Smartphone: Camera, Phone{
    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi smartphone berhasil booting")
    }
}