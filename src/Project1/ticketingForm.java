package Project1;
import static Project1.ticketingForm.obj_sgd;
import javax.swing.*;

import java.util.*;
public class ticketingForm extends javax.swing.JFrame implements gbBTN, rstBTN, nextBTN
{
    private String time, movie, tp, seat="", qty, theater, cm;

    private double totalprice, price = 55000, change, cash, quantity, theaterno;

    static setgetData obj_sgd = new setgetData();
    List list = new ArrayList<>();
    
    public ticketingForm() 
    {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngr_time = new javax.swing.ButtonGroup();
        panel_ticket = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_movie = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_seat = new javax.swing.JLabel();
        comb_movie = new javax.swing.JComboBox<>();
        rb_time1 = new javax.swing.JRadioButton();
        rb_time2 = new javax.swing.JRadioButton();
        rb_time3 = new javax.swing.JRadioButton();
        btn_reset = new javax.swing.JButton();
        btn_goback = new javax.swing.JButton();
        tf_quantity = new javax.swing.JTextField();
        panel_od = new javax.swing.JPanel();
        lbl_od = new javax.swing.JLabel();
        lbl_odmovie = new javax.swing.JLabel();
        lbl_odquantity = new javax.swing.JLabel();
        lbl_odtime = new javax.swing.JLabel();
        lbl_odseat = new javax.swing.JLabel();
        btn_pt = new javax.swing.JButton();
        tf_odmovie = new javax.swing.JTextField();
        tf_odquantity = new javax.swing.JTextField();
        tf_odtime = new javax.swing.JTextField();
        tf_odseat = new javax.swing.JTextField();
        lbl_odtp = new javax.swing.JLabel();
        tf_odtp = new javax.swing.JTextField();
        lbl_odcash = new javax.swing.JLabel();
        tf_odcash = new javax.swing.JTextField();
        lbl_odcm = new javax.swing.JLabel();
        tf_odcm = new javax.swing.JTextField();
        cb_seatA1 = new javax.swing.JCheckBox();
        cb_seatA2 = new javax.swing.JCheckBox();
        cb_seatA3 = new javax.swing.JCheckBox();
        cb_seatA4 = new javax.swing.JCheckBox();
        cb_seatA5 = new javax.swing.JCheckBox();
        cb_seatB5 = new javax.swing.JCheckBox();
        cb_seatB4 = new javax.swing.JCheckBox();
        cb_seatB3 = new javax.swing.JCheckBox();
        cb_seatB2 = new javax.swing.JCheckBox();
        cb_seatB1 = new javax.swing.JCheckBox();
        cb_seatC1 = new javax.swing.JCheckBox();
        cb_seatC2 = new javax.swing.JCheckBox();
        cb_seatC3 = new javax.swing.JCheckBox();
        cb_seatC4 = new javax.swing.JCheckBox();
        cb_seatC5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_ticket.setBackground(new java.awt.Color(255, 255, 255));
        panel_ticket.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));

        lbl_title.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        lbl_title.setText("Ticketing");

        lbl_movie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_movie.setText("Movie");

        lbl_quantity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_quantity.setText("Quantity");

        lbl_time.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_time.setText("Time");

        lbl_seat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_seat.setText("Select the seat");

        comb_movie.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        comb_movie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Choose Movie---", "Harry Potter and the Half Blood Prince", "Avengers : End Game" }));
        comb_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_movieActionPerformed(evt);
            }
        });

        btngr_time.add(rb_time1);
        rb_time1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        rb_time1.setText("12.30");
        rb_time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_time1ActionPerformed(evt);
            }
        });

        btngr_time.add(rb_time2);
        rb_time2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        rb_time2.setText("15.30");
        rb_time2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_time2ActionPerformed(evt);
            }
        });

        btngr_time.add(rb_time3);
        rb_time3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        rb_time3.setText("19.00");
        rb_time3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_time3ActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(0, 0, 0));
        btn_reset.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset Selection");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_goback.setBackground(new java.awt.Color(0, 0, 0));
        btn_goback.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_goback.setForeground(new java.awt.Color(255, 255, 255));
        btn_goback.setText("Go Back");
        btn_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gobackActionPerformed(evt);
            }
        });

        tf_quantity.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantityActionPerformed(evt);
            }
        });
        tf_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_quantityKeyReleased(evt);
            }
        });

        panel_od.setBackground(new java.awt.Color(255, 255, 255));
        panel_od.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 0, 0, new java.awt.Color(0, 0, 0)));

        lbl_od.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        lbl_od.setText("Order Details");

        lbl_odmovie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odmovie.setText("Movie");

        lbl_odquantity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odquantity.setText("Quantity");

        lbl_odtime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odtime.setText("Time");

        lbl_odseat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odseat.setText("Seat");

        btn_pt.setBackground(new java.awt.Color(0, 0, 0));
        btn_pt.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_pt.setForeground(new java.awt.Color(255, 255, 255));
        btn_pt.setText("Print Ticket");
        btn_pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ptActionPerformed(evt);
            }
        });

        tf_odmovie.setEditable(false);
        tf_odmovie.setBackground(new java.awt.Color(255, 255, 255));
        tf_odmovie.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odmovie.setToolTipText("");
        tf_odmovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odmovieActionPerformed(evt);
            }
        });

        tf_odquantity.setEditable(false);
        tf_odquantity.setBackground(new java.awt.Color(255, 255, 255));
        tf_odquantity.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odquantity.setToolTipText("");
        tf_odquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odquantityActionPerformed(evt);
            }
        });

        tf_odtime.setEditable(false);
        tf_odtime.setBackground(new java.awt.Color(255, 255, 255));
        tf_odtime.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odtime.setToolTipText("");
        tf_odtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odtimeActionPerformed(evt);
            }
        });

        tf_odseat.setEditable(false);
        tf_odseat.setBackground(new java.awt.Color(255, 255, 255));
        tf_odseat.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odseat.setToolTipText("");
        tf_odseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odseatActionPerformed(evt);
            }
        });

        lbl_odtp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odtp.setText("Total Price");

        tf_odtp.setEditable(false);
        tf_odtp.setBackground(new java.awt.Color(255, 255, 255));
        tf_odtp.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odtp.setToolTipText("");
        tf_odtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odtpActionPerformed(evt);
            }
        });

        lbl_odcash.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odcash.setText("Cash");

        tf_odcash.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odcash.setToolTipText("");
        tf_odcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odcashActionPerformed(evt);
            }
        });
        tf_odcash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_odcashKeyReleased(evt);
            }
        });

        lbl_odcm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_odcm.setText("Change");

        tf_odcm.setEditable(false);
        tf_odcm.setBackground(new java.awt.Color(255, 255, 255));
        tf_odcm.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        tf_odcm.setToolTipText("");
        tf_odcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_odcmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_odLayout = new javax.swing.GroupLayout(panel_od);
        panel_od.setLayout(panel_odLayout);
        panel_odLayout.setHorizontalGroup(
            panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_odLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_odLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_odquantity)
                            .addComponent(lbl_odmovie)
                            .addComponent(lbl_odtime)
                            .addComponent(lbl_odseat))
                        .addGap(441, 441, 441))
                    .addGroup(panel_odLayout.createSequentialGroup()
                        .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_odLayout.createSequentialGroup()
                                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_odcm)
                                    .addComponent(lbl_odtp)
                                    .addComponent(lbl_odcash))
                                .addGap(18, 18, 18)
                                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tf_odcash, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_odcm, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_odseat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tf_odquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_odtime, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tf_odmovie, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(btn_pt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panel_odLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lbl_od)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_odLayout.setVerticalGroup(
            panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_odLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_od)
                .addGap(34, 34, 34)
                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_odmovie)
                    .addComponent(tf_odmovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_odquantity)
                    .addComponent(tf_odquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_odtime)
                    .addComponent(tf_odtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_odseat)
                    .addComponent(tf_odseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_odLayout.createSequentialGroup()
                        .addComponent(lbl_odtp)
                        .addGap(19, 19, 19)
                        .addComponent(lbl_odcash)
                        .addGap(19, 19, 19)
                        .addComponent(lbl_odcm))
                    .addGroup(panel_odLayout.createSequentialGroup()
                        .addComponent(tf_odtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_odcash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_odcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btn_pt)
                .addContainerGap())
        );

        cb_seatA1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatA1.setText("A1");
        cb_seatA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatA1ActionPerformed(evt);
            }
        });

        cb_seatA2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatA2.setText("A2");
        cb_seatA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatA2ActionPerformed(evt);
            }
        });

        cb_seatA3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatA3.setText("A3");
        cb_seatA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatA3ActionPerformed(evt);
            }
        });

        cb_seatA4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatA4.setText("A4");
        cb_seatA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatA4ActionPerformed(evt);
            }
        });

        cb_seatA5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatA5.setText("A5");
        cb_seatA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatA5ActionPerformed(evt);
            }
        });

        cb_seatB5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatB5.setText("B5");
        cb_seatB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatB5ActionPerformed(evt);
            }
        });

        cb_seatB4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatB4.setText("B4");
        cb_seatB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatB4ActionPerformed(evt);
            }
        });

        cb_seatB3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatB3.setText("B3");
        cb_seatB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatB3ActionPerformed(evt);
            }
        });

        cb_seatB2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatB2.setText("B2");
        cb_seatB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatB2ActionPerformed(evt);
            }
        });

        cb_seatB1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatB1.setText("B1");
        cb_seatB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatB1ActionPerformed(evt);
            }
        });

        cb_seatC1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatC1.setText("C1");
        cb_seatC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatC1ActionPerformed(evt);
            }
        });

        cb_seatC2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatC2.setText("C2");
        cb_seatC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatC2ActionPerformed(evt);
            }
        });

        cb_seatC3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatC3.setText("C3");
        cb_seatC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatC3ActionPerformed(evt);
            }
        });

        cb_seatC4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatC4.setText("C4");
        cb_seatC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatC4ActionPerformed(evt);
            }
        });

        cb_seatC5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cb_seatC5.setText("C5");
        cb_seatC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seatC5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ticketLayout = new javax.swing.GroupLayout(panel_ticket);
        panel_ticket.setLayout(panel_ticketLayout);
        panel_ticketLayout.setHorizontalGroup(
            panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ticketLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_goback)
                .addGap(537, 537, 537))
            .addGroup(panel_ticketLayout.createSequentialGroup()
                .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ticketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_movie)
                            .addComponent(lbl_time)
                            .addComponent(lbl_seat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ticketLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(panel_ticketLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ticketLayout.createSequentialGroup()
                                        .addComponent(cb_seatA1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_seatA2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_seatA3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_seatA4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_seatA5))
                                    .addGroup(panel_ticketLayout.createSequentialGroup()
                                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel_ticketLayout.createSequentialGroup()
                                                .addComponent(cb_seatC1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cb_seatC2))
                                            .addGroup(panel_ticketLayout.createSequentialGroup()
                                                .addComponent(cb_seatB1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cb_seatB2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_seatB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_seatC3))
                                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_ticketLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cb_seatC4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ticketLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(cb_seatB4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_seatB5)
                                            .addComponent(cb_seatC5)))
                                    .addGroup(panel_ticketLayout.createSequentialGroup()
                                        .addComponent(rb_time1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_time2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_time3))
                                    .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comb_movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panel_ticketLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lbl_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel_od, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_ticketLayout.setVerticalGroup(
            panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ticketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(36, 36, 36)
                .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ticketLayout.createSequentialGroup()
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_movie)
                            .addComponent(comb_movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_quantity)
                            .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(lbl_time))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_time1)
                        .addComponent(rb_time2)
                        .addComponent(rb_time3)))
                .addGap(32, 32, 32)
                .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_seat)
                    .addGroup(panel_ticketLayout.createSequentialGroup()
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_seatA1)
                            .addComponent(cb_seatA2)
                            .addComponent(cb_seatA3)
                            .addComponent(cb_seatA4)
                            .addComponent(cb_seatA5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_seatB1)
                            .addComponent(cb_seatB2)
                            .addComponent(cb_seatB3)
                            .addComponent(cb_seatB4)
                            .addComponent(cb_seatB5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_seatC1)
                            .addComponent(cb_seatC2)
                            .addComponent(cb_seatC3)
                            .addComponent(cb_seatC4)
                            .addComponent(cb_seatC5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_goback))
                .addGap(24, 24, 24))
            .addComponent(panel_od, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ptActionPerformed
        if(cb_seatA1.isSelected())
        {
            list.add("A1");
            seat +="A1 ";
            
        }
        if(cb_seatA2.isSelected())
        {
            list.add("A2");
            seat +="A2 ";
        }
        if(cb_seatA3.isSelected())
        {
            list.add("A3");
            seat +="A3 ";
            
        }
        if(cb_seatA4.isSelected())
        {
            list.add("A4");
            seat +="A4 ";
        }
        if(cb_seatA5.isSelected())
        {
            list.add("A5");
            seat +="A5 ";
            
        }
        if(cb_seatB1.isSelected())
        {
            list.add("B1");
            seat +="B1 ";
        }
        if(cb_seatB2.isSelected())
        {
            list.add("B2");
            seat +="B2 ";
            
        }
        if(cb_seatB3.isSelected())
        {
            list.add("B3");
            seat +="B3 ";
        }
        if(cb_seatB4.isSelected())
        {
            list.add("B4");
            seat +="B4 ";
            
        }
        if(cb_seatB5.isSelected())
        {
            list.add("B5");
            seat +="B5 ";
        }
        if(cb_seatC1.isSelected())
        {
            list.add("C1");
            seat +="C1 ";
        }
        if(cb_seatC2.isSelected())
        {
            list.add("C2");
            seat +="C2 ";
            
        }
        if(cb_seatC3.isSelected())
        {
            list.add("C3");
            seat +="C3 ";
        }
        if(cb_seatC4.isSelected())
        {
            list.add("C4");
            seat +="C4 ";
            
        }
        if(cb_seatC5.isSelected())
        {
            list.add("C5");
            seat +="C5 ";
        }
        
       
        tf_odseat.setText(seat);
        obj_sgd.setSeat(seat);
        
        nextbtn(list);
    }//GEN-LAST:event_btn_ptActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        resetbtn();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void comb_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_movieActionPerformed
        if(comb_movie.getSelectedIndex() == 1)
        {
            movie = "Harry Potter and the Half Blood Prince";
            tf_odmovie.setText(movie);
            theaterno = 1;
            theater = Double.toString(theaterno);
            obj_sgd.setMovie(movie);
            obj_sgd.setTheater(theater);
        }
        else if(comb_movie.getSelectedIndex() == 2)
        {
            movie = "Avengers : End Game";
            tf_odmovie.setText(movie);
            theaterno = 2;
            theater = Double.toString(theaterno);
            obj_sgd.setMovie(movie);
            obj_sgd.setTheater(theater);
        }
        else
        {
            movie = "";
            tf_odmovie.setText(movie);
            theaterno = 0;
            theater = Double.toString(theaterno);
            obj_sgd.setMovie(movie);
            obj_sgd.setTheater(theater);
        }
    }//GEN-LAST:event_comb_movieActionPerformed

    private void tf_odmovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odmovieActionPerformed

    }//GEN-LAST:event_tf_odmovieActionPerformed

    private void tf_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantityActionPerformed

    }//GEN-LAST:event_tf_quantityActionPerformed

    private void tf_odquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odquantityActionPerformed
        
    }//GEN-LAST:event_tf_odquantityActionPerformed

    private void tf_odtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odtimeActionPerformed
        
    }//GEN-LAST:event_tf_odtimeActionPerformed

    private void tf_odseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odseatActionPerformed

    }//GEN-LAST:event_tf_odseatActionPerformed

    private void tf_odtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odtpActionPerformed
        
    }//GEN-LAST:event_tf_odtpActionPerformed

    private void rb_time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_time1ActionPerformed
        if(rb_time1.isSelected())
        {
            time = rb_time1.getText();
            tf_odtime.setText(time);
            obj_sgd.setTime(time);
        }
        else
        {
            time = "";
            tf_odtime.setText(time);
            obj_sgd.setTime(time);
        }        
    }//GEN-LAST:event_rb_time1ActionPerformed

    private void rb_time2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_time2ActionPerformed
        if (rb_time2.isSelected()) 
        {
            time = rb_time2.getText();
            tf_odtime.setText(time);
            obj_sgd.setTime(time);
        }
        else
        {
            time = "";
            tf_odtime.setText(time);
            obj_sgd.setTime(time);
        }
    }//GEN-LAST:event_rb_time2ActionPerformed

    private void rb_time3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_time3ActionPerformed
        if (rb_time3.isSelected())
        {
            time = rb_time3.getText();
            tf_odtime.setText(time);
            obj_sgd.setTime(time);
        }
        else
        {
            time = "";
            tf_odtime.setText(time);
            obj_sgd.setTime(time);
        }
    }//GEN-LAST:event_rb_time3ActionPerformed

    private void cb_seatA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatA1ActionPerformed

    }//GEN-LAST:event_cb_seatA1ActionPerformed
        
    private void cb_seatA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatA2ActionPerformed

    }//GEN-LAST:event_cb_seatA2ActionPerformed

    private void cb_seatA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatA3ActionPerformed

    }//GEN-LAST:event_cb_seatA3ActionPerformed

    private void cb_seatA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatA4ActionPerformed

    }//GEN-LAST:event_cb_seatA4ActionPerformed

    private void cb_seatA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatA5ActionPerformed

    }//GEN-LAST:event_cb_seatA5ActionPerformed

    private void cb_seatB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatB1ActionPerformed

    }//GEN-LAST:event_cb_seatB1ActionPerformed

    private void cb_seatB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatB2ActionPerformed

    }//GEN-LAST:event_cb_seatB2ActionPerformed

    private void cb_seatB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatB3ActionPerformed

    }//GEN-LAST:event_cb_seatB3ActionPerformed

    private void cb_seatB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatB4ActionPerformed

    }//GEN-LAST:event_cb_seatB4ActionPerformed

    private void cb_seatB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatB5ActionPerformed

    }//GEN-LAST:event_cb_seatB5ActionPerformed

    private void cb_seatC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatC1ActionPerformed

    }//GEN-LAST:event_cb_seatC1ActionPerformed

    private void cb_seatC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatC2ActionPerformed

    }//GEN-LAST:event_cb_seatC2ActionPerformed

    private void cb_seatC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatC3ActionPerformed

    }//GEN-LAST:event_cb_seatC3ActionPerformed

    private void cb_seatC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatC4ActionPerformed

    }//GEN-LAST:event_cb_seatC4ActionPerformed

    private void cb_seatC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seatC5ActionPerformed

    }//GEN-LAST:event_cb_seatC5ActionPerformed

    private void tf_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quantityKeyReleased
        
         try 
        {
            quantity = Integer.parseInt(tf_quantity.getText());
        
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "please input a valid number for the quantity");
        }
        qty = Double.toString(quantity);
        totalprice = quantity*price;
        tp = Double.toString(totalprice);
        tf_odtp.setText(tp);
        tf_odquantity.setText(qty);
        obj_sgd.setQty(qty);
    }//GEN-LAST:event_tf_quantityKeyReleased

    private void btn_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gobackActionPerformed
        goback();
    }//GEN-LAST:event_btn_gobackActionPerformed

    private void tf_odcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odcashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_odcashActionPerformed

    private void tf_odcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_odcmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_odcmActionPerformed

    private void tf_odcashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_odcashKeyReleased
        try 
        {
            cash = Double.valueOf(tf_odcash.getText());
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "please input a valid nominal of money for the cash");
        }
        change = cash-totalprice;
        cm = Double.toString(change);
        tf_odcm.setText(cm);
    }//GEN-LAST:event_tf_odcashKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goback;
    private javax.swing.JButton btn_pt;
    private javax.swing.JButton btn_reset;
    private javax.swing.ButtonGroup btngr_time;
    private javax.swing.JCheckBox cb_seatA1;
    private javax.swing.JCheckBox cb_seatA2;
    private javax.swing.JCheckBox cb_seatA3;
    private javax.swing.JCheckBox cb_seatA4;
    private javax.swing.JCheckBox cb_seatA5;
    private javax.swing.JCheckBox cb_seatB1;
    private javax.swing.JCheckBox cb_seatB2;
    private javax.swing.JCheckBox cb_seatB3;
    private javax.swing.JCheckBox cb_seatB4;
    private javax.swing.JCheckBox cb_seatB5;
    private javax.swing.JCheckBox cb_seatC1;
    private javax.swing.JCheckBox cb_seatC2;
    private javax.swing.JCheckBox cb_seatC3;
    private javax.swing.JCheckBox cb_seatC4;
    private javax.swing.JCheckBox cb_seatC5;
    private javax.swing.JComboBox<String> comb_movie;
    private javax.swing.JLabel lbl_movie;
    private javax.swing.JLabel lbl_od;
    private javax.swing.JLabel lbl_odcash;
    private javax.swing.JLabel lbl_odcm;
    private javax.swing.JLabel lbl_odmovie;
    private javax.swing.JLabel lbl_odquantity;
    private javax.swing.JLabel lbl_odseat;
    private javax.swing.JLabel lbl_odtime;
    private javax.swing.JLabel lbl_odtp;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_seat;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel panel_od;
    private javax.swing.JPanel panel_ticket;
    private javax.swing.JRadioButton rb_time1;
    private javax.swing.JRadioButton rb_time2;
    private javax.swing.JRadioButton rb_time3;
    private javax.swing.JTextField tf_odcash;
    private javax.swing.JTextField tf_odcm;
    private javax.swing.JTextField tf_odmovie;
    private javax.swing.JTextField tf_odquantity;
    private javax.swing.JTextField tf_odseat;
    private javax.swing.JTextField tf_odtime;
    private javax.swing.JTextField tf_odtp;
    private javax.swing.JTextField tf_quantity;
    // End of variables declaration//GEN-END:variables

    @Override
    public void goback() 
    {
        mainMenuForm obj_mame = new mainMenuForm();
        obj_mame.setVisible(true);
        this.setVisible(false);
    }

    @Override
    public void resetbtn() 
    {
        tf_odmovie.setText("");
        tf_odquantity.setText("");
        tf_odseat.setText("");
        tf_odtime.setText("");
        tf_odtp.setText("");
        comb_movie.setSelectedItem(null);
        tf_quantity.setText("");
        tf_odcash.setText("");
        tf_odcm.setText("");
        btngr_time.clearSelection();
        cb_seatA1.setSelected(false);
        cb_seatA2.setSelected(false);
        cb_seatA3.setSelected(false);
        cb_seatA4.setSelected(false);
        cb_seatA5.setSelected(false);
        cb_seatB1.setSelected(false);
        cb_seatB2.setSelected(false);
        cb_seatB3.setSelected(false);
        cb_seatB4.setSelected(false);
        cb_seatB5.setSelected(false);
        cb_seatC1.setSelected(false);
        cb_seatC2.setSelected(false);
        cb_seatC3.setSelected(false);
        cb_seatC4.setSelected(false);
        cb_seatC5.setSelected(false);
        seat = "";
        time = "";
        movie = "";
        quantity = 0;
        totalprice = 0;
        theaterno = 0;
        change = 0;
        cash = 0;
    }

    @Override
    public void nextbtn(List ls) 
    {
        int choose = JOptionPane.showOptionDialog(this, "Print the ticket?", "Print ticket.", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, null, null);
        switch(choose)
        {
            case JOptionPane.YES_OPTION:
                confirmationForm obj_cf = new confirmationForm();
                obj_cf.setVisible(true);
                obj_cf.data(ls);
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Ticket has been printed!", "Ticket printed.", JOptionPane.INFORMATION_MESSAGE);
                break;
            case JOptionPane.NO_OPTION:
                resetbtn();
                break;
        }
    }

    public void check(List ls) 
    {
        try 
        {
            if("A1".equals(ls.get(0))){
                cb_seatA1.setEnabled(false);
            }
            if("A2".equals(ls.get(1))){
                cb_seatA2.setEnabled(false);
            }
            if("A3".equals(ls.get(2))){
                cb_seatA3.setEnabled(false);
            }
            if("A4".equals(ls.get(3))){
                cb_seatA4.setEnabled(false);
            }
            if("A5".equals(ls.get(4))){
                cb_seatA5.setEnabled(false);
            }
            if("B1".equals(ls.get(5))){
                cb_seatB1.setEnabled(false);
            }
            if("B2".equals(ls.get(6))){
                cb_seatB2.setEnabled(false);
            }
            if("B3".equals(ls.get(7))){
                cb_seatB3.setEnabled(false);
            }
            if("B4".equals(ls.get(8))){
                cb_seatB4.setEnabled(false);
            }
            if("B5".equals(ls.get(9))){
                cb_seatB5.setEnabled(false);
            }
            if("C1".equals(ls.get(10))){
                cb_seatC1.setEnabled(false);
            }
            if("C2".equals(ls.get(11))){
                cb_seatC2.setEnabled(false);
            }
            if("C3".equals(ls.get(12))){
                cb_seatC3.setEnabled(false);
            }
            if("C4".equals(ls.get(13))){
                cb_seatC4.setEnabled(false);
            }
            if("C5".equals(ls.get(14))){
                cb_seatC5.setEnabled(false);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("oops! somethings not right");
        }
            
    }

    @Override
    public void nextbtn() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void goback(List ls) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
 public int hitung(int a, int b, int c){
        return a*b-c;
    }

    public void kembalian()
    {
        double kembalian;
        try 
        {
            quantity = Integer.parseInt(tf_quantity.getText());
        
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "please input a valid number for the quantity");
        }
        qty = Double.toString(quantity);
        totalprice = quantity*price;
        tp = Double.toString(totalprice);
        tf_odtp.setText(tp);
        tf_odquantity.setText(qty);
        obj_sgd.setQty(qty);
        kembalian = change;
    }
}


    


    
    



