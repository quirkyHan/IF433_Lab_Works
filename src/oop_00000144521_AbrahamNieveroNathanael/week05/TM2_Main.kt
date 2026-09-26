package oop_00000144521_AbrahamNieveroNathanael.week05

fun main(){
    val EWallet1 = EWallet("Abrahamimut123", 50000.00)
    val CreditCard1 = CreditCard("Abrahamimut123", 100000.00)

    val PaymentMethod: List<PaymentMethod> = listOf(EWallet1, CreditCard1)

    for(paymentMethod in PaymentMethod){
        paymentMethod.processPayment(75000.00)
    }
}