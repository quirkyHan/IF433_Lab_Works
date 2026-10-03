package oop_00000144521_AbrahamNieveroNathanael.week06

fun main() {
    val smartLamp = SmartLamp("1", "Ruang tamu")
    val smartSpeaker = SmartSpeaker("1", "Google nest dapur")
    val smartCCTV = SmartCCTV("1", "Ezviz garasi")

    val hub = SmartHomeHub()

    hub.addDevice(smartLamp)
    hub.addDevice(smartSpeaker)
    hub.addDevice(smartCCTV)

    hub.activateSecurityMode()
    hub.turnOfllAllDevices()
}