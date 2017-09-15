/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.image.BufferedImage;

/**
 *
 * @author yiyangyang
 */
public class Person {
    private String lastName ;
    private String firstName;
    private int phoneNum;
    private String email;
    BufferedImage img = null;
    Address address;
    Creditcard creditCard;
    FinancialAccount checkingAccount;
    FinancialAccount SavingAccount;
    LicenseData licenseData;

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public FinancialAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(FinancialAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public FinancialAccount getSavingAccount() {
        return SavingAccount;
    }

    public void setSavingAccount(FinancialAccount SavingAccount) {
        this.SavingAccount = SavingAccount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Creditcard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Creditcard creditCard) {
        this.creditCard = creditCard;
    }


    public LicenseData getLicenseData() {
        return licenseData;
    }

    public void setLicenseData(LicenseData licenseData) {
        this.licenseData = licenseData;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
}
