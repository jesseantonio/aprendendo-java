package com.godev.acamparbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.godev.acamparbackend.domain.CampingRegra;

@Repository
public interface CampingRegraRepository extends JpaRepository<CampingRegra, Integer> {

	@Query("SELECT campingRegra FROM CampingRegra campingRegra INNER JOIN campingRegra.id.regra regra WHERE regra.id IN (:regrasIds)")
	List<CampingRegra> findAllCampingRegraByRegraId(@Param("regrasIds") List<Integer> regrasIds);
	
	@Query("SELECT campingRegra FROM CampingRegra campingRegra WHERE campingRegra.id.camping.id = :A")
	List<CampingRegra> findAllCampingRegraByCampingId(@Param("A") Integer campingId);
	
}
