package org.com.capg.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiagnosticCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int centerId;
	
	private String centerName;
	private String centerAddress;
	private String contactNumber;
	
	
	
	
	
	public int getDiagnosticCenterId() {
		return centerId;
	}
	public void setDiagnosticCenterId(int diagnosticCenterId) {
		this.centerId = diagnosticCenterId;
	}
	
	public String getCenterName() {
		return centerName;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setCenterName(String diagnosticCenterName) {
		this.centerName = diagnosticCenterName;
	}
	
	public String getCenterAddress() {
		return centerAddress;
	}
	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}

	@Override
	public String toString() {
		return "DiagnosticCentre [diagnosticCentreId=" + centerId + ", centreName=" + 
	centerName + ", centreAddress=" + centerAddress + "]";
	}
	
}
