package Muhtar_SDET.Day10_Scanner_Continue_String;

import javax.xml.transform.Source;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException { // it throws an exception error

        Scanner scan = new Scanner(Path.of("src/Muhtar_SDET/Day10_Scanner_Continue_String/Test.txt"));


        //System.out.println(scan.next());
        System.out.println(scan.nextLine());    // it reads first line
        System.out.println(scan.nextLine());    // it reads second line
        System.out.println(scan.nextLine());    // it reads third line
                                                // if the text file empty compiler will give error
        scan.close();
    }
}
