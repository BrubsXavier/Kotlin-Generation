class Client (
    var nome: String,
    var idade: Int,
    val genero: String,
    var email: String,
    var telefone: String
        ) {

    var update = false
    val nacionalidade = ""

    constructor(
        nome: String,
        idade: Int,
        genero: String,
        email: String,
        telefone: String,
        update: Boolean,
        nacionalidade: String

    ): this(nome, idade, genero, email, telefone){
        this.update = update
    }

    fun listinfos () {

        println("As informações do cliente são: ")
        println()
        println("Nome: $nome")
        println("Idade: $idade")
        println("Gênero: $genero")
        println("Nacionalidade: $nacionalidade")
        println("Email: $email")
        println("Telefone: $telefone")

        }
    }


