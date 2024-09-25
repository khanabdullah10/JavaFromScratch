package src.onlineShoppingPlatform;

public class Product {
    private String type;
    private String name;
    private double price;
    private String productId;
    private String description;


    public Product(String pType,String name, double price, String productId, String description) {
        this.type = pType;
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

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Type : "+type +" "+name +" "+ price+"₹/- "+productId+" "+description;
    }
}
