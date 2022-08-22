fun main() {

    /*
    1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
     */

    println("Insira o nome do cliente: ")
    val nome = readln()

    println("Insira a idade do cliente: ")
    val idade = readln().toInt()

    println("Insira o gênero do cliente: ")
    val genero = readln()

    println("Insira o email do cliente: ")
    val email = readln()

    println("Insira a nacionalidade do cliente: ")
    val nacionalidade = readln()

    println("Insira o telefone do cliente (ex: (xx) 90000-0000): ")
    val telefone = readln()

    val client1 = Client(
        nome, idade, genero, email, false
    )

    println()
    client1.listinfos()


}