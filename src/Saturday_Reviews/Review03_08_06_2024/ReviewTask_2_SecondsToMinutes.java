package Saturday_Reviews.Review03_08_06_2024;

public class ReviewTask_2_SecondsToMinutes {
    public static void main(String[] args) {

        int totalSeconds = 550;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println("In " + totalSeconds + " seconds - there are " + minutes +" minutes and " + seconds + " seconds");



    }
}
 /*
 SecondsToMinutes [variables, remainder operator, concatenation]
    Declare and assign the following variables
        totalSeconds

    Declare minutes , calculate minutes in totalSeconds
    Declare seconds , calculate remaining seconds
    Display in this format:
    In 550 seconds - there are 9 minutes and 10 seconds
  */