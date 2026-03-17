interface Calculadora1{

    fun sumar(num1: Int, num2: Int): Int

    fun max (num1: Int, num2: Int): Int

    fun mix(num1: Int, num2: Int): Int

}

class MisCaclc: Calculadora1{
    override fun sumar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun max(num1: Int, num2: Int): Int {
        if (num1 > num2) return num1
        else return num2
    }

    override fun mix(num1: Int, num2: Int): Int {
    if (num1>num2) return num2
    else return num1

    }
}