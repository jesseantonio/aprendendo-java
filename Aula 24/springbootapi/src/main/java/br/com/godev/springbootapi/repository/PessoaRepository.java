package br.com.calculadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.calculadora.entity.Calculator;

@Repository
public interface CalculatorRepository extends JpaRepository<Calculator, Double>{}