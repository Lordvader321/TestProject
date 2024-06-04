package Classes;

public class SavingAccount extends Account{
    int withdrawLimit = 3;
    int count = 0;
    SavingAccount(int accountNumber, String name) {
        super(accountNumber, name);
    }




//    public void addInterest(double interestAmount){
//       double balance2 = getBalance();
//       balance2 = balance2+interestAmount;
//       setBalance(balance2);
//
//    }

    public void addInterest(double interestPercentage){
        double balance2 = getBalance();
        double intAmount = balance2 * (interestPercentage/100);
        balance2 = balance2+intAmount;
        setBalance(balance2);
    }

    public void withdrawMoney(double withdrawAmount){
        if (getBalance() >= withdrawAmount && count<= withdrawLimit){
            setBalance(getBalance()-withdrawAmount);
            count++;
        }else System.out.println("you cant withdraw " + withdrawAmount);
        System.out.println("your balance is " + getBalance());
    }

}
