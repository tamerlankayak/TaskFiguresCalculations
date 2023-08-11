package repository

open class Repository<T> {
    protected val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

}