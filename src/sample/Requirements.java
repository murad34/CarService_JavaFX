package sample;

public class Requirements {

    private Integer id;
    private String requirements;
    private String totalprice;

    public Requirements(Integer id,String requirements,String totalprice) {
        this.id = id;
        this.requirements = requirements;
        this.totalprice = totalprice;
    }

    public Integer getId() {
        return id;
    }

    public String getRequirements() {
        return requirements;
    }

    public String getTotalprice() {
        return totalprice;
    }

}
