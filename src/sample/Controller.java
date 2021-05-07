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

import javax.swing.text.html.ImageView;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane leftpanel;

    @FXML
    private AnchorPane rightpanel;

    // image

    @FXML
    private ImageView image35;

    // part 1 -new car

    @FXML
    private Button newcarbutton;

    @FXML
    private Label carlabel;

    @FXML
    private Label namelabel;

    @FXML
    private Label numberofownerlabel;

    @FXML
    private VBox numberofownervbox;

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
    private ComboBox<String> carcombobox;

    @FXML
    private ComboBox<String> modelofcarcombobox;

    @FXML
    private Label modelofcarlabel;

    @FXML
    private VBox VBox2;

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

    // part 2 - clients

    @FXML
    private Button clientsbutton;

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
    private TextField iddeletetextfield;

    @FXML
    private Button deletebutton;

    @FXML
    private Button refreshbutton;

    // part 3 - requirements

    @FXML
    private Button requirementsbutton;

    @FXML
    private TableView<Requirements> requirementstable;

    @FXML
    private TableColumn<Requirements, Integer> colId3;

    @FXML
    private TableColumn<Requirements, String> colR1;

    @FXML
    private TableColumn<Requirements, String> colR2;

    @FXML
    private TableColumn<Requirements, String> colR3;

    @FXML
    private TableColumn<Requirements, String> colR4;

    @FXML
    private TableColumn<Requirements, String> colR5;

    @FXML
    private TableColumn<Requirements, String> colR6;

    @FXML
    private TableColumn<Requirements, String> colR7;

    @FXML
    private TableColumn<Requirements, Double> colR8;

    @FXML
    private VBox searchVBox2;

    @FXML
    private ChoiceBox<String> searchchoicebox2;

    @FXML
    private TextField searchtextfield2;

    @FXML
    private Button refreshbutton2;

    @FXML
    private Label categorylabel2;

    // part 4 - services

    @FXML
    private Button servicesbutton;

    @FXML
    private TableView<Services> servicestable;

    @FXML
    private TableColumn<Services, Integer> colId4;

    @FXML
    private TableColumn<Services, String> colServices;

    @FXML
    private TableColumn<Services, String> colPrices;

    @FXML
    private Label newservicelabel;

    @FXML
    private TextField newservicetextfield;

    @FXML
    private Label newpricelabel;

    @FXML
    private TextField newpricetextfield;

    @FXML
    private Button addbutton;

    @FXML
    private TextField servicesearchtextfield;

    @FXML
    private VBox vboxservices;

    @FXML
    private ChoiceBox<String> servicessearchchoicebox;


    //part 1 - new car


    void qwertyui() {

//        ObservableList<String> list35 = carcombobox.getItems();
//        list35.add("Mercedes");
//        list35.add("BMW");
//        list35.add("Audi");
//        list35.add("Ford");

        carcombobox.getItems().add("Mercedes");
        carcombobox.getItems().add("BMW");
        carcombobox.getItems().add("Audi");
        carcombobox.getItems().add("Ford");

    }

    void sdfghj() {

        modelofcarcombobox.getItems().add("C");
        modelofcarcombobox.getItems().add("E");
        modelofcarcombobox.getItems().add("X5");
        modelofcarcombobox.getItems().add("M5");
        modelofcarcombobox.getItems().add("i7");
        modelofcarcombobox.getItems().add("A4");
        modelofcarcombobox.getItems().add("RS7");
        modelofcarcombobox.getItems().add("Q8");
        modelofcarcombobox.getItems().add("Mustang");
        modelofcarcombobox.getItems().add("Fusion");
        modelofcarcombobox.getItems().add("Focus");

    }

    @FXML
    void carcomboboxaction(ActionEvent event) {

    }

    @FXML
    void modelofcarcomboboxaction(ActionEvent event) {

    }

    void numberofownerchoicebox() {
        numberofownerchoicebox.getItems().add("050");
        numberofownerchoicebox.getItems().add("051");
        numberofownerchoicebox.getItems().add("055");
        numberofownerchoicebox.getItems().add("070");
        numberofownerchoicebox.getItems().add("077");
        numberofownerchoicebox.getItems().add("012");
    }


    @FXML
    void newcaraction(ActionEvent event) {

        namelabel.setVisible(true);
        nametextfield.setVisible(true);
        surnametextfield.setVisible(true);
        numberofownerlabel.setVisible(true);
        numberofownervbox.setVisible(true);
        numberofownerchoicebox.setVisible(true);
        numberofownertextfield.setVisible(true);
        dateofreceiving.setVisible(true);
        dateofgiving.setVisible(true);
        dateofreceivinglabel.setVisible(true);
        dateofgivinglabel.setVisible(true);
        carlabel.setVisible(true);
        modelofcarlabel.setVisible(true);
        VBox.setVisible(true);

        carcombobox.setVisible(true);
        modelofcarcombobox.setVisible(true);

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
        iddeletetextfield.setVisible(false);
        deletebutton.setVisible(false);
        refreshbutton.setVisible(false);

        requirementstable.setVisible(false);
        categorylabel2.setVisible(false);
        searchtextfield2.setVisible(false);
        searchchoicebox2.setVisible(false);
        searchVBox2.setVisible(false);
        refreshbutton2.setVisible(false);

        servicestable.setVisible(false);
        newservicelabel.setVisible(false);
        newservicetextfield.setVisible(false);
        newpricelabel.setVisible(false);
        newpricetextfield.setVisible(false);
        addbutton.setVisible(false);
        servicessearchchoicebox.setVisible(false);
        servicesearchtextfield.setVisible(false);

    }

    @FXML
    void sendtodatabaseaction(ActionEvent event) {

        String namestring = nametextfield.getText();
        String surnamestring = surnametextfield.getText();
        String numberofownerstring1 = numberofownerchoicebox.getSelectionModel().getSelectedItem();
        String numberofownerstring2 = numberofownertextfield.getText();
        LocalDate dateofreceivinglocaldate = dateofreceiving.getValue();
        LocalDate dateofgivinglocaldate = dateofgiving.getValue();
        String carstring = carcombobox.getSelectionModel().getSelectedItem();
        String modelofcarstring = modelofcarcombobox.getSelectionModel().getSelectedItem();
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
        double b1;
        if (c1.isSelected()) {
            a1 = "yes";
            b1 = 20;
        } else {
            a1 = "---";
            b1 = 0;
        }

        String a2;
        double b2;
        if (c2.isSelected()) {
            a2 = "yes";
            b2 = 30;
        } else {
            a2 = "---";
            b2 = 0;
        }

        String a3;
        double b3;
        if (c3.isSelected()) {
            a3 = "yes";
            b3 = 40;
        } else {
            a3 = "---";
            b3 = 0;
        }

        String a4;
        double b4;
        if (c4.isSelected()) {
            a4 = "yes";
            b4 = 50;
        } else {
            a4 = "---";
            b4 = 0;
        }

        String a5;
        double b5;
        if (c5.isSelected()) {
            a5 = "yes";
            b5 = 100;
        } else {
            a5 = "---";
            b5 = 0;
        }

        String a6;
        double b6;
        if (c6.isSelected()) {
            a6 = "yes";
            b6 = 80;
        } else {
            a6 = "---";
            b6 = 0;
        }

        String a7;
        double b7;
        if (c7.isSelected()) {
            a7 = "yes";
            b7 = 150;
        } else {
            a7 = "---";
            b7 = 0;
        }

        double totalprice = b1 + b2 + b3 + b4 + b5 + b6 + b7;

        try {
            String sql = "insert into requirements(washing,cleaning,changeofoil,changeofbrakes,changeofmotor,changeofwheels,changeofcarcass,totalprice) " +
                    "values('" + a1 + "','" + a2 + "','" + a3 + "','" + a4 + "','" + a5 + "','" + a6 + "','" + a7 + "','" + totalprice + "')";

            statement = connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    // part 2 - clients

    @FXML
    void clientsaction(ActionEvent event) {

        namelabel.setVisible(false);
        nametextfield.setVisible(false);
        surnametextfield.setVisible(false);
        numberofownerlabel.setVisible(false);
        numberofownervbox.setVisible(false);
        numberofownerchoicebox.setVisible(false);
        numberofownertextfield.setVisible(false);
        dateofreceiving.setVisible(false);
        dateofgiving.setVisible(false);
        dateofreceivinglabel.setVisible(false);
        dateofgivinglabel.setVisible(false);
        carlabel.setVisible(false);
        modelofcarlabel.setVisible(false);
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

        categorylabel.setVisible(true);
        searchVBox.setVisible(true);
        searchchoicebox.setVisible(true);
        searchtextfield.setVisible(true);
        clientstable.setVisible(true);
        searchbutton.setVisible(false);
        iddeletetextfield.setVisible(true);
        deletebutton.setVisible(true);
        refreshbutton.setVisible(true);

        requirementstable.setVisible(false);
        requirementstable.setVisible(false);
        categorylabel2.setVisible(false);
        searchtextfield2.setVisible(false);
        searchchoicebox2.setVisible(false);
        searchVBox2.setVisible(false);
        refreshbutton2.setVisible(false);

        carcombobox.setVisible(false);
        modelofcarcombobox.setVisible(false);

        servicestable.setVisible(false);
        newservicelabel.setVisible(false);
        newservicetextfield.setVisible(false);
        newpricelabel.setVisible(false);
        newpricetextfield.setVisible(false);
        addbutton.setVisible(false);
        servicessearchchoicebox.setVisible(false);
        servicesearchtextfield.setVisible(false);

    }


    ObservableList<Clients> list = FXCollections.observableArrayList();

    public ObservableList<Clients> getClients() {

        Statement statement;
        DataBase connectDB = new DataBase();
        ResultSet rs;

        try {

            String sql = "select * from clients";
            statement = connectDB.connecting().createStatement();
            rs = statement.executeQuery(sql);

            Clients clients;

            while (rs.next()) {
                clients = new Clients(rs.getInt("id"), rs.getString("name"), rs.getString("numberofowner"), rs.getString("dateofreceiving"),
                        rs.getString("dateofgiving"), rs.getString("car"), rs.getString("modelofcar"), rs.getString("numberofcar"));
                list.add(clients);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;

    }


    ObservableList<Clients> showlist = getClients();

    public void showClients() {

        colId.setCellValueFactory(new PropertyValueFactory<Clients, Integer>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<Clients, String>("name"));
        colNumberofowner.setCellValueFactory(new PropertyValueFactory<Clients, String>("numberofowner"));
        colDateofreceiving.setCellValueFactory(new PropertyValueFactory<Clients, String>("dateofreceiving"));
        colDateofgiving.setCellValueFactory(new PropertyValueFactory<Clients, String>("dateofgiving"));
        colCar.setCellValueFactory(new PropertyValueFactory<Clients, String>("car"));
        colModelofcar.setCellValueFactory(new PropertyValueFactory<Clients, String>("modelofcar"));
        colNumberofcar.setCellValueFactory(new PropertyValueFactory<Clients, String>("numberofcar"));

        clientstable.setItems(showlist);

    }


    // search part

    void searchchoisebox() {

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


                if (searchchoicebox.getSelectionModel().getSelectedItem() == "ID") {
                    if (String.valueOf(clients.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Name") {
                    if (clients.getName().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Number of owner") {
                    if (clients.getNumberofowner().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Date of receiving") {
                    if (clients.getDateofreceiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Date of giving") {
                    if (clients.getDateofgiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Car") {
                    if (clients.getCar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Model of a car") {
                    if (clients.getModelofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == "Number of a car") {
                    if (clients.getNumberofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox.getSelectionModel().getSelectedItem() == null) {
                    if (String.valueOf(clients.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else if (clients.getName().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (clients.getNumberofowner().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (clients.getDateofreceiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (clients.getDateofgiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (clients.getCar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (clients.getModelofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (clients.getNumberofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    }
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
            String sql = "delete from clients where id = " + iddeletetextfield.getText() + ";delete from requirements where id = " + iddeletetextfield.getText() + "";
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

    // part 3 - requiremments


    @FXML
    void requirementsbuttonaction(ActionEvent event) {

        namelabel.setVisible(false);
        nametextfield.setVisible(false);
        surnametextfield.setVisible(false);
        numberofownerlabel.setVisible(false);
        numberofownervbox.setVisible(false);
        numberofownerchoicebox.setVisible(false);
        numberofownertextfield.setVisible(false);
        dateofreceiving.setVisible(false);
        dateofgiving.setVisible(false);
        dateofreceivinglabel.setVisible(false);
        dateofgivinglabel.setVisible(false);
        carlabel.setVisible(false);
        modelofcarlabel.setVisible(false);
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
        iddeletetextfield.setVisible(false);
        deletebutton.setVisible(false);
        refreshbutton.setVisible(false);

        requirementstable.setVisible(true);
        requirementstable.setVisible(true);
        categorylabel2.setVisible(true);
        searchtextfield2.setVisible(true);
        searchchoicebox2.setVisible(true);
        searchVBox2.setVisible(true);
        refreshbutton2.setVisible(true);

        carcombobox.setVisible(false);
        modelofcarcombobox.setVisible(false);

        servicestable.setVisible(false);
        newservicelabel.setVisible(false);
        newservicetextfield.setVisible(false);
        newpricelabel.setVisible(false);
        newpricetextfield.setVisible(false);
        addbutton.setVisible(false);
        servicessearchchoicebox.setVisible(false);
        servicesearchtextfield.setVisible(false);

    }


    ObservableList<Requirements> requirementslist = FXCollections.observableArrayList();

    public ObservableList<Requirements> getrequirements() {

        Statement statement;
        DataBase connectDB = new DataBase();
        ResultSet rs;

        try {

            String sql = "select * from requirements";
            statement = connectDB.connecting().createStatement();
            rs = statement.executeQuery(sql);

            Requirements requirements;

            while (rs.next()) {
                requirements = new Requirements(rs.getInt("id"), rs.getString("washing"), rs.getString("cleaning"), rs.getString("changeofoil"), rs.getString("changeofbrakes"),
                        rs.getString("changeofmotor"), rs.getString("changeofwheels"), rs.getString("changeofcarcass"), rs.getDouble("totalprice"));
                requirementslist.add(requirements);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return requirementslist;

    }

    ObservableList<Requirements> showrequirementslist = getrequirements();

    public void showrequirements() {

        colId3.setCellValueFactory(new PropertyValueFactory<Requirements, Integer>("id"));
        colR1.setCellValueFactory(new PropertyValueFactory<Requirements, String>("washing"));
        colR2.setCellValueFactory(new PropertyValueFactory<Requirements, String>("cleaning"));
        colR3.setCellValueFactory(new PropertyValueFactory<Requirements, String>("changeofoil"));
        colR4.setCellValueFactory(new PropertyValueFactory<Requirements, String>("changeofbrakes"));
        colR5.setCellValueFactory(new PropertyValueFactory<Requirements, String>("changeofmotor"));
        colR6.setCellValueFactory(new PropertyValueFactory<Requirements, String>("changeofwheels"));
        colR7.setCellValueFactory(new PropertyValueFactory<Requirements, String>("changeofcarcass"));
        colR8.setCellValueFactory(new PropertyValueFactory<Requirements, Double>("totalprice"));

        requirementstable.setItems(showrequirementslist);

    }


    void searchchoicebox2() {
        searchchoicebox2.getItems().add("ID");
        searchchoicebox2.getItems().add("Washing");
        searchchoicebox2.getItems().add("Cleaning");
        searchchoicebox2.getItems().add("Changeofoil");
        searchchoicebox2.getItems().add("Changeofbrakes");
        searchchoicebox2.getItems().add("Changeofmotor");
        searchchoicebox2.getItems().add("Changeofwheels");
        searchchoicebox2.getItems().add("Changeofcarcass");
    }

    public void search2() {

        FilteredList<Requirements> filteredlist2 = new FilteredList<>(showrequirementslist, b -> true);

        searchtextfield2.textProperty().addListener((observable, oldvalue, newvalue) -> {
            filteredlist2.setPredicate(requirements -> {

                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }

                String lowercasefilter = newvalue.toLowerCase();


                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "ID") {
                    if (String.valueOf(requirements.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Washing") {
                    if (requirements.getWashing().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Cleaning") {
                    if (requirements.getCleaning().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Changeofoil") {
                    if (requirements.getChangeofoil().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Changeofbrakes") {
                    if (requirements.getChangeofbrakes().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Changeofmotor") {
                    if (requirements.getChangeofmotor().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Changeofwheels") {
                    if (requirements.getChangeofwheels().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Changeofcarcass") {
                    if (requirements.getChangeofcarcass().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == null) {
                    if (String.valueOf(requirements.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else if (requirements.getWashing().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getCleaning().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getChangeofoil().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getChangeofbrakes().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getChangeofmotor().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getChangeofwheels().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getChangeofcarcass().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    }
                }
                return false;
            });
        });


        SortedList<Requirements> sortedlist2 = new SortedList<>(filteredlist2);

        sortedlist2.comparatorProperty().bind(requirementstable.comparatorProperty());

        requirementstable.setItems(sortedlist2);

        return;

    }


    @FXML
    void refreshbuttonaction2(ActionEvent event) {

    }

    //part 4 - services

    @FXML
    void servicesaction(ActionEvent event) {

        namelabel.setVisible(false);
        nametextfield.setVisible(false);
        surnametextfield.setVisible(false);
        numberofownerlabel.setVisible(false);
        numberofownervbox.setVisible(false);
        numberofownerchoicebox.setVisible(false);
        numberofownertextfield.setVisible(false);
        dateofreceiving.setVisible(false);
        dateofgiving.setVisible(false);
        dateofreceivinglabel.setVisible(false);
        dateofgivinglabel.setVisible(false);
        carlabel.setVisible(false);
        modelofcarlabel.setVisible(false);
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
        iddeletetextfield.setVisible(false);
        deletebutton.setVisible(false);
        refreshbutton.setVisible(false);

        requirementstable.setVisible(false);
        requirementstable.setVisible(false);
        categorylabel2.setVisible(false);
        searchtextfield2.setVisible(false);
        searchchoicebox2.setVisible(false);
        searchVBox2.setVisible(false);
        refreshbutton2.setVisible(false);

        carcombobox.setVisible(false);
        modelofcarcombobox.setVisible(false);

        servicestable.setVisible(true);
        newservicelabel.setVisible(true);
        newservicetextfield.setVisible(true);
        newpricelabel.setVisible(true);
        newpricetextfield.setVisible(true);
        addbutton.setVisible(true);
        servicessearchchoicebox.setVisible(true);
        servicesearchtextfield.setVisible(true);

    }


    @FXML
    void addbuttonaction(ActionEvent event) {

        String newservicestring = newservicetextfield.getText();
        String newpricestring = newpricetextfield.getText();

        Statement statement;
        DataBase connectDB = new DataBase();

        try {
            String sql = "insert into services(services,prices) values('" + newservicestring + "','" + newpricestring + "')";
            statement = connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    ObservableList<Services> serviceslist = FXCollections.observableArrayList();

    public ObservableList<Services> getServices() {

        Statement statement;
        DataBase connectDB = new DataBase();
        ResultSet rs;

        try {

            String sql = "select * from services";
            statement = connectDB.connecting().createStatement();
            rs = statement.executeQuery(sql);

            Services services;

            while (rs.next()) {
                services = new Services(rs.getInt("id"), rs.getString("services"), rs.getString("prices"));
                serviceslist.add(services);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return serviceslist;

    }

    ObservableList<Services> showserviceslist = getServices();

    public void showservices() {

        colId4.setCellValueFactory(new PropertyValueFactory<Services, Integer>("id"));
        colServices.setCellValueFactory(new PropertyValueFactory<Services, String>("services"));
        colPrices.setCellValueFactory(new PropertyValueFactory<Services, String>("prices"));

        servicestable.setItems(showserviceslist);

    }

    void servicesearchchoicebox() {
        servicessearchchoicebox.getItems().add("ID");
        servicessearchchoicebox.getItems().add("Services");
        servicessearchchoicebox.getItems().add("Prices");
    }

    public void search3() {

        FilteredList<Services> filteredlist3 = new FilteredList<>(showserviceslist, b -> true);

        servicesearchtextfield.textProperty().addListener((observable, oldvalue, newvalue) -> {
            filteredlist3.setPredicate(services -> {

                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }

                String lowercasefilter = newvalue.toLowerCase();

                if (servicessearchchoicebox.getSelectionModel().getSelectedItem() == "ID") {
                    if (String.valueOf(services.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else {
                        return false;
                    }
                }
                if (servicessearchchoicebox.getSelectionModel().getSelectedItem() == "Services") {
                    if (services.getServices().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (servicessearchchoicebox.getSelectionModel().getSelectedItem() == "Prices") {
                    if (services.getPrices().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (servicessearchchoicebox.getSelectionModel().getSelectedItem() == null) {
                    if (String.valueOf(services.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else if (services.getServices().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (services.getPrices().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    }
                }
                return false;
            });
        });

        SortedList<Services> sortedlist3 = new SortedList<>(filteredlist3);

        sortedlist3.comparatorProperty().bind(servicestable.comparatorProperty());

        servicestable.setItems(sortedlist3);

        return;

    }


    @FXML
    void initialize() {

        numberofownerchoicebox();
        showClients();
        searchchoisebox();
        search();
        showrequirements();
        search2();
        searchchoicebox2();

        qwertyui();
        sdfghj();

        showservices();
        search3();
        servicesearchchoicebox();

    }
}

