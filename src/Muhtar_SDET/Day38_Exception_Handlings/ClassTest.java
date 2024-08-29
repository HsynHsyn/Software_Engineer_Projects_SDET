package Muhtar_SDET.Day38_Exception_Handlings;

public class ClassTest {

    public static void main(String[] args) {
        String str = "Java";

        try {

            System.out.println(10/1);//code2
            System.out.println("working");

            System.out.println(str.charAt(-10));//code1
            Thread.currentThread().interrupt(); // Interrupt the current thread

            Thread.sleep(3000);//code3

        }catch (InterruptedException e){
            e.printStackTrace();

            System.out.println("code3 handled");

        }catch (IndexOutOfBoundsException e){
            e.getStackTrace();

           // System.out.println("code1 handled");

        }catch (ArithmeticException e){
            e.printStackTrace();

            System.out.println("code2 handled");

        }
    }
}
