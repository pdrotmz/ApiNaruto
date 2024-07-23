package dev.pdro.ApiNaruto.controller;

import dev.pdro.ApiNaruto.model.Ninjas;
import dev.pdro.ApiNaruto.service.ninjasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Coração da aplicação, os ending points da aplicação saem daqui
@RequestMapping("/api/ninjas") // Faz o mapeamento da api
public class ninjasController {

    @Autowired
    private ninjasService service;

    // localhost:8080/api/ninjas/addninja
    @PostMapping("/add")
    // ResponseEntity = Resposta da entidade
    // RequestBody = Faz a comparação de campos no JSON

    // Método POST
    public ResponseEntity<Ninjas> addNinjas(@RequestBody Ninjas ninja) {
        Ninjas newNinja = service.createNinja(ninja);
        // retorna a resposta da criação de um novo ninja e diz que ele foi criado
        return new ResponseEntity<>(newNinja, HttpStatus.CREATED);
    }

    // locahost:8080//api/ninjas/all
    @GetMapping("/all")
    public ResponseEntity<List<Ninjas>> getAllNinjas() {
        List<Ninjas> allNinjas = service.getAllNinjas();
        // retorna a resposta da seleção de ninjas
        return new ResponseEntity<>(allNinjas, HttpStatus.OK);
    }
}
