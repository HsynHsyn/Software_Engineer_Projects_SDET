package Muhtar_SDET.Day17_ClassAndObject_Intro;

public class TestDogObject {
    public static void main(String[] args) {

     Dog dog1 = new Dog();

     dog1.name = "Max";
     dog1.breed = "Husky";
     dog1.gender = 'M';
     dog1.age = 4;
     dog1.size = "Large";
     dog1.colour = "Gray";

     Dog dog2 = new Dog();
     dog2.name = "Loki";
     dog2.breed = "Golden Retriever";
     dog2.gender = 'F';
     dog2.size = "Small";
     dog2.colour = "Orange";

     Dog dog3 = new Dog();
    dog3.setInfo("Loki","Chow chow",'M', 3, "Black","Black");

    Dog dog4 = new Dog();
    dog4.setInfo("Chuck", "Bulldog", 'M',5,"Small","White");


     System.out.println("dog1 = " + dog1); // info of dog1, hash-codes
     System.out.println("dog3 = " + dog3);
     System.out.println("dog4 = " + dog4);
     System.out.println();

     dog3.eat();
     dog4.drink();
     System.out.println("---------------------------");
     System.out.println(dog3); // toString() run





    }
}
