import model.Cube
import model.Cuboid

fun main(args: Array<String>) {

    val figureRepository = FigureRepository<IFigure>()

    figureRepository.add(Cuboid(2.0f, 3.0f, 4.0f))
    figureRepository.add(Cube(2.5f))

    figureRepository.getAll().forEach { figure ->
        with(figure) {
            println("Plane Area: ${planeArea()}")
            println("Total Area: ${totalArea()}")
            println("Volume: ${volume()}")
            println("--------")
        }
    }
}