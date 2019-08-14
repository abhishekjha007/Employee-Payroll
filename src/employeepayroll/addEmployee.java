
package employeepayroll;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author kd
 */
public class addEmployee extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public addEmployee() {
        initComponents();
        
        Toolkit toolkit = getToolkit();         //Code to see the Application in the middle of the screen.
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-  getWidth()/2,size.height/2 - getHeight()/2);
        
        conn = db.java_db();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_add1 = new javax.swing.JTextField();
        txt_add2 = new javax.swing.JTextField();
        txt_house = new javax.swing.JTextField();
        txt_pcode = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        txt_designation = new javax.swing.JTextField();
        txt_datehired = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_jobtitle = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        btn_addrecord = new javax.swing.JButton();
        gender1 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        img = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Employee Id :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("FirstName :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("LastName :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Date of Birth :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Email Id :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Mob No :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Address 1 :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Address 2 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("House No :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setText("Pin Code :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setText("Department :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel12.setText("Designation :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel13.setText("Date Hired : ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel14.setText("Basic Salary : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel15.setText("Job Title : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel16.setText("Status :");

        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        txt_house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_houseActionPerformed(evt);
            }
        });

        txt_pcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pcodeActionPerformed(evt);
            }
        });

        txt_jobtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobtitleActionPerformed(evt);
            }
        });

        btn_addrecord.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_addrecord.setText("Add Record");
        btn_addrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addrecordActionPerformed(evt);
            }
        });

        gender1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        gender1.setText("Gender :");

        r_male.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        r_female.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(img1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("Attach Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setText("Search Employee Using Id : ");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_delete.setText("Delete Record");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("Update Record");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(gender1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(r_male)
                                        .addGap(18, 18, 18)
                                        .addComponent(r_female))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                    .addComponent(txt_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(txt_lname)
                                        .addComponent(txt_phone)
                                        .addComponent(txt_email)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_designation))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_dept))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_datehired, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_pcode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(24, 24, 24)
                                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_addrecord)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_jobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(btn_delete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_pcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_datehired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender1)
                            .addComponent(r_male)
                            .addComponent(r_female)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_jobtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobtitleActionPerformed

    private void txt_pcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pcodeActionPerformed

    private void txt_houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_houseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_houseActionPerformed

    private void btn_addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addrecordActionPerformed
        // TODO add your handling code here:

        //Code to Add record in Database;
        
        int x = JOptionPane.showConfirmDialog(null, "Are you sure want to Add Records ?????","Add Record",JOptionPane.YES_NO_OPTION);
        if(x == 0){
        try
        {
            String sql = "insert into employee_info(firstname,lastname,Dob,email,mobile_no,Addressone,Addresstwo,house_no,pincode,department,designation,datehired,salary,jobtitle,status,gender,image) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,txt_fname.getText());
            pst.setString(2,txt_lname.getText());
            pst.setString(3,txt_dob.getText());           
            pst.setString(4,txt_email.getText());
            pst.setString(5,txt_phone.getText());
            pst.setString(6,txt_add1.getText());
            pst.setString(7,txt_add2.getText());                       
            pst.setString(8,txt_house.getText());
            pst.setString(9,txt_pcode.getText());
            pst.setString(10,txt_dept.getText());
            pst.setString(11,txt_designation.getText());
            pst.setString(12,txt_datehired.getText());
            pst.setString(13,txt_salary.getText());
            pst.setString(14,txt_jobtitle.getText());
            pst.setString(15,txt_status.getText());
            pst.setString(16,gender);
            pst.setBytes(17,person_image);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data is Saved Successfully...");
            
        }catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

        //Code for Automatically Created Username and Password.....
        try
        {
            
            String sq = "SELECT * from employee_info where (Emp_id) NOT IN (select id from users)";
            pst = conn.prepareStatement(sq);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String add1 = rs.getString("Emp_id");
                String add2 = rs.getString("firstname");
                String add3 = rs.getString("Dob");
                String res = add3.replace("/", "");
                String add4 = rs.getString("department");
                
                String sql = "Insert into users(username,password,division,Emp_id) values('"+add2+"', '"+res+"', '"+add4+"', '"+add1+"')";
                pst = conn.prepareStatement(sql);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "User Account has been Created Successfully :..." +"Username : " +add2+ " " + "Password : "+res);
                
            }
            
        }catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            try
            {
                rs.close();
                pst.close();
                
            }catch(SQLException e)
            {
                //JOptionPane.showMessageDialog(null,e);
            }
        }
        }
        
    }//GEN-LAST:event_btn_addrecordActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        // TODO add your handling code here:
        gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        // TODO add your handling code here:
        gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
    }//GEN-LAST:event_r_femaleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txt_search.setText("");
        txt_id.setText("");
        txt_fname.setText("");
        txt_lname.setText("");
        txt_dob.setText("");
        txt_email.setText("");
        txt_phone.setText("");
        txt_add1.setText("");
        txt_add2.setText("");
        txt_house.setText("");
        txt_pcode.setText("");
        txt_dept.setText("");
        txt_designation.setText("");
        txt_datehired.setText("");
        txt_salary.setText("");
        txt_jobtitle.setText("");
        txt_status.setText("");
        img1.setIcon(null);
        r_male.setSelected(false);
        r_female.setSelected(false);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();  // For Attaching the Image of the Person...
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT));
        img1.setIcon(imageIcon);
        
        try
        {
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[2048];
            
            for(int number; (number = fix.read(buf)) != -1;)
            {
                bos.write(buf,0,number);
            }
            person_image = bos.toByteArray();
            
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        
        try
        {
           
            String query;
            query = "select * from employee_info where Emp_id=? ";
            pst = conn.prepareStatement(query);
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            
            boolean first = rs.first();
            
            /*rs.next();
            String foundType = rs.getString(1);
 
            if(rs.next())
            {
              foundType = rs.getString(1);
            }*/
            
            String add1 = rs.getString("Emp_id");
            txt_id.setText(add1);
            
            String add2 = rs.getString("firstname");
            txt_fname.setText(add2);
            
            String add3 = rs.getString("lastname");
            txt_lname.setText(add3);
            
            String add4 = rs.getString("Dob");
            txt_dob.setText(add4);
            
            String add5 = rs.getString("email");
            txt_email.setText(add5);
            
            String add6 = rs.getString("mobile_no");
            txt_phone.setText(add6);
            
            String add7 = rs.getString("Addressone");
            txt_add1.setText(add7);
            
            String add8 = rs.getString("Addresstwo");
            txt_add2.setText(add8);
            
            String add9 = rs.getString("house_no");
            txt_house.setText(add9);
            
            String add10 = rs.getString("pincode");
            txt_pcode.setText(add10);
            
            String add11 = rs.getString("department");
            txt_dept.setText(add11);
            
            String add12 = rs.getString("designation");
            txt_designation.setText(add12);
            
            String add13 = rs.getString("datehired");
            txt_datehired.setText(add13);
            
            String add14 = rs.getString("salary");
            txt_salary.setText(add14);
            
            String add15 = rs.getString("jobtitle");
            txt_jobtitle.setText(add15);
            
            String add16 = rs.getString("status");
            txt_status.setText(add16);
            
            String add17 = rs.getString("gender");
            if(add17.equals("Male"))
            {
                r_male.setSelected(true);
            }
            else
            {
                r_female.setSelected(true);
            }
            
        byte[] image;    
            image = rs.getBytes("image");
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT));
        img1.setIcon(imageIcon);
            
            
        }catch(SQLException e)
        {
            //JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
                
            }catch(SQLException e)
            {
                //JOptionPane.showMessageDialog(null,e);
            }
        }
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        
        ConfirmDelete x = new ConfirmDelete();
        x.setVisible(true);
        
        /*int x = JOptionPane.showConfirmDialog(null, "Are you sure want to Delete Records ?????","Delete Record",JOptionPane.YES_NO_OPTION);
        if(x == 0){               //Above line and this line is the code for Confirmation frame.
        try
        {
            String sql = "DELETE FROM employee_info where Emp_id=? ";    //Code to delete the Data.
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_id.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully..... ");
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
                
            }catch(SQLException e)
            {
                //JOptionPane.showMessageDialog(null, e);
            }
        }
        }*/
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String val1 = txt_id.getText();
        int x = JOptionPane.showConfirmDialog(null, "Are you sure want to Update Records ?????","Update Record",JOptionPane.YES_NO_OPTION);
        if(x == 0){
        try
        {
            //String val1 = txt_id.getText();
            String val2 = txt_fname.getText();
            String val3 = txt_lname.getText();
            String val4 = txt_dob.getText();
            String val5 = txt_email.getText();
            String val6 = txt_phone.getText();
            String val7 = txt_add1.getText();
            String val8 = txt_add2.getText();
            String val9 = txt_house.getText();
            String val10 = txt_pcode.getText();
            String val11 = txt_dept.getText();
            String val12 = txt_designation.getText();
            String val13 = txt_datehired.getText();
            String val14 = txt_salary.getText();
            String val15 = txt_jobtitle.getText();
            String val16 = txt_status.getText();
            
            String sql;
            sql = "UPDATE employee_info set Emp_id = '"+val1+"',firstname = '"+val2+"',lastname = '"+val3+"', Dob = '"+val4+"', email = '"+val5+"', mobile_no = '"+val6+"', Addressone = '"+val7+"', Addresstwo = '"+val8+"', house_no = '"+val9+"', pincode = '"+val10+"', department = '"+val11+"', designation = '"+val12+"', datehired = '"+val13+"', salary = '"+val14+"', jobtitle = '"+val15+"', status = '"+val16+"',gender='"+gender+"' where Emp_id = '"+val1+"' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Record Updated Successfully.....");
            
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try
        {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            
            byte [] image = new byte[(int) file.length()];
            fis.read(image);
            
            String sql;
            sql = "UPDATE employee_info SET image = ? where Emp_id = '"+val1+"' ";
            pst = conn.prepareStatement(sql);
            pst.setBytes(1, image);
            pst.executeUpdate();
            pst.close();
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }   catch (IOException ex) {
                Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }catch(SQLException e)
            {
                //JOptionPane.showMessageDialog(null, e);
            }
        }
        
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

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
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addEmployee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addrecord;
    private javax.swing.JButton btn_delete;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTextField txt_add1;
    private javax.swing.JTextField txt_add2;
    private javax.swing.JTextField txt_datehired;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jobtitle;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_pcode;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    // End of variables declaration//GEN-END:variables

private String gender;

//For Attaching the Image...

private ImageIcon format = null;
String filename = null;
byte[] person_image = null;

    private FileInputStream FileInputStream(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
