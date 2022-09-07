fun main() {
    val list = mutableListOf(1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9, 9,10,10,10)
    println("Lista actual: $list")

    val distinct = list.toSet().toList();
    print("Lista sin repetidos: ")
    println(distinct)
}