package main.ie.murph.genetic

import java.util.*

/**
 * Created by Paul on 9/25/2016.
 */


fun main(args: Array<String>)
{
    println("Creating a genetic algorithm using Kotlin")
    generateFiveRandomPopulationNumbers().forEach { println(it)}

    //Next trying to place fittness into a map
    val map = generateFiveRandomPopulationNumbers()
}

//Generating numbers for the 'Fittness' population
fun generateFiveRandomPopulationNumbers(): List<Int>
{
    //Create a list of interger type and populate  //Generate a random number between 1 and 10
    return IntArray(5){Random().nextInt(9)+1}.asList()
}
