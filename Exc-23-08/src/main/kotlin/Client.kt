class Client(
    val name: String,
    val adress: String,
    val number: String,

    ) {

    init {
        checkData()
    }
 private var shoplist = mutableListOf<String>()

    fun addproduct(product: String){

        if(product != ""){
            shoplist.add(product)
            println("Produto adicionado com sucesso!")

        }else{
            println("Produto inválido!")
        }
    }

    fun removeproduct(){

        while (true){
            println("Digite um item para ser excluído da lista: ")
            val product = readln()

           if(shoplist.contains(product)){
                shoplist.remove(product)
                println("$product excluído com sucesso!")
                break
            }else{
                println("O produto não consta na lista!")
            }
        }
    }
    fun listproduct () {
        println()
        println(shoplist)
    }

    private fun checkData() {
        if (name == "" || adress == "" || number == "") {
            throw Exception("Cadastro incorreto. Falta de informações pessoais!")
        }
    }


}

private fun String.add(shoplist: MutableList<String>) {

}


