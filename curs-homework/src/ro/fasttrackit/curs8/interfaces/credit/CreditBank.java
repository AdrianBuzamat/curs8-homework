package ro.fasttrackit.curs8.interfaces.credit;

public interface CreditBank {
    int withdraw(int amountToWithdraw);
    int deposit(int amountToDeposit);
    int getSold();
}
