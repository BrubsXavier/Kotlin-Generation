package classes

abstract class Animal (
    val specie : String,
    val name : String,
    val scientificname : String,
    val diet : String,
    val sex : String,
    val age : String
        ) {

    abstract fun move ()

    abstract fun swim ()

    abstract fun eat ()

    abstract fun makesound ()

    open fun listdata () {
        println()
        println("Espécie: $specie")
        println("Nome do animal: $name")
        println("Nome científico: $scientificname")
        println("Hábitos alimentares: $diet")
        println("Sexo do animal: $sex")
        println("Idade: $age")
    }





}