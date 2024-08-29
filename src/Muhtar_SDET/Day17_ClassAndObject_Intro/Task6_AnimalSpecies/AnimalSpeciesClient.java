package Muhtar_SDET.Day17_ClassAndObject_Intro.Task6_AnimalSpecies;


public class AnimalSpeciesClient {
    public static void main(String[] args) {
        AnimalSpecies species1 = new AnimalSpecies();

        species1.setInfo("lion",20,5);

        System.out.println(species1.calculateInYears(5));

        System.out.println(species1.toString());


    }
}
