package sample;

import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    private Button servicebutton;

    @FXML
    private Button newcarbutton;

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

    void numberofownerchoicebox() {
        numberofownerchoicebox.getItems().add("050");
        numberofownerchoicebox.getItems().add("070");
        numberofownerchoicebox.getItems().add("055");
    }

    void carchoicebox() {
        carchoicebox.getItems().add("Mercedes");
        carchoicebox.getItems().add("BMW");
        carchoicebox.getItems().add("Audi");
    }

    @FXML
    void newcaraction(ActionEvent event) {

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
//        String modelofcarstring = modelofcarchoicebox.getSelectionModel().getSelectedItem();
        String numberofcarstring1 = numberofcartextfield1.getText();
        String numberofcarstring2 = numberofcartextfield2.getText();
        String numberofcarstring3 = numberofcartextfield3.getText();

        Statement statement;
        DataBase connectDB = new DataBase();

        try{
            String sql="insert into newcar(name,numberofowner,dateofreceiving,dateofgiving,car,modelofcar,numberofcar) " +
                    "values('"+namestring+" "+surnamestring+"','"+numberofownerstring1+numberofownerstring2+"','"+dateofreceivinglocaldate+"'," +
                    "'"+dateofgivinglocaldate+"','"+carstring+"','"+"','"+numberofcarstring1+"-"+numberofcarstring2+"-"+numberofcarstring3+"')";
            statement=connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try{
            String sql="insert into service(washing,cleaningtheinside,changeofoil,changeofbrakes,changeofmotor,changeofwheels,changeofcarcass) " +
                    "values('"+ c1.isSelected() +"','"+ c2.isSelected() +"','"+ c3.isSelected() +"'," +
                    "'"+ c4.isSelected() +"','"+ c5.isSelected() +"','"+ c6.isSelected() +"','"+ c7.isSelected() +"')";

            statement=connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @FXML
    void serviceaction(ActionEvent event) {

    }

    @FXML
    void initialize() {

        numberofownerchoicebox();
        carchoicebox();

    }
}
