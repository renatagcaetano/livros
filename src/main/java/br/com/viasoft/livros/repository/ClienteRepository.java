package br.com.viasoft.livros.repository;

import br.com.viasoft.livros.model.Cliente;
import br.com.viasoft.livros.model.Produto;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findAllByNomeIgnoreCase(String nome);
    List<Cliente> findAllByNomeContainsIgnoreCase(String nome);
}
