package oop_00000144521_AbrahamNieveroNathanael.week06

class gopay: PaymentMethod{
    override fun pay(amount: Double){
        println("Processing Rp$amount via gopay server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(amount: Double){
        println("Contacting bank for Rp$amount")
    }
}