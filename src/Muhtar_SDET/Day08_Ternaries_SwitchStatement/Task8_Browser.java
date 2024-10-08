package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class Task8_Browser {
    public static void main(String[] args) {

        String browserName = "opera";

        String result;

        switch (browserName) {
            case "chrome" :
                result = "chrome";
                break;
            case "firefox" :
                result = "firefox";
                break;
            case "opera" :
                result = "opera";
                break;
            case "safari" :
                result = "safari";
                break;
            case "edge" :
                result = "edge";
                break;
            default:
                result = "Invalid Browser";
                break;
        }
        System.out.println("result = " + result);
    }
}

/*
Write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

		Note: MUST use switch statement
 */