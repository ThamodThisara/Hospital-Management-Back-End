package edu.icet.service.impl;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import edu.icet.repository.PatientRepository;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    @Autowired
    final PatientRepository repository;
    final ModelMapper mapper;

    List<Patient> patientList = new ArrayList<>();
    @Override
    public List<Patient> getPatient() {
        List<Patient> patientList = new ArrayList<>();
        repository.findAll().forEach(patient ->{
            patientList.add(mapper.map(patient, Patient.class));
        });
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Patient> searchByName(String name) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByName(name).forEach(entity->{
            patientList.add(mapper.map(entity,Patient.class));
        });
        return patientList;
    }

    @Override
    public List<Patient> searchByAddress(String address) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByAddress(address).forEach(entity->{
            patientList.add(mapper.map(entity,Patient.class));
        });
        return patientList;
    }

    @Override
    public List<Patient> searchByNic(String nic) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByNic(nic).forEach(entity->{
            patientList.add(mapper.map(entity,Patient.class));
        });
        return patientList;
    }

    @Override
    public List<Patient> searchByBloodGroup(String bloodGroup) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByBloodGroup(bloodGroup).forEach(entity->{
            patientList.add(mapper.map(entity,Patient.class));
        });
        return patientList;
    }

    @Override
    public List<Patient> searchByCategory(String category) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByCategory(category).forEach(entity->{
            patientList.add(mapper.map(entity,Patient.class));
        });
        return patientList;
    }


}
