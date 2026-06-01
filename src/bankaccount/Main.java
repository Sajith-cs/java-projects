package bankaccount;

public class Main {
    public static void main(String[] args)  {
    BankAccount obj=new BankAccount(10000);
    obj.deposit(10000);
    System.out.println("Your remaining balance : "+obj.getBalance());
    try{
    obj.withdraw(500);}
    catch(InsufficientFundsException e){
        System.out.println(e.getMessage());
    }
    System.out.println("Your remaining balance : "+obj.getBalance());
    obj.deposit(1000);
    System.out.println("Your remaining balance : "+obj.getBalance());
    try{
        obj.withdraw(500000);
    }
    catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    obj.printHistory();
    }
}
