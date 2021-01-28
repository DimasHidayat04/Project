package Project1;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.List;
public class confirmationForm extends javax.swing.JFrame implements gbBTN
{
    static setgetData obj_sgd = new setgetData();
    String  movie = obj_sgd.getMovie(), qty = obj_sgd.getQty(), time = obj_sgd.getTime(), seat = obj_sgd.getSeat(), theater = obj_sgd.getTheater();
    static List lss;
    public void data(List ls)
    {
        lss=ls;
        ticketingForm tf = new ticketingForm();
        tf.check(ls);
    }
    
    public void confirmationForm() 
    {
        initComponents();
        setLocationRelativeTo(this);
        tf_movie1.setText(movie);
        tf_movie2.setText(movie);
        tf_quantity1.setText(qty);
        tf_quantity2.setText(qty);
        tf_seat1.setText(seat);
        tf_seat2.setText(seat);
        tf_theater1.setText(theater);
        tf_theater2.setText(theater);
        tf_time1.setText(time);
        tf_time2.setText(time);
        LocalDate ld = LocalDate.now();
        tf_date1.setText(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ld));
        tf_date2.setText(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ld));
    
    }    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_confirm = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_movie1 = new javax.swing.JLabel();
        lbl_quantity1 = new javax.swing.JLabel();
        lbl_time1 = new javax.swing.JLabel();
        lbl_seat1 = new javax.swing.JLabel();
        tf_movie1 = new javax.swing.JTextField();
        tf_quantity1 = new javax.swing.JTextField();
        tf_time1 = new javax.swing.JTextField();
        tf_seat1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_theater2 = new javax.swing.JLabel();
        tf_theater2 = new javax.swing.JTextField();
        lbl_date1 = new javax.swing.JLabel();
        tf_date1 = new javax.swing.JTextField();
        lbl_quantity2 = new javax.swing.JLabel();
        tf_quantity2 = new javax.swing.JTextField();
        lbl_movie2 = new javax.swing.JLabel();
        tf_movie2 = new javax.swing.JTextField();
        lbl_theater1 = new javax.swing.JLabel();
        tf_theater1 = new javax.swing.JTextField();
        lbl_time2 = new javax.swing.JLabel();
        tf_time2 = new javax.swing.JTextField();
        lbl_seat2 = new javax.swing.JLabel();
        tf_seat2 = new javax.swing.JTextField();
        lbl_date2 = new javax.swing.JLabel();
        tf_date2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_goback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_confirm.setBackground(new java.awt.Color(255, 255, 255));
        panel_confirm.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));

        lbl_title.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        lbl_title.setText("Ticket");

        lbl_movie1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_movie1.setText("Movie             :");

        lbl_quantity1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_quantity1.setText("Quantity         :");

        lbl_time1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_time1.setText("Time              :");

        lbl_seat1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_seat1.setText("Seat               :");

        tf_movie1.setEditable(false);
        tf_movie1.setBackground(new java.awt.Color(255, 255, 255));
        tf_movie1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_movie1ActionPerformed(evt);
            }
        });
        tf_movie1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_movie1KeyReleased(evt);
            }
        });

        tf_quantity1.setEditable(false);
        tf_quantity1.setBackground(new java.awt.Color(255, 255, 255));
        tf_quantity1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N

        tf_time1.setEditable(false);
        tf_time1.setBackground(new java.awt.Color(255, 255, 255));
        tf_time1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N

        tf_seat1.setEditable(false);
        tf_seat1.setBackground(new java.awt.Color(255, 255, 255));
        tf_seat1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_theater2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_theater2.setText("Theater:");

        tf_theater2.setEditable(false);
        tf_theater2.setBackground(new java.awt.Color(255, 255, 255));
        tf_theater2.setFont(new java.awt.Font("Sylfaen", 1, 96)); // NOI18N
        tf_theater2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_date1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_date1.setText("Date              :");

        tf_date1.setEditable(false);
        tf_date1.setBackground(new java.awt.Color(255, 255, 255));
        tf_date1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_date1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_date1KeyReleased(evt);
            }
        });

        lbl_quantity2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_quantity2.setText("Quantity:");

        tf_quantity2.setEditable(false);
        tf_quantity2.setBackground(new java.awt.Color(255, 255, 255));
        tf_quantity2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_quantity2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_movie2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_movie2.setText("Movie:");

        tf_movie2.setEditable(false);
        tf_movie2.setBackground(new java.awt.Color(255, 255, 255));
        tf_movie2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_movie2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_movie2ActionPerformed(evt);
            }
        });

        lbl_theater1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lbl_theater1.setText("Theater          :");

        tf_theater1.setEditable(false);
        tf_theater1.setBackground(new java.awt.Color(255, 255, 255));
        tf_theater1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_theater1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_theater1ActionPerformed(evt);
            }
        });
        tf_theater1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_theater1KeyReleased(evt);
            }
        });

        lbl_time2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_time2.setText("Time      :");

        tf_time2.setEditable(false);
        tf_time2.setBackground(new java.awt.Color(255, 255, 255));
        tf_time2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_time2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_seat2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_seat2.setText("Seat      :");

        tf_seat2.setEditable(false);
        tf_seat2.setBackground(new java.awt.Color(255, 255, 255));
        tf_seat2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N

        lbl_date2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_date2.setText("Date      :");

        tf_date2.setEditable(false);
        tf_date2.setBackground(new java.awt.Color(255, 255, 255));
        tf_date2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_date2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_date2KeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        btn_goback.setBackground(new java.awt.Color(0, 0, 0));
        btn_goback.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_goback.setForeground(new java.awt.Color(255, 255, 255));
        btn_goback.setText("Go to Ticketing Form");
        btn_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gobackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_confirmLayout = new javax.swing.GroupLayout(panel_confirm);
        panel_confirm.setLayout(panel_confirmLayout);
        panel_confirmLayout.setHorizontalGroup(
            panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_confirmLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title)
                    .addGroup(panel_confirmLayout.createSequentialGroup()
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_seat1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_quantity1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_time1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_date1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_quantity1)
                                    .addComponent(tf_time1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_seat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_confirmLayout.createSequentialGroup()
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_theater1)
                            .addComponent(lbl_movie1))
                        .addGap(35, 35, 35)
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_theater1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_confirmLayout.createSequentialGroup()
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_theater2)
                            .addComponent(tf_movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_confirmLayout.createSequentialGroup()
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_confirmLayout.createSequentialGroup()
                                .addComponent(tf_theater2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_quantity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_time2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_quantity2)
                                    .addComponent(tf_time2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbl_seat2)
                            .addComponent(tf_seat2)
                            .addComponent(lbl_date2)
                            .addComponent(tf_date2))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_confirmLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_goback)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_confirmLayout.setVerticalGroup(
            panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_confirmLayout.createSequentialGroup()
                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_confirmLayout.createSequentialGroup()
                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_confirmLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_movie2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_movie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_theater2)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_confirmLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_theater2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_confirmLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel_confirmLayout.createSequentialGroup()
                                                .addComponent(lbl_quantity2)
                                                .addGap(18, 18, 18)
                                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lbl_time2)
                                                    .addComponent(tf_time2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panel_confirmLayout.createSequentialGroup()
                                                .addComponent(tf_quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)))))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_seat2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_seat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_date2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_confirmLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbl_title)
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_movie1)
                                    .addComponent(tf_movie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_theater1)
                                    .addComponent(tf_theater1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_quantity1)
                                    .addComponent(tf_quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_time1)
                                    .addComponent(tf_time1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_seat1)
                                    .addComponent(tf_seat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_date1)
                                    .addComponent(tf_date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_goback)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_movie1ActionPerformed

    }//GEN-LAST:event_tf_movie1ActionPerformed

    private void tf_movie1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_movie1KeyReleased

    }//GEN-LAST:event_tf_movie1KeyReleased

    private void tf_date1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_date1KeyReleased
        
    }//GEN-LAST:event_tf_date1KeyReleased

    private void tf_movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_movie2ActionPerformed

    }//GEN-LAST:event_tf_movie2ActionPerformed

    private void tf_theater1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_theater1ActionPerformed
 
    }//GEN-LAST:event_tf_theater1ActionPerformed

    private void tf_theater1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_theater1KeyReleased

    }//GEN-LAST:event_tf_theater1KeyReleased

    private void tf_date2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_date2KeyReleased

    }//GEN-LAST:event_tf_date2KeyReleased

    private void btn_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gobackActionPerformed
        goback(lss);
    }//GEN-LAST:event_btn_gobackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_date1;
    private javax.swing.JLabel lbl_date2;
    private javax.swing.JLabel lbl_movie1;
    private javax.swing.JLabel lbl_movie2;
    private javax.swing.JLabel lbl_quantity1;
    private javax.swing.JLabel lbl_quantity2;
    private javax.swing.JLabel lbl_seat1;
    private javax.swing.JLabel lbl_seat2;
    private javax.swing.JLabel lbl_theater1;
    private javax.swing.JLabel lbl_theater2;
    private javax.swing.JLabel lbl_time1;
    private javax.swing.JLabel lbl_time2;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel panel_confirm;
    private javax.swing.JTextField tf_date1;
    private javax.swing.JTextField tf_date2;
    private javax.swing.JTextField tf_movie1;
    private javax.swing.JTextField tf_movie2;
    private javax.swing.JTextField tf_quantity1;
    private javax.swing.JTextField tf_quantity2;
    private javax.swing.JTextField tf_seat1;
    private javax.swing.JTextField tf_seat2;
    private javax.swing.JTextField tf_theater1;
    private javax.swing.JTextField tf_theater2;
    private javax.swing.JTextField tf_time1;
    private javax.swing.JTextField tf_time2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void goback() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void goback(List ls) 
    {
        ticketingForm obj = new ticketingForm();
        obj.setVisible(true);
        obj.check(ls);
        this.setVisible(false);
    }
}
