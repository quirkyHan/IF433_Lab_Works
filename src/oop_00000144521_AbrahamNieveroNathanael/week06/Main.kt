package oop_00000144521_AbrahamNieveroNathanael.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val mySmartphone = Smartphone()
    mySmartphone.turnOn()

    val pay1 = gopay()
    val pay2 = CreditCard()

    println("\n ====Testing Checkout====")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}