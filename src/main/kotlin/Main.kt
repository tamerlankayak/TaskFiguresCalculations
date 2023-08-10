import model.ClosedAtTop
import model.Cube
import model.Cuboid
import model.OpenAtTop
import repository.FigureRepository
import shapes.IFigure

fun main() {

    val figureRepository = FigureRepository<IFigure>()

    figureRepository.addFigure(Cuboid(2.0, 3.0, 4.0))
    figureRepository.addFigure(Cube(2.5))
    figureRepository.addFigure(ClosedAtTop(3.0, 5.0));
    figureRepository.addFigure(OpenAtTop(2.0, 4.0));

    figureRepository.getFiguresResult().forEach { figure ->
        with(figure) {
            println("Plane Area: ${planeArea()}")
            println("Total Area: ${totalArea()}")
            println("Volume: ${volume()}")
            println("--------")
        }
    }
}