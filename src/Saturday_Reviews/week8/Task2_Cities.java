package Saturday_Reviews.week8;

public class Task2_Cities {
    public static void main(String[] args) {

        String[] cities = {
                "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
                "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose",
                "Austin", "Jacksonville", "San Francisco", "Columbus", "Fort Worth"
        };
        String largest = "";

        for (String city : cities) {

            if (largest.length() < city.length()){
                largest = city ;
                }


        }
        String smallest = cities[0];
        for (String city : cities) {

            if (smallest.length() > city.length()){
                smallest = city ;
            }

        }

        System.out.println(smallest);


    }
}
