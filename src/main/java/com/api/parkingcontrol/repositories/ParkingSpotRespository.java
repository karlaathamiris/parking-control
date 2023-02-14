package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

/**
 * @author karlaathamiris
 *
 * Interface responsavel por transacoes com banco de dados extendendo do JpaRepository
 * possuindo metodos ja prontos. E um bean do Spring
 */
@Repository
public interface ParkingSpotRespository extends JpaRepository<ParkingSpotModel, UUID> {

}
