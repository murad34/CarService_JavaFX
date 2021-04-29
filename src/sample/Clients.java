package sample;

public class Clients {

    private Integer id;
    private String name;
    private String numberofowner;
    private String dateofreceiving;
    private String dateofgiving;
    private String car;
    private String modelofcar;
    private String numberofcar;
    private String washing;
    private String cleaning;
    private String changeofoil;
    private String changeofbrakes;
    private String changeofmotor;
    private String changeofwheels;
    private String changeofcarcass;

    public Clients(Integer id, String name, String numberofowner, String dateofreceiving, String dateofgiving, String car, String modelofcar, String numberofcar, String washing, String cleaning, String changeofoil, String changeofbrakes, String changeofmotor, String changeofwheels, String changeofcarcass) {
        this.id = id;
        this.name = name;
        this.numberofowner = numberofowner;
        this.dateofreceiving = dateofreceiving;
        this.dateofgiving = dateofgiving;
        this.car = car;
        this.modelofcar = modelofcar;
        this.numberofcar = numberofcar;
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

    public String getNumberofowner() {
        return numberofowner;
    }

    public String getDateofreceiving() {
        return dateofreceiving;
    }

    public String getDateofgiving() {
        return dateofgiving;
    }

    public String getCar() {
        return car;
    }

    public String getModelofcar() {
        return modelofcar;
    }

    public String getNumberofcar() {
        return numberofcar;
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