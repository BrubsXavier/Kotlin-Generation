package classes

class Horse(
    specie: String,
    name: String,
    scientificname: String,
    diet: String,
    sex: String,
    age: String,
    val breed: String,
    val furcolor: String
) : Animal(specie, name, scientificname, diet, sex, age) {

    override fun move() {
        println("O cavalo é quadrúpede e caminha ao passo felizmente!")

    }

    override fun swim() {
        println("Olha, um cavalo nadando enquanto atravessa sua tela. Go pocotó!")
    }

    override fun eat() {
        println("O cavalo come paciente seus matinhos, pensando que um torrão de açúcar seria bem mais gostoso...")
    }

    override fun makesound() {
        println("Neeeeeeeeeeeeeeeeeeeeigh")
    }

    override fun listdata() {
        super.listdata()
        println("Raça do cavalo: $breed")
        println("Cor da pelagem: $furcolor")
    }

    fun kick() {
        println("A pessoa assustou o cavalo e levou um coice sem querer. Toma distraído!")
    }

    fun runaway() {
        println("O cavalo abriu a baia mais uma vez! Corra para encontrar o bicho fujão!")
    }

    fun gallop() {
        println("O cavalo dispara a toda velocidade enquanto a música tema de spirit toca!")
        println("Po-co-tó, po-co-tó, po-co-tó...")
    }

    fun trot() {
        println("O cavalo marcha em um trote alongado")
        println("Po-tó, po-tó, po-tó...")
    }

}