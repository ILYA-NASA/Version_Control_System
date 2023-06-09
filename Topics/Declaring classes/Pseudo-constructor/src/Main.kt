class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

/*
fun createPoint(x: Int, y: Int, z: Int): Point3D {
    val point = Point3D()
    point.x = x
    point.y = y
    point.z = z
    return point
}
*/

fun createPoint(x: Int, y: Int, z: Int) = Point3D().also { it.x = x; it.y = y; it.z = z }