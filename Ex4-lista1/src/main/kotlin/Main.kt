fun main() {
    /*
    4) Crie uma classe funcionário e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto funcionário, defina as
    instancias deste objeto e apresente as informações deste objeto no
    console.
     */

    println("Insira o nome do Funcionário: ")
    val nome = readln()

    println("Insira o código do colaborador: ")
    val codigo = readln()

    println("Insira a idade atual: ")
    val idade = readln().toInt()

    println("Insira o CPF a ser cadastrado: ")
    val cpf = readln()

    println("Insira o tempo de empresa do colaborador: ")
    val tempo = readln()

    println("Insira o tipo de regime de contratação vigente: ")
    val contrato = readln()

    val func1 = Funcionario(
        nome, codigo, idade, cpf, tempo, contrato
    )

    println()
    func1.listinfos()

}