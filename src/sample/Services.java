package sample;

public class Services {

    private Integer id;
    private String services;
    private String prices;

    public Services(Integer id, String services, String prices) {
        this.id = id;
        this.services = services;
        this.prices = prices;
    }

    public Integer getId() {
        return id;
    }

    public String getServices() {
        return services;
    }

    public String getPrices() {
        return prices;
    }

}
