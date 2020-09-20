package org.com.capg.healthcare.dao;

import org.com.capg.healthcare.entity.DiagnosticCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer>{

	public DiagnosticCenter getByCenterName(String centerName);

}
