package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.RestaurantTask;

public class Chef {

    public String name;
    public int employeeID; // we can put also ``id``
    public double hourlyRate;
    public boolean isFullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void makeOrder(){
        System.out.println(name + " chef is making an order");
    }
    public void washDishes(){
        System.out.println(name + " chef is washing the dishes");
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
