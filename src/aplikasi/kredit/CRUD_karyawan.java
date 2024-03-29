/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.kredit;

import java.awt.HeadlessException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sigma
 */
public class CRUD_karyawan extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_karyawan
     */
    
    String vpassword;
    String vmd5;
    String txtMD5;
    
    public CRUD_karyawan() {
        initComponents();
        show_data();
        form_kosong();
    }
    
    private String encryptPasswordMD5(){
        vpassword=input_password.getText();
        String encPass=null;
        try{
           MessageDigest digest=MessageDigest.getInstance("MD5");
           digest.update(vpassword.getBytes(),0,vpassword.length());
           encPass=new BigInteger(1,digest.digest()).toString(16);
           vmd5=encPass.toUpperCase();
        }
        catch(Exception e){
           e.printStackTrace();
        }
          return encPass;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txt_nik = new javax.swing.JLabel();
        input_nik = new javax.swing.JTextField();
        txt_nama = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        txt_password = new javax.swing.JLabel();
        input_password = new javax.swing.JPasswordField();
        txt_notelepon = new javax.swing.JLabel();
        input_notelepon = new javax.swing.JTextField();
        txt_email = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_alamat = new javax.swing.JTextArea();
        txt_jabatan = new javax.swing.JLabel();
        input_jabatan = new javax.swing.JTextField();
        txt_status = new javax.swing.JLabel();
        input_status = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_homepage = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nik.setText("NIK");
        jPanel1.add(txt_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 30));

        input_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nikActionPerformed(evt);
            }
        });
        jPanel1.add(input_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 330, -1));

        txt_nama.setText("Nama");
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 30));

        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });
        jPanel1.add(input_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, 28));

        txt_password.setText("Password");
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, 30));
        jPanel1.add(input_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 330, -1));

        txt_notelepon.setText("No Telepon");
        jPanel1.add(txt_notelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 110, 30));

        input_notelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_noteleponActionPerformed(evt);
            }
        });
        jPanel1.add(input_notelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 330, 30));

        txt_email.setText("Email");
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 220, 30));

        input_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_emailActionPerformed(evt);
            }
        });
        jPanel1.add(input_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 330, -1));

        txt_alamat.setText("Alamat");
        jPanel1.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, 40));

        input_alamat.setColumns(20);
        input_alamat.setRows(5);
        jScrollPane1.setViewportView(input_alamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 330, 58));

        txt_jabatan.setText("Jabatan");
        jPanel1.add(txt_jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, 30));

        input_jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jabatanActionPerformed(evt);
            }
        });
        jPanel1.add(input_jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 330, -1));

        txt_status.setText("Status");
        jPanel1.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, 30));

        input_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_statusActionPerformed(evt);
            }
        });
        jPanel1.add(input_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 330, -1));

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 140, 30));

        btn_edit.setText("EDIT");
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 30));

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA KARYAWAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 44));

        btn_homepage.setText("Back Homepage");
        btn_homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homepageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 160, 30));

        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "NIK", "Nama", "No Telepon", "Email", "Alamat", "Jabatan", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_data);
        if (table_data.getColumnModel().getColumnCount() > 0) {
            table_data.getColumnModel().getColumn(0).setResizable(false);
            table_data.getColumnModel().getColumn(1).setResizable(false);
            table_data.getColumnModel().getColumn(2).setResizable(false);
            table_data.getColumnModel().getColumn(3).setResizable(false);
            table_data.getColumnModel().getColumn(4).setResizable(false);
            table_data.getColumnModel().getColumn(5).setResizable(false);
            table_data.getColumnModel().getColumn(6).setResizable(false);
            table_data.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 920, 150));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaActionPerformed

    private void input_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nikActionPerformed

    private void input_noteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_noteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_noteleponActionPerformed

    private void input_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_emailActionPerformed

    private void input_jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jabatanActionPerformed

    private void input_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_statusActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
            // TODO add your handling code here:
        try {
            String sql = "INSERT INTO karyawan (`NIK`, `nama`, `password`, `no_telepon`, `email`, `alamat`, `jabatan`, `status`) VALUES ('"+input_nik.getText()+"','"+input_nama.getText()+"','"+encryptPasswordMD5()+"','"+input_notelepon.getText()+"','"+input_email.getText()+"','"+input_alamat.getText()+"','"+input_jabatan.getText()+"','"+input_status.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        show_data();
        form_kosong();
    }//GEN-LAST:event_btn_submitActionPerformed

    private void table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dataMouseClicked
        int baris = table_data.rowAtPoint(evt.getPoint());
        String NIK = table_data.getValueAt(baris, 1).toString();
        input_nik.setText(NIK);
        input_nik.setEnabled(false);
        String nama = table_data.getValueAt(baris, 2).toString();
        input_nama.setText(nama);
        String no_telepon = table_data.getValueAt(baris, 3).toString();
        input_notelepon.setText(no_telepon);
        String email = table_data.getValueAt(baris, 4).toString();
        input_email.setText(email);
        String alamat = table_data.getValueAt(baris, 5).toString();
        input_alamat.setText(alamat);
        String jabatan = table_data.getValueAt(baris, 6).toString();
        input_jabatan.setText(jabatan);
        String status = table_data.getValueAt(baris, 7).toString();
        input_status.setText(status);
    }//GEN-LAST:event_table_dataMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            String sql ="UPDATE karyawan SET nama = '"+input_nama.getText()+"', password = '"+encryptPasswordMD5()+"', no_telepon = '"+input_notelepon.getText()+"', email = '"+input_email.getText()+"', alamat = '"+input_alamat.getText()+"', jabatan = '"+input_jabatan.getText()+"', status = '"+input_status.getText()+"' WHERE NIK = '"+input_nik.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        show_data();
        form_kosong();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="delete from karyawan where NIK='"+input_nik.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        show_data();
        form_kosong();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        //
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_homepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homepageActionPerformed
        // TODO add your handling code here:
        Homepage homepage = new Homepage();
        homepage.show();
        
        dispose();
    }//GEN-LAST:event_btn_homepageActionPerformed

    private void show_data(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("No Telepon");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Jabatan");
        model.addColumn("Status");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "SELECT `NIK`,`nama`,`no_telepon`,`email`,`alamat`,`jabatan`,`status` FROM karyawan";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            table_data.setModel(model);
            System.out.print(model);
        } catch (Exception e) {
        }
    }
    
    private void form_kosong() {
        input_nik.setText(null);
        input_nik.setEnabled(true);
        input_nama.setText(null);
        input_notelepon.setText(null);
        input_jabatan.setText(null);
        input_email.setText(null);
        input_password.setText(null);
        input_status.setText(null);
        input_alamat.setText(null);
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
            java.util.logging.Logger.getLogger(CRUD_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_homepage;
    private javax.swing.JButton btn_submit;
    private javax.swing.JTextArea input_alamat;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_jabatan;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_nik;
    private javax.swing.JTextField input_notelepon;
    private javax.swing.JPasswordField input_password;
    private javax.swing.JTextField input_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_data;
    private javax.swing.JLabel txt_alamat;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_jabatan;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_nik;
    private javax.swing.JLabel txt_notelepon;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_status;
    // End of variables declaration//GEN-END:variables
}
