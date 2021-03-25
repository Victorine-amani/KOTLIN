import java.util.*

fun main() {
    create()
    gramma()
    builtin()
   createArray(arrayOf("Victorine","Elizabeth","Hope"))
}
fun create(){
    val listArray= arrayOf("Victorine",true,"Amani","14")
    println(Arrays.toString(listArray))
}
fun gramma(){
  val citiesArray = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    citiesArray.forEach { cities->
      println(cities.capitalize())
    }
}
fun builtin(){
    val numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    val sum=numbers.get(1)+numbers.get(4)
    println(sum)
    val index=numbers.indexOf(158)
    println(index)
    val sortedNumbers=numbers.sortedArray()
   for(i in sortedNumbers)
       println(i)
// println(Arrays.toString(sortedNumbers))
}
fun createArray(names:Array<String>):Array<String>{
    return names
    println(Arrays.toString(names))
}
