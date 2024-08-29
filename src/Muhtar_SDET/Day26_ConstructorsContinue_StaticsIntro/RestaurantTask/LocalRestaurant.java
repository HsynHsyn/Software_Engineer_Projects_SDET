package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.RestaurantTask;

import Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.studentTask.Student;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server server  = new Server("Ali", 5, 40, true);
        Server server2  = new Server("Halime", 6, 25, false);
        Server server3  = new Server("Jack", 7, 35, true);
        Server server4  = new Server("Huseyin", 8, 20, false);

        Server[] servers = new Server[] { server2, server3, server4, };

        Chef chef = new Chef("Hans", 1, 30, true);
        Chef chef2 = new Chef("Kerem", 2, 40, true);
        Chef chef3 = new Chef("Yunus", 3, 20, false);
        Chef chef4 = new Chef("Kaan", 4, 25, false);

        Chef [] chefs =  {chef2, chef3, chef4};

        Restaurant restaurant1 = new Restaurant("Hakan", "Manchester", 5);

        restaurant1.hireChef(chef);
        restaurant1.hireServer(server);

        restaurant1.hireChef(chefs);
        restaurant1.hireServer(servers);



        restaurant1.terminateServer(5);
        restaurant1.terminateChef(1);

        System.out.println(restaurant1.Servers);
        System.out.println(restaurant1.Chefs);

    }
}
