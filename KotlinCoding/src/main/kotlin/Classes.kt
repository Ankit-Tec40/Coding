import kotlin.properties.Delegates

class Box{
    var length:Int=10
    var width:Int=20
    var  height:Int=5



    fun fillContents(){
        println("box filled")
    }
    fun open(){
        println("box open")
    }



}