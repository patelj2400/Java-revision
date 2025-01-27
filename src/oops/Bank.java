package oops;


class Account {
    int accountNo;
    String name;
    double balance;

    void insert(int a, String n, double b) {
        accountNo = a;
        name = n;
        balance = b;
        System.out.println(name +" Account has created");
        System.out.println("Account no: " + accountNo+ " Balance: " + balance);

    }

    void deposit(double b) {
       balance = balance + b;
       System.out.println(b+ " Money has been deposit in the account "+"of "+name+" is "+accountNo);
    }

    void withdraw(double b) {
        if(balance < b){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - b;
            System.out.println("withdrawal successful");
            System.out.println(b+" Money Withdrawn from "+name+" account "+"of "+accountNo);
        }
    }

    void checkBalance() {
        System.out.println("Account no: " + accountNo + " New Balance: " + balance);
    }
}


public class Bank {

    public static void main(String[] args) {


        Account a = new Account();
        a.insert(1, "John", 500);
        a.deposit(300);
        a.checkBalance();
        a.withdraw(50);
        a.checkBalance();



    }

}
