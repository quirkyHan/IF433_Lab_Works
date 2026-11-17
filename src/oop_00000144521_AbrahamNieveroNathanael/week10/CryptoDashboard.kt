package oop_00000144521_AbrahamNieveroNathanael.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC"))
    coinRepo.add(Coin("ETH"))
    coinRepo.add(Coin("USDT"))

    val response = ApiResponse("200 OK", coinRepo.getAll())

}