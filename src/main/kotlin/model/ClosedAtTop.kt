package model

import kotlin.math.PI

class ClosedAtTop(var r: Double, var h: Double) : RightCircularCylinder() {
    override fun planeArea() = 2 * (PI * (r * r))

    override fun totalArea() = 2 * PI * r * (r + h)

    override fun volume() = PI * (r * r) * h
}