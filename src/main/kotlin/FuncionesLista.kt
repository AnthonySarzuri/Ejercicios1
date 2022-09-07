fun main() {
    val numeros = listOf(4,3,2,1,5,7)
    val impares = numeros.filter {
        numero -> numero % 2 !=0
    }

    println(numeros)
    println(impares)

    //Ooperacion aplicada a todos los elementos de su lista
    //a`plicar una funcion f(x) a cada elemento de tu lista
    //f(x) = 2x - 1 -> x seria cada elemento de tu lista
    val resultado = numeros.map {
        valor -> (2* valor)-1
    }
    println(resultado)

    //reduce barre tu lista de izquierda a derecha
    //al revez hay otra funcion reduceRight
    //va agarrando cada elemento, aplica una operacion lo va acumulando y como resultado acumulado
    println(numeros.reversed().reduce { total, valor -> total*valor })

    numeros.sorted()
    numeros.sortedDescending()
    val ordenado = numeros.sortedBy {
        valor -> valor %2==0
    }
    println(ordenado)
    val ordena2=numeros.sortedBy {
        valor -> valor >2
    }
    println(ordena2)
    println(numeros)
}