package sample;

public class Services {

    private Integer id;
    private String name;
    private String washing;
    private String cleaning;
    private String changeofoil;
    private String changeofbrakes;
    private String changeofmotor;
    private String changeofwheels;
    private String changeofcarcass;

    public Services(Integer id, String name, String washing, String cleaning, String changeofoil, String changeofbrakes, String changeofmotor, String changeofwheels, String changeofcarcass) {
        this.id = id;
        this.name = name;
        this.washing = washing;
        this.cleaning = cleaning;
        this.changeofoil = changeofoil;
        this.changeofbrakes = changeofbrakes;
        this.changeofmotor = changeofmotor;
        this.changeofwheels = changeofwheels;
        this.changeofcarcass = changeofcarcass;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
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
}
