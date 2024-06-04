package inhertanceclasspractice;

public class SavingAccount extends BankAccount {

    SavingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double withdrawAmount){
        double sBalance = getBalance();
        if ((sBalance-withdrawAmount) > 100){
            sBalance = sBalance - withdrawAmount;
            setBalance(sBalance);
        }else System.out.println("you cant not withdraw " + withdrawAmount);
    }

    public void test (){
        System.out.println("test");
    }
}
