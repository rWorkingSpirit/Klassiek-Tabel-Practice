package com.demonstratiemotoren.demomotoren.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demonstratiemotoren.demomotoren.domein.MotorFiets;
import com.demonstratiemotoren.demomotoren.persistance.MotorFietsService;

/*
 * Dit is voor het front-end.
 * Dit zijn de ook wel de URL's
 */

@RestController
public class MotorFietsEndPoint 
{
	@Autowired
	MotorFietsService mfs;
	
	
	@GetMapping("demotoren")
	public Iterable<MotorFiets> alleMotoren()
	{
		return mfs.geefAlleMotoren();
	}
	
	
	@PostMapping("voegmotortoe")
	public void voegMotorToe(@RequestBody MotorFiets motor)
	{
		mfs.slaMotorOp(motor);
	}
	
	
	@DeleteMapping("verwijderMotor/{motorid}")
	public void verwijderMotor(@PathVariable("motorid") int motorid)
	{
		mfs.verwijderMotor(motorid);
	}
	
	
	
}
