/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vendor;

/**
 *
 * @author rodri
 */
public interface VendorDao {
    
    public void add(Vendor v);
    public void delete(Vendor v);
    public VendorDirectory getAll();
    public Vendor getVendor(String emailId, String password);

}
