package oop_00000144521_AbrahamNieveroNathanael.week08

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()