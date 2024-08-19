fun main() {
    var op : Int
    var consumoEletricidade : Double
    var consumoGas : Double

    var pegadaEletricidade = 0.0
    var pegadaGas = 0.0
    var pegadaTotal = 0.0

    val fatorEmissaoEletricidade = 0.475
    val fatorEmissaoGas = 2.0

    while (true) {
        println("+======================================================+")
        println("! Cálculo da Pegada de Carbono                         !")
        println("! Escolha seu tipo de consumo para calcular a pegada   !")
        println("+======================================================+")
        println("! 1 - Eletricidadde                                    !")
        println("! 2 - Gás                                              !")
        println("! 3 - Exibir total                                     !")
        println("! 0 - Sair                                             !")
        println("+======================================================+")
        op = readln().toInt()

        when(op) {
            0 -> {
                println("Até mais :)")
                break
            }
            1 -> {
                while(true) {
                    print("Digite seu consumo de eletricidade (kWh/m³)\n> ")
                    consumoEletricidade = readln().toDouble()
                    if (consumoEletricidade < 0.0) {
                        println("Valor inválido, digite novamente")
                    } else {
                        pegadaEletricidade = consumoEletricidade * fatorEmissaoEletricidade
                        pegadaTotal += pegadaEletricidade
                        break
                    }
                }
            }
            2 -> {
                while(true) {
                    print("Digite seu consumo de gás (kWh/m³)\n> ")
                    consumoGas = readln().toDouble()
                    if (consumoGas < 0.0) {
                        print("Valor inválido, digite novamente")
                    } else {
                        pegadaGas = consumoGas * fatorEmissaoGas
                        pegadaTotal += pegadaGas
                    }
                }
            }
            3 -> {

                println("Eletricidade: $pegadaEletricidade kg CO2")
                println("Gás: $pegadaGas kg CO2")
                println("Total: $pegadaTotal kg CO2")
            }
            else -> {
                println("Opção inválida")
            }
        }
    }

}