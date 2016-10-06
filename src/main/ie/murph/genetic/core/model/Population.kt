package main.ie.murph.genetic.core.model

import java.util.*

/**
 * Created by Paul on 9/28/2016.
 */
class Population
{
    //Generating numbers for the 'Fittness' population
    fun generateFiveRandomPopulationFitness(): List<Int>
    {
        //Create a list of interger type and populate  //Generate a random number between 1 and 10
        return IntArray(5){ Random().nextInt(9)+1}.asList()
    }

    fun orderPopulationFitness() : HashMap<String, Int>
    {
        //Next trying to place fittness into a map
        val map = HashMap<String, Int>()
        var index = 1 // 'var' is mutable, whereas 'val' is not
        for (fitness in generateFiveRandomPopulationFitness())
        {
            map.put("Population:"+index, fitness)
            index++
        }
        return map
    }

    fun dropWeakestPopulationFitness()
    {
        val map = orderPopulationFitness()
        for ((string, fittnes) in map.entries)
        {
            println("User $string has $fittnes fittness")
        }
    }

}