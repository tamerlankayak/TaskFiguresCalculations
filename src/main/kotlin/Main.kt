import model.ClosedAtTop
import model.Cube
import model.Cuboid
import model.OpenAtTop
import repository.FigureRepository
import shapes.IFigure

fun main() {
    val figureRepository = FigureRepository()

    val cuboid = Cuboid(l = 3.0, b = 4.0, h = 5.0)
    val cube1 = Cube(a = 2.0)
    val openAtTop = OpenAtTop(r = 4.0, h = 2.0);
    val closedAtTop = ClosedAtTop(r = 5.0, h = 3.0)

    figureRepository.add(cuboid)
    figureRepository.add(cube1)
    figureRepository.add(openAtTop)
    figureRepository.add(closedAtTop)

    val cuboids = figureRepository.getAll().filterIsInstance<Cuboid>()
    val cubes = figureRepository.getAll().filterIsInstance<Cube>()
    val opnAtTops = figureRepository.getAll().filterIsInstance<OpenAtTop>()
    val closedAtTops = figureRepository.getAll().filterIsInstance<ClosedAtTop>()

    println("Cuboids:")
    println("Total plane area: ${cuboids.sumOf { it.planeArea() }}")
    println("Total total area: ${cuboids.sumOf { it.totalArea() }}")
    println("Total volume: ${cuboids.sumOf { it.volume() }}")

    println("Cubes:")
    println("Total plane area: ${cubes.sumOf { it.planeArea() }}")
    println("Total total area: ${cubes.sumOf { it.totalArea() }}")
    println("Total volume: ${cubes.sumOf { it.volume() }}")

    println("OpenAtTop:")
    println("Total plane area: ${opnAtTops.sumOf { it.planeArea() }}")
    println("Total total area: ${opnAtTops.sumOf { it.totalArea() }}")
    println("Total volume: ${opnAtTops.sumOf { it.volume() }}")


    println("ClosedAtTop:")
    println("Total plane area: ${closedAtTops.sumOf { it.planeArea() }}")
    println("Total total area: ${closedAtTops.sumOf { it.totalArea() }}")
    println("Total volume: ${closedAtTops.sumOf { it.volume() }}")
}