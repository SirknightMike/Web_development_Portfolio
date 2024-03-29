/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adjava_fa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class MainMenu extends javax.swing.JFrame {

    public static Account myAObj = new Account();
    /**
     * Creates new form MainMenu
     */
    public static void myMethod(){
        String URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String userName = "root";
        String password = "Mikedesign3339991";
        
         try{
            Connection con = DriverManager.getConnection(URL, userName, password);
            Statement myState = con.createStatement();
            
            String queryString = "SELECT CURRENTBALANCE FROM atm WHERE ID ="+MSCD_ATM.myObj.getId();
            ResultSet mySet = myState.executeQuery(queryString);
            while(mySet.next()){
                myAObj.setBalance(mySet.getInt("CURRENTBALANCE"));
                
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No Connection");
        }
    }
    
     public static void printMethod(){
        String URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String userName = "root";
        String password = "Mikedesign3339991";
        
         try{
            Connection con = DriverManager.getConnection(URL, userName, password);
            Statement myState = con.createStatement();
            
            String queryString = "SELECT USERNAME,CURRENTBALANCE FROM atm WHERE ID ="+MSCD_ATM.myObj.getId();
            ResultSet rs = myState.executeQuery(queryString);
            while(rs.next()){
                String nameOfUser = rs.getString("USERNAME");
                int currentBalance = rs.getInt("CURRENTBALANCE");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
                Date date = new Date();  
                
                JOptionPane.showMessageDialog(null, "Name: "+nameOfUser+"\nCurrent Balance: R "+currentBalance+"\nDate: "+formatter.format(date));
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No Connection");
        }
    }
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainMenu = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        withdrawBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        depositBtn = new javax.swing.JButton();
        printStatementBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        panelMainMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelMainMenu.setForeground(new java.awt.Color(153, 153, 153));

        label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label.setForeground(new java.awt.Color(255, 51, 51));
        label.setText("Main Menu");

        javax.swing.GroupLayout panelMainMenuLayout = new javax.swing.GroupLayout(panelMainMenu);
        panelMainMenu.setLayout(panelMainMenuLayout);
        panelMainMenuLayout.setHorizontalGroup(
            panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainMenuLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        panelMainMenuLayout.setVerticalGroup(
            panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        checkBtn.setBackground(new java.awt.Color(204, 204, 204));
        checkBtn.setForeground(new java.awt.Color(255, 51, 51));
        checkBtn.setText("Check Balance");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        withdrawBtn.setBackground(new java.awt.Color(204, 204, 204));
        withdrawBtn.setForeground(new java.awt.Color(255, 51, 51));
        withdrawBtn.setText("Withdraw");
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setForeground(new java.awt.Color(255, 51, 51));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        depositBtn.setBackground(new java.awt.Color(204, 204, 204));
        depositBtn.setForeground(new java.awt.Color(255, 51, 51));
        depositBtn.setText("Deposit");
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        printStatementBtn.setBackground(new java.awt.Color(204, 204, 204));
        printStatementBtn.setForeground(new java.awt.Color(255, 51, 51));
        printStatementBtn.setText("Print Statement");
        printStatementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printStatementBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(204, 204, 204));
        exitBtn.setForeground(new java.awt.Color(255, 51, 51));
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
                .addGap(153, 153, 153)
                .addComponent(panelMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(printStatementBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(withdrawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panelMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printStatementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        myMethod();
        JOptionPane.showMessageDialog(null, "Your current balance is: R "+myAObj.getBalance());
    }//GEN-LAST:event_checkBtnActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        Withdraw myWithdrawWindow = new Withdraw();
        myWithdrawWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MSCD_ATM welcomeWin = new MSCD_ATM();
        welcomeWin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed
        Deposit depositWin = new Deposit();
        depositWin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositBtnActionPerformed

    private void printStatementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printStatementBtnActionPerformed
        printMethod();
    }//GEN-LAST:event_printStatementBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton depositBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel label;
    private javax.swing.JPanel panelMainMenu;
    private javax.swing.JButton printStatementBtn;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
