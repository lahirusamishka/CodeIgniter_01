/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lk.ijse.sellingsystem.controller.SupplierAddController;
import lk.ijse.sellingsystem.core.dto.SupplierDTO;
import lk.ijse.sellingsystem.idgenerator.IDGenerator;
import static sun.font.FontManagerNativeLibrary.load;

/**
 *
 * @author Samishka
 */
public class SupplierAdd extends javax.swing.JPanel {

    /**
     * Creates new form SupplierAdd
     */
    public SupplierAdd() {
        initComponents();
        lordSupplierId();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        btnNew = new org.jdesktop.swingx.JXLabel();
        btnDelete = new org.jdesktop.swingx.JXLabel();
        btnSave = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerView = new org.jdesktop.swingx.JXTable();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        txtSupplierId = new org.jdesktop.swingx.JXTextField();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        txtCustomerNIC1 = new org.jdesktop.swingx.JXTextField();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        txtSupplierAddress = new org.jdesktop.swingx.JXTextField();
        txtEmail = new org.jdesktop.swingx.JXTextField();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        txtPhoneNo = new org.jdesktop.swingx.JXTextField();
        txtSupplierName = new org.jdesktop.swingx.JXTextField();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jXLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jXLabel2.setText("ADD SUPPLIER ");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel2);

        jXLabel1.setBackground(new java.awt.Color(235, 235, 235));
        jXPanel1.add(jXLabel1);

        add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 30));

        jXPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jXPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew.setBackground(new java.awt.Color(153, 153, 153));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/add (4).png"))); // NOI18N
        btnNew.setText("NEW");
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setOpaque(true);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
        });
        jXPanel2.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/delete4.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        jXPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 90, 40));

        btnSave.setBackground(new java.awt.Color(153, 153, 153));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/sav4.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        jXPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 90, 40));

        add(jXPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        tblCustomerView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Name", "Phone no"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCustomerView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomerView);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 37, 520, 510));

        jXPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jXLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jXLabel3.setText("ADD SUPPLIER ");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel3.add(jXLabel3);

        jXLabel4.setBackground(new java.awt.Color(235, 235, 235));
        jXPanel3.add(jXLabel4);

        add(jXPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1060, 30));

        txtSupplierId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSupplierId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSupplierId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierIdActionPerformed(evt);
            }
        });
        add(txtSupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 92, 120, 30));

        jXLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel8.setText("Supplier  ID");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 130, 30));

        jXLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel9.setText("Supplier  NIC");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 130, 30));

        txtCustomerNIC1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCustomerNIC1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCustomerNIC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNIC1ActionPerformed(evt);
            }
        });
        add(txtCustomerNIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 138, 120, 30));

        jXLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel6.setText("Supplier  Address");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, 130, 30));

        txtSupplierAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSupplierAddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSupplierAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierAddressActionPerformed(evt);
            }
        });
        add(txtSupplierAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 234, 380, 30));

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 284, 380, 30));

        jXLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel10.setText("Email Address");
        jXLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 120, 30));

        jXLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel7.setText("Phone Number");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 120, 30));

        txtPhoneNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });
        add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 334, 120, 30));

        txtSupplierName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSupplierName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierNameActionPerformed(evt);
            }
        });
        add(txtSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 186, 120, 30));

        jXLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel11.setText("Supplier  Name");
        jXLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tblCustomerViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerViewMouseClicked

    }//GEN-LAST:event_tblCustomerViewMouseClicked

    private void txtSupplierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierIdActionPerformed

    private void txtCustomerNIC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNIC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNIC1ActionPerformed

    private void txtSupplierAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierNameActionPerformed

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/sav4.png"));
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/sav3.png"));
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
            SupplierDTO supplier;
            supplier = new SupplierDTO(
                    txtSupplierId.getText(),
                    txtCustomerNIC1.getText(),
                    txtSupplierName.getText(),
                    txtSupplierAddress.getText(),
                    txtEmail.getText(),
                    txtPhoneNo.getText()
            );
            boolean result = SupplierAddController.addSupplier(supplier);

            if (result) {
                JOption mass = new JOption();
                mass.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Customer hasn't been added due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(SupplierAdd.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/delete4.png"));
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/delete5.png"));
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
        btnNew.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/add (4).png"));
        btnNew.setIcon(icon);
    }//GEN-LAST:event_btnNewMouseExited

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/add 4_1.png"));
        btnNew.setIcon(icon);
    }//GEN-LAST:event_btnNewMouseEntered

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked

    }//GEN-LAST:event_btnNewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel btnDelete;
    private org.jdesktop.swingx.JXLabel btnNew;
    private org.jdesktop.swingx.JXLabel btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private org.jdesktop.swingx.JXTable tblCustomerView;
    private org.jdesktop.swingx.JXTextField txtCustomerNIC1;
    private org.jdesktop.swingx.JXTextField txtEmail;
    private org.jdesktop.swingx.JXTextField txtPhoneNo;
    private org.jdesktop.swingx.JXTextField txtSupplierAddress;
    private org.jdesktop.swingx.JXTextField txtSupplierId;
    private org.jdesktop.swingx.JXTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

    private void lordSupplierId() {
   
      
        try {
            String orderId;
            orderId = IDGenerator.getNewsupplierID("Supplier","id", "SI");
            txtSupplierId.setText(orderId);
        } catch (SQLException ex) {
            Logger.getLogger(SupplierAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

   
}
