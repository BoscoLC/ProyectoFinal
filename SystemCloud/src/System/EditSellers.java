package System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditSellers extends javax.swing.JInternalFrame {

    Connection conect = null;
    Statement state = null;
    DefaultTableModel model;
//try {
//            int filas = model.getRowCount();
//            for (int i = 0; filas > i; i++) {
//                model.removeRow(0);
//            }
//        } catch (Exception e) {
//            System.out.println("Error " + e.getMessage());
//        }
//
//        Processes load = new Processes();
//        ArrayList<Seller> arraySeller = load.getSeller();
//        while (!arraySeller.isEmpty()) {
//            Seller x = arraySeller.remove(0);
//            model.addRow(x.getRow());
//        }
    public EditSellers() {
        initComponents();
                try {
            
            String url = "jdbc:mysql://localhost:3306/tutorialproyecto";
            String usuario = "root";
            String contraseña = "contraseña";  
            
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               conect = DriverManager.getConnection(url,usuario,contraseña);
               if (conect!= null)
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               
               stmt = conect.createStatement();
               ResultSet rs = stmt.executeQuery("select* from usuarios");
               
               model = new DefaultTableModel(null,titulos);
            
               while(rs.next()) {
                   
                   fila[0] = rs.getString("id");
                   fila[1] = rs.getString("nombre");
                   fila[2] = rs.getString("domicilio");
                   fila[3] = rs.getString("telefono");
                   fila[4] = rs.getString("nick");
                   fila[5] = rs.getString("password");
                   fila[6] = rs.getString("tipousuario");
                   
                   model.addRow(fila);     
               }
               tabla_usuarios.setModel(model);
               
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }


// btn consultar  instanciar un objeto de la clase consultaUsuarios

       this.dispose();
        consultaUsuarios cu = new consultaUsuarios();
        cu.setLocationRelativeTo(null);
        cu.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSellers = new javax.swing.JTable();
        buttonShow = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Edit Sellers");
        setPreferredSize(new java.awt.Dimension(1300, 500));

        tableSellers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Correo Electronico", "Nombre Usuario", "Contraseña", "Telefono", "Puesto", "Direccion", "Tipo Usuario"
            }
        ));
        jScrollPane1.setViewportView(tableSellers);

        buttonShow.setText("Show");

        buttonEdit.setText("Edit");

        buttonExit.setText("Exit");

        buttonDelete.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonShow)
                .addGap(210, 210, 210)
                .addComponent(buttonEdit)
                .addGap(177, 177, 177)
                .addComponent(buttonDelete)
                .addGap(154, 154, 154)
                .addComponent(buttonExit)
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonShow)
                    .addComponent(buttonEdit)
                    .addComponent(buttonDelete)
                    .addComponent(buttonExit))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonShow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSellers;
    // End of variables declaration//GEN-END:variables
}
