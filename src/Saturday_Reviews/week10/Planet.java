package Saturday_Reviews.week10;

public class Planet {
    public String name;
    public long distanceFromSun;

    public Planet() {
        System.out.println("Creating planet object");
    }

    public Planet(String name, long distanceFromSun) {
        System.out.println("Creating planet object using name and distanceFromSun");
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                " km}";
    }
}
