class FigureRepository<T : IFigure> {

    private val figures = mutableListOf<T>()

    fun add(item: T) {
        figures.add(item)
    }

    fun getAll(): List<T> {
        return figures.toList()
    }
}