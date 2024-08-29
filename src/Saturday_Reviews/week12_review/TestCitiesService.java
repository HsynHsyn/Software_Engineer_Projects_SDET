package Saturday_Reviews.week12_review;

import java.io.IOException;

public class TestCitiesService {
    public static void main(String[] args) throws IOException {
        System.out.println(CitiesService.getAllCities());
        CitiesService.loadAllCities();
        System.out.println(CitiesService.getAllCities());

    }
}
