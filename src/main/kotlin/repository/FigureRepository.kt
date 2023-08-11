package repository

import shapes.IFigure

class FigureRepository : Repository<IFigure>(), IFigure {
    override fun planeArea(): Double {
        var totalPlaneArea = 0.0
        getAll().forEach { totalPlaneArea += it.planeArea() }
        return totalPlaneArea
    }

    override fun totalArea(): Double {
        var totalTotalArea = 0.0
        getAll().forEach { totalTotalArea += it.totalArea() }
        return totalTotalArea
    }

    override fun volume(): Double {
        var totalVolume = 0.0
        getAll().forEach { totalVolume += it.volume() }
        return totalVolume
    }
}
