package Muhtar_SDET.Day43_CollectionsAndMaps.hashSetIPAddress;

public class WebsiteData {
    public static void main(String[] args) {
        AddressManager facebook = new AddressManager();
        facebook.addAddress("198.2.4.12.3");
        facebook.addAddress("112.4.12.4.1");
        facebook.addAddress("10.0.23.5");
        facebook.addAddress("10.0.23.4");
        System.out.println(facebook.getUniqueIp());

        facebook.addAddress("112.4.12.4.1");
        facebook.addAddress("10.0.23.5");

        facebook.addAddress("123.213.5.3.1");
        System.out.println(facebook.getUniqueIp());

        System.out.println(facebook.getUniqueIp().size());
    }
}

