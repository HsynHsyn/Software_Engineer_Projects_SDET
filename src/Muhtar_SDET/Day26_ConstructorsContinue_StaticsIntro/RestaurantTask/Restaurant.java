package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> Servers;
    public ArrayList<Chef> Chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.Servers = new ArrayList<>(); //buraya this. ekledim eger hata alisan sil
        this.Chefs = new ArrayList<>(); ////buraya this. ekledim eger hata alisan sil
    }

    public void hireServer (Server server){
        Servers.add(server);
    }

    public void hireServer(Server[] servers){
        Servers.addAll(Arrays.asList(servers));

    }

    public void hireChef(Chef chef){
        Chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){

        Chefs.removeIf(p -> p.employeeID == employeeID); // we can put also ``id``

    }

    public void terminateServer(int employeeID){
    // This employeeID is the method parameter
        Servers.removeIf(p->p.employeeID == employeeID); // we can put also ``id``
        // Inside the lambda:
        // p.employeeID refers to the employeeID attribute of the Server object 'p'
        // employeeID (right side) refers to the method parameter employeeID
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Servers=" + Servers +
                ", Chefs=" + Chefs +
                '}';
    }
}
