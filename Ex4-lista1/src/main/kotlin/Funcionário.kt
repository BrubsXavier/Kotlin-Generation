class Funcionario(
    val nome: String,
    val codigo: String,
    val idade: Int,
    val cpf: String,
) {
    var tempo = "Tempo de empresa não informado!"
    var contrato = "Regime de contratação não informado!"

    constructor(
        nome: String,
        codigo: String,
        idade: Int,
        cpf: String,
        tempo: String,
        contrato: String
    ) : this(nome, codigo, idade, cpf) {
        this.tempo = tempo
        this.contrato = contrato

    }

    fun listinfos() {

        println("A ficha técnica do funcionário cadastrado é: ")
        println()
        println("Nome do funcionário: $nome")
        println("Código do funcionário: $codigo")
        println("Idade do funcionário: $idade")
        println("CPF: $cpf")
        println("Tempo desde a contratação: $tempo")
        println("Regime de contratação: $contrato")

    }
}
