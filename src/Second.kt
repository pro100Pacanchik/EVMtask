import java.util.Scanner;

typealias coordinates = Pair<Double,Double>;

fun findCoefA (x1: Double, y1: Double, x2: Double, y2: Double): Double {
        val a  = (y1 -y2) / (x1 - x2)
    return a;
}
fun findCoefB (x1: Double,y1: Double,a: Double): Double {
    return (y1 -a * x1)
}
fun  isXCoorsConcide (xDotA: Double, xDotB: Double,xDotC: Double): Boolean {
    if(xDotB == xDotC) {
        if(xDotA == xDotB) {
            println("Yes. these points coincide")
            return true;
        }
        else {
            println("No")
            return false;
        }
    }
}
fun  isYCoorsConcide (yDotA: Double, yDotB: Double,yDotC: Double): Boolean {
    if(yDotB == yDotC) {
        if(yDotA == yDotB) {
            println("Yes. these points coincide")
            return true;
        }
        else {
            println("No");
            return false;
        }
    }
}
fun isDotBelong (dotA : coordinates, dotB: coordinates, dotC: coordinates) {
    if(!isXCoorsConcide(dotA.first, dotB.first, dotC.first) && !isYCoorsConcide(dotA.second, dotB.second,dotC.second)) {
        val a: Double = findCoefA(dotB.first, dotB.second, dotC.first, dotC.second);
        val b: Double = findCoefB(dotB.first,dotB.second,a);
        if(a * dotA.first + b == dotA.second)
            println("Yes")
        else
            println("No")
    }
}

fun CoordinatesInput (): coordinates{
    val input = Scanner(System.`in`)
    println("Write down the Coordiantes of A")
    println("x Coordinate")
    val abscissaDot = input.nextDouble();
    println("y Coordinate")
    val ordinateDot = input.nextDouble();
    val coordinatesOfDot: coordinates = abscissaDot to ordinateDot;
    return coordinatesOfDot;
}

fun main (args: Array<String>)  {
    val dotA = CoordinatesInput();
    val dotB =  CoordinatesInput();
    val dotC = CoordinatesInput();
    isDotBelong(dotA, dotB, dotC);
}