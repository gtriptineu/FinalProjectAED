/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.Patient;

/**
 *
 * @author Lenovo
 */
public interface PatientDao {
    void add(Patient p);
    boolean checkPatientAlreadyPresent(String id);
    Patient getPatient(String emailId, String password);
}
