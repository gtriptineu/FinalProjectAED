/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.store;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class StoreDirectory {
    private ArrayList<Store> storeDictionary;
    
    public StoreDirectory(){
        this.storeDictionary = new ArrayList<>();
    }

    public ArrayList<Store> getStoreDictionary() {
        return storeDictionary;
    }

    public void setStoreDictionary(ArrayList<Store> storeDictionary) {
        this.storeDictionary = storeDictionary;
    }
    
    public Store addNewStore(){
        Store newStore = new Store();
        storeDictionary.add(newStore);
        return newStore;
    }
    
    public void viewStore(Store s){
        System.out.print(s.getStoreId()+"---"+ s.getStoreName());       
    }

}
