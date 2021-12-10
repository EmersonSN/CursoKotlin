fun media(vararg notas:Float){
    if (notas.isNotEmpty()){
        var soma:Float = 0f;
        for (notas in notas){
            soma+=notas;
        }
        println("A media é ${soma/notas.size}");
    }
}
fun <T> teste (vararg valores:T){
    for (valor in valores){
        println(valor)
    }
}
fun main() {
    media(8f,10f)
    media(7f,8f,2f,5f)

    teste(10,"Emerson", 78f, 78.5f, true)
}