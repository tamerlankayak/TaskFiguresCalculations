package model

open class Cuboid(var l: Double = 0.0, var b: Double = 0.0, var h: Double = 0.0) : Figure() {
    override fun planeArea() = 2 * (l * b)
    override fun totalArea() = 2 * (l * b + b * h + h * l)
    override fun volume() = l * b * h
}