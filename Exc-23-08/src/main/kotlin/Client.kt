class Client(
    val name: String,
    val adress: String,
    val number: String,

    ) {

    init {
        checkData()
    }
 private var _shoplist = mutableListOf<String>()
    var shopList: List <String> = _shoplist

    fun addproduct(product: String){

        if(product != ""){
            _shoplist.add(product)
            println("Produto adicionado com sucesso!")

        }else{
            println("Produto inválido!")
        }
    }

    fun removeproduct(product: String){

        while (true){

           if(_shoplist.contains(product)){
                _shoplist.remove(product)
                println("$product excluído com sucesso!")
                break
            }else{
                println("O produto não consta na lista!")
            }
        }
    }
    fun listproduct () {
        println()
        println(_shoplist)
    }

    private fun checkData() {
        if (name == "" || adress == "" || number == "") {
            throw Exception("Cadastro incorreto. Falta de informações pessoais!")
        }
    }


}

private fun String.add(_shoplist: MutableList<String>) {

}


