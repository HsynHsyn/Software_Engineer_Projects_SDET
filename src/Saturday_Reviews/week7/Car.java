package Saturday_Reviews.week7;

public class Car {
    public String make;
    public String model;

    public String toString() { // we do not use "static" because we just want object to use this method
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void setInfo(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println(make +" "+ model + " is driving..");
    }
}

class CarObjects {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.make = "Honda";
        honda.model = "Pilot";
        honda.drive();
        System.out.println(honda); //Automatically calls toString method

        Car kia = new Car();
        kia.setInfo("Kia", "Teluride");
        kia.drive();
        System.out.println(kia);
    }
}
