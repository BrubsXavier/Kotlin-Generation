class Avião(
    val tipo: String,
    val modelo: String,
    var porte: String
) {
    var nmotor = 0
    var capacidade = 0

    constructor(
        tipo: String,
        modelo: String,
        porte: String,
        capacidade: Int,
        nmotor: Int
    ) : this(tipo, modelo, porte) {
        this.nmotor = nmotor
        this.capacidade = capacidade

    }

    fun listinfos() {

        println("As informações da aeronave são: ")
        println()
        println("Tipo: $tipo")
        println("Modelo: $modelo")
        println("Número de motores: $nmotor")
        println("Porte: $porte")
        println("Capacidade total: $capacidade")

    }
}

