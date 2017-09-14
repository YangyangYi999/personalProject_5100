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
public class Creditcard {
    private String accountNum;
    private String bankName;
    private String cardHolders;
    private String expireDate;
    private int CVVNum;


    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardHolders() {
        return cardHolders;
    }

    public void setCardHolders(String cardHolders) {
        this.cardHolders = cardHolders;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getCVVNum() {
        return CVVNum;
    }

    public void setCVVNum(int CVVNum) {
        this.CVVNum = CVVNum;
    }



}
