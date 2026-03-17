          class Estudiante{
              var nombre = ""
              var edad = 0


              fun estudiar(){
                  println("$nombre esta estudiando...")
              }
          }

          class Asignatura(private val nombre: String, private val precio: Double){
              fun getNombre(): String{
                  return "La asignatura se llama: $nombre"
              }

              fun getPrecio(): Double{
                  return precio
              }

          }

          fun main(args: Array<String>) {
              val estudiante = Estudiante()
              estudiante.nombre="Harry Joiner"
              estudiante.edad=20



          }

