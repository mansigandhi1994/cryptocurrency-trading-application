/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
   
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(0, 153, 153));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 523, 140));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Network");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(0, 153, 153));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 136, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        usernameJTextField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(0, 153, 153));
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 136, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Enterprise");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(0, 153, 153));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 136, -1));

        submitJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitJButton1.setForeground(new java.awt.Color(0, 153, 153));
        submitJButton1.setText("Submit");
        submitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(submitJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        nameJTextField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 136, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        passwordJPasswordField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(0, 153, 153));
        passwordJPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 134, -1));

        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 153, 153));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
private boolean chkUserName()
    {
        Pattern p = Pattern.compile("^([a-zA-Z0-9]{1}+)([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+).([a-zA-Z]{2,5})$");
        Matcher m = p.matcher(usernameJTextField.getText());
        boolean b = m.find();
        if(b == true){
            return false;
        }
        else {
            return true;
        }   
    }
 private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("[^A-Za-z0-9@$&]");
        Matcher m = p.matcher(String.valueOf(passwordJPasswordField.getPassword()));
        boolean b = m.find();
        if(b == true){
            System.out.println("There is a special character in my string.");
            return false;
        }
        else {
            System.out.println("There is no special character.");
            return true;
        }
    }private boolean containsDigit(String s) {
    boolean containsDigit = false;

    if (s != null && !s.isEmpty()) {
        for (char c : s.toCharArray()) {
            if (containsDigit = Character.isDigit(c)) {
                break;
            }
        }
    }

    return containsDigit;
}
private boolean containsSpecialCharacter(String s)
{
    boolean status =false ;
    Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
 
      //String str = "abc@";
      Matcher matcher = pattern.matcher(s);
 
      if (!matcher.matches()) {
          status=true;
      } 
      return status;
}
    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void submitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton1ActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        String name=nameJTextField.getText();
        String userName=usernameJTextField.getText();
        boolean isInteger=containsDigit(name);
        boolean isSpecial=containsSpecialCharacter(name);
        for(UserAccount account:system.getUserDirectory().getUserAccountList())
        {

            System.out.println(account);
            if(account.getUsername().equalsIgnoreCase(userName))
            {
                JOptionPane.showMessageDialog(this,"Username already exists.Please enter a different user name.");
                return;

            }

        }
        for(UserAccount account:enterprise.getUserAccountDirectory().getUserAccountList())
        {

            System.out.println(account);
            if(account.getUsername().equalsIgnoreCase(userName))
            {
                JOptionPane.showMessageDialog(this,"Username already exists.Please enter a different user name.");
                return;

            }
        }

        String username = usernameJTextField.getText();
        if (chkUserName())
        {
            JOptionPane.showMessageDialog(this,"Username is invalid.Please enter valid user name.");
            return;
        }

        String password = String.valueOf(passwordJPasswordField.getPassword());
        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(this, "password must contain alphanumeric values and @ $ and & only");
            passwordJPasswordField.setText("");

            return;
        }
        // String name = nameJTextField.getText();
        if(nameJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The name field can not be blank", "Warning", JOptionPane.INFORMATION_MESSAGE);
            nameJTextField.setText(" ");
        }
        else if(isInteger==true){
            JOptionPane.showMessageDialog(null, "The name field cannot be Numbers", "Warning", JOptionPane.INFORMATION_MESSAGE);
            nameJTextField.setText(" ");
        }
        else if(isSpecial==true){
            JOptionPane.showMessageDialog(null, "The name field cannot have special characters", "Warning", JOptionPane.INFORMATION_MESSAGE);
            nameJTextField.setText(" ");
        }
        else
        {

            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);

            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());

            // system.getUserDirectory().getUserAccountList().add(account);
            populateTable();
            nameJTextField.setText(" ");
            System.out.println("Employee created for the enterprise organization");
        }

    }//GEN-LAST:event_submitJButton1ActionPerformed

    private void passwordJPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJPasswordFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        /*Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();*/
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton1;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
