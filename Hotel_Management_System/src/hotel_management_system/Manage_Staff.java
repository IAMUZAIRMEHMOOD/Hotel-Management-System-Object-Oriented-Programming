/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import Classes.Staff;
import java.util.ArrayList;

/**
 *
 * @author Uzair
 */
public class Manage_Staff extends javax.swing.JFrame {
  public static ArrayList<Staff> staff = new ArrayList<Staff>();
    /**
     * Creates new form Manage_Staff
     */
    public Manage_Staff() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manage_staff_See = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manage_staff_add = new javax.swing.JButton();
        manage_staff_See1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manage_staff_See.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manage_staff_See.setForeground(new java.awt.Color(24, 44, 97));
        manage_staff_See.setText("See Staff");
        manage_staff_See.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_staff_SeeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("Manage Staff");

        manage_staff_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manage_staff_add.setForeground(new java.awt.Color(24, 44, 97));
        manage_staff_add.setText("Add Staff");
        manage_staff_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_staff_addActionPerformed(evt);
            }
        });

        manage_staff_See1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manage_staff_See1.setForeground(new java.awt.Color(24, 44, 97));
        manage_staff_See1.setText("Exit");
        manage_staff_See1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_staff_See1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manage_staff_See1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_staff_See, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_staff_add, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(manage_staff_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manage_staff_See, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(manage_staff_See1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manage_staff_SeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_staff_SeeActionPerformed
      for (Staff st : staff) 
        {
        System.out.println(st.getName());
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_manage_staff_SeeActionPerformed

    private void manage_staff_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_staff_addActionPerformed
Add_Staff addstaff = new Add_Staff(staff);
addstaff.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_manage_staff_addActionPerformed

    private void manage_staff_See1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_staff_See1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_manage_staff_See1ActionPerformed

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
            java.util.logging.Logger.getLogger(Manage_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manage_staff_See;
    private javax.swing.JButton manage_staff_See1;
    private javax.swing.JButton manage_staff_add;
    // End of variables declaration//GEN-END:variables
}
