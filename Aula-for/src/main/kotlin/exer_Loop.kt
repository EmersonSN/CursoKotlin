fun pares(n: Int) {
    for (n in 100..200 step 2) {
        println(n);
    }
}
fun Ordem(n1:Int, n2:Int, tipo:String){
    if (tipo == "Crescente") {
        print("Crescente->");
        for (i in n1..n2) {
            print(", $i")
        }
    } else if (tipo == "Decrescente") {
        print("Decrescente->");
        for (i in n2 downTo  n1) {
            print(", $i")
        }
    }
}

fun main() {
    var n: Int = 10;
    //pares(n);
    var str = "Teste";
    /*for (i in str) {
        print("$i ")
    }*/
    val n1: Int = 10;
    val n2: Int = 15;
    val tipo: String = "Crescente";
    //Ordem(n1,n2,tipo);


    var j:Int=1;
    while (j<=4){
        if (j==1){
            println("#")
        }else if (j==2){
            println("##")
        }else if (j==3){
            println("###")
        }else{
            println("####")
        }
        j++;
    }

}
