/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoga Pratama
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class home_apotek extends javax.swing.JFrame {

    /**
     * Creates new form home_apotek
     */
    DefaultTableModel model;
    public home_apotek() {
        initComponents();
        String [] judul = {"Id Obat","Nama Obat","Harga Obat","Jenis Obat","Jumlah Stok"};
        model = new DefaultTableModel(judul, 0);
        tabel_apotek.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnamaobat = new javax.swing.JTextField();
        jhargaobat = new javax.swing.JTextField();
        jjenisobat = new javax.swing.JComboBox<>();
        jjmlstok = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_apotek = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jidobat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APOTEK SEHAT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nama Obat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 102, 72, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Harga Obat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 143, 72, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Obat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 184, 72, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah Stok");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 225, 72, -1));

        jnamaobat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jnamaobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnamaobatActionPerformed(evt);
            }
        });
        getContentPane().add(jnamaobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 99, 160, -1));

        jhargaobat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jhargaobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 68, -1));

        jjenisobat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jjenisobat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "Sirup", "Tablet", "Kapsul", "Serbuk" }));
        jjenisobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjenisobatActionPerformed(evt);
            }
        });
        getContentPane().add(jjenisobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 181, -1, -1));

        jjmlstok.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jjmlstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 222, 68, -1));

        btntambah.setBackground(new java.awt.Color(255, 255, 0));
        btntambah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 271, -1, -1));

        btnedit.setBackground(new java.awt.Color(255, 255, 0));
        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
        });
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 271, 62, -1));

        btnhapus.setBackground(new java.awt.Color(255, 255, 0));
        btnhapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 271, -1, -1));

        btnreset.setBackground(new java.awt.Color(255, 255, 0));
        btnreset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 271, -1, -1));

        tabel_apotek.setBackground(new java.awt.Color(255, 255, 0));
        tabel_apotek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_apotek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_apotekMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_apotek);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 313, -1, 167));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Id Obat");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 62, -1, -1));
        getContentPane().add(jidobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 59, 67, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jjenisobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjenisobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jjenisobatActionPerformed

    private void jnamaobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnamaobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnamaobatActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            // TODO add your handling code here:
            String jenisobt = jjenisobat.getSelectedItem().toString();
            if (jenisobt.equals("Silahkan Pilih")){
                JOptionPane.showMessageDialog(null,"Jenis obat belum dipilih!");
            } else {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotek","root","");
            cn.createStatement().executeUpdate("INSERT INTO obat VALUES('"+jidobat.getText()+"','"+jnamaobat.getText()+"','"+jhargaobat.getText()+"','"+jjenisobat.getSelectedItem()+"','"+jjmlstok.getText()+"')");
            tampilkan();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(home_apotek.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ada data yang belum kamu isi!");
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotek","root","");
            cn.createStatement().executeUpdate("UPDATE obat SET id_obat='"+jidobat.getText()+"',nama_obat='"+jnamaobat.getText()+"',harga_obat='"+jhargaobat.getText()+"',jenis_obat='"+jjenisobat.getSelectedItem()+"',jml_stok='"+jjmlstok.getText()+"' WHERE id_obat='"+jidobat.getText()+"'");
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(home_apotek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void tabel_apotekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_apotekMouseClicked
        // TODO add your handling code here:
        int i = tabel_apotek.getSelectedRow();
        if (i > -1){
            jidobat.setText(model.getValueAt(i, 0).toString());
            jnamaobat.setText(model.getValueAt(i, 1).toString());
            jhargaobat.setText(model.getValueAt(i, 2).toString());
            jjenisobat.setSelectedItem(model.getValueAt(i, 3).toString());
            jjmlstok.setText(model.getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_tabel_apotekMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotek","root","");
            cn.createStatement().executeUpdate("DELETE from obat WHERE id_obat='"+jidobat.getText()+"'");
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(home_apotek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditMouseClicked

private void reset()  {
    jidobat.setText("");
    jnamaobat.setText("");
    jhargaobat.setText("");
    jjenisobat.setSelectedItem("Silahkan Pilih");
    jjmlstok.setText("");
    
}  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_apotek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jhargaobat;
    private javax.swing.JTextField jidobat;
    private javax.swing.JComboBox<String> jjenisobat;
    private javax.swing.JTextField jjmlstok;
    private javax.swing.JTextField jnamaobat;
    private javax.swing.JTable tabel_apotek;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int row = tabel_apotek.getRowCount();
        for(int a = 0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotek","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM obat");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(home_apotek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
