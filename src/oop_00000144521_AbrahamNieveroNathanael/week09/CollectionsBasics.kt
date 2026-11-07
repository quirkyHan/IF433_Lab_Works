package oop_00000144521_AbrahamNieveroNathanael.week09

fun main(){
    println("=== test list ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable list: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")

    println("\n === Test Set ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers: $uniqueNumbers")

    val activeUsers = mutableSetOf("User A", "User B")
    activeUsers.add("User C")
    activeUsers.add("User A")
    println("Active Users: $activeUsers")

    println("\n=== Test Map ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A",
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apple"] = 45
    println("inventory: $inventory")
}