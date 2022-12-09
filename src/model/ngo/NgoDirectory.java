/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ngo;

import java.util.ArrayList;
import model.inventory.Inventory;

/**
 *
 * @author Lenovo
 */
public class NgoDirectory {
    ArrayList<Ngo> ngoDirectory;
    
    public NgoDirectory(){
        this.ngoDirectory = new ArrayList<>();
    }

    public ArrayList<Ngo> getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(ArrayList<Ngo> ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }
    
    public Ngo addNewNgo(){
        Ngo newNgo = new Ngo();
        ngoDirectory.add(newNgo);
        return newNgo;
    }
    
    public void viewInventory(Ngo n){
        System.out.print(n.getId()+" ---- "+n.getName()+" --- "+ n.getFunctionality());       
    }
}
