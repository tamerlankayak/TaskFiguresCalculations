package repository

import shapes.IFigure

class FigureRepository<T : IFigure> {

    private val figures = mutableListOf<T>()

    fun addFigure(item: T) = figures.add(item)
    fun getFiguresResult() = figures.toList()
}