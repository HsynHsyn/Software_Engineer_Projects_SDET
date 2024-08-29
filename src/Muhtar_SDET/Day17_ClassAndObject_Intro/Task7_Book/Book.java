package Muhtar_SDET.Day17_ClassAndObject_Intro.Task7_Book;
import java.time.LocalDate; // import the LocalDate class


public class Book {

    public String title, author;
    public  double price;
    public int publicationYear,stock;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.publicationYear = 0;
        this.stock = 0;
 }


    /*Constructors)
Constructors, nesneleri başlatmak için kullanılan özel metotlardır.
Sınıfla aynı ada sahiptirler ve dönüş tipi (return type) yoktur, hatta void bile olmaz.
Yapıcıların ana amacı, bir nesne oluşturulurken bu nesnenin başlangıç durumunu ayarlamaktır.
     */

    public void setInfo (String author, String title, double price, int publicationYear, int stock) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
        this.stock = stock;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", stock=" + stock +
                '}';
    }
}

class BookGenres extends Book{
    private String genres;

    public BookGenres() {
        super();
    }


    public BookGenres (String author, String title, double price, int publicationYear, int stock,String genres){
        super();
        setInfo(title, author, price, publicationYear, stock);
        this.genres= genres;
    }

    //public void bookDetails()
    public String toString() {
        return "BookGenres{" +
                "genres='" + genres + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", stock=" + stock +
                '}';
    }
}

class Customer{
    public String customerFullName, customerMail;

    public Customer(String customerFullName, String customerMail) {
        this.customerFullName = customerFullName;
        this.customerMail = customerMail;
    }
    //LocalDate date1 = LocalDate.of(2024, 7, 7);


    public void setInfo(String customerFullName, String customerMail) {
        this.customerFullName = customerFullName;
        this.customerMail = customerMail;
        //this.date1 = date1;
    }

    public String toString() {
        return "Customer{" +
                "customerFullName='" + customerFullName + '\'' +
                ", customerMail='" + customerMail + '\'' +
                '}';
    }

    static class Order extends Customer{
    public double orderCost;
    public short orderNumber;
    public String bookList;

    public Order(String customerFullName, String customerMail, double orderCost,short orderNumber,String bookList) {
        super(customerFullName, customerMail);
        this.orderCost = orderCost;
        this.orderNumber = orderNumber;
        this.bookList = bookList;
    }


    public String cancelOrder(){
        return "We cancelled your order upon your request.";
    }

    public String toString() {
        return "Order{" +
                "orderCost=" + orderCost +
                ", orderNumber=" + orderNumber +
                ", bookList='" + bookList + '\'' +
                ", customerFullName='" + customerFullName + '\'' +
                ", customerMail='" + customerMail + '\'' +

                '}';
    }
}
}

/*
In this class:

The constructor public Book(...) initializes the object when it is created.
The setInfo method public void setInfo(...) allows you to update the properties of
the Book object after it has been created.
 */

/*
Summary of Differences
Constructor:
Has the same name as the class.
Does not have a return type, not even void.
Used to initialize a new object.
-------------------------------------
Method (e.g., setInfo):
Can have any name.
Has a return type, which can be void or another type.
Used to perform actions or modify the state of an existing object.
 */


