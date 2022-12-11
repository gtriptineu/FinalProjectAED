/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.doctor;

import java.util.ArrayList;

/**
 *
 * @author nikethanann
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        this.doctorDirectory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctorDirectory.add(newDoctor);
        return newDoctor;
    }
    
    public void viewDoctorList(Doctor doc){
        System.out.print(doc.getDocName()+" ---- "+doc.getDocLicense()+" --- "+ doc.getDocEmail());       
    }
}
