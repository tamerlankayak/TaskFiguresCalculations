fun main(args: Array<String>) {

    val cuboidRepository = FigureRepository<Cuboid>()
    val cuboid = Cuboid()
    cuboid.l = 2.0f
    cuboid.b = 3.0f
    cuboid.h = 4.0f

    cuboidRepository.add(cuboid)

    val retrievedCuboids = cuboidRepository.getAll()
    for (c in retrievedCuboids) {
        println("Cuboid Plane Area: ${c.planeArea()}")
        println("Cuboid Total Area: ${c.totalArea()}")
        println("Cuboid Volume: ${c.volume()}")
        println("--------")
    }

}