package org.com.capg.healthcare.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import org.com.capg.healthcare.entity.DiagnosticCenter;
import org.com.capg.healthcare.entity.Test;
import org.com.capg.healthcare.exception.CenterNameAlreadyExistException;
import org.com.capg.healthcare.exception.CenterNotFoundException;
import org.com.capg.healthcare.service.DiagnosticCenterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnosticcenter")
@CrossOrigin("http://localhost:4200")
public class DiagnosticCenterController {
	
	@Autowired
	DiagnosticCenterService centerService;
	
	@PostMapping("/addcenter")
	@ExceptionHandler(CenterNameAlreadyExistException.class)
	public DiagnosticCenter addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		return centerService.saveDiagnosticCenter(diagnosticCenter);
	}
	
	
	@DeleteMapping("/deletecenter/{centerId}")
	public String deleteCenter(@PathVariable(value = "centerId") Integer centerId) throws CenterNotFoundException {

		return centerService.deleteDiagnosticCenter(centerId);
	}
	
	@PutMapping("/updatecenter")
	public ResponseEntity<DiagnosticCenter> updateDiagnosticCenter( @RequestBody DiagnosticCenter diagnosticCenter)
			throws CenterNotFoundException {

		return centerService.updateDiagnosticCenter(diagnosticCenter);
	}
	
	@GetMapping("/allcenters")
	public List<DiagnosticCenter> getAllCenters(BigInteger centerId) {

		return centerService.getAllCenters(centerId);

	}
	
	@GetMapping("/getcenter/centerid/{centerId}")
	public ResponseEntity<DiagnosticCenter> getDiagnosticCenter(@PathVariable Integer centerId)
	{
		return centerService.getCenterById(centerId);
	}
	
	

}

