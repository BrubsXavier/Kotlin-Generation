fun main() {
    /*
    1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
 nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

 A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
 Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio,
 jogue uma exceção. Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro
 de um bloco try catch.
     */
    try {

        print("Olá, por favor insira o nome a ser cadastrado: ")
        val name = readln()

        println()

        print("Agora adicione o endereço do titular da conta: ")
        val adress = readln()

        println()

        print("Para finalizar, adicione o telefone principal para contato: ")
        val number = readln()

        val client1 = Client(
            name, adress, number
        )

        while (true) {

            println()
            println("1 - Adicionar um produto")
            println("2 - Remover um produto")
            println("3 - Exibir produtos")
            println("4 - Sair")
            println()
            println("Escolha uma das opções acima: ")

            when (readln().toInt()) {
                1 -> {
                    print("Adicione um produto para a Lista de compras: ")
                    val product = readln()
                    client1.addproduct(product)
                }
                2 -> client1.removeproduct()
                3 -> client1.listproduct()
                4 -> {
                    println("Obrigada por utilizar nosso sistema: ")
                    break
                }

            }

        }
    } catch (e : Exception) {
        println("O cadastro foi feito de forma incorreta. Erro inesperado")
    }
}


