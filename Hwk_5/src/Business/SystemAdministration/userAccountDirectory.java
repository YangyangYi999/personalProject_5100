/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemAdministration;

import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class userAccountDirectory {
     private ArrayList<UserAccount> userAccount;

    public ArrayList<UserAccount> getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(ArrayList<UserAccount> userAccount) {
        this.userAccount = userAccount;
    }


    
    public userAccountDirectory() {
		userAccount = new ArrayList<>();

	}

	public UserAccount addUserAccount() {
		UserAccount a = new UserAccount();
		userAccount.add(a);
		return a;
	}

	public void deleteUserAccount(UserAccount a) {
		userAccount.remove(a);
	}
        
        public UserAccount isValidUser(String userName, String pwd){
            for(UserAccount ua:userAccount ){
                if(userName.equals(ua.getUserName()) && pwd.equals(ua.getPassword())){
                    return ua;
                }
            }
         return null;
        }
}
