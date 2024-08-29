package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class SwitchIntro2 {
    public static void main(String[] args) {
        int n= 7;

        String day = "";

        switch (n){
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid Value";
                break;
        }
        System.out.println(day);
    }
}
