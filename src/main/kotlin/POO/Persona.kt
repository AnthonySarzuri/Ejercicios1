package POO

class Persona {
    //atributos
    var nombre: String=""
    var apellido: String=""
    var ci: Int = 0

    //constructor secundarios o alternativos
    constructor(nombre: String, apellido: String) {
        this.nombre = nombre
        this.apellido = apellido
    }

    //Metodos en clases
    fun mostrarNombre(){
        println("Bienvenido a clases:  $nombre $apellido")
    }
}