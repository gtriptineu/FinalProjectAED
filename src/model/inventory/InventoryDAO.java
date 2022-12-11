/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.inventory;

/**
 *
 * @author Lenovo
 */
public interface InventoryDAO {
    public void add(Inventory i);
    public InventoryDirectory getAll();
    public void delete(Inventory inv);
    public InventoryDirectory getByMedicine(String medicineName);
    public InventoryDirectory getByMedicineCommunity(String medicineName, String community);
    public InventoryDirectory getByMedicineDosage(String medicineName, String dosage);
    public InventoryDirectory getByMedicineCommunityDosage(String medicineName, String community, String dosage);
    public InventoryDirectory getByMedicineStoreId(String medicinename, String storeId);
    public void updateQuantity(String medicineId, int quantity);
}
