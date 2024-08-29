package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class Task6_DayAndMonth {
    public static void main(String[] args) {
        System.out.println("Day is " + day(5));
        System.out.println("Month name is " + monthName(6));
        System.out.println(daysInMonth(1));

    }
    public static String day(int day) {
        String result = "";

        switch (day) {
            case 1 -> result = "monday";
            case 2 -> result = "tuesday";
            case 3 -> result = "wednesday";
            case 4 -> result = "thursday";
            case 5 -> result = "friday";
            case 6 -> result = "saturday";
            case 7 -> result = "Sunday";
            default -> result = "Invalid number";
        }
        return result;
    }

    public static String monthName(int monthName) {
        String result = "";
        switch (monthName) {
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid number";
        }
        return result;
    }
    public static String daysInMonth(int daysInMonth) {
        String result ="";
        switch (daysInMonth) {
            case 1,3,5,7,8,10,12 -> result = "Has 31 days";
            case 2 -> result ="Has 28 days";
            case 4,6,9,11 -> result= "Has 30 days";
            default -> result ="Invalid month";
        }

        String month = daysInMonth==1 ? "January": daysInMonth==2 ? "February": daysInMonth==3 ? "March"
                :daysInMonth==4 ? "April":daysInMonth==5 ? "May":daysInMonth==6 ? "June"
                :daysInMonth==7 ? "July":daysInMonth==8 ? "August":daysInMonth==9 ? "September"
                :daysInMonth==10 ? "October":daysInMonth==11 ? "November":daysInMonth==12 ? "December":"Invalid number";

        return month + " " + result;

       }

}



/*
Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */