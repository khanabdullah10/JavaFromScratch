package src.onlineShoppingPlatform;

public class Admin {

    public void addProductToInventory(Inventory inventory, Product prod) {
        inventory.addProduct(prod);
        System.out.println("Product added: "+prod.getName());
    }
}
