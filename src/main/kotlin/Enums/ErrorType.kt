package Enums
/*
* */
enum class ErrorType(
    val message:String
) {
    SUCCESS("Todo ha conectado correctamente") {
        override var errorCode: Int =200
        override fun getCountIntent(): Int = (1 .. 5).random()
        override fun showServer(): String ="digitalocean"
    },
    ACCESS_DENIED("El aceso ha sido denegado") {
        override var errorCode: Int = 401
        override fun getCountIntent(): Int = (1 .. 8).random()
    },
    INTERNAL_ERROR("Ha habido un problema en el servidor intente mas tarde") {
        override var errorCode: Int = 500
        override fun getCountIntent(): Int = (1 .. 20).random()
    };
    //definicion de atributos y metodos de podrian
    //ser o quiza deberian ser aplicados a tus elementos de la clase
    abstract var errorCode: Int
    abstract fun getCountIntent(): Int

    fun getPingConection(): Int = 60
    open fun showServer():String="heroku.com"
}