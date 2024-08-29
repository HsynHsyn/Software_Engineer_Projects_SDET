package Saturday_Reviews.week14.exercise;

public class Gym {
    public static void main(String[] args) {

        Bench bench = new Bench();
        bench.perform();
        System.out.println(bench.getCaloriesBurned(20));
        bench.rackWeight();

        System.out.println("------------------------------------");

        Exercise run1 = new Bench();
        System.out.println(run1);
        run1.perform();
        run1.test2();



    }
}
