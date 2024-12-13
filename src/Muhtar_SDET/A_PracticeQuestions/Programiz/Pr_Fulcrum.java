package Muhtar_SDET.A_PracticeQuestions.Programiz;

public class Pr_Fulcrum {

    public static void main(String[] args) {

        System.out.println(findFulcrum(new int[]{3, 1, 5, 2, 4, 6, -1}));

    }

    public static int findFulcrum(int[] arr) {

        int result = -1;

        //int fulcrum =  arr[x];
        if (arr.length % 2 == 0){
            result = -1;
        } else {
            int fulcrum = arr.length / 2 ;
            // System.out.println(fulcrum); // 3
            int sum=0;
            int sum1=0;
            for(int i=0;i<fulcrum;i++)
            {
                sum+=arr[i];
            }
            for(int j=fulcrum+1;j<=arr.length-1;j++)
            {
                sum1+=arr[j];
            }
            if(sum==sum1) {
                result = arr[fulcrum];
            }else {
                result = -1;
            }

        }

        return result;
        }

    }


/*

Find the index of an element in an array such that the sum
of all elements to its left is equal to the sum of all elements to its right.
This index is called the "fulcrum". If no such index exists, return -1.
int[] arr = {3, 1, 5, 2, 4, 6, -1};
 */