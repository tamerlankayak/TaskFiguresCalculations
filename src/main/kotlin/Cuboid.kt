open class Cuboid : Figure() {
    var l: Float = 0.0f
    var b: Float = 0.0f
    var h: Float = 0.0f

    override fun planeArea(): Float {
        return 2 * (l * b);
    }

    override fun totalArea(): Float {
        return 2 * (l * b + b * h + h * l);
    }

    override fun volume(): Float {
        return l * b * h;
    }
}