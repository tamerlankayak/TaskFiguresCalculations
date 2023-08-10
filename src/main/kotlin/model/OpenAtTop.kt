package model

import kotlin.math.PI

class OpenAtTop(var r: Double, var h: Double) : RightCircularCylinder() {

    override fun planeArea() = PI * (r * r);

    override fun totalArea() = PI * r * (2 * h + r)

    override fun volume() = PI * (r * r) * h


}