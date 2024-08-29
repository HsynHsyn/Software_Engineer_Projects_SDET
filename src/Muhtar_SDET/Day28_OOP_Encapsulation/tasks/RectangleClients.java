package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Task2_Rectangle rectangle = new Task2_Rectangle(10, 20);


        rectangle.setWidth(110);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());

        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());

        System.out.println(rectangle);
    }
}
