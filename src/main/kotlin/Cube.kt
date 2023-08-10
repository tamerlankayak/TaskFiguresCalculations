class Cube : Cuboid() {

    var a: Float = 0.0f;

    override fun planeArea(): Float {
        return 2 * (a * a);
    }

    override fun totalArea(): Float {
        return 6 * (a * a);
    }

    override fun volume(): Float {
        return a * a * a;
    }
}