/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.ngo;

/**
 *
 * @author Lenovo
 */
public interface NgoDAO {
    public void add(Ngo ngo);
    public void delete(Ngo ngo);
    public NgoDirectory getAll();
    public NgoDirectory getByCommunityCity(String community, String city);
}
