package Saturday_Reviews.week12_review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TestCity {

    public static void main(String[] args) {
        //Baltimore,-4.0,622104,Maryland
        Saturday_Reviews.week12_review.City city1 = new City("Baltimore", -4.0, 622104L, "Maryland");
        System.out.println("name = " + city1.getName());
        System.out.println("growth = " + city1.getGrowthRate());
        System.out.println("population = " + city1.getPopulation());
        System.out.println("state = " + city1.getState());


        String cityInfo = "Nashville-Davidson,16.2,634464,Tennessee";
        //convert cityInfo to City java object

        String[] arr = cityInfo.split(",");

        List<String> allLines;
        try {
            allLines = Files.readAllLines(Paths.get("src/Saturday_Reviews/week12_review/cities.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(allLines.size());
        System.out.println(allLines.get(0));





    }

}
