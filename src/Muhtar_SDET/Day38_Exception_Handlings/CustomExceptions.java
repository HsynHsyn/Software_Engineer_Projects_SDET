package Muhtar_SDET.Day38_Exception_Handlings;


class CustomCheckedException extends Exception{


}

class CustomUnCheckedException extends RuntimeException{

}


public class CustomExceptions {
    public static void main(String[] args) {

        // custom checked
        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------");

        // custom unchecked
        try {
            throw new CustomUnCheckedException();
        } catch (CustomUnCheckedException e) {
            e.printStackTrace();
        }


    }
}
