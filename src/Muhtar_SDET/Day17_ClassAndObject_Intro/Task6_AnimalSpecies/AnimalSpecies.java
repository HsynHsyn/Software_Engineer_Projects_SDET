package Muhtar_SDET.Day17_ClassAndObject_Intro.Task6_AnimalSpecies;

public class AnimalSpecies {

    public double population, growthRate, estimate;
    String name;
    public int year;

    public void setInfo(String name, double population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
       }


    public double calculateInYears(int year){

        double growthFactor = 1 + (growthRate / 100);

        estimate = population * Math.pow(growthFactor, year);

        return estimate;
    }

    public String toString() {
        //String formattedEstimate = String.format("%.2f", estimate);
        return "AnimalSpecies{" +
                "The " + name +
                ", currently has a population of " + population +
                "million , The growth rate is sitting around around" + growthRate +
                " % , so we predict the population in " + year + " years will be = " + estimate +
                '}';
    }
}

/*
    Given a class called AnimalSpecies
    declare these instance variables:
        name, population (double), growth rate (double)
        -> where the unit for the population is 1 million. Ex: 20 population would represent 20 million
        -> where the growth rate is a number percentage. Ex: 2.5 growth rate would be 2.5%

    create a method called calculateInYears that will accept an int year parameter and return the population estimate.
    Calculate the estimate of what the population will be in the given years based on the growth rate

    create a toString() that shows the information in the following format:
        The $name currently has a population of $population million
        The growth rate is sitting around $rate %, so we predict the population in 5 years will be: $5_year_estimate

    After finishing the AnimalSpecies class uncomment the TestAnimalSpecies class
 */