package src.practicalTest.Question1;

public class TestAddressBook {

    static SingleAddress sA = new SingleAddress();

    static void addAddress(SingleAddress address){

        sA.singleAddress.add(address);

    }

    static void deleteAddress(SingleAddress address){
        sA.singleAddress.remove(address);
    }

    public void exit(){

        System.out.println("Thank you for your prestigious time, Have a Good day!");
        System.exit(1);
    }

    public static void display(){
        System.out.println(sA.singleAddress);
    }


    public static void main(String[] args) {

        SingleAddress s_a = new SingleAddress();
        s_a.setStreetAddress("Noida sector 63, Lohia rd");
        addAddress(s_a);

        display();
    }

}
