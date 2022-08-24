package classes

class Dog(
    specie: String,
    name: String,
    scientificname: String,
    diet: String,
    sex: String,
    age: String,
    val breed : String,
    val furcolor : String
) : Animal(specie, name, scientificname, diet, sex, age) {

    override fun move() {
        println("O doguinho é quadrúpede e corre feliz!")

    }

    override fun swim() {
       println ("O doguinho está brincando na piscina!")
    }

    override fun eat() {
        println("O doguinho está comendo tudo sem mastigar enquanto planeja roubar sua comida!")
    }

    override fun makesound() {
        println("Auauau")
    }

    override fun listdata() {
        super.listdata()
        println("Raça do cachorro: $breed")
        println("Cor da pelagem: $furcolor")
    }

    fun howl () {
        println("AUUUUUUUUUUUUUUUUUUUUUUUUUUU!")
    }

}