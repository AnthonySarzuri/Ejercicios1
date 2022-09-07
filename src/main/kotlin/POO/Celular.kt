package POO
//definar en la clase atributos
//para que una clase pueda ser vista y heredada por otras OPEN
open class Celular(val modelo: String="",val precio: Float = 150.0f) {
fun mostrarModelo(){
    //si deseas que la funcion o metodo lo puedes sobreescribir en una clase hijo debes indicar que es open
    println("El modelo es: $modelo")

}
}