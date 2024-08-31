package Saturday_Reviews.week15.custom;

import java.time.LocalTime;

public class TestGoHome {
    public static void main(String[] args) {
        if (LocalTime.now().getHour() >= 5){
            throw new TimeToGoHomeException("Class ended, lets go home");

        }
    }
}
