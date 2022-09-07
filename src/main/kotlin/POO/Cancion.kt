package POO
//2 tipos de constructores : primario que va en los parentesis def clase
//constructor secundario que permite crear mas constructores e inicializaciones en su clase
//abstraccion... obj de tipo cancion requisistos minimos tema autos genero
//pero adicionalmente quizas me gustaria tener registrado la duracion calificaion
class Cancion(
    val tema: String,
    val autor: String,
    val genero:Char
)   {
    //Atrinbutos
    //con constructor primario esos tributos nonecesitan ser definidos explicitamenete
    var duracion: Long=0
    var calificacion: Int=0

     //Constructor secundario
    constructor(
         tema: String,
         autor: String,
         genero: Char,
         duracion: Long,
         calificacion: Int
    ): this(tema, autor, genero){
         this.duracion = duracion
         this.calificacion=calificacion
         //proceso
         println("Ha sido generado el proceso al crear la clase")
    }
    //Si quieres hacer un proceso extra en tu constructor llamada init
    init {
        println("Ha sido creada el objeto")
        println("El proceso ha corrido")
    }

    //Comportamientos
    //indiques que una cancion se esta reproduciendo
    //indiques la cancion que se esta deteniendo
    fun reproducirCancion(){
        println("Escuchando la cancion: $tema del autor $autor")
    }
    fun detenerCancion (){
        println("Detener la cancion $tema")
    }
}