package oop_00000144521_AbrahamNieveroNathanael.week06

class Smartwatch: Watch(), BluetoothConnectable, rechargeable {
    override fun showTime(){
        println("Layar AMOLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W")
    }

}