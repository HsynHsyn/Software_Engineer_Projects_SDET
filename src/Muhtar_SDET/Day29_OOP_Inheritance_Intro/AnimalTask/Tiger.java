package Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask;

public class Tiger extends Animal{ // Tiger - Is An - Animal

    public void hunt(){
        System.out.println(getName() + " is hunting"); //getName() getter and setter because access modifier is private
    }
}
