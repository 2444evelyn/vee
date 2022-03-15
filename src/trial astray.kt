fun main (){

    details(name = arrayOf("bilha","faith","Lonah"))
    name(name = arrayOf("chair","desk","ruler","board"))
    towns()
    var name = arrayOf("pipi","atah","donah")
    capitalizename(name)

}
fun details( name:Array<String>){
    println(name.contentToString())
}
fun name(name:Array<String>){
    println(name.contentToString())
}
fun towns(){
    var citiesArray = arrayOf("nairobi","capetown","kampala","mombasa")
     citiesArray.forEach { n->
         println(n)
     }
}
fun capitalizename(name: Array<String>) {
    name.forEach { n->
        println(n.capitalize())
    }
}

