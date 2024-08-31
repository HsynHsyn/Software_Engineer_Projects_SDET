package Saturday_Reviews.week15.clothes;


import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

public class ListOfClothing {
    public static void main(String[] args) {
        List<Clothes> clothingList = new ArrayList<>();

        clothingList.add(new TShirt());
        clothingList.add(new Jacket());
        clothingList.add(new TShirt());

        Clothes myjacket = new Jacket();
        clothingList.add(myjacket);

        System.out.println("Total clothes : " + clothingList.size());

        //loop the list using for each loop:
        for (Clothes eachClothing : clothingList) {
            eachClothing.wear();
            //check if object is Jacket type
            if (eachClothing instanceof Jacket) {
                ((Jacket) eachClothing).putOnHood();
            }

//            if (eachClothing.getClass().getSimpleName().equals("TShirt")) {
//                System.out.println("TShirt object");
//            }
        }

        Clothes cl1 = new TShirt();
        Clothes cl2 = new Jacket();

        System.out.println("cl1 = " + cl1.getClass().getSimpleName());
        System.out.println("cl2 = " + cl2.getClass().getSimpleName());

        if (cl1 instanceof TShirt) {
            System.out.println("TShirt Object");
        }

        System.out.println(cl2 instanceof Jacket);
    }
}