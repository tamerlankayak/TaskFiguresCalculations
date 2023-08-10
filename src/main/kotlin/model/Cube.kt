package model

class Cube(var a: Double = 0.0) : Cuboid() {

    override fun planeArea() = 2 * (a * a);

    override fun totalArea() = 6 * (a * a);

    override fun volume() = a * a * a;
}