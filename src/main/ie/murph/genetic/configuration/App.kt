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
    population.generateFiveRandomPopulationFitness().forEach { println(it)}

    population.orderPopulationFitness()

}

