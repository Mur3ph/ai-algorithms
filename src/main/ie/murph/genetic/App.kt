package main.ie.murph.genetic

import java.util.*

/**
 * Created by Paul on 9/25/2016.
 */


fun main(args: Array<String>)
{
    println("Creating a genetic algorithm using Kotlin")
    generateFiveRandomPopulationNumbers()
}

fun generateFiveRandomPopulationNumbers()
{
    //Create a list of interger type and populate  //Generate a random number between 1 and 10
    val listOfRandomNumbers = IntArray(5){Random().nextInt(9)+1}.asList()
    listOfRandomNumbers.forEach { println(it) }
}