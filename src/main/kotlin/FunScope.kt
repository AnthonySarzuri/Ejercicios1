//Fun de scope son fun dinamicas que suelen aplicar operadores directamente sobre elementos que esten el contexto de una coleccion.
//evitar que crees cierta variables.
fun main() {
    val celulares = mutableListOf(
        "Nova 5T",
        "S20FE",
        "Note 8 Pro",
        "Huawei P30"
    )


    with(celulares){
        //dentro de este ambito
        //this agarra tu lista todas tus funciones que le aplicas a la lista las puedes hacer directamente
        println("La lista es $this")
        println("El tamaño es: $size")
        println("El primero elemento es: ${first()}")
        println("El ultimo elemento es: ${last()}")
    }

    celulares.apply {
        println("T$this")
        println("$size")
    }

    println(celulares.also {
        it + ("Hola")
    }.add("Samsung"))

    println(celulares)
}