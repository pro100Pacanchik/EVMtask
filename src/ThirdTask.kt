import  java.util.Scanner
val input = Scanner(System.`in`)

fun main (args: Array<String>)  {
    println("Write down numbers of rows")
    val rows  = input.nextInt();
    println("Write down numbers of columns")
    val  columns = input.nextInt();
    findRowAndColumn(rows,columns)
}

fun findRowAndColumn(rows: Int, columns: Int): Boolean {
    var table  = Array(rows,{Array(columns,{0})})


    var i0: Int = -1; var j0: Int = -1; var isRowFind: Boolean = false;
    var zeroNubmers: Int = 0; var oneNumbers: Int  = 0;
    for(i in 0..(rows-1)) {
        for(j in 0..(columns-1)) {
            table[i][j] += input.nextInt();
            if(!isRowFind && table[i][j] == 1) {
                ++oneNumbers;
            }
        }
        if(oneNumbers % rows == (rows - 1)) {
            i0 = i;
            oneNumbers = 0;
            isRowFind = true;
        }
        else if (!isRowFind)
            oneNumbers = 0;
    }
    for(i in 0..(rows-1)) {
        for(j in 0..(columns-1)) {
            if(table[j][i] == 0) {
                ++zeroNubmers;
            }
        }
        if(zeroNubmers % columns == 0 && zeroNubmers != 0) {
            j0  = i;
            break;
        }
        else {
            zeroNubmers = 0;
        }
    }
    i0 +=1 ; j0 +=1;
    println("$i0 -> строка; \n $j0 -> столбец (0 значит не найдено)")
    return true;
}
import  java.util.Scanner
val input = Scanner(System.`in`)

fun main (args: Array<String>)  {
    println("Write down numbers of rows")
    val rows  = input.nextInt();
    println("Write down numbers of columns")
    val  columns = input.nextInt();
    findRowAndColumn(rows,columns)
}

fun findRowAndColumn(rows: Int, columns: Int): Boolean {
    var table  = Array(rows,{Array(columns,{0})})


    var i0: Int = -1; var j0: Int = -1; var isRowFind: Boolean = false;
    var zeroNubmers: Int = 0; var oneNumbers: Int  = 0;
    for(i in 0..(rows-1)) {
        for(j in 0..(columns-1)) {
            table[i][j] += input.nextInt();
            if(!isRowFind && table[i][j] == 1) {
                ++oneNumbers;
            }
        }
        if(oneNumbers % rows == (rows - 1)) {
            i0 = i;
            oneNumbers = 0;
            isRowFind = true;
        }
        else if (!isRowFind)
            oneNumbers = 0;
    }
    for(i in 0..(rows-1)) {
        for(j in 0..(columns-1)) {
            if(table[j][i] == 0) {
                ++zeroNubmers;
            }
        }
        if(zeroNubmers % columns == 0 && zeroNubmers != 0) {
            j0  = i;
            break;
        }
        else {
            zeroNubmers = 0;
        }
    }
    i0 +=1 ; j0 +=1;
    println("$i0 -> строка; \n $j0 -> столбец (0 значит не найдено)")
    return true;
}
