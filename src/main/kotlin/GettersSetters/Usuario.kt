package GettersSetters

import java.time.LocalDate

/*
    Crear un sistema donde tienes usuarios que accederan al mismo
    cada usuario debe por defecto registro
    Caso de uso: REgistro usuario
    un email -- minusscula
    password -- 6 caracteres
    adicionalmemte un usuario deberia registrarse con su fecha de nacimiento
    Opcinalmente un usuario podria registrar su nickname y su genero
    El sitio debe validar que sea mayor de edaddado que es contenido para adultos
*/
class Usuario (
    email: String,
    password: String,
    fechaNacimiento: LocalDate,
    ){

    //atributos opcionales
    var nickname: String = ""
    var genero:Char='N'
    var esValido= true

    //Getters Setters
    //si la variable es val cuidado que no puedas hacer un set
    //inmediatamente despues de la variable o atributo
    var emailValido: String=email
        set(value) {
            field=value.lowercase()
        }
    var passwordValido: String=password
        set(value) {
            field=if (value.length == 6) value else {
                esValido=false
                ""
            }
        }
    var fechaValida:LocalDate=fechaNacimiento
        set(value) {
            val age = LocalDate.now().year - value.year
            if (age >18 ){
                field=value
            }else{
                esValido=false
                0
            }
        }

    init {
        //this.email=emailValido
        //this.password=passwordValido
    }
    //constructor
    constructor(
        email: String,
        password: String,
        fechaNacimiento: LocalDate,
        nickname: String,
        genero:Char
    ):this(email,password,fechaNacimiento ){
        this.nickname=nickname
        this.genero=genero
    }


   /*
    fun mostrarDatosUsuario():String{
        return """
            Email: $email
            Password: $password
            Fecha de Nacimiento: $fechaNacimiento         
        """.trimIndent()
    }*/

}