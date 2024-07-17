package dev.pdro.ApiNaruto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Essa classe toda vai ser salva no banco de dados
@Table(name = "ninjas") // Nome da tabela dentro do banco de dados
@Data // Anotação de abstração de getters e setters
@AllArgsConstructor // Cria um construtor com todos os argumentos
@NoArgsConstructor
public class Ninjas {

    @Id // Id é gerado automáticamente quando o ninja é criado
    @GeneratedValue (strategy = GenerationType.IDENTITY) // Gera de maneira sequencial
    Long id;
    String nome;
    String aldeia;
    int idade;
    String elemento;
    String imgUrl;


}
