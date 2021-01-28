package Project1;

import javax.swing.*;
import java.awt.*;

public class loginForm extends javax.swing.JFrame implements rstBTN, nextBTN
{
    String uname;
    int pw;
    
    public loginForm() 
    {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_login = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        lbl_pw = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        tf_uname = new javax.swing.JTextField();
        pwf_pw = new javax.swing.JPasswordField();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_login.setBackground(new java.awt.Color(255, 255, 255));
        panel_login.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));

        lbl_title.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lbl_title.setText("Login here:");

        lbl_uname.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_uname.setText("Username");

        lbl_pw.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_pw.setText("Password");

        btn_reset.setBackground(new java.awt.Color(0, 0, 0));
        btn_reset.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(0, 0, 0));
        btn_login.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        tf_uname.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        tf_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_unameActionPerformed(evt);
            }
        });

        pwf_pw.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        pwf_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwf_pwActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_loginLayout.createSequentialGroup()
                                .addComponent(btn_exit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_reset)
                                .addGap(38, 38, 38)
                                .addComponent(btn_login))
                            .addGroup(panel_loginLayout.createSequentialGroup()
                                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_pw)
                                    .addComponent(lbl_uname))
                                .addGap(56, 56, 56)
                                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_uname)
                                    .addComponent(pwf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lbl_title))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_title)
                .addGap(62, 62, 62)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_uname)
                    .addComponent(tf_uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pw)
                    .addComponent(pwf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_login)
                    .addComponent(btn_exit))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        nextbtn();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        resetbtn();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void tf_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_unameActionPerformed
        
    }//GEN-LAST:event_tf_unameActionPerformed

    private void pwf_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwf_pwActionPerformed
        
    }//GEN-LAST:event_pwf_pwActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel lbl_pw;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPasswordField pwf_pw;
    private javax.swing.JTextField tf_uname;
    // End of variables declaration//GEN-END:variables

    @Override
    public void resetbtn() 
    {
        tf_uname.setText(null);
        pwf_pw.setText(null);
    }

    @Override
    public void nextbtn() 
    {
        try 
        {
            account obj_acc = new account();
            uname = tf_uname.getText();
            pw = Integer.parseInt(pwf_pw.getText());
            if (uname.equals(obj_acc.adminacc(uname)) && pw == obj_acc.adminacc(pw)) 
            {
                mainMenuForm obj_mm = new mainMenuForm();
                obj_mm.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username or Password incorrect!", 
                        "Login Failed.", JOptionPane.INFORMATION_MESSAGE);
                tf_uname.setText("");
                pwf_pw.setText(null);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Password field only accept number.", 
                    "Invalid input.", JOptionPane.INFORMATION_MESSAGE);
            resetbtn();
        }
    }

    @Override
    public void nextbtn(java.util.List ls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class account
{
    public String adminacc(String username)
    {
        username = "admin@gmail.com";
        return username;
    }
    public int adminacc(int password)
    {
        password = 121314;
        return password;
    }
}