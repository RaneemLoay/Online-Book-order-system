/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OnlineBookOrderSystem;

import java.io.File;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author tarik
 */
public class ManageBookForm extends javax.swing.JFrame {

    /**
     * Creates new form AddCategoryForm
     */
    connect_database DB = connect_database.getInstance();
    String id;
    String filename;
    String filename2;
    boolean uploded;

    public ManageBookForm() {
        initComponents();
        try {
            connect_database con = connect_database.getInstance();
            String query1 = "SELECT * FROM category";
            ResultSet res = con.retrivedata(query1);
            while (res.next()) {
                String categoryName = res.getString("name");
                CategoriesComboBox.addItem(categoryName);
            }
        } catch (Exception ex) {
        }
        try {

            ResultSet rs = DB.retrivedata("select * from book");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Delete_book_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        available_units_txt = new javax.swing.JTextField();
        book_price_txt = new javax.swing.JTextField();
        book_edition_txt = new javax.swing.JTextField();
        upload_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        book_name_txt = new javax.swing.JTextField();
        book_status_txt = new javax.swing.JTextField();
        Update_book_btn = new javax.swing.JButton();
        Add_book_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        Author_name_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CategoriesComboBox = new javax.swing.JComboBox<>();
        book_pop_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Jimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 640));
        setPreferredSize(new java.awt.Dimension(1000, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,120));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 640));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category Name:");

        Delete_book_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Delete_book_btn.setText("Delete");
        Delete_book_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_book_btnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available units:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book price:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book edition:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book cover:");

        available_units_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                available_units_txtActionPerformed(evt);
            }
        });

        upload_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        upload_btn.setText("Upload Cover");
        upload_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_btnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book Name:");

        book_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_name_txtActionPerformed(evt);
            }
        });

        Update_book_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Update_book_btn.setText("Update");
        Update_book_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_book_btnActionPerformed(evt);
            }
        });

        Add_book_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Add_book_btn.setText("Add");
        Add_book_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_book_btnActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book status:");

        cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel_btn.setText("Back");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Author Name:");

        CategoriesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book popularity:");

        jTable1.setBackground(new java.awt.Color(248, 248, 255));
        jTable1.setForeground(new java.awt.Color(24, 130, 203));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BookId", "Book Name", "Author Name", "Edition", "Discription", "Popularity", "Book Category", "Price", "Available Units", "Book cover", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, false, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(248, 248, 255));
        jTable1.setSelectionBackground(new java.awt.Color(248, 248, 255));
        jTable1.setSelectionForeground(new java.awt.Color(24, 130, 203));
        jTable1.setShowHorizontalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(820, 820, 820)
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(book_pop_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upload_btn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(book_edition_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(book_status_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(available_units_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(book_price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(book_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Author_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(Add_book_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update_book_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete_book_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Author_name_txt, CategoriesComboBox, available_units_txt, book_edition_txt, book_name_txt, book_pop_txt, book_price_txt, book_status_txt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Author_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(book_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(available_units_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(book_price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(book_edition_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(book_status_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(book_pop_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(upload_btn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_book_btn)
                    .addComponent(Update_book_btn)
                    .addComponent(Delete_book_btn))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel_btn)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Author_name_txt, available_units_txt, book_edition_txt, book_name_txt, book_pop_txt, book_price_txt, book_status_txt});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 630));

        Jimage.setForeground(new java.awt.Color(255, 255, 255));
        Jimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        Jimage.setText("jLabel5");
        Jimage.setMaximumSize(new java.awt.Dimension(1000, 1000));
        Jimage.setMinimumSize(new java.awt.Dimension(1000, 640));
        Jimage.setPreferredSize(new java.awt.Dimension(1000, 640));
        getContentPane().add(Jimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Delete_book_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_book_btnActionPerformed
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int bookID = Integer.parseInt(table.getValueAt(jTable1.getSelectedRow(), 0).toString());
        if (jTable1.getSelectedRowCount() == 1) {
            table.removeRow(jTable1.getSelectedRow());
            try {
                connect_database con = connect_database.getInstance();
                String query = "DELETE FROM book WHERE id = '" + bookID + "'";
                con.queurydata(query);
                JOptionPane.showMessageDialog(this, "slected book is deleted successfully !");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "The table is empty");

            } else {
                JOptionPane.showMessageDialog(this, "Please select single row");

            }
        }
    }//GEN-LAST:event_Delete_book_btnActionPerformed

    private void available_units_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_available_units_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_available_units_txtActionPerformed

    private void book_name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_name_txtActionPerformed

    private void Update_book_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_book_btnActionPerformed
//        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
//        if (jTable1.getSelectedRowCount() == 1) {
//
//            String name = book_name_txt.getText();
//            String Aname = Author_name_txt.getText();
//            String edition = book_edition_txt.getText();
//            int cindex = CategoriesComboBox.getSelectedIndex();
//            String cindext = String.valueOf(cindex) + 1;
//            String price = book_price_txt.getText();
//            String aunits = available_units_txt.getText();
//            String status = book_status_txt.getText();
//            String popularity = book_pop_txt.getText();
//
//            table.setValueAt(name, jTable1.getSelectedRow(), 1);
//            table.setValueAt(Aname, jTable1.getSelectedRow(), 2);
//            table.setValueAt(edition, jTable1.getSelectedRow(), 3);
//            table.setValueAt(cindext, jTable1.getSelectedRow(), 5);
//            table.setValueAt(price, jTable1.getSelectedRow(), 6);
//            table.setValueAt(aunits, jTable1.getSelectedRow(), 7);
//            table.setValueAt(status, jTable1.getSelectedRow(), 9);
//            table.setValueAt(popularity, jTable1.getSelectedRow(), 4);
//            System.out.println(id);
//            try {
//
//                DB.queurydata("Update book set book_name = '" + name + "' , author_name = '" + Aname + "' ,"
//                        + " edition = '" + edition + "' , popularity = '" + popularity + "', book_category = '" + cindex + "' , price = '" + price + "',"
//                        + " available_units = '" + aunits + "', status = '"+status+"', book_cover = '" + filename + "' where id = '" + id + "' ");
//                JOptionPane.showMessageDialog(this, "Update Successfully...");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            if (jTable1.getRowCount() == 0) {
//                JOptionPane.showMessageDialog(this, "Table Empty...");
//
//            } else {
//                JOptionPane.showMessageDialog(this, "Please Select Single Row...");
//
//            }
//        }
       DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            String name = book_name_txt.getText();
            String Aname = Author_name_txt.getText();
            String edition = book_edition_txt.getText();
            int cind = CategoriesComboBox.getSelectedIndex();
            cind++;
            String cindext = String.valueOf(cind);
            String price = book_price_txt.getText();
            String aunits = available_units_txt.getText();
            String status = book_status_txt.getText();
            String popularity = book_pop_txt.getText();
            String filecover;
            table.setValueAt(name, jTable1.getSelectedRow(), 1);
            table.setValueAt(Aname, jTable1.getSelectedRow(), 2);
            table.setValueAt(edition, jTable1.getSelectedRow(), 3);
            table.setValueAt(popularity, jTable1.getSelectedRow(), 4);
            table.setValueAt(cindext, jTable1.getSelectedRow(), 5);
            table.setValueAt(price, jTable1.getSelectedRow(), 6);
            table.setValueAt(aunits, jTable1.getSelectedRow(), 7);
            table.setValueAt(filename, jTable1.getSelectedRow(), 8);
            table.setValueAt(status, jTable1.getSelectedRow(), 9);
            if (uploded) {
                filecover = filename2;
            } else {
                filecover = filename;
            }
            System.out.println(filename);
            try {
                DB.queurydata("Update book set book_name = '" + name + "' , author_name = '" + Aname + "' ,"
                        + " edition = '" + edition + "' , popularity = '" + popularity + "', book_category = '" + cind + "'"
                        + " , price = '" + price + "',"
                        + " available_units = '" + aunits + "' , book_cover = '" + filecover + "'"
                        + ", status = '" + status + "' where id = '" + id + "' ");
                JOptionPane.showMessageDialog(this, "Update Successfully...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty...");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row...");

            }
        }

    }//GEN-LAST:event_Update_book_btnActionPerformed

    private void Add_book_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_book_btnActionPerformed
//        try {
//            int cid = CategoriesComboBox.getSelectedIndex() + 1;
//            String aname = Author_name_txt.getText();
//            String bname = book_name_txt.getText();
//            int avlunits = Integer.parseInt(available_units_txt.getText());
//            Float bPrice = Float.valueOf(book_price_txt.getText());
//            String bEdition = book_edition_txt.getText();
//            String bStatus = book_status_txt.getText();
//            String popularity = book_pop_txt.getText();
//
//            int id = 0;
//            connect_database con = connect_database.getInstance();
////            String query1 = "SELECT MAX(id) AS max_id FROM book ";
////            ResultSet res = con.retrivedata(query1);
////            if (res.next()) {
////                id = res.getInt("max_id") + 1;
////            }
//            String query = "INSERT INTO book (book_name,author_name,edition,popularity,book_category,price,available_units,status,book_cover) "
//                    + "values( '" + bname + "', '" + aname + "', '" + bEdition + "','" + popularity + "', '" + cid + "', '" + bPrice + "', '" + avlunits + "', '" +bStatus +"', '"+ filename + "')";
//            con.queurydata(query);
//            JOptionPane.showMessageDialog(null, "Book Added Successfully");
//            new ManageBookForm().setVisible(true);
//        } catch (Exception ex) {
//            JOptionPane.showConfirmDialog(null, "Enter All Empty Fields", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    try {
            int cid = 1;
            String aname = Author_name_txt.getText();
            String bname = book_name_txt.getText();
            int avlunits = Integer.parseInt(available_units_txt.getText());
            Float bPrice = Float.valueOf(book_price_txt.getText());
            String bEdition = book_edition_txt.getText();
            String bStatus = book_status_txt.getText();
            String popularity = book_pop_txt.getText();
            connect_database con = connect_database.getInstance();
            Object cname = CategoriesComboBox.getSelectedItem();
            String query1 = "SELECT id FROM category where name = '" + cname + "'";
            ResultSet res = con.retrivedata(query1);
            if (res.next()) {
                cid = res.getInt("id");
            }
            String query = "INSERT INTO book (book_name,author_name,edition,popularity,book_category,price,available_units,book_cover,status) "
                    + "values( '" + bname + "', '" + aname + "', '" + bEdition + "','" + popularity
                    + "', '" + cid + "', '" + bPrice + "', '" + avlunits + "', '" + filename + "', '" + bStatus + "')";
            con.queurydata(query);
            JOptionPane.showMessageDialog(null, "Book Added Successfully");
            new ManageBookForm().setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Enter All Empty Fields", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_Add_book_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        new AdminForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        id = table.getValueAt(jTable1.getSelectedRow(), 0).toString();

        String name = table.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String Aname = table.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String edition = table.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String popularity = table.getValueAt(jTable1.getSelectedRow(), 4).toString();

        String temp = table.getValueAt(jTable1.getSelectedRow(), 5).toString();
        int cindex = Integer.parseInt(temp);
        String price = table.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String aunits = table.getValueAt(jTable1.getSelectedRow(), 7).toString();
        filename = table.getValueAt(jTable1.getSelectedRow(), 8).toString();

         String status = table.getValueAt(jTable1.getSelectedRow(), 9).toString();
        book_name_txt.setText(name);
        Author_name_txt.setText(Aname);
        book_edition_txt.setText(edition);
        CategoriesComboBox.setSelectedIndex(cindex - 1);
        book_price_txt.setText(price);
        available_units_txt.setText(aunits);
        book_status_txt.setText(status);
        book_pop_txt.setText(popularity);
    }//GEN-LAST:event_jTable1MouseClicked

    private void CategoriesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriesComboBoxActionPerformed

    }//GEN-LAST:event_CategoriesComboBoxActionPerformed

    private void upload_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_btnActionPerformed
  JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        int res = chooser.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            filename = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(filename);
            filename2 = filename.replace("\\", "\\\\");
            uploded = true;
        }
    }//GEN-LAST:event_upload_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_book_btn;
    private javax.swing.JTextField Author_name_txt;
    private javax.swing.JComboBox<String> CategoriesComboBox;
    private javax.swing.JButton Delete_book_btn;
    private javax.swing.JLabel Jimage;
    private javax.swing.JButton Update_book_btn;
    private javax.swing.JTextField available_units_txt;
    private javax.swing.JTextField book_edition_txt;
    private javax.swing.JTextField book_name_txt;
    private javax.swing.JTextField book_pop_txt;
    private javax.swing.JTextField book_price_txt;
    private javax.swing.JTextField book_status_txt;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton upload_btn;
    // End of variables declaration//GEN-END:variables
}
