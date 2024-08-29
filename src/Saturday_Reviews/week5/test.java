package Saturday_Reviews.week5;

public class test {
    public static void main(String[] args) {
        System.out.println(covertToV2("x",100));
    }
    public static double covertToV2(String currency, double amount) {
        double convertedAmount = 0;
        //convert to lowercase and trim spaces. " YEN " -> " yen " -> "yen"
        currency = currency.toLowerCase().trim();

        System.out.println("----------------Test-------------------");

        switch (currency) {
            case "euro" -> convertedAmount = amount * 0.91;

            case "yen" -> convertedAmount = amount * 121.03;

            case "lira" -> convertedAmount = amount * 14.85;

            case "won" -> convertedAmount = amount * 1217.52;

            case "rupee" -> convertedAmount = amount * 181.45;

            default -> System.out.println("Conversion not available to " + currency);
        }

        return convertedAmount;
    }

}
