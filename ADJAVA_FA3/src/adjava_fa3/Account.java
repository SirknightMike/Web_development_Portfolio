/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adjava_fa3;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class Account {
    private int id;
    private int balance;
    private Date dateCreated;
    private double initialBalance;
    
    public Account(int id, double initialBalance){
        this.id = id;
        this.initialBalance = initialBalance;
    }
    
    public Account(int id){
        this.id = id;
    }
    
    public Account(){
        
    }
    
    // Getters
    public int getId(){
        return id;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getInitialBalance(){
        return initialBalance;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void withdraw(int withdrawAmount){
        if(withdrawAmount > balance){
            JOptionPane.showMessageDialog(null, "You can't withdraw more than what you have in the your current balance.");
        }else{
            JOptionPane.showMessageDialog(null, "Withdraw has been done.");
        }
    }
}
