/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacist;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class PharmacistDirectory {
    private ArrayList<Pharmacist> pharDir;

    public PharmacistDirectory(){
        this.pharDir = new ArrayList<>();
    }
    public ArrayList<Pharmacist> getPharDir() {
        return pharDir;
    }

    public void setPharDir(ArrayList<Pharmacist> pharDir) {
        this.pharDir = pharDir;
    }
    
    public Pharmacist addPharmacist(){
        Pharmacist newPhar = new Pharmacist();
        pharDir.add(newPhar);
        return newPhar;
    }
}
