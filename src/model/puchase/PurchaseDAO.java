/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.puchase;

/**
 *
 * @author Lenovo
 */
public interface PurchaseDAO {
    public void add(String email, String medicineId, String storeId, int quantity, String status, String timestamp, float totalPrice);
    
}
