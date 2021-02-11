package br.com.viasoft.livros.model;

import ch.qos.logback.core.net.server.Client;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cliente implements Comparable<Cliente>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;

    @Override
    public int compareTo(Cliente o) {
        return nome.compareTo(o.nome);
    }
}