package model

class Cube(var a: Float = 0.0f) : Cuboid() {

    override fun planeArea() = 2 * (a * a);

    override fun totalArea() = 6 * (a * a);

    override fun volume() = a * a * a;
}