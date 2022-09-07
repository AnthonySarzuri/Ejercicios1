package POO

fun main() {
    //Crear objetos
    val persona = Persona("Royer","Ticona")
    persona.mostrarNombre()
    val celular =Celular("Xiomi Note 11")
    celular.mostrarModelo()

    //Cons
    val cancion = Cancion("Wyard","Glass Animals",'I', 120,5)
    val cancion2 = Cancion("Animals","Martin Garrix",'E')

    println(cancion.tema)//kotlin por debajo ejecuta el ger y set que tiene
    cancion.reproducirCancion()
    cancion2.detenerCancion()

}