package main.ie.murph.genetic.core.model

import java.util.*

/**
 * Created by Paul on 9/28/2016.
 */
class Population
{
    //Generating numbers for the 'Fittness' population
    fun generateFiveRandomPopulationNumbers(): List<Int>
    {
        //Create a list of interger type and populate  //Generate a random number between 1 and 10
        return IntArray(5){ Random().nextInt(9)+1}.asList()
    }

}