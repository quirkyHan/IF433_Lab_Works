package oop_00000144521_AbrahamNieveroNathanael.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val lamp = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }
    homeDevices.add(lamp)

    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera Terhubung")
    }

    homeDevices.add(camera)

    val ac = run{
        SmartDevice("Daikin Inverter (kabel 3x2.5)", "HVAC", false, 800)
    }

    homeDevices.add(ac)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    println(homeDevices)

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        println(it.diagnose())
    }


}