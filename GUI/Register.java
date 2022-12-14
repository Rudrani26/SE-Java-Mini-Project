
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.logging.Level;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rudra
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        RegisterPanel = new javax.swing.JPanel();
        RegisterLabel = new javax.swing.JLabel();
        ContentPanel2 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        setpass = new javax.swing.JLabel();
        regbutton = new javax.swing.JButton();
        emailtf = new javax.swing.JTextField();
        setpasstf = new javax.swing.JPasswordField();
        conpass = new javax.swing.JLabel();
        conpasstf = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        reguname1 = new javax.swing.JLabel();
        regnametf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(208, 0, 0));

        RegisterPanel.setBackground(new java.awt.Color(3, 7, 30));

        RegisterLabel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        RegisterLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLabel.setText("REGISTRATION");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(RegisterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ContentPanel2.setBackground(new java.awt.Color(33, 158, 188));
        ContentPanel2.setPreferredSize(new java.awt.Dimension(0, 400));

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("EMAIL ID");

        setpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setpass.setForeground(new java.awt.Color(255, 255, 255));
        setpass.setText("SET PASSWORD");

        regbutton.setBackground(new java.awt.Color(3, 7, 30));
        regbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regbutton.setForeground(new java.awt.Color(255, 183, 3));
        regbutton.setText("Register");
        regbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbuttonActionPerformed(evt);
            }
        });

        emailtf.setBackground(new java.awt.Color(0, 0, 0));
        emailtf.setForeground(new java.awt.Color(255, 255, 255));

        setpasstf.setBackground(new java.awt.Color(0, 0, 0));
        setpasstf.setForeground(new java.awt.Color(255, 255, 255));
        setpasstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpasstfActionPerformed(evt);
            }
        });

        conpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conpass.setForeground(new java.awt.Color(255, 255, 255));
        conpass.setText("CONFIRM PASSWORD");

        conpasstf.setBackground(new java.awt.Color(0, 0, 0));
        conpasstf.setForeground(new java.awt.Color(255, 255, 255));
        conpasstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpasstfActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 183, 3));
        cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(3, 7, 30));
        cancel.setText("Back to Login");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        reguname1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reguname1.setForeground(new java.awt.Color(255, 255, 255));
        reguname1.setText("USERNAME");

        regnametf1.setBackground(new java.awt.Color(0, 0, 0));
        regnametf1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentPanel2Layout = new javax.swing.GroupLayout(ContentPanel2);
        ContentPanel2.setLayout(ContentPanel2Layout);
        ContentPanel2Layout.setHorizontalGroup(
            ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email)
                    .addComponent(setpass)
                    .addComponent(conpass)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reguname1))
                .addGap(39, 39, 39)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(setpasstf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(conpasstf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regnametf1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        ContentPanel2Layout.setVerticalGroup(
            ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reguname1)
                    .addComponent(regnametf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setpasstf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conpasstf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbuttonActionPerformed
        // TODO add your handling code here:
        String regemail = emailtf.getText();
        String regname = regnametf1.getText();
        String regpass = String.valueOf(setpasstf.getPassword());
        String regconpass = String.valueOf(conpasstf.getPassword());
        
        PreparedStatement ps;
        String query = "INSERT INTO account (emailid, username, password , conpassword ) VALUES(?,?,?,?)";
        
        try {
           
            ps = DBConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, regemail);
            ps.setString(2, regname);
            ps.setString(3, regpass);
            ps.setString(4, regconpass);
            
            if(regemail.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Enter Email ID");
            }
            else if (regname.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Enter Username");
            }
            else if (regpass.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Enter Password");
            }
            else if (!regpass.equals(regconpass))
            {
               JOptionPane.showMessageDialog(null, "Password does not match");
            }
            
            else if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "New User Added");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_regbuttonActionPerformed

    private void setpasstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setpasstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setpasstfActionPerformed

    private void conpasstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpasstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpasstfActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);

    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel2;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel conpass;
    private javax.swing.JPasswordField conpasstf;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton regbutton;
    private javax.swing.JTextField regnametf1;
    private javax.swing.JLabel reguname1;
    private javax.swing.JLabel setpass;
    private javax.swing.JPasswordField setpasstf;
    // End of variables declaration//GEN-END:variables
}

