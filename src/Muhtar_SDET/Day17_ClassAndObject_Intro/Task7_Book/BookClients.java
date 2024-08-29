package Muhtar_SDET.Day17_ClassAndObject_Intro.Task7_Book;

public class BookClients {
    public static void main(String[] args) {

        //Book book1 =  new Book("Harry Potter","JJ Davidson",20,2011,50);

        Customer customer1 =  new Customer("Hakan", "Hakan@oz");

        //book1.setInfo("Harry Potter","JJ Davidson",20,2011,50);
        //System.out.println(book1.toString());
        //System.out.println(book1.author);

        customer1.setInfo("Hakan", "Hakan@oz");

        System.out.println(customer1.toString());

        Customer.Order test1 = new Customer.Order("hakan","oz", 20.0, (short) 30, "huseyin");
        System.out.println(test1.cancelOrder());

        BookGenres myBook = new BookGenres();

        myBook.setInfo("Clean Code", "Robert C. Martin", 39.99, 2008, 15);
        

    }
}
