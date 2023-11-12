fun main() {
    println("Программа находит наименьшее и наибольшее расстояние между точками:")
    println("Введите количество точек (не менее 2):")
    var kol_vo = readln().toInt()
    while (kol_vo < 2) {
        println("Количество точек должно быть не менее 2. Повторите ввод:")
        kol_vo = readln().toInt()
    }

    val points = mutableListOf<Point>()
    for (i in 1..kol_vo) {
        println("Введите координаты $i точки:")
        println("Введите координаты x:")
        val x = readln().toDouble()
        println("Введите координаты y:")
        val y = readln().toDouble()
        points.add(Point(x, y))
    }

    var minDistance = Double.MAX_VALUE//первое значение, которое высчитает - будет наименьшим
    var maxDistance = 0.0

    for (i in 0 until points.size - 1) {
        for (j in i + 1 until points.size) {
            val distance = points[i].distanceTo(points[j])
            if (distance < minDistance) {
                minDistance = distance
            }
            if (distance > maxDistance) {
                maxDistance = distance
            }
        }
    }

    println("Минимальное расстояние между точками: $minDistance")
    println("Максимальное расстояние между точками: $maxDistance")
}

