package edu.icet.controller;

import edu.icet.dto.Appointment;
import edu.icet.dto.MedicalReport;
import edu.icet.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
public class MedicalReportController {
    final MedicalReportService service;
    @PostMapping("/add-report")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport){
        service.addMedicalReport(medicalReport);
    }

    @GetMapping("get-reports")
    public List<MedicalReport> getMedicalReports(){
        return service.getMedicalReports();
    }

    @DeleteMapping("/delete-report/{id}")
    public Boolean deleteMedicalReport(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/get-report-by-category/{category}")
    public List<MedicalReport> getReportByCategory(@PathVariable String category){
        return service.getReportByCategory(category);
    }

    @GetMapping("/get-report-by-adminId/{id}")
    public List<MedicalReport> getReportByCategory(@PathVariable Integer id){
        return service.getReportByadminId(id);
    }

    @GetMapping("/get-report-by-patientId/{id}")
    public List<MedicalReport> getReportByPatientId(@PathVariable Integer id){
        return service.getReportByPatientId(id);
    }

    @GetMapping("/get-report-by-labNumber/{num}")
    public List<MedicalReport> getReportByLabNumber(@PathVariable Integer num){
        return service.getReportByLabNumber(num);
    }

}
