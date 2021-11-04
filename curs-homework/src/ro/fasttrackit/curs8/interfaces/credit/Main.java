package ro.fasttrackit.curs8.interfaces.credit;

public class Main {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount(new BrdAccount());

        personalAccount.showSold();
        personalAccount.deposit(200);
        personalAccount.deposit(200);
        personalAccount.withdraw(-1000);
    }
}
