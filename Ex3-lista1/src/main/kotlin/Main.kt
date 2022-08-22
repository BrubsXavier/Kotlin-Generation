fun main() {
   /*
   3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
    */

    println("Insira o Eletrônico: ")
    val produto = readln()

    println("Insira o modelo: ")
    val modelo = readln()

    println("Insira a marca: ")
    val marca = readln()

    println("Insira a funcionalidade: ")
    val func = readln()

    println("Insira a categoria: ")
    val categoria = readln()

    val eletro1 = Eletrônico (
        produto, modelo, marca, func, categoria
    )

    println()
    eletro1.listinfos()
}