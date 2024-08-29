package Saturday_Reviews.week14.exercise;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Running for cardio fitness");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }
    public void test(){
        System.out.println("Running");
    }
}
