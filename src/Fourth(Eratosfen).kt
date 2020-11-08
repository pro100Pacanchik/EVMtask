import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.math.*;
import java.math.BigInteger
import java.util.Scanner;

val input = Scanner(System.`in`)

fun main(args: Array<String>) {
    println("Введите Границы отрезка: \n A: ")
    val A: Int = input.nextInt();
    print("B: ");
    val B = input.nextInt();
    val number = (B - A + 1);
    WriteNumbersInFile(A,B);
    var array: IntArray = IntArray(number,{0});
    array = ReadElements(array);
    for(i in array)
        print("$i ")
    SieveEratosthenes(array,number,A,B);
}

fun SieveEratosthenes (array: IntArray,number: Int,begin: Int,end: Int) {
    var sieve = array;
    val writer = File("Output.txt").bufferedWriter()
    var is_prime  = Array(end + 1,{true});
    for(i in 2..end) {
        if(is_prime[i] == true) {
            for(j in (2 * i)..end step  i) {
                is_prime[j] = false;
            }
        }
    }
    for(i in 0 until number) {
        if(is_prime[array[i]])
            writer.write("${array[i].toString()} ")
    }
    writer.close();
}

fun ReadElements(array: IntArray): IntArray {
    var index = 0;
    var str: String  = "";
    try {
        var fin  = FileReader("Input.txt");
        var c: Int?
        do {
            c = fin.read()
            str += (c.toChar());
            /*array.set(index,c);
            ++index;*/
        } while(c != -1)
    } catch (ex:Exception) {
        print(ex.message);
    }
    var tempArray: IntArray = array;
    var isSpaceFind: Boolean = false;
    var tempStr: String = "";
    var count: Int = 0;
    for(i in str.indices) {
        if(str[i] == ' ') {
            tempArray[count] = tempStr.toInt()
            ++count;
            tempStr = "";
        }
        else
            tempStr += str[i];
    }
    return tempArray;
}
fun WriteNumbersInFile(A: Int, B: Int) {
    val writer = File("Input.txt").bufferedWriter()
    var count: Int = A;
    for(i in A..(B)) {
        writer.write(count.toString()); ++count;
        writer.write(" ");
    }
    writer.close();
}