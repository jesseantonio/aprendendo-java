package com.godev.acamparbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godev.acamparbackend.domain.Regra;

@Repository
public interface RegraRepository extends JpaRepository<Regra, Integer> {

}
