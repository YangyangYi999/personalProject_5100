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
public class Disease {
        private int id;
        private String name;
        private static int count = 1;
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public Disease() {
        id = count;
        count++;
       
    }
        @Override
    public String toString(){
        return name; 
    }
}
