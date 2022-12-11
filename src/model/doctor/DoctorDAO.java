/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.doctor;

/**
 *
 * @author nikethanann
 */
public interface DoctorDAO {
    void add(Doctor doc);
    boolean checkDoctorAlreadyPresent(String email);
    Doctor getDoctor(String emailId, String password);
}
