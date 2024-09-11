package Muhtar_SDET.Day43_CollectionsAndMaps.arrayDeque_CustomerSupport;

public class Customer {
    private String name;
    private String productId;

    public Customer(String name, String productId) {
        this.name = name;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}