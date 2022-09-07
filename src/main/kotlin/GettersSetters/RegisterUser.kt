package GettersSetters
//Caso
class RegisterUser
{
    fun invoke(usuario: Usuario):Usuario?{
        return if (usuario.esValido)usuario else null
    }
}