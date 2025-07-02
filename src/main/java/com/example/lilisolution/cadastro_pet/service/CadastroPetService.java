package com.example.lilisolution.cadastro_pet.service;

import com.example.lilisolution.cadastro_pet.repository.CadastroPetRepository;
import com.example.lilisolution.cadastro_pet.entity.CadastroPet;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CadastroPetService {
    private CadastroPetRepository cadastroPetRepository;

    // Injeção de dependência do repositório
    public CadastroPetService(CadastroPetRepository cadastroPetRepository) {
        this.cadastroPetRepository = cadastroPetRepository;
    }

    public List<CadastroPet> listarPets(){
        Sort sort = Sort.by("porte").descending().and(Sort.by("nome").ascending());
        return cadastroPetRepository.findAll(sort);
    }

    public List<CadastroPet> cadastrarPet(CadastroPet cadastroPet) {
        cadastroPetRepository.save(cadastroPet);
        return listarPets();
    }

    public List<CadastroPet> atualizarPet(CadastroPet cadastroPet){
        cadastroPetRepository.save(cadastroPet);
        return listarPets();
    }

    public List<CadastroPet> excluirPet(Long id){
        cadastroPetRepository.deleteById(id);
        return listarPets();
    }
    
}
