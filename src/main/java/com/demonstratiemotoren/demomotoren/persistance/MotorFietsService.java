package com.demonstratiemotoren.demomotoren.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstratiemotoren.demomotoren.domein.MotorFiets;


/* Het kruispunt die kan met meerderen Repositorys werken.
 * en hij doet alle handelingen tussen de objecten van het type van het eintiteit
 */




@Service
public class MotorFietsService 
{
	@Autowired
	MotorFietsRepository mfr;
	
	public Iterable<MotorFiets> geefAlleMotoren()
	{
		return mfr.findAll();
	}

	public void slaMotorOp(MotorFiets motor) 
	{
		mfr.save(motor);
	}

	public void verwijderMotor(long motorid) 
	{
		mfr.deleteById(motorid);
	}
}
