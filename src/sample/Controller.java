package sample;

import java.net.URL;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import net.proteanit.sql.DbUtils;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane leftpanel;

    @FXML
    private AnchorPane rightpanel;

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

//
//    class DigitFilter extends DocumentFilter {
//
//        private static final String DIGITS = "\\d+";
//
//        @Override
//        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
//
//            if (string.matches(DIGITS)) {
//                super.insertString(fb, offset, string, attr);
//            }
//        }
//
//        @Override
//        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String string, AttributeSet attrs) throws BadLocationException {
//            if (string.matches(DIGITS)) {
//                super.replace(fb, offset, length, string, attrs);
//            }
//        }
//
//    }
//
//
//    void dfg() {
//
//        TextField numberofownertextfield = new TextField();
//
//        PlainDocument doc = (PlainDocument) numberofownertextfield.getDocument();
//        doc.setDocumentFilter(new DigitFilter());
//
//    }
//

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
    private ListView<String> listviewservices;

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
    private TableColumn<Requirements, String> colRequirements;

    @FXML
    private TableColumn<Requirements, String> colTotalprice;

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


    void carcombobox() {

        carcombobox.getItems().add("Mercedes");
        carcombobox.getItems().add("BMW");
        carcombobox.getItems().add("Audi");
        carcombobox.getItems().add("Ford");

    }

    void modelofcarcombobox() {

        if (carcombobox.getValue() == "Mercedes") {

            modelofcarcombobox.getItems().clear();
            modelofcarcombobox.getItems().add("C");
            modelofcarcombobox.getItems().add("E");
            modelofcarcombobox.getItems().add("S");

        } else if (carcombobox.getValue() == "BMW") {

            modelofcarcombobox.getItems().clear();
            modelofcarcombobox.getItems().add("X5");
            modelofcarcombobox.getItems().add("M5");
            modelofcarcombobox.getItems().add("i7");

        } else if (carcombobox.getValue() == "Audi") {

            modelofcarcombobox.getItems().clear();
            modelofcarcombobox.getItems().add("A4");
            modelofcarcombobox.getItems().add("Rs7");
            modelofcarcombobox.getItems().add("Q8");

        } else if (carcombobox.getValue() == "Ford") {

            modelofcarcombobox.getItems().clear();
            modelofcarcombobox.getItems().add("Mustang");
            modelofcarcombobox.getItems().add("Fusion");
            modelofcarcombobox.getItems().add("Focus");

        }

        carcombobox.setOnAction(e -> modelofcarcombobox());

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
        listviewservices.setVisible(true);
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


    void listviewservices() {

        Statement statement;
        DataBase connectDB = new DataBase();
        ResultSet rs;

        ObservableList<String> items = FXCollections.observableArrayList();


        try {

            String sql = "select * from services";
            statement = connectDB.connecting().createStatement();
            rs = statement.executeQuery(sql);

            while (rs.next()) {

                items.add(rs.getString("services"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        listviewservices.setItems(items);

        listviewservices.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listviewservices.addEventFilter(MouseEvent.MOUSE_PRESSED, evt -> {
            Node node = evt.getPickResult().getIntersectedNode();

            // go up from the target node until a list cell is found or it's clear
            // it was not a cell that was clicked
            while (node != null && node != listviewservices && !(node instanceof ListCell)) {
                node = node.getParent();
            }

            // if is part of a cell or the cell,
            // handle event instead of using standard handling
            if (node instanceof ListCell) {
                // prevent further handling
                evt.consume();

                ListCell cell = (ListCell) node;
                ListView lv = cell.getListView();

                // focus the listview
                lv.requestFocus();

                if (!cell.isEmpty()) {
                    // handle selection for non-empty cells
                    int index = cell.getIndex();
                    if (cell.isSelected()) {
                        lv.getSelectionModel().clearSelection(index);
                    } else {
                        lv.getSelectionModel().select(index);
                    }
                }
            }
        });

    }


    @FXML
    void sendtodatabaseaction(ActionEvent event) {

        String namestring = nametextfield.getText();
        String surnamestring = surnametextfield.getText();
        String numberofownerstring1 = numberofownerchoicebox.getSelectionModel().getSelectedItem();
        String numberofownerstring2 = numberofownertextfield.getText();
        String dateofreceivinglocaldate = dateofreceiving.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String dateofgivinglocaldate = dateofgiving.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String carstring = carcombobox.getSelectionModel().getSelectedItem();
        String modelofcarstring = modelofcarcombobox.getSelectionModel().getSelectedItem();
        String numberofcarstring1 = numberofcartextfield1.getText();
        String numberofcarstring2 = numberofcartextfield2.getText();
        String numberofcarstring3 = numberofcartextfield3.getText();

        Statement statement;
        DataBase connectDB = new DataBase();


        if (namestring.length() < 1) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Name is empty !");
            message.show();
        } else if (surnamestring.length() < 1) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Surname is empty !");
            message.show();
        } else if (numberofownerchoicebox.getSelectionModel().getSelectedItem() == null) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Choose type of the number !");
            message.show();
        } else if (numberofownerstring2.length() > 7) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("The number contains more than need numbers !");
            message.show();
        } else if (numberofownerstring2.length() < 7) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("The number contains less than need numbers !");
            message.show();
        } else if (dateofreceivinglocaldate == null) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Choose Date of receiving !");
            message.show();
        } else if (dateofgivinglocaldate == null) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Choose Date of giving !");
            message.show();
        } else if (carcombobox.getTypeSelector() == null) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Choose a car !");
            message.show();
        } else if (modelofcarcombobox.getSelectionModel().getSelectedItem() == null) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Choose a model of the car !");
            message.show();
        } else if (numberofcarstring1.length() < 1) {
            Alert ar = new Alert(Alert.AlertType.INFORMATION);
            ar.setTitle("Error");
            ar.setContentText("Fill the number of a car properly");
            ar.show();
        } else if (numberofcarstring2.length() < 1) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Fill the number of a car properly");
            message.show();
        } else if (numberofcarstring3.length() < 1) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Fill the number of a car properly");
            message.show();
        } else if (listviewservices.getSelectionModel().getSelectedItems() == null) {
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setTitle("Error");
            message.setContentText("Choose services");
            message.show();
        } else {

            try {
                String sql = "insert into clients(name,numberofowner,dateofreceiving,dateofgiving,car,modelofcar,numberofcar) " +
                        "values('" + namestring + " " + surnamestring + "','" + numberofownerstring1 + numberofownerstring2 + "','" + dateofreceivinglocaldate + "'," +
                        "'" + dateofgivinglocaldate + "','" + carstring + "','" + modelofcarstring + "','" + numberofcarstring1 + "-" + numberofcarstring2 + "-" + numberofcarstring3 + "')";
                statement = connectDB.connecting().createStatement();
                statement.executeUpdate(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

//        String a1;
//        double b1;
//        if (c1.isSelected()) {
//            a1 = "yes";
//            b1 = 20;
//        } else {
//            a1 = "---";
//            b1 = 0;
//        }
//
//        String a2;
//        double b2;
//        if (c2.isSelected()) {
//            a2 = "yes";
//            b2 = 30;
//        } else {
//            a2 = "---";
//            b2 = 0;
//        }
//
//        String a3;
//        double b3;
//        if (c3.isSelected()) {
//            a3 = "yes";
//            b3 = 40;
//        } else {
//            a3 = "---";
//            b3 = 0;
//        }
//
//        String a4;
//        double b4;
//        if (c4.isSelected()) {
//            a4 = "yes";
//            b4 = 50;
//        } else {
//            a4 = "---";
//            b4 = 0;
//        }
//
//        String a5;
//        double b5;
//        if (c5.isSelected()) {
//            a5 = "yes";
//            b5 = 100;
//        } else {
//            a5 = "---";
//            b5 = 0;
//        }
//
//        String a6;
//        double b6;
//        if (c6.isSelected()) {
//            a6 = "yes";
//            b6 = 80;
//        } else {
//            a6 = "---";
//            b6 = 0;
//        }
//
//        String a7;
//        double b7;
//        if (c7.isSelected()) {
//            a7 = "yes";
//            b7 = 150;
//        } else {
//            a7 = "---";
//            b7 = 0;
//        }
//
//        double totalprice = b1 + b2 + b3 + b4 + b5 + b6 + b7;


            try {
                String sql = "insert into requirements(requirements) " +
                        "values('" + listviewservices.getSelectionModel().getSelectedItems() + "')";

                statement = connectDB.connecting().createStatement();
                statement.executeUpdate(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
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
        listviewservices.setVisible(false);
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
        listviewservices.setVisible(false);
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
                requirements = new Requirements(rs.getInt("id"), rs.getString("requirements"), rs.getString("totalprice"));
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
        colRequirements.setCellValueFactory(new PropertyValueFactory<Requirements, String>("requirements"));
        colTotalprice.setCellValueFactory(new PropertyValueFactory<Requirements, String>("totalprice"));

        requirementstable.setItems(showrequirementslist);

    }

    void searchchoicebox2() {
        searchchoicebox2.getItems().add("ID");
        searchchoicebox2.getItems().add("Requirements");
        searchchoicebox2.getItems().add("Total price");
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
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Requirements") {
                    if (requirements.getRequirements().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == "Total price") {
                    if (requirements.getTotalprice().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (searchchoicebox2.getSelectionModel().getSelectedItem() == null) {
                    if (String.valueOf(requirements.getId()).indexOf(lowercasefilter) != -1)
                        return true;
                    else if (requirements.getRequirements().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    } else if (requirements.getTotalprice().toLowerCase().indexOf(lowercasefilter) != -1) {
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
        listviewservices.setVisible(false);
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
        vboxservices.setVisible(true);
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


    void refresh() {


    }


    @FXML
    void initialize() {

        numberofownerchoicebox();
        carcombobox();
        modelofcarcombobox();
        listviewservices();

        showClients();
        searchchoisebox();
        search();
        showrequirements();
        search2();
        searchchoicebox2();

        showservices();
        search3();
        servicesearchchoicebox();

        refresh();

    }
}
