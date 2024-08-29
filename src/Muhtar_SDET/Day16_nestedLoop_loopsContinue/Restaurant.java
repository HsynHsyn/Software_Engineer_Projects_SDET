package Muhtar_SDET.Day16_nestedLoop_loopsContinue;
    public class Restaurant {
        public static void main(String[] args) {
            Restaurant restaurant = new Restaurant();

            restaurant.setInfo("Nobu","Bulevar Principe Alfonso von Hohenlohe, Spain","+34-111-222-333",75);
            System.out.println(restaurant);


            System.out.println("Muhtar_SDET.Day16_nestedLoop_loopsContinue.test.Restaurant menu: ");
            restaurant.menu(false,true,true,true);

            restaurant.reservations(true,5);

            int liked = restaurant.rating(3);
            System.out.println("The restaurant consist of > "+liked +" *** (Michellini Rating)");
        }

        public String name;
        public String address;
        public String phone;
        public int staff;

        public void setInfo(String name, String address, String phone, int staff) {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.staff = staff;
        }

        public void menu(boolean setMenu, boolean cold, boolean hot, boolean drink) {
            if (setMenu == true) {
                System.out.println("Served with Miso Soup, Rice, Salad & Nobu Biscuits > $35");
                System.out.println("---------------");
                System.out.println("Salmon with Crispy Leaves (120g) > $40");
                System.out.println("---------------");
                System.out.println("Grilled Chicken with Nobu Sauces > $50");
            } else if (cold == true) {
                System.out.println("Crispy Rice with Spicy Tuna  > $60");
                System.out.println("---------------");
                System.out.println("Nobu Tacos (4 pieces per order) > $25");
                System.out.println("---------------");
                System.out.println("Sashimi Salad with Matsuhisa Dressing > $90");
            } else if (hot == true) {
                System.out.println("Unami Chicken Wings ( 6 pieces ) > $30");
                System.out.println("---------------");
                System.out.println("Snapper with Black Bean Sauce > $68");
                System.out.println("---------------");
                System.out.println("Beef Tendelorin with Yuzu Soy > $76");
            } else {
                System.err.println("Client hasn't ordered yet !");
            }

            if (drink == true) {
                System.out.println("Madame Alexander > $12");
                System.out.println("---------------");
                System.out.println("Mad Dog > $25");
                System.out.println("---------------");
                System.out.println("Godfather > $18");
            } else {
                System.out.println("Client did not order drink !");
            }

        }

        public void reservations(boolean booking, int tables) {
            if (booking == true) {
                System.out.println("Client has made reservations for " + tables + " tables");
            } else {
                System.out.println("Sorry ! You cannot enter without reservation !");
            }
        }

        public int rating(int stars) {
            return stars;
        }

        public String toString(){
            return "Welcome to the "+name+" Muhtar_SDET.Day16_nestedLoop_loopsContinue.test.Restaurant ! \n"
                    +"Address: "+address+"\n"
                    +"Phone: "+phone+"\n"
                    +"Staff: "+staff+"\n";
        }
    }
