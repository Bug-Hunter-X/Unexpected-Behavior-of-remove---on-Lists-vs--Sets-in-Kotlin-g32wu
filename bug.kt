fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.remove(3) 
    println(list) // Output: [1, 2, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.remove(3)
    println(set) // Output: [1, 2, 4, 5]

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    map.remove("c")
    println(map) // Output: {a=1, b=2}
}