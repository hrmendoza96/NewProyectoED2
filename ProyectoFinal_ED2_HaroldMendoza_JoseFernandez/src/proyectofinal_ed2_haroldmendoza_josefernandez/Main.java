package proyectofinal_ed2_haroldmendoza_josefernandez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() throws IOException {
        //LlenarRegistros();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }//Fin del main

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Insert = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombreUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_SalarioUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        btn_RegisterUser = new javax.swing.JButton();
        jdc_FechaBirth = new com.toedter.calendar.JDateChooser();
        jd_list = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tablaListar = new javax.swing.JTable();
        jd_search = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_tablaSearch = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        b_searchUser = new javax.swing.JButton();
        cb_search = new javax.swing.JComboBox<>();
        jd_modify = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        b_searchModifyUser = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        b_saveChanges = new javax.swing.JButton();
        tf_ModifyName = new javax.swing.JTextField();
        tf_ModifySalary = new javax.swing.JTextField();
        tf_ModifyID = new javax.swing.JTextField();
        cb_modify = new javax.swing.JComboBox<>();
        jdateModify = new com.toedter.calendar.JDateChooser();
        jd_delete = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_tablaDelete = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        bdelete_User = new javax.swing.JButton();
        cb_delete = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_insert = new javax.swing.JButton();
        b_list = new javax.swing.JButton();
        b_search = new javax.swing.JButton();
        b_modify = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(51, 157, 143));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insert User");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel3)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(34, 36, 48));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salary");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");

        btn_RegisterUser.setBackground(new java.awt.Color(51, 157, 143));
        btn_RegisterUser.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_RegisterUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegisterUser.setText("Register");
        btn_RegisterUser.setBorderPainted(false);
        btn_RegisterUser.setContentAreaFilled(false);
        btn_RegisterUser.setOpaque(true);
        btn_RegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegisterUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombreUser)
                    .addComponent(txt_SalarioUser)
                    .addComponent(txt_Id)
                    .addComponent(btn_RegisterUser, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jdc_FechaBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_SalarioUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jdc_FechaBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btn_RegisterUser)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jd_InsertLayout = new javax.swing.GroupLayout(jd_Insert.getContentPane());
        jd_Insert.getContentPane().setLayout(jd_InsertLayout);
        jd_InsertLayout.setHorizontalGroup(
            jd_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_InsertLayout.setVerticalGroup(
            jd_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_InsertLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(77, 120, 154));
        jPanel5.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("List of Users");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(34, 36, 48));

        jt_tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Date of Birth", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_tablaListar);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_listLayout = new javax.swing.GroupLayout(jd_list.getContentPane());
        jd_list.getContentPane().setLayout(jd_listLayout);
        jd_listLayout.setHorizontalGroup(
            jd_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_listLayout.setVerticalGroup(
            jd_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(35, 207, 95));
        jPanel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search User");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(34, 36, 48));

        jt_tablaSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Date of Birth", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_tablaSearch);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Type Name:");

        b_searchUser.setBackground(new java.awt.Color(35, 207, 95));
        b_searchUser.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_searchUser.setForeground(new java.awt.Color(255, 255, 255));
        b_searchUser.setText("Select");
        b_searchUser.setBorderPainted(false);
        b_searchUser.setContentAreaFilled(false);
        b_searchUser.setOpaque(true);
        b_searchUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_searchUserMouseClicked(evt);
            }
        });

        cb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(267, 267, 267)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(228, 228, 228)
                                    .addComponent(b_searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 235, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(cb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(b_searchUser)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_searchLayout = new javax.swing.GroupLayout(jd_search.getContentPane());
        jd_search.getContentPane().setLayout(jd_searchLayout);
        jd_searchLayout.setHorizontalGroup(
            jd_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_searchLayout.setVerticalGroup(
            jd_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_searchLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(247, 103, 0));
        jPanel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Modify User");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel10)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(34, 36, 48));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Type Name:");

        b_searchModifyUser.setBackground(new java.awt.Color(247, 103, 0));
        b_searchModifyUser.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_searchModifyUser.setForeground(new java.awt.Color(255, 255, 255));
        b_searchModifyUser.setText("Select");
        b_searchModifyUser.setBorderPainted(false);
        b_searchModifyUser.setContentAreaFilled(false);
        b_searchModifyUser.setOpaque(true);
        b_searchModifyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_searchModifyUserMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Birth");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salary");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID");

        b_saveChanges.setBackground(new java.awt.Color(245, 67, 55));
        b_saveChanges.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_saveChanges.setForeground(new java.awt.Color(255, 255, 255));
        b_saveChanges.setText("Save Changes");
        b_saveChanges.setBorderPainted(false);
        b_saveChanges.setContentAreaFilled(false);
        b_saveChanges.setOpaque(true);
        b_saveChanges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_saveChangesMouseClicked(evt);
            }
        });

        tf_ModifyName.setEnabled(false);

        tf_ModifySalary.setEnabled(false);

        tf_ModifyID.setEnabled(false);

        cb_modify.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jdateModify.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(321, 321, 321))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(tf_ModifySalary)
                                .addGap(149, 149, 149)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(tf_ModifyID, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(tf_ModifyName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jdateModify, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(b_saveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel11))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_searchModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(cb_modify, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addComponent(cb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(b_searchModifyUser)
                .addGap(53, 53, 53)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdateModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_ModifyName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_ModifySalary, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(tf_ModifyID))
                .addGap(74, 74, 74)
                .addComponent(b_saveChanges)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout jd_modifyLayout = new javax.swing.GroupLayout(jd_modify.getContentPane());
        jd_modify.getContentPane().setLayout(jd_modifyLayout);
        jd_modifyLayout.setHorizontalGroup(
            jd_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_modifyLayout.setVerticalGroup(
            jd_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modifyLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(77, 197, 172));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Delete User");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(34, 36, 48));

        jt_tablaDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Date of Birth", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_tablaDelete);

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Type Name:");

        bdelete_User.setBackground(new java.awt.Color(77, 197, 172));
        bdelete_User.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        bdelete_User.setForeground(new java.awt.Color(255, 255, 255));
        bdelete_User.setText("Select");
        bdelete_User.setBorderPainted(false);
        bdelete_User.setContentAreaFilled(false);
        bdelete_User.setOpaque(true);
        bdelete_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdelete_UserMouseClicked(evt);
            }
        });

        cb_delete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jButton1.setBackground(new java.awt.Color(245, 67, 55));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(267, 267, 267)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(228, 228, 228)
                                    .addComponent(bdelete_User, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(cb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(bdelete_User)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jd_deleteLayout = new javax.swing.GroupLayout(jd_delete.getContentPane());
        jd_delete.getContentPane().setLayout(jd_deleteLayout);
        jd_deleteLayout.setHorizontalGroup(
            jd_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_deleteLayout.setVerticalGroup(
            jd_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_deleteLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 67, 55));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 36, 48));

        b_insert.setBackground(new java.awt.Color(245, 67, 55));
        b_insert.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_insert.setForeground(new java.awt.Color(255, 255, 255));
        b_insert.setText("Insert");
        b_insert.setToolTipText("");
        b_insert.setBorderPainted(false);
        b_insert.setContentAreaFilled(false);
        b_insert.setOpaque(true);
        b_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_insertMouseClicked(evt);
            }
        });

        b_list.setBackground(new java.awt.Color(245, 67, 55));
        b_list.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_list.setForeground(new java.awt.Color(255, 255, 255));
        b_list.setText("List");
        b_list.setToolTipText("");
        b_list.setBorderPainted(false);
        b_list.setContentAreaFilled(false);
        b_list.setOpaque(true);
        b_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_listMouseClicked(evt);
            }
        });

        b_search.setBackground(new java.awt.Color(245, 67, 55));
        b_search.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_search.setForeground(new java.awt.Color(255, 255, 255));
        b_search.setText("Search");
        b_search.setToolTipText("");
        b_search.setBorderPainted(false);
        b_search.setContentAreaFilled(false);
        b_search.setOpaque(true);
        b_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_searchMouseClicked(evt);
            }
        });

        b_modify.setBackground(new java.awt.Color(245, 67, 55));
        b_modify.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_modify.setForeground(new java.awt.Color(255, 255, 255));
        b_modify.setText("Modify");
        b_modify.setToolTipText("");
        b_modify.setBorderPainted(false);
        b_modify.setContentAreaFilled(false);
        b_modify.setOpaque(true);
        b_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_modifyMouseClicked(evt);
            }
        });

        b_delete.setBackground(new java.awt.Color(245, 67, 55));
        b_delete.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        b_delete.setForeground(new java.awt.Color(255, 255, 255));
        b_delete.setText("Delete");
        b_delete.setToolTipText("");
        b_delete.setBorderPainted(false);
        b_delete.setContentAreaFilled(false);
        b_delete.setOpaque(true);
        b_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_deleteMouseClicked(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        btn_Exit.setBorderPainted(false);
        btn_Exit.setContentAreaFilled(false);
        btn_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_list, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(btn_Exit)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(b_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(b_list, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(b_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_Exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_ExitMouseClicked

    private void b_insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_insertMouseClicked
        this.jd_Insert.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_Insert.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_Insert.setLocationRelativeTo(this);
        this.jd_Insert.setVisible(true);
    }//GEN-LAST:event_b_insertMouseClicked

    private void b_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_listMouseClicked

        try {
            List();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jd_list.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_list.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_list.setLocationRelativeTo(this);
        this.jd_list.setVisible(true);
    }//GEN-LAST:event_b_listMouseClicked

    private void b_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_searchMouseClicked
        this.jd_search.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_search.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_search.setLocationRelativeTo(this);
        try {
            this.ListarCBSearch();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jd_search.setVisible(true);
    }//GEN-LAST:event_b_searchMouseClicked

    private void b_modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_modifyMouseClicked
        this.jd_modify.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_modify.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_modify.setLocationRelativeTo(this);
        try {
            this.ListarCBModificar();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jd_modify.setVisible(true);
    }//GEN-LAST:event_b_modifyMouseClicked

    private void b_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_deleteMouseClicked
        this.jd_delete.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_delete.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_delete.setLocationRelativeTo(this);
        try {
            this.ListarCBDelete();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jd_delete.setVisible(true);
    }//GEN-LAST:event_b_deleteMouseClicked

    private void btn_RegisterUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterUserMouseClicked
        try {
            if ((Integer.parseInt(txt_Id.getText()) < 0) || (Integer.parseInt(txt_SalarioUser.getText()) < 0) || (txt_nombreUser.getText().equals(""))) {
            JOptionPane.showMessageDialog(this.jd_Insert, "No ha llenado todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            Person persona = new Person(Integer.parseInt(txt_SalarioUser.getText()), Integer.parseInt(txt_Id.getText()));

            //Para pasar el nombre a un arreglo de caracteres
            String cadena = txt_nombreUser.getText();
            int size = cadena.length();
            if (size <= 40) {

                String nombre;
                nombre = cadena;
                persona.setName(nombre); //se agrega el nombre

                //Fin de pasar nombre a arreglo de caracteres
                //Para el date
                DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
                String fechaSeleccionada = df.format(jdc_FechaBirth.getDate());
                String fecha;

                fecha = fechaSeleccionada;

                persona.setBirthDate(fecha); //Fin del date
                /**
                 *Se declara el estado del record: 
                 * '-'-> Disponible
                 * '*'-> Borrado
                 */
                persona.setEstadoRecord('-'); 
                

                try {
                    boolean creado = tda.insert(persona);
                    if (creado) {
                        System.out.println("Se inserto el registro");
                    } else {
                        System.out.println("Fallo en ingresar");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this.jd_Insert, "Se presentan muchos caracteres en el nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            }//Fin del if

        }//Fin del if else
        this.txt_Id.setText("");
        this.txt_SalarioUser.setText("");
        this.txt_nombreUser.setText("");
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btn_RegisterUserMouseClicked

    private void b_saveChangesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_saveChangesMouseClicked
        if ((Integer.parseInt(tf_ModifySalary.getText()) < 0) || (Integer.parseInt(tf_ModifyID.getText()) < 0) || (tf_ModifyName.getText().equals(""))) {
            JOptionPane.showMessageDialog(this.jd_modify, "No ha llenado los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            //Para pasar el nombre a un arreglo de caracteres
            String cadena = tf_ModifyName.getText();
            int size = cadena.length();
            if (size <= 40) {

                Person persona = null;
                String nombreAux = (String) cb_modify.getSelectedItem();
                persona = tda.searchModificar(nombreAux);
                System.out.println("La persona se ha encontrado y es: "+persona.toString());
                persona.setEstadoRecord('-');
                persona.setId(Integer.parseInt(tf_ModifyID.getText()));
                persona.setName(tf_ModifyName.getText());
                persona.setSalary(Integer.parseInt(tf_ModifySalary.getText()));

                //Para el date
                DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
                String fechaSeleccionada = df.format(jdateModify.getDate());
                String fecha;
                fecha = fechaSeleccionada;
                persona.setBirthDate(fecha);
                try {
                    //Fin del date
                    boolean seModifico = tda.modify(persona);
                    if(seModifico){
                        JOptionPane.showMessageDialog(this.jd_modify, "Persona modficada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this.jd_modify, "Muchos caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            this.tf_ModifyID.setText("");
            this.tf_ModifyName.setText("");
            this.tf_ModifySalary.setText("");

            this.tf_ModifyID.setEnabled(false);
            this.tf_ModifyName.setEnabled(false);
            this.tf_ModifySalary.setEnabled(false);
            this.jdateModify.setEnabled(false);

        }//Fin del if

    }//GEN-LAST:event_b_saveChangesMouseClicked

    private void b_searchModifyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_searchModifyUserMouseClicked
        System.out.println(cb_modify.getSelectedIndex());
        if (cb_modify.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this.jd_modify, "No ha seleccionado a ninguna persona.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.tf_ModifyID.setEnabled(true);
            this.tf_ModifyName.setEnabled(true);
            this.tf_ModifySalary.setEnabled(true);
            this.jdateModify.setEnabled(true);

        }//Fin del if

    }//GEN-LAST:event_b_searchModifyUserMouseClicked

    private void b_searchUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_searchUserMouseClicked
        // TODO add your handling code here:
        if (cb_search.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this.jd_modify, "No ha seleccionado a ninguna persona.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Person persona = null;
            String nombreAux = (String) cb_search.getSelectedItem();
            for (Person temp : personas) {
                if ((temp.getName()).equals(nombreAux)) {
                    persona = temp;
                    break;
                }//fin if
            }// fin fore
            persona = tda.search(nombreAux);
            //insertar a la tabla
            DefaultTableModel modelo = (DefaultTableModel) jt_tablaSearch.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            Object[] newrow = {
                persona.getId(),
                persona.getName(),
                persona.getBirthDate(),
                persona.getSalary()
            };
            modelo.addRow(newrow);
            jt_tablaSearch.setModel(modelo);
        }//fin else
    }//GEN-LAST:event_b_searchUserMouseClicked

    private void bdelete_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelete_UserMouseClicked
        if (cb_delete.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this.jd_delete, "No ha seleccionado a ninguna persona.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            String nombreAux = (String) cb_delete.getSelectedItem();
            for (Person temp : personas) {
                if ((temp.getName()).equals(nombreAux)) {
                    personaToDelete = temp;
                    break;
                }//fin if
            }// fin fore
            personaToDelete = tda.search(nombreAux);
            //insertar a la tabla
            DefaultTableModel modelo = (DefaultTableModel) jt_tablaDelete.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            Object[] newrow = {
                personaToDelete.getId(),
                personaToDelete.getName(),
                personaToDelete.getBirthDate(),
                personaToDelete.getSalary()
            };
            modelo.addRow(newrow);
            jt_tablaDelete.setModel(modelo);
        }//fin else
    }//GEN-LAST:event_bdelete_UserMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean seBorro=false;
        if(personaToDelete!=null){
            seBorro=tda.delete(personaToDelete);
            personaToDelete= null;
            DefaultTableModel modelo = (DefaultTableModel) jt_tablaDelete.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
        }
        
        JOptionPane.showMessageDialog(this.jd_delete, "Se Borro = "+seBorro);
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_insert;
    private javax.swing.JButton b_list;
    private javax.swing.JButton b_modify;
    private javax.swing.JButton b_saveChanges;
    private javax.swing.JButton b_search;
    private javax.swing.JButton b_searchModifyUser;
    private javax.swing.JButton b_searchUser;
    private javax.swing.JButton bdelete_User;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_RegisterUser;
    private javax.swing.JComboBox<String> cb_delete;
    private javax.swing.JComboBox<String> cb_modify;
    private javax.swing.JComboBox<String> cb_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_Insert;
    private javax.swing.JDialog jd_delete;
    private javax.swing.JDialog jd_list;
    private javax.swing.JDialog jd_modify;
    private javax.swing.JDialog jd_search;
    private com.toedter.calendar.JDateChooser jdateModify;
    private com.toedter.calendar.JDateChooser jdc_FechaBirth;
    private javax.swing.JTable jt_tablaDelete;
    private javax.swing.JTable jt_tablaListar;
    private javax.swing.JTable jt_tablaSearch;
    private javax.swing.JTextField tf_ModifyID;
    private javax.swing.JTextField tf_ModifyName;
    private javax.swing.JTextField tf_ModifySalary;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_SalarioUser;
    private javax.swing.JTextField txt_nombreUser;
    // End of variables declaration//GEN-END:variables

    File archivo = new File("./NeoRegistros");
    TDA_ARLF tda = new TDA_ARLF(archivo);
    ArrayList<Person> personas = new ArrayList();
    Person personaToDelete = null;

    private void List() throws IOException {
        personas = new ArrayList();
        tda.listar();
        personas = tda.getListPersonas();
        DefaultTableModel modelo = (DefaultTableModel) jt_tablaListar.getModel();
        int tamano = modelo.getRowCount();
        if (tamano > 0) {
            for (int i = tamano - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }//Fin del for            
        }

        for (Person temp : personas) {
            Object[] newrow = {
                temp.getId(),
                temp.getName(),
                temp.getBirthDate(),
                temp.getSalary()
            };
            modelo.addRow(newrow);
        }
        
        jt_tablaListar.setModel(modelo);
        
    }
    

    private void ListarCBModificar() throws IOException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_modify.getModel(); //Crea uno nuevo cada vez
        //Resetear el modelo
        modelo.removeAllElements();
        modelo.addElement('-');     
        //==================
        personas=new ArrayList();
        tda.listar();
        personas = tda.getListPersonas();
        for (Person temp : personas) {
            modelo.addElement(temp.getName()); //los pasa con su toString
        }
        cb_modify.setModel(modelo);
    }//Fin del metodo

    private void ListarCBSearch() throws IOException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_search.getModel(); //Crea uno nuevo cada vez
        //Resetear el modelo
        modelo.removeAllElements();
        modelo.addElement('-');     
        //==================
        personas=new ArrayList();
        tda.listar();
        personas = tda.getListPersonas();
        for (Person temp : personas) {
            modelo.addElement(temp.getName()); //los pasa con su toString
        }
        cb_search.setModel(modelo);
        //System.out.println(modelo.getSize());
    }//Fin del metodo

    private void ListarCBDelete() throws IOException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_delete.getModel(); //Crea uno nuevo cada vez
        //Resetear el modelo
        modelo.removeAllElements();
        modelo.addElement('-');     
        //==================
        personas=new ArrayList();
        tda.listar();
        personas = tda.getListPersonas();
        for (Person temp : personas) {
            modelo.addElement(temp.getName()); //los pasa con su toString
        }
        cb_delete.setModel(modelo);
    }//Fin del metodo
    
    
        public ArrayList<Person> sortOtherArrays(ArrayList temp) { //se realiza el sort del arrayList para el split
        Collections.sort(temp, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                String id1 = o1.getId() + "";
                String id2 = o2.getId() + "";
                return id1.compareTo(id2);
            }
        });
        return temp;
    }
        
        
        public void LlenarRegistros(){
            File x = null;
            FileReader fr = null;
            BufferedReader br = null;
            Person p;
            
            File x2 = new File("./NeoRegistros");
            TDA_ARLF tempTDA = new TDA_ARLF(x2);
            int numRegistros = 0;

            //Inicio de metodo con BufferedReader
            try {
                x = new File("./NeoRegistros.txt");
                fr = new FileReader(x);
                br = new BufferedReader(fr);

                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String[] lineas = linea.split(";");
                    p = new Person('-', Integer.parseInt(lineas[2]), lineas[0], lineas[1], Float.parseFloat(lineas[3]));//estado,id,nombre,fecha,salario
                    tempTDA.insert(p);
                    numRegistros++;
                    //System.out.println("Registro: "+numRegistros);
                    //personas.add(p);
                }//Fin del while
            } catch (Exception e) {
                e.printStackTrace();
            }
            //Cerrar lectura de archivo
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
            }

            
        }
        
        
        

}//Fin de la clase
