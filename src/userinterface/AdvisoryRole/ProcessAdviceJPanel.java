/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdvisoryRole;

import Business.Coins.Coins;
import Business.Customer.CoinWallet;
import Business.EcoSystem;
import Business.Investment.Investment;
import Business.WorkQueue.AdviceWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mansigandhi
 */
public class ProcessAdviceJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
AdviceWorkRequest awr;
EcoSystem business;
    /**
     * Creates new form ProcessAdviceJPanel
     */
    public ProcessAdviceJPanel(JPanel userProcessContainer, AdviceWorkRequest awr,EcoSystem business) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.awr=awr;
        this.business= business;
        populateCoins();
        populateTable();
        txtInvestAmnt.setText(String.valueOf(awr.getdAmount()));
    }


     public void populateTable() {
        Timer timer = new Timer();
        TimerTask tsk = new TimerTask() {

            @Override
            public void run() {
                DefaultTableModel model = (DefaultTableModel) liveContentsTable.getModel();
                model.setRowCount(0);
                for (Coins c : business.getCoinsCatalog().getCoinsList()) {
                    Object[] row = new Object[2];
                    row[0] = c.getdPrice();
                    row[1] = c.getSymbol();
                    model.addRow(row);
                }
            }
        };
        timer.schedule(tsk, 0, 5000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liveContentsTable = new javax.swing.JTable();
        txtInvestAmnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCoins1 = new javax.swing.JComboBox();
        cmbCoins = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnAddCoins = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdvice = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        liveContentsTable1 = new javax.swing.JTable();
        txtInvestAmnt1 = new javax.swing.JTextField();

        jLabel2.setText("Investment Amount:");

        liveContentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RATE", "COIN SYMBOLS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(liveContentsTable);

        jLabel3.setText("Coin Type:");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Coin Type:");

        btnAddCoins.setText("Add");
        btnAddCoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCoinsActionPerformed(evt);
            }
        });

        tblAdvice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coin", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblAdvice);

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSend.setText("Send Advice");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setText("Investment Amount:");

        liveContentsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RATE", "COIN SYMBOLS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(liveContentsTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtInvestAmnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCoins, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnAddCoins))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemove)
                            .addGap(34, 34, 34)
                            .addComponent(btnSend)
                            .addGap(12, 12, 12))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInvestAmnt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCoins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnAddCoins))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnSend)
                    .addComponent(btnBack))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateCoins() {
        for (Coins c : business.getCoinsCatalog().getCoinsList()) {
            cmbCoins.addItem(c);
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] components = userProcessContainer.getComponents();
        for (Component c : components) {
            if (c instanceof AdvisoryWorkAreaJPanel) {
                AdvisoryWorkAreaJPanel advisoryWorkJPanel = (AdvisoryWorkAreaJPanel) c;
                advisoryWorkJPanel.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        awr.setStatus("Completed");
        awr.setResolveDate(new Date());
        double amount= 0;
        for (int i = 0; i < tblAdvice.getRowCount(); i++) {
            Investment invest = new Investment();
            invest.setCoin((Coins)tblAdvice.getValueAt(i, 0));
            Double price = (Double)tblAdvice.getValueAt(i, 1);
            invest.setdPrice(price);
            Integer quantity = Integer.parseInt((String) tblAdvice.getValueAt(i, 2));
            invest.setQuantity(quantity);
            amount = amount + (price*quantity);
            if (amount <= awr.getdAmount()){
                awr.addInvestment(invest);
            }
            else{
                JOptionPane.showMessageDialog(null, "Advice amount is more thann investment amount");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Advice sent successfully");
        System.out.println("Suggested coins advice processed and sent to customer");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnAddCoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCoinsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblAdvice.getModel();
        Coins c = (Coins) cmbCoins.getSelectedItem();

        Object[] row = new Object[2];
        row[0] = c;
        row[1] = c.getdPrice();

        model.addRow(row);
        cmbCoins.removeItem(c);
    }//GEN-LAST:event_btnAddCoinsActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdvice.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a coin to remove first");
        } else {

            int modelIndex = tblAdvice.convertRowIndexToModel(selectedRow); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) tblAdvice.getModel();
            model.removeRow(modelIndex);
            cmbCoins.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCoins;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox cmbCoins;
    private javax.swing.JComboBox cmbCoins1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable liveContentsTable;
    private javax.swing.JTable liveContentsTable1;
    private javax.swing.JTable tblAdvice;
    private javax.swing.JTextField txtInvestAmnt;
    private javax.swing.JTextField txtInvestAmnt1;
    // End of variables declaration//GEN-END:variables
}