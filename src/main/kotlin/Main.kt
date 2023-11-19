import kotlin.math.exp

/*
01.11.2023
--SETTING UP WHAT WE NEED


--HELLO WORLD
fun main () {
    println("Hello world!")
    println()
    println("Whats up?")
}


03.11.2023
--VAR, VAL, INTEGER, BOOLEAN

fun main() {
    var name = "Dias"
    var age = 24

    println("Меня зовут $name и мне $age года")

    age = 25
    println("В следующем году мне исполнится $age")

}

fun main() {
    val age:Int = 7 + 5

    println(age)
}

fun main() {
    val x:Boolean = true

    println(x)
}


--ARITHMETIC OPERATORS
Задание:
fun main() {
    val x = 3
    val y = 4
    val z = 5

    println("x: $x")
    println("x + y: ${x + y")
    println("x + y + z: ${x + y + z}")
}


--DECIMAL NUMBERS
Задание: Найти объем сферы
fun main() {
    val radius = 7.3
    val pi = 3.14159265359
    val volume = 0.75 * pi * radius * radius * radius

    println("The volume of the sphere with the radius $radius is $volume")
}


--STRINGS
Задание: Объявить переменную со строкой и напечатать ее наоборот в верхнем
регистре
fun main() {
    val myName = "Dias"

    println(myName.toUpperCase().reversed())
}

--LOGICAL AND COMPARISON OPERATORS
Задание: Определить что будет возвращено true или false
fun main() {
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    //Возвращено true

    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool
            || y < z)
    println(hardExpression)
}


07.11.2023
--IF CONDITIONS
Задание: Проверить является ли переменная string палиндромом
fun main() {
    var string = "racecar"
    println("The string is $string")

    if (string.reversed() == string) {
        println("The string $string is a palindrome")
    }
}


--NULL VALUES AND USER INPUT
Задание: Программа для определения возраста
fun main() {
     println("Пожалуйста введите свой возраст")

    val userAge = readLine()?.toInt()
    if(userAge != null) {
        if (userAge >= 0 && userAge < 18) {
            println("Вы еще слишком молод")
        } else if(userAge >= 18 && userAge <= 65) {
            println("Вы взрослый")
        } else {
            println("Вы уже старый")
        }
    }
}


--ARRAYS
fun main() {
    val myArray = arrayOf(3, 2, 6, 4)
    println(myArray[1])
}


08.11.2023
--WHILE LOOP
fun main() {
    var x = 4
    while (x > 2) {
        println("Hello")
        x--
    }

    println("whats up?")
}

fun main() {
    val myArray = arrayOf("Hello", "Guys", "Whats up?")
    val arrayLenght = myArray.size
    var i = 0

    while (i < arrayLenght) {
        println(myArray[i])
        i++
    }
}

Задание: с помощью цикла while создать программу которая считает числа от
заданного числа
fun main() {
    println("Пожалуйста введите число:")

    var userNumber = readLine()?.toInt()
    println("Давайте посчитаем от $userNumber до 0:")

    while (userNumber != null && userNumber >= 0) {
        println(userNumber)
        userNumber--
    }
}

fun main() {
   println("Введите число 1:")
   val x = readLine()?.toInt()

   println("Введите число 2:")
   val y = readLine()?.toInt()

   var result = 1
   var i = 0
   while (x != null && y != null && i < y) {
       result *= x
       i++
   }
   println("$x в степени $y это $result")
}


--FOR LOOP
fun main() {
    val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
    var max = myArray[0]
    for(i in myArray) {
        if(i > max) {
            max = i
        }
    }
    println(max)
}

fun main() {
    val myArray = arrayOf(4, 5, 6)
    var sum = 0

    for (i in myArray) {
        sum += i
    }
    println(sum)
}


13.11.2023
--LISTS
fun main() {
    val array = arrayOf(1, 2, 3)
    val list = mutableListOf(1, 2, 3)

    list.removeAt(2)
    println(list)
}

fun main() {
    val list = mutableListOf<Int>()
    for (i in 1..5) {
        val x = readLine()?.toInt()
        if (x != null) {
            list.add(x)
        }
    }
    println(list)
    for (i in list.size - 1 downTo 0) {
        println(list[i])
    }
}

fun main() {
    println("Введите число:")

    var userNum = readLine()?.toInt()
    println("Давайте выполним обратный отсчет от $userNum до 0:")


    while (userNum != null && userNum > 0) {
        println(userNum)
        userNum--
    }
}


17.11.2023
--WHEN
fun main() {
    val age = readLine()?.toInt()

    when (age) {
        in 0..5 -> println("Ты еще ребенок!")
        in 6..17 -> println("Ты подросток!")
        18 -> println("Ты уже совершеннолетний!")
        19, 20 -> println("Ты молодой человек!")
        in 21..65 -> println("Ты уже взростлый!")
        else -> println("Вы уже старый!")
    }
}

fun main() {
    val age = readLine()?.toInt()
    val x = 6

    when (age) {
        in 0..5 -> println("Ты еще ребенок!")
        in 6..17 -> println("Ты подросток!")
        18 -> if (x == 6) {
            println("Ты уже совершеннолетний!")
        }
        19, 20 -> println("Ты молодой человек!")
        in 21..65 -> println("Ты уже взрослый!")
        else -> println("Вы уже старый!")
    }
}

Задание:
fun main() {
    println("Откуда ты?")
    val userCountry = readLine()

    when (userCountry) {
        "USA" -> println("Hello!")
        "Kazakhstan", "Казахстан" -> println("Salem!")
        "Russia", "Россия" -> println("Привет!")
        else -> println("К сожалению, не знаю эту страну")
    }
}


18.11.2023
--FUNCTIONS AND PARAMETERS
fun main() {
    printThreeLines()
}

fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}

fun main() {
    printPow(3, 5 )
    printPow(3, 4)
    printPow(4,2)
}

fun printPow(base: Int, exponent: Int) {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is $result")
}


Задание:
fun main() {
    println("Для определения суммы значений от 1 до n. Введите значение n:")
    printSum()
}

fun printSum() {
   val n = readLine()?.toInt()
   var sum = 0

   if (n != null) {
       for (i in 1..n) {
           sum += i
       }
   }
   println()
   println("Сумма значений от 1 до $n равна $sum")
}


--FUNCTIONS WITH RETURN VALUE

fun main() {
    val pow = printPow(3, 5 )
    println("3 to the power of 5 is $pow")
}

fun multiplay(a: Int, b:Int) = a * b

fun printPow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3)
}

fun printFirstItem(list: List<Int>) = println(list[0])

fun printPow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
 */

fun main() {
    val list = listOf(3, 2, 5, 1, 5, 6, 7)
    println("Список выглядит следующим образом: $list")
}

fun searchListItem( list: List<Int>) {

}















