package src.onlineShoppingPlatform;

public class Product {

    private String name;
    private double price;
    private String productId;
    private String description;


    public Product(String name, double price, String productId, String description) {
        this.name = name;
        this.price = price;
        this.productId = productId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return name +" "+ price+"₹/- "+productId+" "+description;
    }
}
