package Muhtar_SDET.Day18_Memory_Management;

public class Task1_PizzaObjectTest {
    public static void main(String[] args) {
        //creating object we stored in a variable (pizza1)
        Task1_Pizza pizza1  =  new Task1_Pizza();

        Task1_Pizza pizza2  =  new Task1_Pizza();

//        pizza1.size= 'L';
//        pizza2.size= 'M';

        pizza1.setInfo('L', 2,3);
        pizza1.setInfo('S', 1,2);

        System.out.println("-----------------------------------------------------------");

        double total = 0;
        for (int i = 0; i < 20 ; i++) {

            Task1_Pizza small = new Task1_Pizza();
            small.setInfo('S',2,3);
            total += small.calcCost();

            Task1_Pizza medium = new Task1_Pizza();
            small.setInfo('M',3,4);
            total += medium.calcCost();

            Task1_Pizza large = new Task1_Pizza();
            small.setInfo('L',4,5);
            total += large.calcCost();

        }
        System.out.println("total: " + total);

    }
}
