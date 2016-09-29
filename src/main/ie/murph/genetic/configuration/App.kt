package main.ie.murph.genetic.configuration

import main.ie.murph.genetic.core.model.Population
import java.util.*

/**
 * Created by Paul on 9/25/2016.
 */


fun main(args: Array<String>)
{
    println("Creating a genetic algorithm using Kotlin")
    val population = Population()
    Population().generateFiveRandomPopulationNumbers().forEach { println(it)}

    //Next trying to place fittness into a map
    val map = Population().generateFiveRandomPopulationNumbers()
}

