package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;
import src.onlineShoppingPlatform.customException.PaymentFailedException;
import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PaymentFailedException {


        Scanner sc = new Scanner(System.in);
        Inventory inventory =  new Inventory();
        Admin admin = new Admin(inventory);

        System.out.println("***************######################################**************");
        System.out.println("Hello Admin! please add product to keep a stock in our Inventory");
        System.out.println("Enter Product name : ");
        String pName = sc.nextLine();
        System.out.println("Enter Product price : ");
        float pPrice =sc.nextFloat();
        System.out.println("Enter Product Id : ");
        String pId = sc.nextLine();
        System.out.println("Enter description for the product : ");
        String pDesciption =sc. nextLine();


        admin.addProductToInventory(new Product(pName,pPrice,pId,pDesciption));

        // Add new products to inventory by Admin
//        admin.addProductToInventory(new Product("Laptop", 35000.0, "P001", "8GB-RAM & 256GB-SSD"));
//        admin.addProductToInventory(new Product("Phone", 1800.0, "P002","4GB-RAM & 128GB-ROM"));
//        admin.addProductToInventory(new Product("Charger", 800.0, "P003","Built-in Quality premium"));
//        admin.addProductToInventory(new Product("Headphone", 500.0, "P004","Metal coating Last 40hrs"));


        System.out.println("Enter customer name ");
        String cName = sc.nextLine();

        Customer customer = new Customer(cName);
        System.out.println();
        inventory.showAllProducts();



        String productId = null;
        try {
            System.out.println();
            System.out.println("Enter the product ID to add to cart:");
            productId = sc.nextLine();
            Product product = inventory.searchProduct(productId);
           customer.get().addItem(product);
        } catch (ProductNotFoundException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        customer.get().viewCart();

        Order order = new Order(customer);
        order.placeOrder();

        Payment.processPayment("COD",2522f);

        Shipping.trackOrder();
        sc.close();


    }
}
