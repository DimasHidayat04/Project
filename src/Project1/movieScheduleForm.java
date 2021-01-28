package Project1;

import java.util.List;

public class movieScheduleForm extends javax.swing.JFrame implements gbBTN
{

    public movieScheduleForm() 
    {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_mm = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        btn_goback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_theater1 = new javax.swing.JLabel();
        lbl_movie3 = new javax.swing.JLabel();
        lbl_price1 = new javax.swing.JLabel();
        lbl_time1 = new javax.swing.JLabel();
        lbl_time2 = new javax.swing.JLabel();
        lbl_time3 = new javax.swing.JLabel();
        lbl_image1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_theater2 = new javax.swing.JLabel();
        lbl_movie4 = new javax.swing.JLabel();
        lbl_price2 = new javax.swing.JLabel();
        lbl_time4 = new javax.swing.JLabel();
        lbl_time5 = new javax.swing.JLabel();
        lbl_time6 = new javax.swing.JLabel();
        lbl_image2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_mm.setBackground(new java.awt.Color(255, 255, 255));
        panel_mm.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));

        lbl_title.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        lbl_title.setText("Movie Schedule");

        btn_goback.setBackground(new java.awt.Color(0, 0, 0));
        btn_goback.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btn_goback.setForeground(new java.awt.Color(255, 255, 255));
        btn_goback.setText("Go Back");
        btn_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gobackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        lbl_theater1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_theater1.setText("Theater 1");

        lbl_movie3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_movie3.setText("Harry Potter and the Half Blood Prince");

        lbl_price1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbl_price1.setText("IDR 55.000,00");

        lbl_time1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_time1.setText("12.30");

        lbl_time2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_time2.setText("15.30");

        lbl_time3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_time3.setText("19.00");

        lbl_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MHZOrgX8xGn8VXV8k0zVwiQxRdt.jpg"))); // NOI18N
        lbl_image1.setMaximumSize(new java.awt.Dimension(220, 326));
        lbl_image1.setPreferredSize(new java.awt.Dimension(220, 326));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_time1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_time2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_time3))
                    .addComponent(lbl_movie3)
                    .addComponent(lbl_theater1))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_theater1)
                .addGap(38, 38, 38)
                .addComponent(lbl_movie3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_price1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_time1)
                    .addComponent(lbl_time2)
                    .addComponent(lbl_time3))
                .addGap(42, 42, 42))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(508, 243));

        lbl_theater2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_theater2.setText("Theater 2");

        lbl_movie4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_movie4.setText("Avengers : End Game");

        lbl_price2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbl_price2.setText("IDR 55.000,00");

        lbl_time4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_time4.setText("12.30");

        lbl_time5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_time5.setText("15.30");

        lbl_time6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_time6.setText("19.00");

        lbl_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Avengers_Endgame_poster.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image2)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_theater2)
                    .addComponent(lbl_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_time4)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_time5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_time6))
                    .addComponent(lbl_movie4))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_image2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_theater2)
                        .addGap(33, 33, 33)
                        .addComponent(lbl_movie4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_price2)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_time4)
                            .addComponent(lbl_time5)
                            .addComponent(lbl_time6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_mmLayout = new javax.swing.GroupLayout(panel_mm);
        panel_mm.setLayout(panel_mmLayout);
        panel_mmLayout.setHorizontalGroup(
            panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mmLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lbl_title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mmLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_mmLayout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mmLayout.createSequentialGroup()
                        .addComponent(btn_goback)
                        .addContainerGap())))
        );
        panel_mmLayout.setVerticalGroup(
            panel_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btn_goback)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gobackActionPerformed
        goback();
    }//GEN-LAST:event_btn_gobackActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_image1;
    private javax.swing.JLabel lbl_image2;
    private javax.swing.JLabel lbl_movie3;
    private javax.swing.JLabel lbl_movie4;
    private javax.swing.JLabel lbl_price1;
    private javax.swing.JLabel lbl_price2;
    private javax.swing.JLabel lbl_theater1;
    private javax.swing.JLabel lbl_theater2;
    private javax.swing.JLabel lbl_time1;
    private javax.swing.JLabel lbl_time2;
    private javax.swing.JLabel lbl_time3;
    private javax.swing.JLabel lbl_time4;
    private javax.swing.JLabel lbl_time5;
    private javax.swing.JLabel lbl_time6;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel panel_mm;
    // End of variables declaration//GEN-END:variables

    @Override
    public void goback() 
    {
        mainMenuForm obj_mame = new mainMenuForm();
        obj_mame.setVisible(true);
        this.setVisible(false);
    }

    @Override
    public void goback(List ls) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
