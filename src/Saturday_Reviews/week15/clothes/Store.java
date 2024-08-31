package Saturday_Reviews.week15.clothes;


public class Store {
    public static void main(String[] args) {
        /*
        Cannot create object of abstract class or interface
        Clothes clothes = new Clothes();
        HasHood hasHood = new HasHood();
         */

        Clothes clothes = new TShirt();
        clothes.wear();

        //HasHood hood = new TShirt(); Error, not parent interface

        Clothes jacket = new Jacket();
        HasHood jacketWithHood = new Jacket();

        jacket.wear();
        /*
        Reference type decides what is accessible.
        Methods/Variables inherited from reference are accessible
         */
        //jacket.putOnHood();//not accessible

        //only putOnHood is accessible though this reference
        jacketWithHood.putOnHood();

        //Solution is downcasting to child reference
        ((Jacket)jacketWithHood).wear();


    }
}

