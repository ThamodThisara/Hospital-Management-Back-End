package edu.icet.service.impl;

import edu.icet.dto.Appointment;
import edu.icet.dto.MedicalReport;
import edu.icet.entity.MedicalReportEntity;
import edu.icet.repository.MedicalReportRepository;
import edu.icet.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportService {
    final ModelMapper mapper;
    final MedicalReportRepository repository;
    @Override
    public void addMedicalReport(MedicalReport medicalReport) {
        repository.save(mapper.map(medicalReport, MedicalReportEntity.class));
    }

    @Override
    public List<MedicalReport> getMedicalReports() {
        List<MedicalReport> medicalReportList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            medicalReportList.add(mapper.map(entity, MedicalReport.class));
        });
        return medicalReportList;
    }

    @Override
    public Boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<MedicalReport> getReportByCategory(String category) {
        List<MedicalReport> medicalReportList = new ArrayList<>();
        repository.findByCategory(category).forEach(entity->{
            medicalReportList.add(mapper.map(entity, MedicalReport.class));
        });
        return medicalReportList;
    }

    @Override
    public List<MedicalReport> getReportByadminId(Integer id) {
        List<MedicalReport> medicalReportList = new ArrayList<>();
        repository.findByAdminId(id).forEach(entity->{
            medicalReportList.add(mapper.map(entity, MedicalReport.class));
        });
        return medicalReportList;
    }

    @Override
    public List<MedicalReport> getReportByPatientId(Integer id) {
        List<MedicalReport> medicalReportList = new ArrayList<>();
        repository.findByPatientId(id).forEach(entity->{
            medicalReportList.add(mapper.map(entity, MedicalReport.class));
        });
        return medicalReportList;
    }

    @Override
    public List<MedicalReport> getReportByLabNumber(Integer num) {
        List<MedicalReport> medicalReportList = new ArrayList<>();
        repository.findByLabNumber(num).forEach(entity->{
            medicalReportList.add(mapper.map(entity, MedicalReport.class));
        });
        return medicalReportList;
    }


}
