package Visibilidad
//visibilidad * tipo de acceso
//Public - private - protecte
//public por defecto
//analizar mucho protected
//y de ser posible para proteger tienda a ir por privado
private class Docente {
    //control de la asignacionde valores a variables
    private var nombre:String?=null
    private var apellido:String?=null

    private fun MostarInfo(){
        println("""
            nombre: $nombre
        """.trimIndent())
    }

}
open class  Persona {
    //protected val persona= Docente()
    protected var nombre: String? = null
    fun mostrarDato(){

    }
}
private class Estudiante: Persona(){
    fun mostrarDatos(){
        super.nombre="Royer"
        println("mi nombre es ${super.nombre}")
    }
}
class People(){
    //internal es lamenos usada pero sirve para que tus atributos o metodos no sean accedidos
     //desde otros modulos o en el mayor de los casos cuando conectas de soluciones de terceros
    internal var name:String?=null
}