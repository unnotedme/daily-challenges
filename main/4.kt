/*
#4 - polygon area
dificultty: easy

create a single function (is important to be only one) that is capable of calculating and returning the area of a polygon.
- the function will receive by parameter only one polygon at a time.
- the supported polygons will be triangle, square and rectangle.
- prints the calculatrion of the area od a polygon of each type.
*/

fun main(): Unit{
    area(Triangle(10.0, 5.0)) // base and height
    area(Rectangle(5.0, 7.0)) // length and width
    area(Square(4.0)) // sides
}

interface Polygon {
    fun area(): Double
    fun printArea()
}

data class Triangle(val base: Double, val height: Double) : Polygon {
    override fun area(): Double {
        return (base * height) / 2
    }

    override fun printArea() {
        println("${area()} is the area of the triangle.")
    }
}

data class Rectangle(val length: Double, val width: Double) : Polygon {
    override fun area(): Double {
        return length * width
    }

    override fun printArea() {
        println("${area()} is the area of the rectangle.")
    }
}

data class Square(val side: Double) : Polygon {
    override fun area(): Double {
        return side * side
    }

    override fun printArea() {
        println("${area()} is the area of the square.")
    }
}

private fun area(polygon: Polygon): Double {
    polygon.printArea()
    return polygon.area()
}
