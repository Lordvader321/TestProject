package Classes;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(224455, "Emon");

        //account.setAccountNumber(224455);
        System.out.println(account.getAccountNumber());

        account.setBalance(50);
       // account.depositMoney(500);
        account.withdrawMoney(600);
        //System.out.println(account.getBalance());
//        System.out.println(account.getBalance());
       System.out.println(account.getName());

       CheckingAccount cAccount = new CheckingAccount(334455, "Zeela");
       cAccount.getName();


       SavingAccount savingAccount = new SavingAccount(665544,"Golam");
       savingAccount.setBalance(500);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getName());
        savingAccount.addInterest(5);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdrawMoney(50);
        savingAccount.withdrawMoney(50);
        savingAccount.withdrawMoney(50);
        System.out.println(savingAccount.getBalance());
        System.out.println("***********");
        savingAccount.withdrawMoney(50);
        savingAccount.withdrawMoney(50);
        System.out.println(savingAccount.getBalance());






//        account.accountNumber = 123;
//        account.name = "Emon Hossain";
//        account.balance = 50;
//        account.balance = account.balance+70;
//        account.email = "golam654@gmail.com";
//        account.phoneNumber = "929-312-8728";
//        System.out.println(account.balance);
//        account.withdrawMoney(50.5);
//        System.out.println(account.balance);

    }
}
