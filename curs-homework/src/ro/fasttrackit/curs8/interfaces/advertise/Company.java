package ro.fasttrackit.curs8.interfaces.advertise;

public class Company {
    private AdvertisePlatform advertisePlatform;

    public Company(AdvertisePlatform advertisePlatform) {
        this.advertisePlatform = advertisePlatform;
    }

    public void publishAdvertise() {
        System.out.println("Publica reclama: " + advertisePlatform.AdvertiseContent() + " for a period of " + advertisePlatform.setPeriod() + " days.");
    }

    public void getContractCost(){
        System.out.println("Total cost: $" + advertisePlatform.getCost());
    }
}
