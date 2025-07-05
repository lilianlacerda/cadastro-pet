package com.example.lilisolution.cadastro_pet.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.lilisolution.cadastro_pet.entity.CadastroPet;

import com.example.lilisolution.cadastro_pet.service.CadastroPetService;

@RestController
@RequestMapping("/api/cadastro-pet")
public class CadastroPetController {
    private CadastroPetService cadastroPetService;

    // Injeção de dependência do serviço
    public CadastroPetController(CadastroPetService cadastroPetService) {
        this.cadastroPetService = cadastroPetService;
    }

    @GetMapping("/listar")
    public List<CadastroPet> listarPets(){
        return cadastroPetService.listarPets();
    }

    @PostMapping("/cadastrar")
    public List<CadastroPet> cadastrarPet(@RequestBody CadastroPet cadastroPet) {
        return cadastroPetService.cadastrarPet(cadastroPet);
    }

    @PutMapping("/atualizar/{id}")
    public List<CadastroPet> atualizarPet(@RequestBody CadastroPet cadastroPet, @PathVariable Long id){
        return cadastroPetService.atualizarPet(cadastroPet, id);
    }

    @DeleteMapping("/excluir/{id}")
    public List<CadastroPet> excluirPet(@PathVariable Long id){
        return cadastroPetService.excluirPet(id);
    }
    
}
