package com.demonstratiemotoren.demomotoren.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.demonstratiemotoren.demomotoren.domein.MotorFiets;


/*
 * Repository werkt maar met 1 entiteit (tabel) (de tabel in de database)
 * en daar heeft hij een verbinding mee via een generic
 */

@Component
public interface MotorFietsRepository extends CrudRepository<MotorFiets, Long>
{
	
}
