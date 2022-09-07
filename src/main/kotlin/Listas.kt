fun main() {
    //Colecciones ---> set ,List ,Map
    //Collecciones 2 formas --- mutable y

    //Listas
    //no mutable =  no cambia
    val numeros = listOf<Int>(1,2,1,2,3,3,2,4,6,5,4,6,4,7)
    val nombres = listOf<String>() //danimacamente agrgas luego

    //las mutables
    val precios= mutableListOf<Int>(1,2,3,4,5,6,7,8,9)
    precios.add(1,20)
    println(precios)
    precios.remove(5)
    println(precios)
    numeros.distinct().joinToString()
    println(numeros.distinct().joinToString())
    //println(quitarDuplicados(numeros))
    quitarDuplicados(numeros)
    numeros.toSet().joinToString()

    //Splitear o separar una lista en sublistas
    //predicado de una funcion
    val resultado=numeros.partition { it %2 == 0 }
    println("----------------------")
    println(resultado.first)
    println(resultado.second)
    println("----------------------")
    //Dada una lista de edades, muestre los elementos que son mayores de edad en su lista
    val edades= listOf(15,29,23,19,16,17,14)
    val mayores = edades.filter { it >=18 }.joinToString()
    println("Los mayores de edad son: $mayores")

    //Promddio de edadesde esa lista
    println("el promedio de edades del curso es: ${edades.average().toInt()}")

    //  Cuenten cuantos estudiantes de su lista son mayores de edad
    //predicado es un proceso de evalucion
    //digamos lo que tradcional mente escribimos en un if que entra como cuerpo de la funcion que va a invocar
    //orden superior
    println("Los mayores de edad son: ${edades.count { it >=18 }}")
    println("Los menores de edad son: ${edades.count { it <=17 }}")
    println("Los estudiantes son: ${edades.count()}")

    //Suma de elementos
    println(edades.sum())
    //Sumar los mayores de edad
    //println(edades.sumOf { it + it})
    println(edades.filter { it >=18 }.sum())
    //ejemplo para sacar la suma de los numeros contenidos en una lista usando la funcion reduce() --> oreden superior
    println(edades.reduce { a, b -> a + b })
    val edadesRandom=edades.random()
    println(edadesRandom)
    println(edades.first())

    //denme al chico de menor de edad de la lista
    print("Chico menor: ")
    println(edades.sorted().first())

    //denme al chico de mayor edad
    print("Chico mayor: ")
    println(edades.sorted().last())

    //Mapas
    //Formato clave valor
    val usuarios = mutableMapOf<Int, String>(
        10 to "Royer",
        20 to "Dain",
        30 to "Brajim"
    )

    //Mapa no mutable
    //                    llave   valor
    val productos= mapOf<String, String>(
    "uno" to "Coca",
    "dos" to "Galleta",
    "tres" to "Leche"
    )
    //existen otras estructuras de dato llamado Pair que son parejas de datos
    val productos2= mapOf<String,Float>(
        Pair("galleta",5.99f),
        Pair("gaseosa",6.99f),
        Pair("chicle",1.00f)
    )
    //mapas tienen dos elementos claves la llave y el valor como tal

    productos2.forEach{
        val key = it.key
        val value =it.value
        println("$key : $value")
    }
    //total de productos
    println(productos2.values.sum().toInt())

    val estudiantes = mapOf<Int,String>(
        1234 to "Armando",
        4567 to "Jaime Daniel",
        7894 to "Daniel Jorge",
        6543 to "Brajin Daniel",
        9632 to "Alejandro",
        1593 to "Drazen"
    )
    val aprobados = estudiantes.filter {
        estudiante -> estudiante.value.contains("Daniel")
    }
    println("Los aprobados son: $aprobados")
}

fun quitarDuplicados(numeros: List<Int>){
    val resultado= mutableListOf<Int>()
    numeros.forEach{
        if (!numeros.contains(it)) resultado.add(it)
    }
    resultado.joinToString()
}