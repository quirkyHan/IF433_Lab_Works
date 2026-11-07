package oop_00000144521_AbrahamNieveroNathanael.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 145.50, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 10, -25.20, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, -80.45, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, 62.80, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 25, 210.10, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 5, -12.30, "OPEN")
    )

    val closedTrades = tradeHistory
        .filter{it.status == "CLOSED"}

    val winningTrades = closedTrades
        .filter{it.roe > 0}

    val losingTrades = closedTrades
        .filter{it.roe <= 0}

    val topPerformerString = winningTrades
        .sortedByDescending { it.roe }
        .map{"Win [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"}

    val worstPerformerString = losingTrades
        .sortedByDescending { it.roe }
        .map{"Win [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"}

}