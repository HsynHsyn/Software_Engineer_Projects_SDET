package Saturday_Reviews.A_SelfStudy;

public class DivideNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int count = 0;

        while(num1 > num2){
            num1 = num1-num2;
            count++;
        }
        System.out.println("count= " + count);


    }
}
