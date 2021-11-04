package ro.fasttrackit.curs8.interfaces.advertise;

public class YahooMail implements AdvertisePlatform{
    public String AdvertiseContent() {
        return "\"Our services are the best\"";
    }

    public int setPeriod() {
        return 30;
    }

    public int getCost() {
        return 2000;
    }
}
