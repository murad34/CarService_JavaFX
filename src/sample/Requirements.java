package sample;

public class Requirements {

    private Integer id;
    private String washing;
    private String cleaning;
    private String changeofoil;
    private String changeofbrakes;
    private String changeofmotor;
    private String changeofwheels;
    private String changeofcarcass;
    private double totalprice;

    public Requirements(Integer id,String washing, String cleaning, String changeofoil, String changeofbrakes, String changeofmotor, String changeofwheels, String changeofcarcass,Double totalprice) {
        this.id = id;
        this.washing = washing;
        this.cleaning = cleaning;
        this.changeofoil = changeofoil;
        this.changeofbrakes = changeofbrakes;
        this.changeofmotor = changeofmotor;
        this.changeofwheels = changeofwheels;
        this.changeofcarcass = changeofcarcass;
        this.totalprice = totalprice;
    }

    public Integer getId() {
        return id;
    }

    public String getWashing() {
        return washing;
    }

    public String getCleaning() {
        return cleaning;
    }

    public String getChangeofoil() {
        return changeofoil;
    }

    public String getChangeofbrakes() {
        return changeofbrakes;
    }

    public String getChangeofmotor() {
        return changeofmotor;
    }

    public String getChangeofwheels() {
        return changeofwheels;
    }

    public String getChangeofcarcass() {
        return changeofcarcass;
    }

    public double getTotalprice() {
        return totalprice;
    }

}
