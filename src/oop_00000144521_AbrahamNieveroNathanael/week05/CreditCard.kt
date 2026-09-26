package oop_00000144521_AbrahamNieveroNathanael.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) <= limit) {
            usedAmount += amount
            println("Sukses")
        } else{
            println("Ditolak")
        }
    }
}