package inhertanceclasspractice;

public class BankAccount {
   private double balance;

   BankAccount(double balance){
       this.balance = balance;
   }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double deposit){
       balance = balance+deposit;

   }

   public void withdraw(double withdraw){
       balance = balance-withdraw;
   }


}
