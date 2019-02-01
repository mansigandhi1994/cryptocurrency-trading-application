/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CheckingAccountRole;

import Business.Account.Account;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.WorkQueue.CheckingAccountWorkRequest;
import Business.WorkQueue.SavingAccountWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author poojahiremath
 */
public class ProcessCheckingAccountRequestJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    CheckingAccountWorkRequest swr;
    EcoSystem ecosystem;
    //private static int count=2000000;
    private int id;
    private double rand;

    /**
     * Creates new form ProcessCheckingAccountRequestJPanel
     */
    public ProcessCheckingAccountRequestJPanel(JPanel userProcessContainer, CheckingAccountWorkRequest swr,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.swr=swr;
        this.ecosystem= ecosystem;
        rand = Math.random()*10000000;
        id = (int)rand;
        System.out.println("Checking Process Id>>"+id);
        nameTF.setText(swr.getSender().getUsername());
        idTF.setText(String.valueOf(id));
        
        
        //count++;  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSend = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(0, 153, 153));
        btnSend.setText("Send ID");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameTF.setForeground(new java.awt.Color(0, 153, 153));
        nameTF.setEnabled(false);

        idTF.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        idTF.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Customer Name:");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Checking Account ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnBack)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btnSend)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(btnSend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        Account acc=new Account();
        acc.setType("Checking");
        acc.setBal(1000);
        acc.setId(id);
        acc.setBankName(swr.getsEnterprise());
        
        List<Customer> list=ecosystem.getCustomerDirectory().getCustomerList();
        for(Customer cus:list){
            System.out.println(list);
            //String s1=usr.getUsername();
            // String s2=swr.getSender().getUsername();
            if(cus.getUseraccount().getUsername().equalsIgnoreCase(swr.getSender().getUsername()))
            {
                cus.getAccountList().add(acc);
                JOptionPane.showMessageDialog(null, "account added to account list");
            }

        }
        swr.setStatus("Completed");
        swr.setResolveDate(new Date());
        System.out.println("Checking account created for customer");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] components = userProcessContainer.getComponents();
        for (Component c : components) {
            if (c instanceof CheckingAccountWorkAreaJPanel) {
                CheckingAccountWorkAreaJPanel checkingAccountWorkAreaJPanel = (CheckingAccountWorkAreaJPanel) c;
                checkingAccountWorkAreaJPanel.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameTF;
    // End of variables declaration//GEN-END:variables
}
