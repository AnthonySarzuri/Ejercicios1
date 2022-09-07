package Enums
/*
enunms clases especiales que repressentan una coleccion de dats validos
general mente se representa como constantes(lista de valores)
Reprentaciones parametricas ya definidas...
por convencion se recomienda denominar sus atributos principales con mayusculas
***cada valor representa una instancia de una clase***
para definirlas se usa la palabra enum
el nombre de la clase debe ser lo suficientemente claro y esoecifico para que se entienda a que representa el enemigo
*/
enum class EnemyStates {
    IDDLE,
    WALK,
    PATROL,
    ATTACK,
    DASH,
    DIE
}