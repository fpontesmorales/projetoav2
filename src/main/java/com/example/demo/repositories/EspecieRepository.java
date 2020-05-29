package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Especie;

@Repository

public interface EspecieRepository extends JpaRepository<Especie, Integer> {

}
