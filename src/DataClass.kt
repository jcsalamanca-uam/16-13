data class Student(
    val cif: String,
    val nombre: String,
    val carrera: String,
    val promedio: Double
){
    fun saludar(): String{
        return "$cif, $nombre"
    }
}
fun main(){

    val estudiante1 = Student(
        cif = "24010046",
        nombre = "Julio Salamanca",
        carrera = "Ingeniería en Sistemas",
        promedio = 90.5
    )

    println(estudiante1.saludar())
    println("Carrera: ${estudiante1.carrera}")
    println("Promedio: ${estudiante1.promedio}")

}