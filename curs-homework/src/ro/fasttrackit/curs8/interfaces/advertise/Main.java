package ro.fasttrackit.curs8.interfaces.advertise;

public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        YahooMail yahooMail = new YahooMail();

        Company company= new Company(yahooMail);
        company.publishAdvertise();
        company.getContractCost();
    }
}
