infix fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.subtract(other: Int): Int {
    return this - other
}

infix fun Int.multiply(other: Int): Int {
    return this * other
}

infix fun Int.divide(other: Int): Int {
    return this / other
}

class Person(val name: String) {
    infix fun say(message: String) {
        println("$name говорит: $message")
    }
}

data class Point(val x: Int, val y: Int)

infix fun Point.isAbove(other: Point): Boolean {
    return this.y > other.y
}

infix fun Point.isRightOf(other: Point): Boolean {
    return this.x > other.x
}

fun main() {
    val a = 10
    val b = 5
    println("Сложение: ${a add b}")
    println("Вычитание: ${a subtract b}")
    println("Умножение: ${a multiply b}")
    println("Деление: ${a divide b}")

    val person = Person("Алексей")
    person say "Привет, мир!"

    val point1 = Point(3, 4)
    val point2 = Point(2, 2)

    println("point1 выше point2: ${point1 isAbove point2}")
    println("point1 правее point2: ${point1 isRightOf point2}")
}