package model

open class Cuboid(var l: Float = 0.0f, var b: Float = 0.0f, var h: Float = 0.0f) : Figure() {
    override fun planeArea() = 2 * (l * b)
    override fun totalArea() = 2 * (l * b + b * h + h * l)
    override fun volume() = l * b * h
}