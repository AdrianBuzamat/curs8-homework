package ro.fasttrackit.curs8.interfaces.credit;

public class BrdAccount implements CreditBank{
    private int brdSold = 0;

    public BrdAccount() {

        brdSold = brdSold;
    }

    public int deposit(int amountToDeposit) {
        brdSold += Math.abs(amountToDeposit);
        return amountToDeposit = Math.abs(amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {

        brdSold -= Math.abs(amountToWithdraw);
        return amountToWithdraw = Math.abs(amountToWithdraw);
    }

    public int getSold() {
        return brdSold;
    }
 }
