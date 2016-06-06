package System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    static String nameDB = "inventory";
    static String login = "root";
    static String password = "1357&^mYsqlsErvEr";
    static String url = "jdbc:mysql://localhost/" + nameDB;
    Connection objConnect = null;

    public ConnectionDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            objConnect = DriverManager.getConnection(url, login, password);
            if (objConnect != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("No se a podido establecer la conexion con la base de datos, error " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("No se a podido establecer la conexion con la base de datos, error " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("No se a podido establecer la conexion con la base de datos, error " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return objConnect;
    }

    public void desconectar() {
        objConnect = null;
    }
}
