package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class TernariesIntro2 {
    public static void main(String[] args) {
        int number =  100;
        String result  =  "";
                
        if (number > 0){
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }

        String result2 =  (number > 0) ? "Positive" :(number < 0) ? "Negative" : "Zero";

        System.out.println("---------------------------------------*******************");

        int n = 1 ;

       /* String day  = "";
        if (n==1){
            day  = "Monday";
        }else if (n==2){
            day  = "Tuesday";
        }else if (n==3) {
            day = "wednesday";
        }else if (n==4) {
            day = "Thursday";
        }else if (n==1) {
            day = "Friday";
        }else if (n==1) {
            day = "Saturday";
        }else{
            day = "Sunday";
        }*/

        String day = (n==1) ? "Monday" : (n==2) ? "Tuesday" : (n==3) ? "wednesday" : (n==4) ? "Thursday" : (n==5) ? "Friday" : (n==6) ? "Saturday" : "Sunday";
        System.out.println("day = " + day);

        System.out.println("---------------------------------------*******************");

        int num = 10;

        String month = (num==1) ? "January" : (num==2) ? "February" : (num==3) ? "March" : (num==3) ? "April" : (num==3) ? "May"
                : (num==6) ? "June" : (num==7) ? "July" :  (num==8) ? "August" : (num==9) ? "September"
                : (num==10) ? "October": (num==11) ? "November" : "December" ;
        System.out.println("month = " + month);
        }
}

