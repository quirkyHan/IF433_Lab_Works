package oop_00000144521_AbrahamNieveroNathanael.week08

class NotificationService {
    fun sendEmail(emailAdress: String) {
        println("Mengirim email ke: $emailAdress")
    }

    fun processUser(user: userProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}