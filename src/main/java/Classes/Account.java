package Classes;

public class Account {

   private int accountNumber;
    private String name;
    private double balance;
    private String phoneNumber;
    private String email;

    Account(int accountNumber, String name){
        this.accountNumber= accountNumber;
        this.name = name;

    }
//    Account(){
//
//    }

    public void depositMoney(double depositAmount){
        balance = balance + depositAmount;
        //balance =+ depositAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>0) {
            this.balance = balance;
        }else System.out.println("Add positive balance");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void withdrawMoney(double withdrawAmount){
        if (balance>=withdrawAmount) {
            balance = balance - withdrawAmount;
            //balance = balance - withdrawAmount;
        }else System.out.println("Insufficient funds " + withdrawAmount);
        System.out.println("your balance is " + balance);

        //balance-=withdrawAmount;
    }

}
