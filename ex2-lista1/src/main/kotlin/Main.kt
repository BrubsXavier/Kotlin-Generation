fun main() {

    /*
    2- Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
     */
    println("Insira o tipo de aeronave: ")
    val tipo = readln()

    println("Insira o modelo do avião: ")
    val modelo = readln()

    println("Insira a quantidade de motores: ")
    val nmotor = readln().toInt()

    println("Insira a capacidade total de passageiros: ")
    val capacidade = readln().toInt()

    println("Insira o porte: ")
    val porte = readln()

    val aero1 = Avião(
        tipo, modelo, porte, capacidade, nmotor
    )

    println()
    aero1.listinfos()
}