package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;
import src.onlineShoppingPlatform.customException.PaymentFailedException;
import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PaymentFailedException, IOException, ProductNotFoundException, OutOfStockException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Inventory inventory =  new Inventory();
        Admin admin = new Admin(inventory);
        boolean exit = false;



        while(!exit){

            System.out.println();
            System.out.println("***************************######################################***********************");
            System.out.println("Hello Admin! please add product to keep a stock in our Inventory");
            System.out.println();
            System.out.println("Choose Item type :");
            System.out.println("Press <1> - Electronic");
            System.out.println("Press <2> - Clothes");
            System.out.println("Press <3> - House Decor or Kitchen utensils");
            System.out.println("Press <4> - Food");
            System.out.println("Press <5> - Exit");
            System.out.println();
            System.out.print("------------------------------------ : Now Choose an option : ------------------------------ \n");
            System.out.print("Enter Here ! :");
            int choice = sc.nextInt();
            sc.nextLine();

            String pName = null;
            float pPrice = 0.0f;
            String pId = null;
            String pDescription = null;



            switch (choice){
                case 1:
                    System.out.println("Enter Product name : ");
                     pName = br.readLine();
                    System.out.println("Enter Product price : ");
                     pPrice = Float.parseFloat(br.readLine());
                    System.out.println("Enter Product Id : ");
                     pId = br.readLine();
                    System.out.println("Enter description for the product : ");
                     pDescription = br.readLine();
                    admin.addProductToInventory(new Product("Electronic ",pName,pPrice,pId,pDescription));
                    System.out.println();
                    System.out.println();
                    System.out.println("Do you want to add more than continue by pressing (+) or Exit by pressing (.)");
                    String input = br.readLine();
                    if(input.equalsIgnoreCase("+")){
                        continue;
                    }else if(input.equalsIgnoreCase(".")) {
                        break;
                    }


                case 2:
                    System.out.println("Enter Product name : ");
                    pName = br.readLine();
                    System.out.println("Enter Product price : ");
                    pPrice = Float.parseFloat(br.readLine());
                    System.out.println("Enter Product Id : ");
                    pId = br.readLine();
                    System.out.println("Enter description for the product : ");
                    pDescription = br.readLine();
                    admin.addProductToInventory(new Product("Clothes ",pName,pPrice,pId,pDescription));

                    System.out.println("Do you want to add more than continue by pressing (+) or Exit by pressing (.)");
                     input = br.readLine();
                    if(input.equalsIgnoreCase("+")){
                        continue;
                    }else if(input.equalsIgnoreCase(".")) {
                        break;
                    }


                case 3:
                    System.out.println("Enter Product name : ");
                    pName = br.readLine();
                    System.out.println("Enter Product price : ");
                    pPrice = Float.parseFloat(br.readLine());
                    System.out.println("Enter Product Id : ");
                    pId = br.readLine();
                    System.out.println("Enter description for the product : ");
                    pDescription = br.readLine();
                    admin.addProductToInventory(new Product("House Decor Or Home Utensils ",pName,pPrice,pId,pDescription));
                    System.out.println();
                    System.out.println("Do you want to add more than continue by pressing (+) or Exit by pressing (.)");
                     input = br.readLine();
                    if(input.equalsIgnoreCase("+")){
                        continue;
                    }else if(input.equalsIgnoreCase(".")) {
                        break;
                    }


                case 4:
                    System.out.println("Enter Product name : ");
                    pName = br.readLine();
                    System.out.println("Enter Product price : ");
                    pPrice = Float.parseFloat(br.readLine());
                    System.out.println("Enter Product Id : ");
                    pId = br.readLine();
                    System.out.println("Enter description for the product : ");
                    pDescription = br.readLine();
                    admin.addProductToInventory(new Product("Food ",pName,pPrice,pId,pDescription));
                    System.out.println();
                    System.out.println("Do you want to add more than continue by pressing (+) or Exit by pressing (.)");
                     input = br.readLine();
                    if(input.equalsIgnoreCase("+")){
                        continue;
                    }else if(input.equalsIgnoreCase(".")) {
                        break;
                    }


                case 5:
                    System.out.println("Thank you for using our Service dear customer, have a Good day! :)");
                    exit = true;
                    System.exit(0);

                default:
                    System.out.println("Invalid input by the Admin");

            }



            inventory.showAllProducts();
            System.out.println();
            System.out.println("      :::::Enter customer name::::");
            String cName = br.readLine();

            Customer customer = new Customer(cName);


            // ...

            String productId = null;
            try {
                while (true) {
                    System.out.println();
                    System.out.println("Enter the product ID to add to cart (<or 'done' to checkout>):");
                    productId = br.readLine();
                    if (productId.equalsIgnoreCase("done")) {
                        break;
                    }
                    Product product = inventory.searchProduct(productId);
                    customer.get().addItem(product);
                }

                customer.get().viewCart();

                Order order = new Order(customer);
                order.placeOrder();
                System.out.println();
                System.out.println("Enter payment method :");
                String method = br.readLine();

                System.out.println("Your total amount = " + customer.get().calculateTotal());
                Payment.processPayment(method, customer.get().calculateTotal());

                Shipping.trackOrder();
            } catch (ProductNotFoundException | OutOfStockException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Enter the correct product ID again:");
                productId = br.readLine();
                Product product = inventory.searchProduct(productId);
                customer.get().addItem(product);
                customer.get().viewCart();

                Order order = new Order(customer);
                order.placeOrder();
                System.out.println();
                System.out.println("Enter payment method :");
                String method = br.readLine();

                System.out.println("Your total amount = " + customer.get().calculateTotal());
                Payment.processPayment(method, customer.get().calculateTotal());
            }

// ...

//            customer.get().viewCart();
//
//            Order order = new Order(customer);
//            order.placeOrder();
//
//            System.out.println("Enter payment method :");
//            String method = br.readLine();
//
//            double totalPrice = customer.get().calculateTotal();
//            System.out.println("Your total amount = "+ totalPrice );
//            Payment.processPayment(method,totalPrice);

            Shipping.trackOrder();






        }








        // Add new products to inventory by Admin
//        admin.addProductToInventory(new Product("Laptop", 35000.0, "P001", "8GB-RAM & 256GB-SSD"));
//        admin.addProductToInventory(new Product("Phone", 1800.0, "P002","4GB-RAM & 128GB-ROM"));
//        admin.addProductToInventory(new Product("Charger", 800.0, "P003","Built-in Quality premium"));
//        admin.addProductToInventory(new Product("Headphone", 500.0, "P004","Metal coating Last 40hrs"));









    }
}
