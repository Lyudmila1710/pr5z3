import kotlin.math.sqrt

class Point(val x: Double, val y: Double) {
    fun distanceTo(point2: Point): Double {
        val dx = x - point2.x
        val dy = y - point2.y
        return sqrt(dx * dx + dy * dy)
    }
}

