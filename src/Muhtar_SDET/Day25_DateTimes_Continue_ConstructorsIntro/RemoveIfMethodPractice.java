package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import Muhtar_SDET.Day17_ClassAndObject_Intro.Dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class RemoveIfMethodPractice  {
    public static void main(String[] args) {



        //              dog1        dog2      dog3      dog4        dog5        dog6
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        Dog dog1 = new Dog();

        dogs[0].setInfo("Chloe", "Golden ", 'M', 10, "Large", "Gold");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        System.out.println(dogs[2].size);


        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        // Collection Types : List,Set,Queue, Map
        //1.1
        /*for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }*/

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));
        System.out.println(smallDogs);

        //1.2
        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        /*for (Dog dog : dogs) {
            if (dog.age <=4){
                youngDogs.add(dog);
            }
            
        }*/

        youngDogs.removeIf(p -> p.age > 4  );

        System.out.println(youngDogs);

        //1.3
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M'); // Male dogs deleted

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'F'); // female dogs deleted

        System.out.println("_____________________________________________________________________");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");



        ArrayList<Dog> list  = new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        Dog[] dogs3 = list.toArray(new Dog[list.size()]); // converted from arrayList to array// we can use dogs2 = list.toArray(new Dog[0]);
        // not necessary just in order to show how to convert array
        System.out.println(Arrays.toString(dogs2));
        System.out.println(list);

        System.out.println("_____________________________________________________________________");



    }
}

/*
Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops

 */