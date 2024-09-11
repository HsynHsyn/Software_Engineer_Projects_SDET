package Muhtar_SDET.Day43_CollectionsAndMaps.urls_Accessed;

public class Browser {
    public static void main(String[] args) {

        Server server =  new Server();

        server.goTo("www.google.com");
        server.goTo("www.youtube.com");
        server.goTo("www.google.com");
        server.goTo("www.amazon.com");
        server.goTo("www.google.com");
        server.goTo("www.amazon.com");
        server.goTo("www.google.com");

        System.out.println(server);








    }
}
