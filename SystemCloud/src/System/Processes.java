package System;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Processes {

    public void AddSeller(Seller seller) {
        ConnectionDB objConnect = new ConnectionDB();
        try {
            Statement objStatment = objConnect.getConnection().createStatement();
            String sql = "INSERT INTO sellers VALUES('" + seller.id + "','" + seller.name + "','" + seller.surname1 + "','" + seller.surname2 + "','" + seller.email + "','" + seller.user + "','" + seller.password + "','" + seller.phone + "','" + seller.position + "','" + seller.address + "','" + seller.type + "')";
            objStatment.executeUpdate(sql);
            System.out.println("REGISTRO EXITOSO");
            objStatment.close();
            objConnect.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar " + e.getMessage());
        }
    }

    public ArrayList<Seller> getSeller() {
        ArrayList<Seller> arraySeller = new ArrayList<>();
        ConnectionDB objConnect = new ConnectionDB();
        String sql = "SELECT * FROM sellers";
        try {
            PreparedStatement objPrepared = objConnect.getConnection().prepareStatement(sql);
            ResultSet objResult = objPrepared.executeQuery();

            while (objResult.next()) {
                Seller seller = new Seller(objResult.getInt("ID"), objResult.getString("Nombre(s)"), objResult.getString("Apellido Paterno"), objResult.getString("Apellido Materno"), objResult.getString("Correo Electronico"), objResult.getString("Nombre Usuario"), objResult.getString("Contraseña"), objResult.getInt("Telefono"), objResult.getString("Puesto"), objResult.getString("Direccion"), objResult.getString("Tipo Usuario"));
                arraySeller.add(seller);
            }
            objResult.close();
            objPrepared.close();
            objConnect.desconectar();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return arraySeller;
    }

}
