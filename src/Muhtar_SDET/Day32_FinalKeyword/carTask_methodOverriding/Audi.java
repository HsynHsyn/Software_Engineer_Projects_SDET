package Muhtar_SDET.Day32_FinalKeyword.carTask_methodOverriding;

public class Audi extends Car{
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override //optional, (annotation)
    public void start() {
        System.out.println("Press the start button " + getMake() + getModel());
    }


}
/*
start(): "Press the start button"
 */
