/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.pharmacist;


/**
 *
 * @author nikethanann
 */
public interface PharmacistDao {
    
    public void add(Pharmacist p);
    public void delete(Pharmacist p);
//    boolean checkPharmacistAlreadyPresent(String id);
    public Pharmacist getPharmacist(String emailId, String password);
    public PharmacistDirectory getAll();
}
