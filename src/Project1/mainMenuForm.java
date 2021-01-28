package Project1;

import java.util.List;

public class mainMenuForm extends javax.swing.JFrame implements gbBTN
{
    public mainMenuForm() 
    {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_mm = new javax.swing.JPanel();
        btn_ticketing = new javax.swing.JButton();
        btn_ms = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_mm.setBackground(new java.awt.Color(255, 255, 255));
        panel_mm.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));

        btn_ticketing.setBackground(new java.awt.Color(0, 0, 0));
        btn_ticketing.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        btn_ticketing.setForeground(new java.awt.Color(255, 255, 255));
        btn_ticketing.setText("Order Ticket");
        btn_ticketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ticketingActionPerformed(evt);
            }
        });

        btn_ms.setBackground(new java.awt.Color(0, 0, 0));
        btn_ms.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        btn_ms.setForeground(new java.awt.Color(255, 255, 255));
        btn_ms.setText("Movie Schedule");
        btn_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_msActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Log out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_mmLayout = new javax.swing.GroupLayout(panel_mm);
        panel_mm.setLayout(panel_mmLayout);
        panel_mmLayout.setHorizontalGroup(
            panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mmLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ticketing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ms))
                .addGap(89, 89, 89))
        );
        panel_mmLayout.setVerticalGroup(
            panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mmLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btn_ticketing)
                .addGap(34, 34, 34)
                .addComponent(btn_ms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_mm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_mm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ticketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ticketingActionPerformed
        ticform obj_tf = new ticform();
        obj_tf.totf();
        this.setVisible(false);
    }//GEN-LAST:event_btn_ticketingActionPerformed

    private void btn_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_msActionPerformed
        ms obj_ms = new ms();
        obj_ms.toms();
        this.setVisible(false);
    }//GEN-LAST:event_btn_msActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        goback();
    }//GEN-LAST:event_btn_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_ms;
    private javax.swing.JButton btn_ticketing;
    private javax.swing.JPanel panel_mm;
    // End of variables declaration//GEN-END:variables

    @Override
    public void goback() 
    {
        loginForm obj_lf = new loginForm();
        obj_lf.setVisible(true);
        this.setVisible(false);
    }

    @Override
    public void goback(List ls) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class ticform
{
    ticketingForm obj_tf = new ticketingForm();
    movieScheduleForm obj_ms = new movieScheduleForm();
    public void totf()
    {
        obj_tf.setVisible(true);
    }
}

class ms extends ticform
{
    public void toms()
    {
        obj_ms.setVisible(true);
    }
}