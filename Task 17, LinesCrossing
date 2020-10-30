import java.util.Scanner
fun isLineCrossng(F1: Double, F2: Double):Boolean {
    val multiplyResult: Double = F1 * F2;
    if (multiplyResult <= 0)
        return true;
    else
        return false;
}
fun BuildFirstLine (a:Double,b:Double,coordinateX:Double,coordinateY:Double):Double {
    val F: Double = a*coordinateX + b -coordinateY;
    return F;
}
fun BuildSecondLine (a:Double,b:Double,coordinateX:Double,coordinateY:Double):Double {
    val F: Double = a*coordinateX + b -coordinateY;
    return F;
}
fun main (args: Array<String>) {
    var a: Double;
    var b: Double;
    var F1: Double = 0.1;
    var F2: Double = 0.1;
    val  input = Scanner(System.`in`)
    print("Write down coefficients of the line")
    a = input.nextDouble()
    b  = input.nextDouble()
    for (i in 1..2) {
        when (i) {
            1 ->{
                println("Write down the coordinates of the first(1) dot")
                val firstValue: Double = input.nextDouble()
                val secondValue: Double  = input.nextDouble()
                F1 = BuildFirstLine(a,b,firstValue,secondValue);
            }
            2-> {
                println("Write down the coordinates of the second(2) dot")
                val firstValue: Double = input.nextDouble()
                val secondValue: Double = input.nextDouble()
                F2 = BuildSecondLine(a,b,firstValue,secondValue)
            }
        }
    }
    print("${isLineCrossng(F1,F2)}")
}
