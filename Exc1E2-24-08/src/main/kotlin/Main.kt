import classes.Dog
import classes.Horse
import classes.Sloth

fun main() {

    try {

        print("Olá, por favor insira a espécie do animal: ")
        val specie = readln()

        print("Agora adicione o nome: ")
        val name = readln()

        print("Informe o nome científico: ")
        val scientificname = readln()

        print("Quase lá... Insira o tipo de hábito alimentar: ")
        val diet = readln()

        print("Agora informe o sexo do animal: ")
        val sex = readln()

        print("Para finalizar, adicione a idade: ")
        val age = readln()

        while (true) {

            println()
            println("1 - Ver informações sobre cachorros")
            println("2 - Ver informações sobre cavalos")
            println("3 - Ver informações sobre Bichos-preguiça")
            println("4 - Finalizar programa")
            println()
            println("Escolha uma das opções acima: ")

            when (readln().toInt()) {
                1 -> {
                    print("Especifique a raça do cachorro: ")
                    val breed = readln()

                    print("Adicione a cor da pelagem do cachorro: ")
                    val furcolor = readln()

                    val dog1 = Dog(specie, name, scientificname,diet, sex, age,breed, furcolor)

                    println()
                    dog1.move()
                    println()
                    dog1.swim()
                    println()
                    dog1.eat()
                    println()
                    dog1.makesound()
                    println()
                    dog1.howl()
                    println()
                    dog1.listdata()

                    println("Obrigada por utilizar nosso sistema: ")
                    break
                }
                2 -> {
                    print("Especifique a raça do cavalo: ")
                    val breed = readln()

                    print("Adicione a cor da pelagem do cavalo: ")
                    val furcolor = readln()

                    val horse1 = Horse(specie, name, scientificname,diet, sex, age,breed, furcolor)

                    println()
                    horse1.move()
                    println()
                    horse1.swim()
                    println()
                    horse1.eat()
                    println()
                    horse1.makesound()
                    println()
                    horse1.kick()
                    println()
                    horse1.trot()
                    println()
                    horse1.gallop()
                    println()
                    horse1.runaway()
                    println()
                    horse1.listdata()

                    println("Obrigada por utilizar nosso sistema: ")
                    break
                }
                3 -> {
                    val sloth1 = Sloth(specie, name, scientificname,diet, sex, age)

                    println()
                    sloth1.move()
                    println()
                    sloth1.swim()
                    println()
                    sloth1.eat()
                    println()
                    sloth1.makesound()
                    println()
                    sloth1.climbtree()
                    println()
                    sloth1.listdata()

                    println("Obrigada por utilizar nosso sistema: ")
                    break
                }
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
