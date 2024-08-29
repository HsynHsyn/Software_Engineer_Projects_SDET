package Saturday_Reviews.week12_review;

/*
   TrafficLight [encapsulation]

    Create a class Traffic Light

    instance variable: color (String)

    the constructor should call the setter method

    encapsulate the class
        the setter: only set the color if it is green, red, or yellow

     all colors should be lowercase

     action() red -> Stop
              green -> Go
              yellow -> Caution, prepare to stop
 */

public class TrafficLight {
    private String color;

    public TrafficLight(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        color = color.trim().toLowerCase();
        if(color.equals("green") || color.equals("yellow")
            || color.equals("red")) {
            this.color = color;
        }else {
            System.err.println("Invalid color: can only be green, yellow, red");
            System.exit(1);
        }
    }

    public String getColor() {
        return color;
    }

    public void action() {
        switch (color) {
            case "red" -> System.out.println("Stop");
            case "green" -> System.out.println("Go");
            case "yellow" -> System.out.println("Caution, prepare to stop");
        }
    }
}
