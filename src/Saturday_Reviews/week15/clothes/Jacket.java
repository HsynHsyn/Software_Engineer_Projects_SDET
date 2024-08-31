package Saturday_Reviews.week15.clothes;

public class Jacket extends Clothes implements HasHood{

    @Override
    public void wear() {

        System.out.println("Wearing a Jacket");

    }

    @Override
    public void putOnHood() {
        System.out.println("Wearing a Jacket with Hood ");


    }
}
