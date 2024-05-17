/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spicycafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pasindu
 */
public class addUser extends javax.swing.JFrame {

    private DefaultTableModel usertblmodel;

    /**
     * Creates new form addUser
     */
    public addUser(DefaultTableModel tblmodel) {
        usertblmodel = tblmodel;
        initComponents();
    }

    private addUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passWordField = new javax.swing.JTextField();
        addUserBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jobrollDropDown = new javax.swing.JComboBox<>();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add User");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 234, 228));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("First Name :");

        firstNameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Last Name :");

        lastNameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Job Roll");

        userIdField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("User ID :");

        passWordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        addUserBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cancelBtn.setText("cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jobrollDropDown.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jobrollDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chashier", "accountant", "exe_chef", "manager" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passWordField)
                            .addComponent(userIdField)
                            .addComponent(lastNameField)
                            .addComponent(jobrollDropDown, 0, 282, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addUserBtn)
                .addGap(34, 34, 34)
                .addComponent(resetBtn)
                .addGap(34, 34, 34)
                .addComponent(cancelBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jobrollDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(resetBtn)
                    .addComponent(addUserBtn))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        firstNameField.setText("");
        lastNameField.setText("");
        userIdField.setText("");
        passWordField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
       String firstName = firstNameField.getText();
       String lastname = lastNameField.getText();
       String jobRoll = (String) jobrollDropDown.getSelectedItem();
       String userId = userIdField.getText();
       String passWord = passWordField.getText();
       
       if (firstName.isEmpty() || lastname.isEmpty()||userId.isEmpty()||passWord.isEmpty()){
           JOptionPane.showMessageDialog(this, "Error! Please Fill The Datails Correctly.");
       }
       else{
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spicycafedb", "root", "");
            String s = "insert into users (first_name,last_name,user_id,password,job_roll) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, firstName);
            ps.setString(2, lastname);
            ps.setString(3, userId);
            ps.setString(4, passWord);
            ps.setString(5, jobRoll);
            System.out.println(ps);
            ps.execute();
            JOptionPane.showMessageDialog(this, "User Added Sucessfully");
            
//            refresh TAble DATA

            usertblmodel.setRowCount(0);
            String s2 = "select * from users";
            PreparedStatement ps2 = con.prepareStatement(s2);
            ResultSet rs2 = ps2.executeQuery();
            
           
            
            while(rs2.next()){
                String firstName1 = rs2.getString("first_name");
                String lastName1 = rs2.getString("last_name");
                String userId1 = rs2.getString("user_id");
                String jobRoll1 = rs2.getString("job_roll");
                String lastLogInDate1 = rs2.getString("last_log_in_date");
                String lastLogInTime1 = rs2.getString("last_log_in_time");
                
                String tableRowData[] = {firstName1,lastName1,userId1,jobRoll1,lastLogInDate1,lastLogInTime1};
                
                usertblmodel.addRow(tableRowData);
            }


//            Refresh TAble Data
            
            con.close();
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            System.out.println(e);
        }
       }
    }//GEN-LAST:event_addUserBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jobrollDropDown;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField passWordField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField userIdField;
    // End of variables declaration//GEN-END:variables
}