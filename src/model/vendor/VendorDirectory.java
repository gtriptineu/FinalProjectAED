/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vendor;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class VendorDirectory {
    
    private ArrayList<Vendor> vendorDir;
    
     public VendorDirectory(){
        this.vendorDir = new ArrayList<>();
    }

    public ArrayList<Vendor> getVendorDir() {
        return vendorDir;
    }

    public void setVendorDir(ArrayList<Vendor> vendorDir) {
        this.vendorDir = vendorDir;
    }
    
     public Vendor addVendor(){
        Vendor newven = new Vendor();
        vendorDir.add(newven);
        return newven;
    }
    
}
