package Muhtar_SDET.Day38_Exception_Handlings.try_CatchTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_EmptyFileCheck {
    public static void main(String[] args) {

        try{
            checkFileNotEmpty("");
           //checkFileNotEmpty("C:\\Users\\dell\\IdeaProjects\\SDET\\src\\Muhtar_SDET\\Day38_Exception_Handlings\\try_CatchTasks\\test.txt");
            System.out.println("File is not empty.");


        } catch (FileNotFoundException  e) {
            System.out.println("Error FileNotFoundException : " + e.getMessage());
            //e.printStackTrace();

        }catch (EmptyFileException e){ // we created an exception
            System.out.println("Error EmptyFileException: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void checkFileNotEmpty(String filename) throws FileNotFoundException, EmptyFileException {

        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()){ // checking scanner object`s inside
            scanner.close();
            throw new EmptyFileException("File is empty.");
        }

        scanner.close();
    }

}
// creating new class which is sub-class of Exception(because it is checked exception)
class EmptyFileException extends Exception{
    public EmptyFileException(String message){ // EmptyFileException`s constructor
        super(message);
    }
}

