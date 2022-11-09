/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author veena
 */
import Code.DbConnection;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.sql.*;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class dev extends javax.swing.JFrame {

    /**
     * Creates new form dev
     */
    Connection con = null;    
    PreparedStatement pst = null;
    ResultSet rs= null;
        
    String dev[];
    
    public dev() {
        initComponents();
        
         con = DbConnection.connect();
     
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(13, 169, 169));
        jButton1.setText("Human Resource Department");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jPanel2.add(jButton1);
        jButton1.setBounds(8, 33, 203, 45);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(13, 169, 169));
        jButton2.setText("Business analysis");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jPanel2.add(jButton2);
        jButton2.setBounds(8, 90, 203, 45);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(13, 169, 169));
        jButton3.setText("Development");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jPanel2.add(jButton3);
        jButton3.setBounds(8, 147, 203, 45);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(13, 169, 169));
        jButton4.setText("Quality assurance");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 210, 203, 45);

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "did", "name", "report"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(330, 170, 420, 180);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(13, 169, 169));
        jButton6.setText("Upload");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(540, 70, 90, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(650, 70, 240, 40);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(13, 169, 169));
        jButton7.setText("Enter");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(770, 190, 100, 30);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 153, 255));
        jTextField1.setText("  ");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(420, 70, 90, 40);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(13, 169, 169));
        jButton8.setText("View");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(770, 240, 100, 30);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(13, 169, 169));
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(770, 290, 100, 30);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 153, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(420, 20, 330, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 169, 169));
        jLabel2.setText("Type ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(330, 80, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 169, 169));
        jLabel3.setText("Search");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(330, 20, 70, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 130, 930, 380);

        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/telicom.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 220, 130);

        jLabel5.setBackground(new java.awt.Color(102, 0, 204));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 0, 710, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f=chooser.getSelectedFile();
        
        filename=f.getAbsolutePath();
        jLabel1.setText(filename);
        
        try{
            File report1= new File(filename);
            FileInputStream fis=new FileInputStream(report1);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            
            byte[]buf=new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
        
                bos.write(buf,0,readNum);

            }
            
            report=bos.toByteArray();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

  
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{

            String querry ="INSERT INTO dev1 VALUES(?,?,?)";

            PreparedStatement pst = con.prepareStatement(querry);

            pst.setString(1, jTextField1.getText());
            pst.setString(2, jLabel1.getText());
            pst.setBytes(3, report);

            pst.execute();

            JOptionPane.showMessageDialog(null, "saved");

            
            pst.close();
            
            jTextField1.setText("");
            jLabel1.setText("");
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM dev1";
            
        try {
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
           DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
           model.setRowCount(0);
           while(rs.next()){
               
               Object o[]={rs.getInt("did"),rs.getString("name"),rs.getString("report")};
              // model.addRow(new String[]{rs.getString(1)rs.getString(2),rs.getString(3)});
              
              model.addRow(o);
           }
               
               
           }catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        int row=jTable1.getSelectedRow();
        String cell=jTable1.getModel().getValueAt(row,0).toString();
        String sql="delete from dev1 where did="+cell;
        
        try{
            pst=con.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "deleted");
            
            pst.close();
        }catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
         
            //pst = con.prepareStatement(sql);
            //rs = pst.executeQuery();
       // String name=jTextField2.getText();
        DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new  TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField2.getText().trim()));
        
        
        //ResultSet rs=DBHelper.getData(name);
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(dev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dev().setVisible(true);
            }
        });
    }
    
    byte[] report=null;
String filename=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

