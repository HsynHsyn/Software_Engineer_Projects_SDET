package Muhtar_SDET.A_Review.Review;

public class HideCreditCardNumber {

    public static void main(String[] args) {

        System.out.println(maskCreditCard("1234567894123456"));

    }

    public static String maskCreditCard(String creditCardNumber) {

        String ret = "";
        if(creditCardNumber.length() > 16 || creditCardNumber.length() < 16){
            ret = "Invalid credit card number. It must be 16 digits long.";
        }else{
            String cut = creditCardNumber.substring(12);
            ret = "XXXX-XXXX-XXXX-"+ cut;
        }

        return ret;
    }
    }

/*
1234567894123456
result : xxxx-xxxx-xxxx-3456;
 */