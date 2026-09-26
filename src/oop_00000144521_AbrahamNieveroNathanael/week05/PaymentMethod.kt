package oop_00000144521_AbrahamNieveroNathanael.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}