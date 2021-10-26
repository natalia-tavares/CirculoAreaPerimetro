fun main(args: Array<String>) {
    var circulo = 0
    var area = 0.0
    var perimetro = 0.0
    var pi = 3.14
    var raio = 0

    println("Digite o valor do diametro do circulo: ")
    circulo = readLine()!!.toInt()

    raio = circulo / 2

    area = pi * (raio * raio)

    perimetro = 2 * pi * raio

    println("A area do seu circulo é: $area e o perimetro do seu circulo é: $perimetro")
}