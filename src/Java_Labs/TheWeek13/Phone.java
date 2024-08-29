package Java_Labs.TheWeek13;

public abstract class Phone {

    String model;
    String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    abstract   void text();
    abstract void call(String name);

    @Override
    public String toString() {
        return  getClass().getSimpleName() +" {" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
