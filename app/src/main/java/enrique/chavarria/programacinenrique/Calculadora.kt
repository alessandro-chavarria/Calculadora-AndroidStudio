package enrique.chavarria.programacinenrique

class Calculadora {

    fun Sumar(num1: Int, num2: Int): Int{
        val Resultado = num1 + num2
        return Resultado
    }

    fun Restar(num1: Int, num2: Int): Int{
        val Resultado = num1 - num2
        return Resultado
    }

    fun Multiplicar(num1: Int, num2: Int): Int{
        val Resultado = num1 * num2
        return Resultado
    }

    fun Dividir(num1: Int, num2: Int): Int{
        val Resultado = num1/num2
        return Resultado
    }
}