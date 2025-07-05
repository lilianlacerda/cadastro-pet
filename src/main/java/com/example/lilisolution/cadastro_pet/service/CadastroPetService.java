package com.example.lilisolution.cadastro_pet.service;

import com.example.lilisolution.cadastro_pet.repository.CadastroPetRepository;
import com.example.lilisolution.cadastro_pet.entity.CadastroPet;
import java.util.List;
import java.util.Optional;

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

    public List<CadastroPet> atualizarPet(CadastroPet cadastroPet, long id) {
        try{
            // Verifica se o pet com o ID fornecido existe
        //Optional significa que o objeto pode ou não estar presente
        Optional <CadastroPet> petEditado = cadastroPetRepository.findById(id);
        if(petEditado.isPresent()){
            cadastroPet.setId(id);
            cadastroPetRepository.save(cadastroPet);
        }else{
            throw new RuntimeException("Pet com ID " + id + " não encontrado.");
        }
        return listarPets();
        }catch(Exception e){

            throw new RuntimeException("Erro ao atualizar o pet: " + e.getMessage());
        }
    }

    public List<CadastroPet> excluirPet(Long id) {
        try{
            Optional<CadastroPet> petExcluido = cadastroPetRepository.findById(id);
        if(petExcluido.isPresent()){
            cadastroPetRepository.deleteById(id);
        }else{
            throw new RuntimeException("Pet com ID " + id + " não encontrado.");
        }
        return listarPets();
        }catch(Exception e){
            throw new RuntimeException("Erro ao excluir o pet: " + e.getMessage());
        }   
    }
    
}
