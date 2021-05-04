package sample;

import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane leftpanel;

    @FXML
    private Button newcarbutton;

    @FXML
    private Button clientsbutton;

    @FXML
    private Button servicesbutton;

    @FXML
    private AnchorPane rightpanel;

    @FXML
    private Label carlabel;

    @FXML
    private Label namelabel;

    @FXML
    private Label numberofownerlabel;

    @FXML
    private Label dateofreceivinglabel;

    @FXML
    private Label dateofgivinglabel;

    @FXML
    private DatePicker dateofreceiving;

    @FXML
    private DatePicker dateofgiving;

    @FXML
    private TextField numberofownertextfield;

    @FXML
    private VBox VBox;

    @FXML
    private ChoiceBox<String> carchoicebox;

    @FXML
    private Label modelofcarlabel;

    @FXML
    private VBox VBox2;

    @FXML
    private ChoiceBox<String> modelofcarchoicebox;

    @FXML
    private Label numberofcarlabel;

    @FXML
    private TextField numberofcartextfield1;

    @FXML
    private Label tirelabel;

    @FXML
    private TextField numberofcartextfield2;

    @FXML
    private TextField numberofcartextfield3;

    @FXML
    private Label tirelabel2;

    @FXML
    private TextField nametextfield;

    @FXML
    private TextField surnametextfield;

    @FXML
    private ChoiceBox<String> numberofownerchoicebox;

    @FXML
    private Label serviceslabel;

    @FXML
    private CheckBox c1;

    @FXML
    private CheckBox c2;

    @FXML
    private CheckBox c3;

    @FXML
    private CheckBox c4;

    @FXML
    private CheckBox c5;

    @FXML
    private CheckBox c6;

    @FXML
    private CheckBox c7;

    @FXML
    private Button sebdtodatabsebutton;


    @FXML
    private TableView<Clients> clientstable;

    @FXML
    private TableColumn<Clients, Integer> colId;

    @FXML
    private TableColumn<Clients, String> colName;

    @FXML
    private TableColumn<Clients, String> colNumberofowner;

    @FXML
    private TableColumn<Clients, String> colDateofreceiving;

    @FXML
    private TableColumn<Clients, String> colDateofgiving;

    @FXML
    private TableColumn<Clients, String> colCar;

    @FXML
    private TableColumn<Clients, String> colModelofcar;

    @FXML
    private TableColumn<Clients, String> colNumberofcar;

    @FXML
    private TableColumn<Clients, String> colR1;

    @FXML
    private TableColumn<Clients, String> colR2;

    @FXML
    private TableColumn<Clients, String> colR3;

    @FXML
    private TableColumn<Clients, String> colR4;

    @FXML
    private TableColumn<Clients, String> colR5;

    @FXML
    private TableColumn<Clients, String> colR6;

    @FXML
    private TableColumn<Clients, String> colR7;

    @FXML
    private VBox searchVBox;

    @FXML
    private Label categorylabel;

    @FXML
    private ChoiceBox<String> searchchoicebox;

    @FXML
    private TextField searchtextfield;

    @FXML
    private Button searchbutton;

    @FXML
    private Label searchlabel;

    @FXML
    private TextField iddeletetextfield;

    @FXML
    private Button deletebutton;

    @FXML
    private Button refreshbutton;


    @FXML
    private TableView<Services> servicestable;

    @FXML
    private TableColumn<Services, Integer> colId3;

    @FXML
    private TableColumn<Services, String> colServices;

    @FXML
    private TableColumn<Services, String> colPrices;


    //part 1 - new car

    void numberofownerchoicebox() {
        numberofownerchoicebox.getItems().add("050");
        numberofownerchoicebox.getItems().add("051");
        numberofownerchoicebox.getItems().add("055");
        numberofownerchoicebox.getItems().add("070");
        numberofownerchoicebox.getItems().add("077");
        numberofownerchoicebox.getItems().add("012");
    }

    String wer1 = "Mercedes";
    String wer2 = "BMW";
    String wer3 = "Audi";
    String wer4 = "Ford";

    void carchoicebox() {
        carchoicebox.getItems().add("Mercedes");
        carchoicebox.getItems().add("BMW");
        carchoicebox.getItems().add("Audi");
        carchoicebox.getItems().add("Ford");
    }


    void modelofcarchoicebox() {

        modelofcarchoicebox.getItems().add("C");
        modelofcarchoicebox.getItems().add("E");
        modelofcarchoicebox.getItems().add("X5");
        modelofcarchoicebox.getItems().add("M5");
        modelofcarchoicebox.getItems().add("i7");
        modelofcarchoicebox.getItems().add("A4");
        modelofcarchoicebox.getItems().add("RS7");
        modelofcarchoicebox.getItems().add("Q8");
        modelofcarchoicebox.getItems().add("Mustang");
        modelofcarchoicebox.getItems().add("Fusion");
        modelofcarchoicebox.getItems().add("Focus");


//        String a35 = carchoicebox.getSelectionModel().getSelectedItem();

//        if (carchoicebox.getSelectionModel().getSelectedItem()==wer1) {
//            modelofcarchoicebox.getItems().add("C");
//            modelofcarchoicebox.getItems().add("E");
//        }
//        else if (carchoicebox.getSelectionModel().getSelectedItem()==wer2) {
//            modelofcarchoicebox.getItems().add("X5");
//            modelofcarchoicebox.getItems().add("M5");
//            modelofcarchoicebox.getItems().add("i7");
//        }
//        else if (carchoicebox.getSelectionModel().getSelectedItem()==wer3) {
//            modelofcarchoicebox.getItems().add("A4");
//            modelofcarchoicebox.getItems().add("RS7");
//            modelofcarchoicebox.getItems().add("Q8");
//        }
//        else {
//            modelofcarchoicebox.getItems().add("Mustang");
//            modelofcarchoicebox.getItems().add("Fusion");
//            modelofcarchoicebox.getItems().add("Focus");
//        }
////        (carchoicebox.getSelectionModel().getSelectedItem()=="Ford")


//        if (a35 == "Mercedes") {
//            modelofcarchoicebox.getItems().add("C");
//            modelofcarchoicebox.getItems().add("E");
//        }
//        else if (a35 == "BMW") {
//            modelofcarchoicebox.getItems().add("X5");
//            modelofcarchoicebox.getItems().add("M5");
//            modelofcarchoicebox.getItems().add("i7");
//        }
//        else if (a35 == "Audi") {
//            modelofcarchoicebox.getItems().add("A4");
//            modelofcarchoicebox.getItems().add("RS7");
//            modelofcarchoicebox.getItems().add("Q8");
//        }
//        else {
//            modelofcarchoicebox.getItems().add("Mustang");
//            modelofcarchoicebox.getItems().add("Fusion");
//            modelofcarchoicebox.getItems().add("Focus");
//            System.out.println("error");
//        }


//        String a35 = carchoicebox.getSelectionModel().getSelectedItem();
//
//        switch (a35) {
//            case "Mercedes" :
//                modelofcarchoicebox.getItems().add("C");
//                break;
//            case "BMW" :
//                modelofcarchoicebox.getItems().add("X5");
//                break;
//            case "Audi" :
//                modelofcarchoicebox.getItems().add("A4");
//                break;
//            default:
//                modelofcarchoicebox.getItems().add("Mustang");
//                modelofcarchoicebox.getItems().add("Fusion");
//                modelofcarchoicebox.getItems().add("Focus");
//                System.out.println("error");
//                break;
//        }


    }


    @FXML
    void newcaraction(ActionEvent event) {

        namelabel.setVisible(true);
        nametextfield.setVisible(true);
        surnametextfield.setVisible(true);
        numberofownerlabel.setVisible(true);
        numberofownerchoicebox.setVisible(true);
        numberofownertextfield.setVisible(true);
        dateofreceiving.setVisible(true);
        dateofgiving.setVisible(true);
        dateofreceivinglabel.setVisible(true);
        dateofgivinglabel.setVisible(true);
        carlabel.setVisible(true);
        carchoicebox.setVisible(true);
        modelofcarlabel.setVisible(true);
        modelofcarchoicebox.setVisible(true);
        VBox.setVisible(true);
        VBox2.setVisible(true);
        numberofcarlabel.setVisible(true);
        numberofcartextfield1.setVisible(true);
        numberofcartextfield2.setVisible(true);
        numberofcartextfield3.setVisible(true);
        tirelabel.setVisible(true);
        tirelabel2.setVisible(true);
        serviceslabel.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        c5.setVisible(true);
        c6.setVisible(true);
        c7.setVisible(true);
        sebdtodatabsebutton.setVisible(true);

        clientstable.setVisible(false);
        categorylabel.setVisible(false);
        searchVBox.setVisible(false);
        searchchoicebox.setVisible(false);
        searchtextfield.setVisible(false);
        clientstable.setVisible(false);
        searchbutton.setVisible(false);
        searchlabel.setVisible(false);
        iddeletetextfield.setVisible(false);
        deletebutton.setVisible(false);
        refreshbutton.setVisible(false);

        servicestable.setVisible(false);

    }

    @FXML
    void sendtodatabaseaction(ActionEvent event) {

        String namestring = nametextfield.getText();
        String surnamestring = surnametextfield.getText();
        String numberofownerstring1 = numberofownerchoicebox.getSelectionModel().getSelectedItem();
        String numberofownerstring2 = numberofownertextfield.getText();
        LocalDate dateofreceivinglocaldate = dateofreceiving.getValue();
        LocalDate dateofgivinglocaldate = dateofgiving.getValue();
        String carstring = carchoicebox.getSelectionModel().getSelectedItem();
        String modelofcarstring = modelofcarchoicebox.getSelectionModel().getSelectedItem();
        String numberofcarstring1 = numberofcartextfield1.getText();
        String numberofcarstring2 = numberofcartextfield2.getText();
        String numberofcarstring3 = numberofcartextfield3.getText();

        Statement statement;
        DataBase connectDB = new DataBase();

        try {
            String sql = "insert into clients(name,numberofowner,dateofreceiving,dateofgiving,car,modelofcar,numberofcar) " +
                    "values('" + namestring + " " + surnamestring + "','" + numberofownerstring1 + numberofownerstring2 + "','" + dateofreceivinglocaldate + "'," +
                    "'" + dateofgivinglocaldate + "','" + carstring + "','" + modelofcarstring + "','" + numberofcarstring1 + "-" + numberofcarstring2 + "-" + numberofcarstring3 + "')";
            statement = connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String a1;
        if (c1.isSelected()) {
            a1 = "yes";
        } else {
            a1 = "---";
        }

        String a2;
        if (c2.isSelected()) {
            a2 = "yes";
        } else {
            a2 = "---";
        }

        String a3;
        if (c3.isSelected()) {
            a3 = "yes";
        } else {
            a3 = "---";
        }

        String a4;
        if (c4.isSelected()) {
            a4 = "yes";
        } else {
            a4 = "---";
        }

        String a5;
        if (c5.isSelected()) {
            a5 = "yes";
        } else {
            a5 = "---";
        }

        String a6;
        if (c6.isSelected()) {
            a6 = "yes";
        } else {
            a6 = "---";
        }

        String a7;
        if (c7.isSelected()) {
            a7 = "yes";
        } else {
            a7 = "---";
        }


        try {
            String sql = "insert into clients_services(name,washing,cleaning,changeofoil,changeofbrakes,changeofmotor,changeofwheels,changeofcarcass) " +
                    "values('" + namestring + " " + surnamestring + "','" + a1 + "','" + a2 + "','" + a3 + "'," +
                    "'" + a4 + "','" + a5 + "','" + a6 + "','" + a7 + "')";

            statement = connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    // part 2 - clients

    @FXML
    void clientsaction(ActionEvent event) {

//        showClients();


        namelabel.setVisible(false);
        nametextfield.setVisible(false);
        surnametextfield.setVisible(false);
        numberofownerlabel.setVisible(false);
        numberofownerchoicebox.setVisible(false);
        numberofownertextfield.setVisible(false);
        dateofreceiving.setVisible(false);
        dateofgiving.setVisible(false);
        dateofreceivinglabel.setVisible(false);
        dateofgivinglabel.setVisible(false);
        carlabel.setVisible(false);
        carchoicebox.setVisible(false);
        modelofcarlabel.setVisible(false);
        modelofcarchoicebox.setVisible(false);
        VBox.setVisible(false);
        VBox2.setVisible(false);
        numberofcarlabel.setVisible(false);
        numberofcartextfield1.setVisible(false);
        numberofcartextfield2.setVisible(false);
        numberofcartextfield3.setVisible(false);
        tirelabel.setVisible(false);
        tirelabel2.setVisible(false);
        serviceslabel.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        sebdtodatabsebutton.setVisible(false);

        servicestable.setVisible(false);

        categorylabel.setVisible(true);
        searchVBox.setVisible(true);
        searchchoicebox.setVisible(true);
        searchtextfield.setVisible(true);
        clientstable.setVisible(true);
        searchbutton.setVisible(false);
        searchlabel.setVisible(true);
        iddeletetextfield.setVisible(true);
        deletebutton.setVisible(true);
        refreshbutton.setVisible(true);

    }


    public void asdf() {
        clientstable.getItems().clear();
    }


    ObservableList<Clients> list = FXCollections.observableArrayList();

    public ObservableList<Clients> getClients() {

        Statement statement;
        DataBase connectDB = new DataBase();
        ResultSet rs;

//      ObservableList<Clients> list = FXCollections.observableArrayList();

        try {

            String sql = "select * from clients inner join clients_services on clients.id=clients_services.id";
            statement = connectDB.connecting().createStatement();
            rs = statement.executeQuery(sql);

            Clients clients;

            while (rs.next()) {
                clients = new Clients(rs.getInt("id"), rs.getString("name"), rs.getString("numberofowner"), rs.getString("dateofreceiving"),
                        rs.getString("dateofgiving"), rs.getString("car"), rs.getString("modelofcar"), rs.getString("numberofcar"),
                        rs.getString("washing"), rs.getString("cleaning"), rs.getString("changeofoil"), rs.getString("changeofbrakes"),
                        rs.getString("changeofmotor"), rs.getString("changeofwheels"), rs.getString("changeofcarcass"));
                list.add(clients);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;

    }


    ObservableList<Clients> showlist = getClients();

    public void showClients() {

//        ObservableList<Clients> showlist = getClients();

        colId.setCellValueFactory(new PropertyValueFactory<Clients, Integer>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<Clients, String>("name"));
        colNumberofowner.setCellValueFactory(new PropertyValueFactory<Clients, String>("numberofowner"));
        colDateofreceiving.setCellValueFactory(new PropertyValueFactory<Clients, String>("dateofreceiving"));
        colDateofgiving.setCellValueFactory(new PropertyValueFactory<Clients, String>("dateofgiving"));
        colCar.setCellValueFactory(new PropertyValueFactory<Clients, String>("car"));
        colModelofcar.setCellValueFactory(new PropertyValueFactory<Clients, String>("modelofcar"));
        colNumberofcar.setCellValueFactory(new PropertyValueFactory<Clients, String>("numberofcar"));
        colR1.setCellValueFactory(new PropertyValueFactory<Clients, String>("washing"));
        colR2.setCellValueFactory(new PropertyValueFactory<Clients, String>("cleaning"));
        colR3.setCellValueFactory(new PropertyValueFactory<Clients, String>("changeofoil"));
        colR4.setCellValueFactory(new PropertyValueFactory<Clients, String>("changeofbrakes"));
        colR5.setCellValueFactory(new PropertyValueFactory<Clients, String>("changeofmotor"));
        colR6.setCellValueFactory(new PropertyValueFactory<Clients, String>("changeofwheels"));
        colR7.setCellValueFactory(new PropertyValueFactory<Clients, String>("changeofcarcass"));

        clientstable.setItems(showlist);

//        showlist.removeAll(showlist);
//        FXCollections.copy(showlist,list);

    }


    // search part

    void searchchoosebox() {

        searchchoicebox.getItems().add("ID");
        searchchoicebox.getItems().add("Name");
        searchchoicebox.getItems().add("Number of owner");
        searchchoicebox.getItems().add("Date of receiving");
        searchchoicebox.getItems().add("Date of giving");
        searchchoicebox.getItems().add("Car");
        searchchoicebox.getItems().add("Model of a car");
        searchchoicebox.getItems().add("Number of a car");

    }

    public void search() {

        FilteredList<Clients> filteredlist = new FilteredList<>(showlist, b -> true);

        searchtextfield.textProperty().addListener((observable, oldvalue, newvalue) -> {
            filteredlist.setPredicate(clients -> {

                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }

                String lowercasefilter = newvalue.toLowerCase();


                if (searchchoicebox.getSelectionModel().getSelectedItem()=="ID") {
                    if (String.valueOf(clients.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Name") {
                    if (clients.getName().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Number of owner") {
                    if (clients.getNumberofowner().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Date of receiving") {
                    if (clients.getDateofreceiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Date of giving") {
                    if (clients.getDateofgiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Car") {
                    if (clients.getCar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Model of a car") {
                    if (clients.getModelofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().getSelectedItem()=="Number of a car") {
                    if (clients.getNumberofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem()==null) {

                }

                return false;
            });
        });


        SortedList<Clients> sortedlist = new SortedList<>(filteredlist);

        sortedlist.comparatorProperty().bind(clientstable.comparatorProperty());

        clientstable.setItems(sortedlist);

        return;

    }


    @FXML
    void searchbutton(ActionEvent event) {

    }


    @FXML
    void deletebuttonaction(ActionEvent event) {

        Statement statement;
        DataBase connectDB = new DataBase();

        try {
            String sql = "delete from clients where id = " + iddeletetextfield.getText() + ";delete from clients_services where id = " + iddeletetextfield.getText() + "";
            statement = connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    // refresh part

    @FXML
    void refreshbuttonaction(ActionEvent event) {

    }

    //part 3 - services

    @FXML
    void servicesaction(ActionEvent event) {

        namelabel.setVisible(false);
        nametextfield.setVisible(false);
        surnametextfield.setVisible(false);
        numberofownerlabel.setVisible(false);
        numberofownerchoicebox.setVisible(false);
        numberofownertextfield.setVisible(false);
        dateofreceiving.setVisible(false);
        dateofgiving.setVisible(false);
        dateofreceivinglabel.setVisible(false);
        dateofgivinglabel.setVisible(false);
        carlabel.setVisible(false);
        carchoicebox.setVisible(false);
        modelofcarlabel.setVisible(false);
        modelofcarchoicebox.setVisible(false);
        VBox.setVisible(false);
        VBox2.setVisible(false);
        numberofcarlabel.setVisible(false);
        numberofcartextfield1.setVisible(false);
        numberofcartextfield2.setVisible(false);
        numberofcartextfield3.setVisible(false);
        tirelabel.setVisible(false);
        tirelabel2.setVisible(false);
        serviceslabel.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        sebdtodatabsebutton.setVisible(false);

        clientstable.setVisible(false);
        categorylabel.setVisible(false);
        searchVBox.setVisible(false);
        searchchoicebox.setVisible(false);
        searchtextfield.setVisible(false);
        searchbutton.setVisible(false);
        searchlabel.setVisible(false);
        iddeletetextfield.setVisible(false);
        deletebutton.setVisible(false);
        refreshbutton.setVisible(false);

        servicestable.setVisible(true);

    }

    @FXML
    void initialize() {

        numberofownerchoicebox();
        carchoicebox();
        modelofcarchoicebox();
        showClients();
        searchchoosebox();
        search();

    }
}

