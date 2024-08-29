
package Preparing.Day19_String_Class;

public class Summary {

    public static void main(String[] args) {

        String name = "Mike Smith";

//        String str =  "";
//        System.out.println(name.length());
//        System.out.println(str.length());
        System.out.println("************************************");
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(5));
        System.out.println("************************************");
        int length = name.length();
        for (int i = 0; i <= length; i++) {
            if (i < length) {
                System.out.print(name.charAt(i));
            }else{
                System.out.print("another");
            }
            System.out.println("************************************");

            //concat();
            String s1 = "Hakan ";
            String s2 = "oz";
            String s3 = s1.concat(s2);
            System.out.println(s3); // Hakan oz

            String word="hakan";

            word= word + true;
            System.out.println(word);// wordtrue

            String word2= "Hi";
            word2= word2.concat("Hey").concat("How are you").concat("good");
            System.out.println(word2);

            System.out.println("************************************");

            //contains();
            String str = "Hello Hakan, welcome to Cydeo SDET ";
            boolean bool = str.contains("SDET");
            boolean bool1 = str.contains("1SDET");
            boolean bool2= str.contains("SD");
            //String email="test@gmail.com.";
            //System.out.println(email.contains("@"));//true
            String email = "ali";


            System.out.println(bool);//true comes
            System.out.println(bool1);//false comes
            System.out.println(bool2); //true

            System.out.println("************************************");

            //indexOf();
            String str1 = "Hello Hakan, welcome to Cydeo SDET ";
            int n = str1.indexOf("Hakan");
            int n1 = str1.indexOf("Halime");

            System.out.println(n1); // Return -1 comes
            System.out.println(n); //6

            System.out.println("************************************");

            //replace() Method
            String str2 = "Hello Hakan, welcome to Cydeo SDET ";
            String replaced = str2.replace("Hakan", "Halime");
            System.out.println(replaced); // Hello Halime, welcome to Cydeo SDET
            System.out.println(str2);// Hello Hakan, welcome to Cydeo SDET

            System.out.println("************************************");

            //equals() method
            String str3 = "Hakan lives in The Uk ";
            String str4 = "Hakan lives in The Uk ";
            String str5 = "Hakan lives in The Netherlands ";

            System.out.println(str3.equals(str4)); // true
            System.out.println(str3.equals(str5)); // false

            System.out.println("************************************");

            // == operator

            String str6 = "Hakan lives in The Uk ";
            String str7 = "Hakan lives in The Uk ";
            String str8 = "Hakan lives in The Netherlands ";

            System.out.println(str6 == str7); // true
            System.out.println(str7 == str8); // false

            String a1 = "Welcome to Cydeo SDET ";
            String a2 = new String("Welcome to Cydeo SDET ");
            System.out.println(a2);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a1 == a2);  // false
            System.out.println(a1.equals(a2)); // true


        }


    }

    }


