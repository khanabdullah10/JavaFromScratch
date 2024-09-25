package src.onlineShoppingPlatform;

public class Admin {

    private Inventory inventory;

    public Admin(Inventory inventory){
        this.inventory = inventory;
    }

    public void addProductToInventory(Product product){
        inventory.addProduct(product);
        System.out.println("[Admin added product: "+product.getName()+" successfully.]");
    }
}
