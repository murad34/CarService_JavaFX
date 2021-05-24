package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    public Connection connecting() {

        String url = "jdbc:postgresql://localhost:5432/MyFirstApp(FX)";
        String user = "postgres";
        String password = "murdikmurdik20032003";
        Connection con ;

        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
//        return null;

    }
}
