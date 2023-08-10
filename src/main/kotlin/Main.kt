import model.ClosedAtTop
import model.Cube
import model.Cuboid
import model.OpenAtTop
import repository.FigureRepository

fun main() {

    val figureRepository = FigureRepository<IFigure>()

    figureRepository.add(Cuboid(2.0, 3.0, 4.0))
    figureRepository.add(Cube(2.5))
    figureRepository.add(ClosedAtTop(3.0, 5.0));
    figureRepository.add(OpenAtTop(2.0, 4.0));

    figureRepository.getAll().forEach { figure ->
        with(figure) {
            println("Plane Area: ${planeArea()}")
            println("Total Area: ${totalArea()}")
            println("Volume: ${volume()}")
            println("--------")
        }
    }
}