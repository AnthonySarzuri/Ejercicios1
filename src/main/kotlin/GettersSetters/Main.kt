package GettersSetters

import java.time.LocalDate

fun main() {

    val usuario=Usuario(
        "royergt912@gmail.com",
        "12354678",
        fechaNacimiento = LocalDate.of(
            2001,
            10,
            17
        )

    )
    //Acceden implisitamente a sus getters y setters
    //Getter estamos obteniendo el valor del atributo
    //println(usuario.genero)
    //Setter asignanado un valor a un atributo
    //usuario.genero='F'
    //println(usuario.mostrarDatosUsuario())

    val nuevoUsuario =Usuario (
        "ABC@gmail.com",
        "123546",
        LocalDate.of(2001,8,24),
        "Jared",
        'M'
        )
    val usuarioValido=RegisterUser()
    usuarioValido.invoke(nuevoUsuario)
    println(usuarioValido)
    println(usuario.emailValido)
    println(LocalDate.now().year)

}