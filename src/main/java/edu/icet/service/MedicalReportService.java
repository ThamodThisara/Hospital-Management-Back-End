package edu.icet.service;

import edu.icet.dto.MedicalReport;

import java.util.List;

public interface MedicalReportService {
    void addMedicalReport(MedicalReport medicalReport);
    List<MedicalReport> getMedicalReports();
    Boolean deleteById(Integer id);
    List<MedicalReport> getReportByCategory(String category);
    List<MedicalReport> getReportByadminId(Integer id);
    List<MedicalReport> getReportByPatientId(Integer id);
    List<MedicalReport> getReportByLabNumber(Integer num);
}
