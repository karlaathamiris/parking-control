package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRespository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;


/**
 * @author karlaathamiris
 * 
 * camada intermediaria entre o controller e repository
 */

@Service
public class ParkingSpotService {
	
	final ParkingSpotRespository parkingSpotRespository;
	
	public ParkingSpotService(ParkingSpotRespository parkingSpotRespository) {
		this.parkingSpotRespository = parkingSpotRespository;
		
	}

	//anotação 'transaction' garante um all back quando há adição ou deleção em cascata
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRespository.save(parkingSpotModel);
	}

}
