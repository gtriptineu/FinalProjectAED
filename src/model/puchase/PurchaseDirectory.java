/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.puchase;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class PurchaseDirectory {
    ArrayList<Purchase> purchaseDir;
    
    public PurchaseDirectory(){
        this.purchaseDir = new ArrayList<>();
    }

    public ArrayList<Purchase> getPurchaseDir() {
        return purchaseDir;
    }

    public void setPurchaseDir(ArrayList<Purchase> purchaseDir) {
        this.purchaseDir = purchaseDir;
    }
    
    public Purchase addNewPurchase(){
        Purchase newMedicine = new Purchase();
        purchaseDir.add(newMedicine);
        return newMedicine;
    }
    
    
}
