package Muhtar_SDET.Day36_OOP_Polymorphism_Continue;

import java.util.Arrays;

public class IPhone {

    private String brand, model, size;
    private String color;
    private double price;

    public IPhone(String brand, String model, String size, String color, double price) { // it is not used setInfo() because Constructor is always the best choose when it comes to initialize the instances
       /* this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price; */ // fields

        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1); // status code 1
        }
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // List<String> list = Arrays.asList(array);
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red","Green","Gray"};

        if (Arrays.asList(colors).contains(color) ){
            this.color = color;
        }else {
            System.err.println("Invalid price: " + color + "\n color of the can only be : "  + Arrays.asList(colors)  );
            System.exit(1); // status code 1
        }
    }

    public void call(long phoneNumber){
        System.out.println(getModel() + " is calling " + phoneNumber );

    }

    public void text(long phoneNumber){
        System.out.println(getModel() + " is texting to " + phoneNumber );

    }


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IPhone)){
            System.err.println("Invalid Object, Object must be Iphone");
            System.exit(1);
        }
        if (model.equals(( (IPhone)obj ).model ) ){ // if the model of the iphone is equal to the given Iphone`s model
            if (color.equals(((IPhone)obj).color ) ) {// if the color of the iphone is equal to the given Iphone`s color
                return true;
            }
        }
        return false;
    }
}
