package Muhtar_SDET.Day43_CollectionsAndMaps.hashMap_Dictionary;

public class SdetLibrary {
    public static void main(String[] args) {
        Dictionary sdetLibrary = new Dictionary();
        System.out.println(sdetLibrary);

        sdetLibrary.addWord("Java", "Programming Language we will learn to use");
        sdetLibrary.addWord("Selenium", "Library that we will use for UI testing");
        sdetLibrary.addWord("variable", "a variable is a container that can hold some data");

        System.out.println(sdetLibrary);
        System.out.println(sdetLibrary.getDefinition("variable"));
    }
}
