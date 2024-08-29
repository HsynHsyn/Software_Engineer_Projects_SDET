package Saturday_Reviews.week12_review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CitiesService {

    private static ArrayList<City> allCities = new ArrayList<>();

    public static void loadAllCities() throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("week12/cities.txt"));
        for (String line : allLines) {
            String[] arr = line.split(",");
            City city = new City(arr[0],Double.parseDouble(arr[1]), Long.parseLong(arr[2]), arr[3]);
            allCities.add(city);
        }
    }

    public static ArrayList<City> getCitiesByState(String state) {
        ArrayList<City> list = new ArrayList<>();
        for(City each : allCities) {
            if (each.getState().equals(state)) {
                list.add(each);
            }
        }
        return list;
    }

    static {
        // read cities.txt and add each loop each line
        List<String> allLines ;
        try {
            allLines = Files.readAllLines(Paths.get("src/Saturday_Reviews/week12_review/cities.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<City> getAllCities() {
        return allCities;
    }

    public static void setAllCities(ArrayList<City> allCities) {
        CitiesService.allCities = allCities;
    }
}
