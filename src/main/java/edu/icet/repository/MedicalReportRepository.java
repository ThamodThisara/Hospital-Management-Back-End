package edu.icet.repository;

import edu.icet.entity.AppointmentEntity;
import edu.icet.entity.MedicalReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalReportRepository extends JpaRepository<MedicalReportEntity,Integer> {
    List<MedicalReportEntity> findByCategory(String category);
    List<MedicalReportEntity> findByAdminId(Integer id);
    List<MedicalReportEntity> findByPatientId(Integer id);
    List<MedicalReportEntity> findByLabNumber(Integer num);
}
