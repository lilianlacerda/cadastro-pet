package com.example.lilisolution.cadastro_pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lilisolution.cadastro_pet.entity.CadastroPet;

public interface CadastroPetRepository extends JpaRepository<CadastroPet, Long>{
    
}
