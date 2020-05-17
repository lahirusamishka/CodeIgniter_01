/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Samishka
 */
public class HomePanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
        setTime();
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
        jXMonthView1 = new org.jdesktop.swingx.JXMonthView();
        lblTime = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();

        setLayout(null);

        jXPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXMonthView1.setBackground(new java.awt.Color(255, 255, 255));
        jXMonthView1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXMonthView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, 180));

        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jXPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 290, 80));

        jXLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/image/background-blur.png"))); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 1140, 560));

        jXLabel1.setBackground(new java.awt.Color(0, 135, 135));
        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/image/new-vehicle-prices-in-Sri-Lanka.jpg"))); // NOI18N
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 2050, 880));

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jXPanel1.add(jXPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 280, 60));

        add(jXPanel1);
        jXPanel1.setBounds(0, 0, 2050, 730);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel jXLabel1;
    public static org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXMonthView jXMonthView1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXLabel lblTime;
    // End of variables declaration//GEN-END:variables

    private void setTime() {
        
    new Timer(0, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date d=new Date();
            SimpleDateFormat time=new SimpleDateFormat("hh:mm:ss a");
            lblTime.setText(time.format(d));
        }
    }).start();
    
    
    }
}