/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepayroll;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class login extends javax.swing.JFrame {
    
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
    
    public login() {
        initComponents();
        
        Toolkit toolkit = getToolkit();         //Code to see the Application in the middle of the screen.
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        
        conn = db.java_db();
        currentDate();
    }
    
    public void currentDate()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        lbl_date.setText(day+" / "+(month+1)+" / "+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText(hour+" : "+minute+" : "+second);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        txt_combo = new javax.swing.JComboBox<>();
        btn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 204));
        jLabel5.setText("Welcome to Employee Payroll Management System.");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 10, 590, 32);
        jPanel2.add(txt_password);
        txt_password.setBounds(130, 180, 210, 40);

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username);
        txt_username.setBounds(130, 129, 210, 40);

        txt_combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Sales" }));
        jPanel2.add(txt_combo);
        txt_combo.setBounds(130, 230, 210, 40);

        btn_login.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login);
        btn_login.setBounds(130, 287, 81, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("Select Division :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 240, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 190, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 204));
        jLabel2.setText("Username :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 140, 90, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 204));
        jLabel1.setText("Please Enter you Username and Password.");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 60, 370, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/emp2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(-10, -20, 1260, 710);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        
        String sql = "Select * from users where(username=? and password=? and division=?)";
         try
         {
             int Count=0;
             pst = conn.prepareStatement(sql);
             
             pst.setString(1, txt_username.getText());
             pst.setString(2, txt_password.getText());
             pst.setString(3, txt_combo.getSelectedItem().toString());
             
             rs = pst.executeQuery();
             
             while(rs.next())
             {
                 int id = rs.getInt(1);  // These two Line code is for to get the Id of user in MainMenu page.
                 Employee.empId = id;
                 String username = rs.getString("username");
                 Employee.empname = username;
                 Count = Count + 1;
             }
             String access = (txt_combo.getSelectedItem().toString());
             
             if("Admin".equals(access))
             {
                 if(Count == 1)
                 {
                     JOptionPane.showMessageDialog(null,"LoggedIn Successfully");
                     MainMenu j = new MainMenu();
                     j.setVisible(true);
                     this.dispose();
                 }else
                 {
                     JOptionPane.showMessageDialog(null, "Wrong Username or Password Entered");
                 }
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
                 JOptionPane.showMessageDialog(null, e);
             }
         }
                
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JComboBox<String> txt_combo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    
}
