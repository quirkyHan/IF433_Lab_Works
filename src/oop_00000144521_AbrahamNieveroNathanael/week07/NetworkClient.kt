package oop_00000144521_AbrahamNieveroNathanael.week07

class NetworkClient private constructor(val url: String){
    companion object{
        const val BASE_URL = "https://api.umn.ac.id/"

        fun createClient(): NetworkClient {
            println("Membangun network dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect(){
        println("Connecting to $url")
    }
}