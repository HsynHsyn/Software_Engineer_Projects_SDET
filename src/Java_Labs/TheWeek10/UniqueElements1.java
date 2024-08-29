package Java_Labs.TheWeek10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Write a program that identifies the unique elements in an array of Strings.
           Example:
              Input array: {"Java", "Python", "Python", "Ruby", "Ruby", "C#"}

           Output:
              Java
              C#
 */
public class UniqueElements1 {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        ArrayList<String> uniqueElement = new ArrayList<>(Arrays.asList(array));
        uniqueElement.removeIf(p-> Collections.frequency(uniqueElement,p) > 1);

        System.out.println(uniqueElement);

//        for (String each : array) {
//            if (uniqueElement.indexOf(each) == uniqueElement.lastIndexOf(each)) {
//                System.out.println(each);

    /*
    for (int i = 0; i < array.length; i++) {
            int freq = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[i].equals(array[j])) {
                    freq +=1;
                }
                }
            if (freq == 1) {
                System.out.println(array[i]);
            }
            }
        }
    }
     *///second solution


//            }
        }
    }

/* another solution
 String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};
        ArrayList<String> newArray = new ArrayList<>(Arrays.asList(array));
        newArray.removeIf(p-> Collections.frequency(newArray,p)!=1);
        System.out.println(newArray);
 */

/*
1. Write a program that identifies the unique elements in an array of Strings.
		   Example:
		      Input array: {"Java", "Python", "Python", "Ruby", "Ruby", "C#"}

		   Output:
		      Java
		      C#


2. Given an ArrayList of Strings named 'items', write a program that returns the frequency of each element.
	   Example:
	      Input list: {"Apple", "Banana", "Apple", "Cherry"}

	   Output:
	      Apple = 2
	      Banana = 1
	      Cherry = 1
 */