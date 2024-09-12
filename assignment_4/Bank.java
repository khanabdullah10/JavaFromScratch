package src.assignment_4;


import java.util.ArrayList;

public class Bank {

    String accName;
    int accNumber;
    float balance;
    static ArrayList<Bank> account;

    Bank(String accName , int getAccNumber, float balance) {
        this.accName = accName;
        this.accNumber = getAccNumber;
        this.balance  = balance;
        account = new ArrayList<>();
    }

    static void addAccount(Bank bank) {

        account.add(bank);

    }


    static void display(){
        for(Bank acc :account){
            System.out.println(acc);
        }
    }

    void deposit(int amount) {
        this.balance += amount;

    }

    void withDraw(int amount){
        if (this.balance < amount) System.out.println("Insufficient balance");
        else this.balance -= amount;
    }


    static void exit(){
        System.out.println("Thanks for using our Service , visit again");
    }

    @Override
    public String toString() {
        return "Bank {" +
                " Name : " + accName +
                ", Number : " + accNumber +
                ", Balance : " + balance +
                '}';
    }



    public static void main(String[] args) {
        Bank acc1 = new Bank("Khan",686783,1000);
        Bank acc2 = new Bank("Abdullah",65154,15000);
        Bank acc3 = new Bank("Ankit",874564,20000);

        addAccount(acc1);
        addAccount(acc2);
        addAccount(acc3);

        display();

        acc1.deposit(10000);
        acc2.withDraw(5000);
        System.out.println();
        display();
        System.out.println();
        exit();





    }

}