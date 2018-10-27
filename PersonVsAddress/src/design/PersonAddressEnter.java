/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import data.Address;
import data.Person;
import javax.swing.JOptionPane;
import sun.security.x509.X500Name;

/**
 *
 * @author Tanny
 */
public class PersonAddressEnter extends javax.swing.JPanel {

    Person p;
    Address workAddress;
    Address homeAddress;
    Address otherAddress;
    public PersonAddressEnter(Person person) {
        initComponents();
        this.p = person;
        workAddress= new Address();
        homeAddress= new Address();
        otherAddress= new Address();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        s = new javax.swing.JScrollPane();
        streetAdd = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        line1Work = new javax.swing.JTextField();
        line2Work = new javax.swing.JTextField();
        cityWork = new javax.swing.JTextField();
        stateWork = new javax.swing.JTextField();
        zipWork = new javax.swing.JTextField();
        countryWork = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        line1Home = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        line2Home = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        line1Other = new javax.swing.JTextField();
        line2Other = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cityHome = new javax.swing.JTextField();
        cityOther = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        stateHome = new javax.swing.JTextField();
        stateOther = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        zipHome = new javax.swing.JTextField();
        countryHome = new javax.swing.JTextField();
        countryOther = new javax.swing.JTextField();
        zipOther = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Person Profile");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Street Address");

        jLabel5.setText("Date of birth(yyyy/mm/dd)");

        lastNameTxt.setToolTipText("");

        streetAdd.setColumns(20);
        streetAdd.setRows(5);
        s.setViewportView(streetAdd);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Work address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Home address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Other address");

        jLabel9.setText("Street line 1");

        jLabel10.setText("Street line 2");

        jLabel11.setText("City");

        jLabel12.setText("State");

        jLabel13.setText("Zip");

        jLabel14.setText("Country");

        line1Work.setToolTipText("");

        jLabel15.setText("Street line 1");

        jLabel16.setText("Street line 2");

        jLabel17.setText("Street line 1");

        jLabel18.setText("Street line 2");

        jLabel19.setText("City");

        jLabel20.setText("City");

        jLabel21.setText("State");

        jLabel22.setText("State");

        jLabel23.setText("Zip");

        jLabel24.setText("Zip");

        jLabel25.setText("Country");

        jLabel26.setText("Country");

        zipHome.setVerifyInputWhenFocusTarget(false);

        saveBtn.setText("Save Details");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(lastNameTxt)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dob)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel7)
                                .addContainerGap(175, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(line1Work, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(countryWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(zipWork, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stateWork, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityWork, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(line2Work))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(line1Home, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cityHome, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(stateHome, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(zipHome, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(countryHome, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(line2Home, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(countryOther, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                    .addComponent(zipOther, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(line2Other, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(line1Other)
                                        .addComponent(cityOther)
                                        .addComponent(stateOther)))))
                        .addGap(0, 37, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(saveBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(line1Work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(line1Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(line1Other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(line2Work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(line2Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(line2Other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cityWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(cityHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(stateWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(stateOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(zipWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(zipHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(countryWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel26)
                    .addComponent(countryOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveBtn))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        p.setFirstName(firstNameTxt.getText());
        p.setLastName(lastNameTxt.getText());
        p.setStreetAddress(streetAdd.getText());
        p.setDob(dob.getText());
        
        workAddress.setStreetLine1(line1Work.getText());
        workAddress.setStreetLine2(line2Work.getText());
        workAddress.setCountry(countryWork.getText());
        workAddress.setState(stateWork.getText());
        workAddress.setCity(cityWork.getText());
        workAddress.setZip(zipWork.getText());
        p.setWorkAddress(workAddress);
        
        homeAddress.setStreetLine1(line1Home.getText());
        homeAddress.setStreetLine2(line2Home.getText());
        homeAddress.setCountry(countryHome.getText());
        homeAddress.setState(stateHome.getText());
        homeAddress.setCity(cityHome.getText());
        homeAddress.setZip(zipHome.getText());
        p.setHomeAddress(homeAddress);
        
        otherAddress.setStreetLine1(line1Other.getText());
        otherAddress.setStreetLine2(line2Other.getText());
        otherAddress.setCountry(countryOther.getText());
        otherAddress.setState(stateOther.getText());
        otherAddress.setCity(cityOther.getText());
        otherAddress.setZip(zipOther.getText());
        p.setOtherAddress(otherAddress);
        JOptionPane.showMessageDialog(null, "Details saved!");
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityHome;
    private javax.swing.JTextField cityOther;
    private javax.swing.JTextField cityWork;
    private javax.swing.JTextField countryHome;
    private javax.swing.JTextField countryOther;
    private javax.swing.JTextField countryWork;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField firstNameTxt;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField line1Home;
    private javax.swing.JTextField line1Other;
    private javax.swing.JTextField line1Work;
    private javax.swing.JTextField line2Home;
    private javax.swing.JTextField line2Other;
    private javax.swing.JTextField line2Work;
    private javax.swing.JScrollPane s;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField stateHome;
    private javax.swing.JTextField stateOther;
    private javax.swing.JTextField stateWork;
    private javax.swing.JTextArea streetAdd;
    private javax.swing.JTextField zipHome;
    private javax.swing.JTextField zipOther;
    private javax.swing.JTextField zipWork;
    // End of variables declaration//GEN-END:variables
}
