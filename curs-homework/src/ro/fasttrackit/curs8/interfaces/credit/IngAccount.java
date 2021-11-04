package ro.fasttrackit.curs8.interfaces.credit;

public class IngAccount implements CreditBank {
    private int ingSold = 0;

    public IngAccount() {

        ingSold = ingSold;
    }

    public int deposit(int amountToDeposit) {
        ingSold += Math.abs(amountToDeposit);
        return amountToDeposit = Math.abs(amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {

        ingSold -= Math.abs(amountToWithdraw);
        return amountToWithdraw = Math.abs(amountToWithdraw);
    }

    public int getSold() {
        return ingSold;
    }
}
