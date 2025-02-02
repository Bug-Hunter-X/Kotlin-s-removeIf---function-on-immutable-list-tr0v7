fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = listOf(1, 2, 3, 4, 5).toMutableList()
    list2.removeIf { it % 2 == 0 }
    println(list2) // Output: [1,3,5]
    
    //Alternative solution using filter
    val evenNumbers = list2.filter { it % 2 == 0 }
    println(evenNumbers) // Output: []
    val oddNumbers = list2.filter { it % 2 != 0 }
    println(oddNumbers) // Output: [1,3,5]
}