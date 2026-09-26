package oop_00000144521_AbrahamNieveroNathanael.week05

fun main(){
    val EWallet1 = EWallet("Abrahamimut123", 50000.00)
    val CreditCard1 = CreditCard("Abrahamimut123", 100000.00)

    val PaymentMethod: List<PaymentMethod> = listOf(EWallet1, CreditCard1)

    for (payment in PaymentMethod){
        payment.processPayment(75000.00)

        when (payment){
            is EWallet -> {
                payment.topUp(50000.00)
                payment.processPayment(75000.00)
            }

        }
    }
}