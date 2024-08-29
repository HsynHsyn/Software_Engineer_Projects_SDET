package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

import org.w3c.dom.ls.LSOutput;

public class CircleClients {
    public static void main(String[] args) {

        Task1_Circle circle = new Task1_Circle(4);

        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());

        System.out.println(circle);


    }



}
