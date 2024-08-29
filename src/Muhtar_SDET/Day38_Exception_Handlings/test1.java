package Muhtar_SDET.Day38_Exception_Handlings;

public class test1 {
    public static void main(String[] args) {

        System.out.println("Program2 started");

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace(); // we can use both of them at the same time but not necessary
            //System.out.println(e.getMessage());
        }
        System.out.println("Program2 ended");
    }
}
