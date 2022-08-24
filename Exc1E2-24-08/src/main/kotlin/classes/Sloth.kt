package classes

class Sloth(
    specie: String,
    name: String,
    scientificname: String,
    diet: String,
    sex: String,
    age: String,
) : Animal(specie, name, scientificname, diet, sex, age) {

    override fun move() {
        println("A preguiça se move lentamente entre as árvores!")

    }

    override fun swim() {
        println ("Lá vem a preguiça nadando de boas!")
    }

    override fun eat() {
        println("Comendo seus matinhos tranquila!")
    }

    override fun makesound() {
        println("Insira aqui o efeito sonoro do r2d2 gritando")
    }

    override fun listdata() {
        super.listdata()
    }

    fun climbtree () {
        println("Escalando uma árvore centenária")
    }

}