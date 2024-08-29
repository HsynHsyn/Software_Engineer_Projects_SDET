package Muhtar_SDET.Day21_Multi_DimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Ahmet", "Ayşe", "Mehmet", "Fatma", "Ali"}; // 4 names
        String[] group2 = {"Mert", "Selin", "Yusuf", "Elif", "Can"};// 3 names
        String[] group3 = {"Hakan", "Zeynep", "Kerem", "Derya", "Burak"};// 5 names
        String[] group4 = {"Ece", "Oğuz", "Naz", "Emre", "Ceren"};// 4 names

        String[][] groups = {group1, group2, group3,group4};

        System.out.println(Arrays.deepToString(groups)); // "it is printed for 2D arrays and more such as 3D, 4D// multi dimensional
        System.out.println(Arrays.toString(groups).toString());

        System.out.println("------------------------------------------");
        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

            }
        System.out.println("---------------------------------------");

        for (String[] eachGroup : groups){
            System.out.println(Arrays.toString(eachGroup));

            for(String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }


        }
        System.out.println("---------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
                
            }

        }

    }
}
