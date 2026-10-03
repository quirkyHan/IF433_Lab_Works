package oop_00000144521_AbrahamNieveroNathanael.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan ${device.name}")
    }

    fun turnOfllAllDevices() {
        for (device in devices) {
            when(device) {
                is Switchable -> device.turnOff()
            }
        }
    }

    fun activateSecurityMode(){
        for (device in devices) {
            when(device) {
                is Recordable -> device.startRecord()
                is SmartSpeaker -> device.playMusic("Haru")
            }
        }
    }

}