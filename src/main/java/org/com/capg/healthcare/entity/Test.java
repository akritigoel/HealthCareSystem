package org.com.capg.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int testId;
	private String testName;
	private String testDetails;
	private float testCost;
	
	@ManyToOne
	@JoinColumn(name="centerId")
	@JsonBackReference
	private TestCenter testCenter;
	
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestDetails() {
		return testDetails;
	}
	public void setTestDetails(String testDetails) {
		this.testDetails = testDetails;
	}
	public float getTestCost() {
		return testCost;
	}
	public void setTestCost(float testCost) {
		this.testCost = testCost;
	}
	
	public TestCenter getDiagnosticCenter() {
		return testCenter;
	}
	public void setDiagnosticCenter(TestCenter diagnosticCenter) {
		this.testCenter = diagnosticCenter;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", testDetails=" + testDetails + ", testCost="
				+ testCost + "]";
	}
}
