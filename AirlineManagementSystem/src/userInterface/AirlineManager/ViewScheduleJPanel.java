/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AirlineManager;

import Business.AirlineDirectory;
import Business.Airlines;
import Business.FlightDirectory;
import Business.Flights;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanny
 */
public class ViewScheduleJPanel extends javax.swing.JPanel {

    JPanel panel;
    int seat;
    String item;
    FlightDirectory fd;
    AirlineDirectory airdir;
    Airlines a;
    public ViewScheduleJPanel(FlightDirectory fd,String item,JPanel panel, int seat,AirlineDirectory airdir,Airlines a) {
        initComponents();
        this.panel=panel;
        this.seat=seat;
        this.a=a;
        this.item=item;
        this.fd=fd;
        this.airdir=airdir;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Source", "Destination", "Departure Time", "Date"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<  Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
//         for(Airlines a1 :airdir.getAirlineDir()){
//            for(Flights f : a1.getFlightdir().getFlightDir()){
//               Object row[]= new Object[5];
//                row[0]=f;//.getItem();
//                row[1]=f.getSource();
//                row[2]=f.getDestination();
//                row[3]=f.getDepTime();
//                row[4]=f.getDate();
//                dtm.addRow(row); 
//            }
//        }
        for(Flights f : fd.getFlightDir()){
            Object row[]= new Object[4];
            row[0]=f;
            row[1]=f.getDestination();
            row[2]=f.getDepTime();
            row[3]=f.getDate()+"-"+f.getMonth();
            dtm.addRow(row);
        }
       }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       panel.remove(this);
        CardLayout layout = (CardLayout)panel.getLayout();
        layout.previous(panel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tbl.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Flights flightDel = (Flights)tbl.getValueAt(selectedRow, 0);
                fd.removeFlight(flightDel);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else{
            Flights f = (Flights) tbl.getValueAt(selectedRow, 0);
            UpdateFlightDetails view = new UpdateFlightDetails(panel, f, fd);
            panel.add("UpdateFlightDetails", view);
            CardLayout layout = (CardLayout)panel.getLayout();
            layout.next(panel);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}