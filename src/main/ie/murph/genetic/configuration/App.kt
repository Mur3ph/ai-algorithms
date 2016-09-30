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
    population.generateFiveRandomPopulationNumbers().forEach { println(it)}
//    Population().generateFiveRandomPopulationNumbers().forEach { println(it)}

    //Next trying to place fittness into a map
    val map = HashMap<String, Int>()
    var index = 1
    for (fitness in population.generateFiveRandomPopulationNumbers())
    {
        map.put("Population:"+index, fitness)
        index++
    }

    for ((string, fittnes) in map.entries)
    {
        println("User $string has $fittnes fittness")
    }

}

