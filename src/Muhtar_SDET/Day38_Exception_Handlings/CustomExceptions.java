package Muhtar_SDET.Day38_Exception_Handlings;


class CustomCheckedException extends Exception{


}

class CustomUnCheckedException extends RuntimeException{

}


public class CustomExceptions {
    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------");

        throw new CustomUnCheckedException();

    }
}
