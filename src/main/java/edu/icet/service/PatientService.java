package edu.icet.service;

import edu.icet.dto.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient();
    void addPatient(Patient patient);
    void deleteById(Integer id);
    List<Patient> searchByName(String name);
    List<Patient> searchByAddress(String address);
    List<Patient> searchByNic(String nic);
    List<Patient> searchByBloodGroup(String bloodGroup);
    List<Patient> searchByCategory(String category);
}
