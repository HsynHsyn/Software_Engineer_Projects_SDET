package Saturday_Reviews.week8;

public class Task1_Countries {
    public static void main(String[] args) {

        String[] countries = {"United States","Canada", "United Kingdom", "Germany","France",
                "Australia",
                "Japan",
                "Brazil",
                "India",
                "China"
        };


        for (int j = countries.length-1; j >=0 ; j--) {
            for (String element : countries) {
                element = countries[j];
                System.out.println(element);
                break;
        }
            for (String element : countries) {

                System.out.println(element.charAt(0) + " " + element.charAt(element.length() - 1));


            }

            System.out.println("************************************");
            for (int i = 0; i < countries.length; i++) {

                System.out.println(countries[i].charAt(0) + " " + countries[i].charAt(countries[i].length() - 1));

            }

            System.out.println("************************************");
            for (String element : countries) {

                if (element.contains("C")){
                    System.out.println(element);

                }

            }
            System.out.println("************************************");

            for (String element : countries) {

                if (element.endsWith("s")){
                    System.out.println(element);

                }

            }


        }




    }

}
