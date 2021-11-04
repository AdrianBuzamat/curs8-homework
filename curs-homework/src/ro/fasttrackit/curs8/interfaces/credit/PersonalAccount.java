package ro.fasttrackit.curs8.interfaces.credit;

public class PersonalAccount {
    private CreditBank creditBank;

    public PersonalAccount(CreditBank creditBank) {
        this.creditBank = creditBank;
    }

    public void deposit(int amountToDeposit) {
        System.out.println("Contul a fost incarcat cu suma: " + creditBank.deposit(amountToDeposit));
    }

    public void withdraw(int amountToWithdraw) {
        if (Math.abs(amountToWithdraw) < creditBank.getSold()) {
            System.out.println("Contul a fost debitat cu suma: " + creditBank.withdraw(amountToWithdraw));
        } else {
            System.out.println("Insufficient funds!Available funds: " + creditBank.getSold());
        }
    }

    public void showSold() {
        System.out.println("Soldul este: " + creditBank.getSold());
    }
}
