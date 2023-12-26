import java.awt.Shape
import kotlin.math.exp
import kotlin.math.sqrt
import kotlin.random.Random

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

Задание:
fun main() {
    val list = listOf(1, 3, 4, 6, 7)
    println("Список выглядит следующим образом: $list")
    println("Найти число:")

    val userInput = readLine()?.toInt()
    if (userInput != null) {
        println("Индекс числа $userInput это ${indexOf(list, userInput)}")
    }
}

fun indexOf(list: List<Int>, value:Int): Int {
    for (i in 0 until list.size) {
        if (list [i] == value) {
            return i
        }
    }
    return -1
}


30.11.2023
--VARARG, DEFAULT AND NAMED PARAMETERS
fun main() {
    val max = getMax(1, 5, 6, 12, 7)
    println(max)
}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for(number in numbers) {
        if(number > max) {
            max = number
        }
    }
    return max
}


fun main() {
    searchFor(search = "Как стать программистом?")
}

fun searchFor(search: String, searchEngine: String = "Google") {
    println("Search for $search on $searchEngine")
}
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for(number in numbers) {
        if(number > max) {
            max = number
        }
    }
    return max
}
*/

/*
fun main() {
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is $sum")

fun main() {
    val list = listOf(1, 4, 5, 6, 8, 10)
    println("Список выглядит следующим образом $list")
    println("Найти число:")

    val input = readLine()?.toInt()
    if(input != null) {
        println("Индекс числа $input это ${searchNumber(list, input)}")
    }
}

fun searchNumber(list: List<Int>, value: Int): Int {
    var result = 0
    for(i in 0 until list.size) {
        if(list[i] == value) {
            return i
        }
    }
    return -1
}
11.12.2023
Задание:
fun main() {
    val sum = alternatingSum(3)
    println(sum)
}

fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0 //-3
    var toggle = false //true

    for(number in numbers) {
        if(toggle) {
            sum += number
        } else {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}


13.12.2023
--EXTENSION FUNCTIONS

fun main() {
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input != null) {
        if(input.isPrime()) {
            println("$input is a prime number")
        } else {
            println("$input is not a prime number")
        }
    }
}

fun Int.isPrime(): Boolean {
    for(i in 2 until this) {
        if(this % i ==0) {
            return false
        }
    }
    return true
}

fun main() {
    val list = listOf(2, 4, 5, 5)
    println("$list is ${list.product()} ")
}

fun List<Int>.product():Int {
    var result = 1
    for(value in this) {
        result *= value
    }
    return result



14.12.2023
--CLASSES
fun main() {
    val myRect = rectangle(4.0, 7.0)
    println("rectangle area is ${myRect.area()}")
    println("rectangle perimeter is ${myRect.perimeter()}")
    println("is rectangle a square? ${myRect.isSquare()}")

    val myCircle1 = Circle(5.0)
    val myCircle2 = Circle(7.0)
}

fun main() {
    val myTriangle = triangle(2.0, 4.0, 6.0)
}

21.12.2023
--INHERITANCE


fun main() {
    val myRectangle = rectangle(5.0, 7.0)
    myRectangle.changeName("Dias")
    println(myRectangle.name)

    val myTriangle = triangle(7.0, 4.0, 9.0)
    myTriangle.changeName("dyakeso")
    println(myTriangle.name)
}

--VISIBILITY MODIFIERS


25.12.2023
--ABSTRACT CLASSES
fun main() {
    val rect = rectangle(5.0)
    val rect2 = rectangle(5, 4)
}

27.12.2023
--OBJECTS AND COMPANION OBJECTS
fun main() {
    val myRec = rectangle.randomRectangle()
}

--ANONYMOUS CLASSES
 */

fun main() {
    val a = 3.0
    val b = 4.0
    val heigh = 2.0
    val parallelogram = object : shape("Parallelogram", a, b, heigh) {

        init {
            println("Parallelogram created with a = $a, b = $b and heigh = $heigh")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }
        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        override fun area(): Double {
            return a * heigh
        }
    }
}
