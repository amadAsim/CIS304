
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;







public class AccountApp extends javax.swing.JFrame {

//    Global variables
    ArrayList<String> accounts;
    AccountUtility accountUtility;
    LinkedHashMap<String, Account> mapNumAccount;
    
    /**
     * Creates new form BankFrame
     */
    public AccountApp() {
        initComponents();
        
    //  Refresh JFrame with updated data
        updateJFrame();
    }
    
    /**
     *  This method will get selected account and display data in text fields
     */
    private void updateData(){
        Account selectedAccount = mapNumAccount.get(accountNumberComboBox.getSelectedItem());
        balanceField.setText("$" + String.format("%.2f", selectedAccount.balance));
        customerNameField.setText(selectedAccount.name);
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
        fmt.setCalendar(selectedAccount.openDate);
        String dateFormatted = fmt.format(selectedAccount.openDate.getTime());
        openDateField.setText(dateFormatted);
       
        
        
        validate();
        
        
       
    }
    
    /**
     *  This method will reload the data from the file, enable buttons and refresh JFrame
     */
    private void updateJFrame(){
        accountUtility = new AccountUtility();
        
        accounts = accountUtility.getAccountNumbers();
        mapNumAccount = accountUtility.getMapNumAccount();
        
        accountNumberComboBox.setModel(new DefaultComboBoxModel(accounts.toArray()));
        depositBtn.setEnabled(false);
        transferToBtn.setEnabled(false);
        withdrawBtn.setEnabled(false);

        repaint();
        validate();
        
        updateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        openDateField = new javax.swing.JTextField();
        balanceField = new javax.swing.JTextField();
        accountNumberComboBox = new javax.swing.JComboBox<>();
        depositBtn = new javax.swing.JButton();
        withdrawBtn = new javax.swing.JButton();
        transferToBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Account Application");

        jLabel1.setText("Account Number:");

        jLabel2.setText("Customer Name:");

        jLabel3.setText("Open Date:");

        jLabel4.setText("Balance");

        customerNameField.setDragEnabled(false);
        customerNameField.setEnabled(false);

        openDateField.setEnabled(false);

        balanceField.setEnabled(false);

        accountNumberComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberComboBoxActionPerformed(evt);
            }
        });

        depositBtn.setMnemonic('d');
        depositBtn.setText("Deposit");
        depositBtn.setEnabled(false);
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        withdrawBtn.setMnemonic('w');
        withdrawBtn.setText("Withdraw");
        withdrawBtn.setEnabled(false);
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        transferToBtn.setMnemonic('t');
        transferToBtn.setText("Transfer To");
        transferToBtn.setEnabled(false);
        transferToBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferToBtnActionPerformed(evt);
            }
        });

        exitBtn.setMnemonic('x');
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameField)
                    .addComponent(openDateField)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transferToBtn)
                            .addComponent(withdrawBtn)
                            .addComponent(exitBtn))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(accountNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(openDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferToBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed
        
        String value = JOptionPane.showInputDialog(null, "Enter a deposit amount for account " + accountNumberComboBox.getSelectedItem(), "Deposit to " + accountNumberComboBox.getSelectedItem(), JOptionPane.PLAIN_MESSAGE);
        try{
            double deposit = Double.parseDouble(value);
            
            if(deposit > 0){
                
                mapNumAccount.get(accountNumberComboBox.getSelectedItem()).deposit(deposit);
                
                accountUtility.save();
                updateData();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid depost amount: " + value, "Invalid deposit", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid depost amount: " + value, "Invalid deposit", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_depositBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        String value = JOptionPane.showInputDialog(null, "Enter a withdrawl amount for account " + accountNumberComboBox.getSelectedItem(), "Withdraw from " + accountNumberComboBox.getSelectedItem(), JOptionPane.PLAIN_MESSAGE);
        
        try{
            double withdraw = Double.parseDouble(value);
            
            if(withdraw > 0){
                if(mapNumAccount.get(accountNumberComboBox.getSelectedItem()).balance >= withdraw){
                    mapNumAccount.get(accountNumberComboBox.getSelectedItem()).withdraw(withdraw);
                    
                    accountUtility.save();
                    updateData();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not enough to withdrawl. Current balance: $" + String.format("%.2f", mapNumAccount.get(accountNumberComboBox.getSelectedItem()).balance), "Unsuccessful withdrawl", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid withdrawl amount: " + value, "Invalid withdrawl", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid withdrawl amount: " + value, "Invalid withdrawl", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void transferToBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferToBtnActionPerformed
        
        String accountValue = JOptionPane.showInputDialog(null, "Enter the beneficiary account number", "Transfer from account " + accountNumberComboBox.getSelectedItem(), JOptionPane.PLAIN_MESSAGE);
        
        if(!accountValue.equals(accountNumberComboBox.getSelectedItem()) && mapNumAccount.containsKey(accountValue)){
            
            String transferAmountValue = JOptionPane.showInputDialog(null, "Enter the transfer amount", "Transfer amount ", JOptionPane.PLAIN_MESSAGE);
            try{
                double transferAmount = Double.parseDouble(transferAmountValue);
                
                
                if(transferAmount > 0){
                    int result = mapNumAccount.get(accountNumberComboBox.getSelectedItem()).transferTo(mapNumAccount.get(accountValue), transferAmount);

                    switch(result){
                        case 0:
                            JOptionPane.showMessageDialog(null, String.format("$%.2f", transferAmount) + " was transfered to " + accountValue, "Transfer successful", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, String.format("$%.2f", transferAmount) + " was transfered to " + accountValue + "\n" + String.format("$%.2f", AccountConstants.TRANSFER_FEE) + " transfer fee was applied.", "Transfer successful", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case -1:
                            JOptionPane.showMessageDialog(null, "Transfer is unsuccessful because balance is less than transfer amount and transfer fee.", "Unsuccessful transfer", JOptionPane.ERROR_MESSAGE);
                            break;
                        case -2:
                            JOptionPane.showMessageDialog(null, "Transfer is unsuccessful because balance is less than transfer amount.", "Unsuccessful transfer", JOptionPane.ERROR_MESSAGE);
                            break;
                    }

                    accountUtility.save();
                    updateData();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid transfer amount: " + transferAmountValue, "Invalid transfer", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid transfer amount: " + transferAmountValue, "Invalid transfer", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(accountValue.equals(accountNumberComboBox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "You can't transfer to/from same account: " + accountValue, "Invalid transfer", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid beneficiary account number: " + accountValue, "Invalid transfer", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_transferToBtnActionPerformed

    private void accountNumberComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberComboBoxActionPerformed
       updateData();
        depositBtn.setEnabled(true);
       transferToBtn.setEnabled(true); 
        withdrawBtn.setEnabled(true);
    }//GEN-LAST:event_accountNumberComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountNumberComboBox;
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JButton depositBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField openDateField;
    private javax.swing.JButton transferToBtn;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
