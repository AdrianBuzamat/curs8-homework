package ro.fasttrackit.curs8.interfaces.advertise;

public class Facebook implements AdvertisePlatform{

    public String AdvertiseContent() {
        return "\"Our services are the best\"";
    }

    public int setPeriod() {
        return 30;
    }

    public int getCost() {
        return 5000;
    }
}
