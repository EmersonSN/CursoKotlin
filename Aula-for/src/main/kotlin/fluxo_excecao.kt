import java.lang.Exception
import java.lang.NumberFormatException

fun main(){
    try{
        println("str".toInt())
    }catch (e: NumberFormatException){
        println("Formato do número não é o correto")
    }catch (e: Exception){
        println("Algo de errado aconteceu!");
    }finally {
        print("Executado independentemente se haja erro ou não!")
    }
}