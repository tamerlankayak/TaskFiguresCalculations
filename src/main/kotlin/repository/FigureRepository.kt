package repository

import IFigure

class FigureRepository<T : IFigure> {

    private val figures = mutableListOf<T>()

    fun add(item: T) = figures.add(item)
    fun getAll() = figures.toList()
}