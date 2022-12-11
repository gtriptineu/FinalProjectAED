/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.store;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface StoreDAO {
    public StoreDirectory getMultipleStore(ArrayList<String> storeIdList);
    public void add(Store s);
    public String getStoreId(String storeName, String comm);
    public String getStoreName(String storeId);
    
}
