/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yiyangyang
 */
public class FinancialAccount {
    private String accountNum;
    private String creationDate;
    private String status;
    private String debtCredit;
    private int balance ;

    public String getDebtCredit() {
        return debtCredit;
    }

    public void setDebtCredit(String debtCredit) {
        this.debtCredit = debtCredit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    
}
