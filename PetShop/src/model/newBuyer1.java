/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import dao.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class newBuyer1 extends javax.swing.JFrame {

    /**
     * Creates new form newBuyer1
     */
    public Pattern mailCheck = Pattern.compile("^[a-zA-Z][a-zA-Z0-9\\-_]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");
    public int check = 0;
    public int ok = 0;
    public int them = 0;
    public int update = 0;
    public String temp;
    public newBuyer1() {
        initComponents();
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextArea1.setEnabled(false);
        jComboBox1.setEnabled(false);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 4, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setText("Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 320, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "name", "numberPhone", "email", "address", "gender"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setInheritsPopupMenu(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1030, 450));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 997, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 0, -1, 768));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Danh S??ch Kh??ch H??ng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("New Buyer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-group.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 470, 120, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 290, 70, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Enter Name");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 190, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Enter NumberPhone");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 190, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Enter Email");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 170, 230, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 290, 203, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, 100, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Save");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 420, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Refresh-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 340, 90, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Refresh");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 420, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Office-Customer-Male-Light-icon.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Office-Girl-icon.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Apps-system-software-update-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 470, 120, 80));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Update Buyer");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 570, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete buyer.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 620, 130, 80));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Delete Buyer");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 700, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 447, 310, 10));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Bank-Check-icon.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, 70));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow-back-1-icon (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Enter Address");
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 200, 230, 80));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset (1).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 110, 80));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 648, 1013, 13));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel17.setText("PET MANAGEMENT SYSTEM");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 679, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Enter NumberPhone");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 180, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1057, 80, 293, 10));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 122, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Print");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 700, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print-icon.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 620, 120, 80));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon (1).png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select name,numberphone,email,address,gender from buyer where status = '1'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        TableColumnModel tcm = jTable1.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(70);
        tcm.getColumn(1).setPreferredWidth(30);
        tcm.getColumn(2).setPreferredWidth(200);
        tcm.getColumn(3).setPreferredWidth(400);
        tcm.getColumn(4).setPreferredWidth(20);
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(them == 0){
            int a = JOptionPane.showConfirmDialog(null,"B???n mu???n th??m kh??ch h??ng?","Select",JOptionPane.YES_NO_OPTION);
            if(a == 0){
                jTextField1.setText("Enter Name");
                jTextField2.setText("Enter NumberPhone");
                jTextField3.setText("Enter Email");
                jTextArea1.setText("Enter Address");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField2.setForeground(new Color(153,153,153));
                jTextField3.setForeground(new Color(153,153,153));
                jTextArea1.setForeground(new Color(153,153,153));
                jComboBox1.setSelectedIndex(0);
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField3.setEnabled(true);
                jTextArea1.setEnabled(true);
                jComboBox1.setEnabled(true);
                jTextField1.setEditable(true);
                jTextField2.setEditable(true);
                jTextField3.setEditable(true);
                jTextArea1.setEditable(true);
                check = 1;
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                them = 1;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(ok == 1){
            String name = jTextField1.getText();
            String numberPhone = jTextField2.getText();
            String email = jTextField3.getText();
            String address = jTextArea1.getText();
            String gender = jComboBox1.getSelectedItem().toString();
            if(name.equals("Enter Name") || numberPhone.equals("Enter NumberPhone") || email.equals("Enter Email") || address.equals("Enter Address")){
                JOptionPane.showMessageDialog(null, "??i???n thi???u th??ng tin! Vui l??ng nh???p ?????y ?????");
            }else if(numberPhone.charAt(0)!= '0' || numberPhone.length()!= 10){
                JOptionPane.showMessageDialog(null, "Sai ?????nh d???ng s??? ??i???n tho???i");
            }
            else if(mailCheck.matcher(email).find()){   
                try {
                    Connection con = ConnectionProvider.getConnection();
                    Statement st = con.createStatement();
                    st.executeUpdate("update buyer set name = N'"+name+"',numberPhone='"+numberPhone+"',email='"+email+"',address=N'"+address+"',gender='"+gender+"'where numberPhone='"+temp+"'");
                    JOptionPane.showMessageDialog(null, "C???p nh???t th??nh c??ng");
                    setVisible(false);
                    new newBuyer1().setVisible(true);
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"S??? ??i???n tho???i ???? t???n t???i");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Email ch??a ????ng ?????nh d???ng v?? ????? d??i k?? t??? > 10");
            }
        }
        else{
        String name = jTextField1.getText();
        String numberPhone = jTextField2.getText();
        String email = jTextField3.getText();
        String address = jTextArea1.getText();
        String gender = (String)jComboBox1.getSelectedItem();
        if(name.equals("Enter Name") || numberPhone.equals("Enter NumberPhone") || email.equals("Enter Email") || address.equals("Enter Address")){
                JOptionPane.showMessageDialog(null, "??i???n thi???u th??ng tin! Vui l??ng nh???p ?????y ?????");
        }
        else if(numberPhone.charAt(0)!= '0' || numberPhone.length()!= 10){
                JOptionPane.showMessageDialog(null, "S??? ??i???n tho???i ph???i b???t ?????u t??? s??? 0 v?? ????? d??i b???ng 10");
            }
        else if(mailCheck.matcher(email).find()){   
            try {
                Connection con = ConnectionProvider.getConnection();
                Statement st = con.createStatement();
                st.executeUpdate("insert into buyer values(N'"+name+"',N'"+numberPhone+"',N'"+email+"',N'"+address+"',N'"+gender+"','1')");
                JOptionPane.showMessageDialog(null,"Th??m th??nh c??ng");
                setVisible(false);
                new newBuyer1().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"S??? ??i???n tho???i ???? t???n t???i");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Email ch??a ????ng ?????nh d???ng ( @gmail.com ho???c @email.com ) v?? ????? d??i k?? t??? > 10");
        }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Enter Name")){
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")){
            jTextField1.setText("Enter Name");
            jTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if(jTextField2.getText().equals("Enter NumberPhone")){
            jTextField2.setText("");
            jTextField2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        if(jTextField2.getText().equals("")){
            jTextField2.setText("Enter NumberPhone");
            jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        if(jTextField3.getText().equals("Enter Email")){
            jTextField3.setText("");
            jTextField3.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        if(jTextField3.getText().equals("")){
            jTextField3.setText("Enter Email");
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("Enter Name");
        jTextField1.setForeground(new Color(153,153,153));
        jTextField2.setText("Enter NumberPhone");
        jTextField2.setForeground(new Color(153,153,153));
        jTextField3.setText("Enter Email");
        jTextField3.setForeground(new Color(153,153,153));
        jTextArea1.setText("Enter Address");
        jTextArea1.setForeground(new Color(153,153,153));
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(them==0){
            jTextField1.setEnabled(true);
            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextArea1.setEnabled(true);
            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            jTextField3.setEditable(false);
            jTextArea1.setEditable(false);
            int row = jTable1.getSelectedRow();
            if(row >= 0){
                jTextField1.setText(jTable1.getValueAt(row, 0).toString());
                jTextField1.setForeground(new Color(0,0,0));
                jTextField2.setText(jTable1.getValueAt(row, 1).toString());
                jTextField2.setForeground(new Color(0,0,0));
                jTextField3.setText(jTable1.getValueAt(row, 2).toString());
                jTextField3.setForeground(new Color(0,0,0));
                jTextArea1.setText(jTable1.getValueAt(row, 3).toString());
                jTextArea1.setForeground(new Color(0,0,0));
                jComboBox1.setSelectedItem(jTable1.getValueAt(row, 4).toString());
                jComboBox1.setForeground(new Color(0,0,0));
                temp = jTextField2.getText();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            if(jTextField1.getText().equals("Enter Name") || jTextField2.getText().equals("Enter NumberPhone") || jTextField3.getText().equals("Enter Email") || jTextArea1.getText().equals("Enter Address")){
                JOptionPane.showMessageDialog(null, "Vui l??ng ch???n kh??ch h??ng mu???n xo??!");
            }
            else{
                String numberPhone =  jTextField2.getText();
                int thongBao = JOptionPane.showConfirmDialog(null, "B???n mu???n xo???","Select",JOptionPane.YES_NO_OPTION);
                if(thongBao==0){
                    try {
                        Connection con = ConnectionProvider.getConnection();
                        Statement st = con.createStatement();
                        st.executeUpdate("update buyer set status = '0' where numberPhone = '"+numberPhone+"'");
                        setVisible(false);
                        new newBuyer1().setVisible(true);
                    } catch (Exception e) {
                    }
                }
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new newBuyer1().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
        if(jTextArea1.getText().equals("Enter Address")){
            jTextArea1.setText("");
            jTextArea1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
        if(jTextArea1.getText().equals("")){
            jTextArea1.setText("Enter Address");
            jTextArea1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextArea1FocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Enter Name") || jTextField2.getText().equals("Enter NumberPhone") || jTextField3.getText().equals("Enter Email") || jTextArea1.getText().equals("Enter Address")){
            JOptionPane.showMessageDialog(null, "Vui l??ng ch???n kh??ch h??ng mu???n c???p nh???t!");
        }
        else if (ok == 0){
            int thongbao = JOptionPane.showConfirmDialog(null, "B???n mu???n c???p nh???t th??ng tin cho ng?????i d??ng c?? s??? ??i???n tho???i" + " " + jTextField2.getText() + "?","Select",JOptionPane.YES_NO_OPTION);
            if(thongbao == 0){
                ok = 1;
                jTextField1.setEditable(true);
                jTextField2.setEditable(true);
                jTextField3.setEditable(true);
                jTextArea1.setEditable(true);
                jComboBox1.setEnabled(true);
                jButton1.setEnabled(false);
                jButton5.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        if(jTextField4.getText().equals("Enter NumberPhone")){
            jTextField4.setText("");
            jTextField4.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        if(jTextField4.getText().equals("")){
            jTextField4.setText("Enter NumberPhone");
            jTextField4.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        String numberPhone = jTextField4.getText();
        
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            if(numberPhone.equals("Enter NumberPhone")|| numberPhone.equals("")){
                ResultSet rs = st.executeQuery("select name,numberphone,email,address,gender from buyer where status = '1'");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }else{
                ResultSet rs = st.executeQuery("select name,numberphone,email,address,gender from buyer where numberPhone like'"+numberPhone+"%' and status = '1'");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            jTable1.setVisible(false);
            jTable1.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                TableColumnModel tcm = jTable1.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(70);
        tcm.getColumn(1).setPreferredWidth(30);
        tcm.getColumn(2).setPreferredWidth(200);
        tcm.getColumn(3).setPreferredWidth(400);
        tcm.getColumn(4).setPreferredWidth(20);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Danh s??ch kh??ch h??ng");
        MessageFormat footer = new MessageFormat("page {0,number,integer}");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(newBuyer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newBuyer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newBuyer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newBuyer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newBuyer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
