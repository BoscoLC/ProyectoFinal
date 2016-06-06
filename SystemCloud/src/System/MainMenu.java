package System;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSellers = new javax.swing.JMenu();
        itemAddSeller = new javax.swing.JMenuItem();
        itemEditSeller = new javax.swing.JMenuItem();
        menuItems = new javax.swing.JMenu();
        menuClients = new javax.swing.JMenu();
        menuReports = new javax.swing.JMenu();
        menuSupplier = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        menuSellers.setText("Sellers");
        menuSellers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSellersActionPerformed(evt);
            }
        });

        itemAddSeller.setText("Add Seller");
        itemAddSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddSellerActionPerformed(evt);
            }
        });
        menuSellers.add(itemAddSeller);

        itemEditSeller.setText("Edit Seller");
        itemEditSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditSellerActionPerformed(evt);
            }
        });
        menuSellers.add(itemEditSeller);

        jMenuBar1.add(menuSellers);

        menuItems.setText("Items");
        jMenuBar1.add(menuItems);

        menuClients.setText("Clients");
        jMenuBar1.add(menuClients);

        menuReports.setText("Reports");
        jMenuBar1.add(menuReports);

        menuSupplier.setText("Supplier");
        jMenuBar1.add(menuSupplier);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void itemAddSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddSellerActionPerformed
        AddSellers objAdd = new AddSellers();
        desktop.add(objAdd);
        objAdd.setVisible(true);
    }//GEN-LAST:event_itemAddSellerActionPerformed
    private void itemEditSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditSellerActionPerformed
        EditSellers objEdit = new EditSellers();
        desktop.add(objEdit);
        objEdit.setVisible(true);
    }//GEN-LAST:event_itemEditSellerActionPerformed
    private void menuSellersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSellersActionPerformed
    }//GEN-LAST:event_menuSellersActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemAddSeller;
    private javax.swing.JMenuItem itemEditSeller;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuClients;
    private javax.swing.JMenu menuItems;
    private javax.swing.JMenu menuReports;
    private javax.swing.JMenu menuSellers;
    private javax.swing.JMenu menuSupplier;
    // End of variables declaration//GEN-END:variables
}
