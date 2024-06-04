package inhertanceclasspractice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(550);
       // System.out.println(bankAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(600);
        savingAccount.withdraw(699);
        System.out.println(savingAccount.getBalance());

        BankAccount bankAccount1 = new SavingAccount(600);




    }
}
