package Saturday_Reviews.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPlanetObjects {
    public static void main(String[] args) {
        Planet planet1 = new Planet();
        System.out.println(planet1);
        planet1.name = "Earth";
        planet1.distanceFromSun = 149_600_000L;
        System.out.println(planet1.toString());

        Planet planet2 = new Planet("Mercury", 57_910_000L);
        System.out.println(planet2);//toString is called automatically

        //lets say I want to create 1 variable and store 3 planet objects in it:
        //what are the options:
        //1) array of planets
        Planet[] planetsArr = new Planet[3];
        planetsArr[0] = planet1;
        planetsArr[1] = planet2;
        planetsArr[2] = new Planet("Venus", 108_200_000L);
        System.out.println(Arrays.toString(planetsArr));

        //2) arraylist of planets:
        ArrayList<Planet> planetsList = new ArrayList<>();
        planetsList.add(new Planet("Mars",227_900_000L));
        planetsList.add(new Planet("Jupiter", 778_300_000L));
        planetsList.add(new Planet("Saturn", 1_430_000_000L));

        //Convert Planet[] to List and add to planetList:
        planetsList.addAll(Arrays.asList(planetsArr));
        System.out.println("total planets = " + planetsList.size());
        System.out.println("planetsList = " + planetsList);

        //print all planet names in same line:
        for(Planet eachPlanet : planetsList) {
            System.out.print(eachPlanet.name + " ");
        }

        //collect all names into String planetNames
        String planetNames = "";
        for(Planet eachPlanet : planetsList) {
            planetNames += eachPlanet.name +" ";
        }
        System.out.println("\nplanetNames = " + planetNames);

        //find the planet closest to sun:
        String planetClosestToSun = "";
        long closestToSun = planetsList.get(0).distanceFromSun;
        for (Planet eachPlanet : planetsList) {
            if (eachPlanet.distanceFromSun < closestToSun) {
                closestToSun = eachPlanet.distanceFromSun;
                planetClosestToSun = eachPlanet.name;
            }
        }
        
        System.out.println("planetClosestToSun = " + planetClosestToSun);
        System.out.println("closestToSun = " + closestToSun);

    }
}
