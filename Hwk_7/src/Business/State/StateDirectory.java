/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class StateDirectory {
    private ArrayList<State> stateList;

    public StateDirectory() {
        stateList = new ArrayList();
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }

    public State createAndAddState(String name) {
        
        State state = new State();
        state.setName(name);
        stateList.add(state);
        return state;
    }
    
}
