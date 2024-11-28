package Muhtar_SDET.Day11_String_Continue;

public class StringMethods2 {
    public static void main(String[] args) {
        // replace()
        // replace(oldValue, newValue): returns new string by replacing
        // *** all the old values *** with the given new value.

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python", "Java");
        sentence = sentence.replace("the best", "the worst");
        System.out.println(sentence);

        //-------------------------------------------------------------

        String word = "java";
        word = word.replace('a','e'); // also we can use like word.replace("a","e");
        System.out.println(word);

        //-----------------------------------------------------
        // replaceFirst(oldValue, newValue): returns new string by replacing
        //  the FIRST matching  old values with the given new value.

        String sentence2 = "I love Java, Java is cool";
        sentence2.replace("Java", "Python");
        sentence2= sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2);

        //-----------------------------------------------------
        String sentence3 = "I love Java, Java is cool, Java is amazing";
        sentence3 = sentence3.replace("Java", "Python");
        //sentence3 = sentence3.replaceFirst("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");


        //-----------------------------------------------------
        // subString()
        //substring(beginningIndex , endingIndex): creates substring starting from
        // the given beginning index till the given ending index (ending index is excluded)

        String str ="Cydeo School";
        str.substring(0,  4+1); // ==> Cydeo

        String sentence4 = "I Love Java Programming";
        System.out.println(sentence4.substring(7,10));

        //-----------------------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        String today =  sentence5.substring(9,14+1);
        System.out.println(today);

        //-----------------------------------------------------
        String email = "CydeoSchoolJavaProgramming@yahoo.com";
        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain =  email.substring(beginning,ending);
        System.out.println(domain);

       // substring(beginningIndex): creates substring starting from the given beginning index till the end of the string
        String str2 = "Cydeo School";
        str.substring(6); //==> School

        //-----------------------------------------------------
        String sentence6 =  "I love Java programming";
        //String r1 = sentence6.substring(7, sentence6.length());
        String r1 = sentence6.substring(7);
        System.out.println(r1);
        //-----------------------------------------------------

        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow =  sentence7.substring(sentence7.lastIndexOf(' ') +1 );
        System.out.println("tomorrow = " + tomorrow);
        //-----------------------------------------------------

        String sentence8 = "I study at Cydeo School";
        String schoolName =  sentence8.substring(11);
        System.out.println(schoolName);

        //-----------------------------------------------------
        //repeat(count): repeats the string for given number of times. returns string

        String str3 = "Python ";
        String result = str3.repeat(10);
        System.out.println("result = " + result);
        String result2 = str3.concat(" ").repeat(4);
        System.out.println(result2);
        String result1 = (str3 + "\n").repeat(10);
        System.out.println(result1);
        String x = "Hakan";
        String xx = x.concat(" " + "\n").repeat(5);
        System.out.println("xx = " + xx);
        //-----------------------------------------------------

    }
}
