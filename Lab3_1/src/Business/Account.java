/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author yiyangyang
 */
public class Account {
    private String rountNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;

    public Account(){
        this.createdOn=new Date();
    }
    public String getRountNumber() {
        return rountNumber;
    }

    public void setRountNumber(String rountNumber) {
        this.rountNumber = rountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

     @Override
    public String toString(){
        return bankName;  
    }

}