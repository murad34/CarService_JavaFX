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

    public Clients(Integer id, String name, String numberofowner, String dateofreceiving, String dateofgiving, String car, String modelofcar, String numberofcar) {
        this.id = id;
        this.name = name;
        this.numberofowner = numberofowner;
        this.dateofreceiving = dateofreceiving;
        this.dateofgiving = dateofgiving;
        this.car = car;
        this.modelofcar = modelofcar;
        this.numberofcar = numberofcar;

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

}