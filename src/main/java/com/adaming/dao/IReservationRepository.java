<<<<<<< HEAD:src/test/java/com/repositories/IReservationRepository.java
package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Reservation;


@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Integer>{

    
    


    
    
=======
package com.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entity.Reservation;



@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Integer>{
	
	
	public Reservation findReservationByVehicule(long id);
	
	public Reservation findReservationByClient(String username);
	

>>>>>>> bef972f416ddb3ee0a8cc78221c6399740bcdfea:src/main/java/com/adaming/dao/IReservationRepository.java
}