/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.State.StateDirectory;

/**
 *
 * @author yiyangyang
 */
public class Network {
    private String name;
    private StateDirectory stateDirectory;
    
    public Network(){
        stateDirectory = new StateDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StateDirectory getStateDirectory() {
        return stateDirectory;
    }

    @Override
    public String toString(){
        return name; 
    }
     
}
