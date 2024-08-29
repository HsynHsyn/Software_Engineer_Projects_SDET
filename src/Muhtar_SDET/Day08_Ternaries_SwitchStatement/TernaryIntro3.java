package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int score = 95;
        /*String result = "";

       if (score >= 0 && score <= 100){ // pre-condition, if the score is valid
            if (score>=60){
               result ="Passed";
            }else{
               result = "Failed";
            }
        }else { // if the score is not valid
            result ="Invalid";
        }
        System.out.println("result = " + result); */
        String result = (score >= 0 && score <= 100) ?
                (score>=60) ? "Passed" : "Failed"
                : "Invalid";
        System.out.println("result = " + result);
    }
}
