package oop_00000144521_AbrahamNieveroNathanael.week10

interface Named {
    val name: String
}

class WalletRepository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List<T> = items

    fun <T : Named> WalletRepository<T>.findByName(name: String): T? {
        return getAll().find { it.name == name }
    }
}