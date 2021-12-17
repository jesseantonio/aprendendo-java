package com.godev.acamparbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godev.acamparbackend.domain.Facilidade;

@Repository
public interface FacilidadeRepository extends JpaRepository<Facilidade, Integer> {

}
