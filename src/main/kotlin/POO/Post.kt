package POO

import java.awt.CheckboxGroup
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

//Blog o foro de facebook
//incluyan nesesaria mente Nombre, Autor, Fecha
//asi mismo quizas pueda ser nesesario que se deba registrar la categoria y valoracion
//debe mostra en pantalla todo el contenido que tiene el objeto
class Post (
    val nombrePost: String,
    val autorPost: String,
    val fechaPost: LocalDateTime
        ){

    //atributos
    var categoriaPost: String=""
    var valoracionPost: Int=0

    //Constructor
    constructor(
        nombrePost: String,
        autorPost: String,
        fechaPost: LocalDateTime,
        categoriaPost: String,
        valoracion: Int
    ):this(nombrePost, autorPost,fechaPost){
        this.categoriaPost = categoriaPost
        this.valoracionPost=valoracion
    }

    fun mostrarDatos():String{
        return """
            Nombre: $nombrePost
            Autor: $autorPost
            Fecha: $fechaPost
            Categoria: $categoriaPost
            Valoracion $valoracionPost           
        """.trimIndent()
    }

    fun mostrarDatos0():String{
        return """
            Nombre: $nombrePost
            Autor: $autorPost
            Fecha: $fechaPost         
        """.trimIndent()
    }

    fun informacionpost(){
        println("EL nombre del post es: $nombrePost del autor $autorPost en la fecha: $fechaPost " )
    }
}