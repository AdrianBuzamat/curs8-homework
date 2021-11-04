package ro.fasttrackit.curs8.interfaces.credit;

public class BtAccount implements CreditBank{
    private int btSold = 0;

    public BtAccount() {

        btSold = btSold;
    }

    public int deposit(int amountToDeposit) {
        btSold += Math.abs(amountToDeposit);
        return amountToDeposit = Math.abs(amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {

        btSold -= Math.abs(amountToWithdraw);
        return amountToWithdraw = Math.abs(amountToWithdraw);
    }

    public int getSold() {
        return btSold;
    }
}
