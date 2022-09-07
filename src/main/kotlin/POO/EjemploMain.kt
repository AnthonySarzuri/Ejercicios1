package POO

import java.time.LocalDateTime
import java.time.Month

fun main() {
    //val post = Post("Memes Programacion","el admin","22/08/2022","Memes",20)
    //println(post)
    //val post1 = Post(" Programacion","el admin","22/08/2022")

    //post.informacionpost()
    //post1.informacionpost()

    val post1 =Post(
        "Memes Programacion",
        "El admin",
        LocalDateTime.of(
            2022,
            Month.AUGUST,
            22,
            16,35
        ),
        "Memes",5
    )
    println("----------------------------------")
    val post2 =Post(
        "Memes Programacion",
        "El admin",
        LocalDateTime.of(
            2022,
            Month.AUGUST,
            22,
            16,35
        )
    )
    println(post1.mostrarDatos())
    println("----------------------------------")
    println(post2.mostrarDatos0())

}