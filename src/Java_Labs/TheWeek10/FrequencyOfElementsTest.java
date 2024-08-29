package Java_Labs.TheWeek10;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyOfElementsTest {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        String[] groceries = {"Apple", "Banana", "Apple", "Cherry"};

        ArrayList<String> codingLanguages = new ArrayList<>();
        codingLanguages.addAll(Arrays.asList(array));

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(Arrays.asList(groceries)); // we can put arraylist like groceriesList.addAll( codingLanguages);

        System.out.println("Frequency Elements of CodingLanguages = " + frequencyOfElements(groceriesList));

        System.out.println("Frequency Elements of CodingLanguages = " + uniqueElements(groceriesList));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println(codingLanguages);

        System.out.println("Frequency Elements of CodingLanguages = " + frequencyOfElements(codingLanguages));

        System.out.println("**************************************************************************");

        System.out.println("Frequency Elements of CodingLanguages = " + uniqueElements(codingLanguages));

    }

    public static ArrayList<String> frequencyOfElements(ArrayList<String> inputList){
        ArrayList<String> resultList = new ArrayList<>();


        for (String eachInput : inputList){

            int count = 0;// we put this inside first loop to reset our counter to zero again
            for (int i = 0; i < inputList.size(); i++) {
                if (eachInput.equals(inputList.get(i))) {
                    count++;
                }
            }
            String element = eachInput + " = " + count; // printing every element`s count //
            // Why do I need to check if that element is already inside my result arraylist?

            if (!resultList.contains(element)) { //  pay attention for resultList.contains(element)
                resultList.add(element);
            }

        }


        return resultList;
    }

    public static ArrayList<String> uniqueElements(ArrayList<String> inputList){

        ArrayList<String> resultList = new ArrayList<>();

        ArrayList<String> frequencyOfElementsList = frequencyOfElements(inputList); // [Java = 1, Python = 2, Ruby = 2, C# = 1]

        for (String each : frequencyOfElementsList) {

            if(each.contains("= 1")){ //  frequencyOfElementsList deki 1 tane olan elemanlari almis oluyor
                resultList.add(each.substring(0,each.length()-4));
                // resultList.add(each.substring(0,each.indexOf("= 1"))); // other way
            }
        }

        return resultList;
    }


}
