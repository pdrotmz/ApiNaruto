package dev.pdro.ApiNaruto.service;

import dev.pdro.ApiNaruto.model.Ninjas;
import dev.pdro.ApiNaruto.repository.ninjasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Toda a lógica da aplicação está dento daqui
public class ninjasService {

    // Instanciação de repository
    /*TODO: Refatorar a instância */
    @Autowired
    private ninjasRepository repository;


    // Criar um novo ninja
    // Faz a criação de um novo ninja e insere no banco de dados
    public Ninjas createNinja(Ninjas ninja) {
        return repository.save(ninja);
    }

    // Motrar ninjas criados
    public List<Ninjas> getAllNinjas() {
        return repository.findAll();
    }

    // Mostrar ninja por ID

    // Deletar ninja

    // Atualizar ninja
}
