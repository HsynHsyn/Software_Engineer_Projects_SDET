/*
• Login Functionality Logic
• UserName,Password
• --- > Program will ask to enter username and password
• --- > If both username and password are blank
• "UserName and Password Fields cannot be empty"
• --- > If userName is blank and password is not blank
• "UserName cannot be empty"
• --- > If userName is not blank and password is blank
• "Password cannot be empty"
• --- > If the username or password is not valid
• "UserName or password is not valid. Please verify"
• --- > If the username and password are both valid
• "User Logged in successfully
 */

package Preparing.Day20_String_Class_Cont;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Task3_UserNameInSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = sc.nextLine();

        System.out.println("Enter your password:");
        String password= sc.nextLine();

        String userNameInSystem="Mike";
        String passwordInSystem="123";

        if(userName.equals("")&& password.equals("")){
            System.out.println("UserName and Password Fields cannot be empty");
        }else if (userName.equals("") && !password.equals("")){
            System.out.println("Username can not be empty");
        }else if(!userName.equals("") && password.equals("")){
            System.out.println("Password can not be empty");
        }else if (!userName.equals(userNameInSystem) && !password.equals(passwordInSystem)){
            System.out.println("Username or password not valid, please verify");
        }else if (userName.equals(userNameInSystem) && password.equals(passwordInSystem)){
            System.out.println("User logged in successfully");

        }


    }
}
