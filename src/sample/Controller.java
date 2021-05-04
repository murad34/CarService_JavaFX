package sample;

import java.lang.reflect.InvocationTargetException;
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

//    void carchoicebox() {
//        carchoicebox.getItems().add("Mercedes");
//        carchoicebox.getItems().add("BMW");
//        carchoicebox.getItems().add("Audi");
//        carchoicebox.getItems().add("Mustang");
//        carchoicebox.getItems().add("Ford");
//    }

    void carchoicebox() {
        carchoicebox.getItems().add("asd");
        carchoicebox.getItems().add("BMW");
        carchoicebox.getItems().add("Audi");
        carchoicebox.getItems().add("Mustang");
        carchoicebox.getItems().add("Ford");
    }

    void modelofcarchoicebox() {
        modelofcarchoicebox.getItems().add("A");
        modelofcarchoicebox.getItems().add("E");
        modelofcarchoicebox.getItems().add("C");
        modelofcarchoicebox.getItems().add("M");
        modelofcarchoicebox.getItems().add("Fusion");
    }

//    String df = "asd";
//    int asd= 123;

    void qwert() {

//        ObservableList<String> cursors = FXCollections.observableArrayList("a","b","c");
//        modelofcarchoicebox.setItems(cursors);

//        if (carchoicebox.getValue().indexOf(1)) {
//
//            modelofcarchoicebox.getItems().add("asdf");
//        }

//        switch (carchoicebox.getValue().indexOf(0)){
//            case 1 :
//                modelofcarchoicebox.getItems().add("M");
//                break;
//            default:
//                System.out.println("error");
//
//        }
        String modelofcarstring1 = carchoicebox.getSelectionModel().getSelectedItem();


        if (modelofcarstring1 == "asd") {
            modelofcarchoicebox.getItems().add("safgsargt");
            System.out.println(modelofcarstring1);
        } else if(modelofcarstring1 =="BMW"){
            modelofcarchoicebox.getItems().add("sagol");
            System.out.println(modelofcarstring1);
        }
        System.out.println(modelofcarstring1);
//        switch (carchoicebox.getValue()) {
//            case "asd":
//                modelofcarchoicebox.getItems().add("M");
//                break;
//            default:
//                modelofcarchoicebox.getItems().add("sagol");
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

    String q = "ID";
    String w = "Name";
    String e = "Number of owner";
    String r = "Date of receiving";
    String t = "Date of giving";
    String y = "Car";
    String u = "Model of a car";
    String i = "Number of a car";

    int a = 1;
    int s = 2;
    int d = 3;
    int f = 4;
    int g = 5;
    int h = 6;
    int j = 7;
    int k = 8;

    void searchchoosebox() {

        searchchoicebox.getItems().add(String.valueOf(a));
        searchchoicebox.getItems().add(String.valueOf(s));
        searchchoicebox.getItems().add(String.valueOf(d));
        searchchoicebox.getItems().add(String.valueOf(f));
        searchchoicebox.getItems().add(String.valueOf(g));
        searchchoicebox.getItems().add(String.valueOf(h));
        searchchoicebox.getItems().add(String.valueOf(j));
        searchchoicebox.getItems().add(String.valueOf(k));

    }

    public void search() {

        FilteredList<Clients> filteredlist = new FilteredList<>(showlist, b -> true);

        searchtextfield.textProperty().addListener((observable, oldvalue, newvalue) -> {
            filteredlist.setPredicate(clients -> {

                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }

                String lowercasefilter = newvalue.toLowerCase();


                if (searchchoicebox.getSelectionModel().isSelected(a)) {
                    if (String.valueOf(clients.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(s)) {
                    if (clients.getName().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(d)) {
                    if (clients.getNumberofowner().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(f)) {
                    if (clients.getDateofreceiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(g)) {
                    if (clients.getDateofgiving().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(h)) {
                    if (clients.getCar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(j)) {
                    if (clients.getModelofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

                if (searchchoicebox.getSelectionModel().isSelected(k)) {
                    if (clients.getNumberofcar().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
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


//    void executeQuery(String sql) {
//        DataBase db = new DataBase();
//        Statement st;
//        try{
//            st=db.connecting().createStatement();
//            st.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }


//    void deleteRecord() {
//        String sql = "delete from clients where id = " + iddeletetextfield.getText() + ";delete from clients_services where id = " + iddeletetextfield.getText() + "";
//        executeQuery(sql);
//        showClients();
//    }


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

//        if (event.getSource()==deletebutton){
//            deleteRecord();
//        }
////        showClients();
//
////        deleteRecord();
////        deleteRecord2();

    }


    // refresh part


    public void abc() {
//        getClients();
//        showClients();
    }

    @FXML
    void refreshbuttonaction(ActionEvent event) {

        asdf();

//        clientstable.getItems().clear();
        getClients();
//        showClients();
//        abc();

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
//        searchchoosebox();
        searchchoosebox();
        search();
//        deleteRecord();

        qwert();

    }
}

