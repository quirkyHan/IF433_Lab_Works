package oop_00000144521_AbrahamNieveroNathanael.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 1700.0))
    coinRepo.add(Coin("USDT", 999.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach{
        println("${it.name}, balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TRX001", 65000.1))
    txRepo.add(Transaction("TRX002", 23930.0))
    txRepo.getAll().forEach { 
        println("${it.id}: ${it.amount}") 
    }

}