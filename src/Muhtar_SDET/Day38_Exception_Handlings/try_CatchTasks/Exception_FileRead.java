package Muhtar_SDET.Day38_Exception_Handlings.try_CatchTasks;

import Muhtar_SDET.Day09_Switch_Continue_Scanner.ScannerIntro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_FileRead {

    public static void main(String[] args) {

        try{
            readFile("test2.txt"); // this file has not so it will give an error
           //FileInputStream fileInputStream = new FileInputStream("new file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    private static void readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}
/*
Java Exception Handling: Exercise-3 with Solution

Write a Java program to create a method that reads a file and throws an exception if the file is not found.
 */