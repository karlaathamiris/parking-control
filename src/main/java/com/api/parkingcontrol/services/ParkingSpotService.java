package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRespository;

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

}
