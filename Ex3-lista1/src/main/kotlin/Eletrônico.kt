class Eletrônico(
    val produto: String,
    val modelo: String,
    val marca: String
) {
    var func = "Funcionalidade não inserida!"
    var categoria = "Categoria não inserida!"

    constructor(
        produto: String,
        modelo: String,
        marca: String,
        func: String,
        categoria: String
    ) : this(produto, modelo, marca) {
        this.func = func
        this.categoria = categoria

    }

    fun listinfos() {

        println("A ficha técnica do eletrônico cadastrado é: ")
        println()
        println("Produto: $produto")
        println("Modelo: $modelo")
        println("Marca: $marca")
        println("Funcionalidade: $func")
        println("Categoria: $categoria")

    }
}


