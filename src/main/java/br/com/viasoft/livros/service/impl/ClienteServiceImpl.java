package br.com.viasoft.livros.service.impl;

import br.com.viasoft.livros.model.Cliente;
import br.com.viasoft.livros.repository.ClienteRepository;
import br.com.viasoft.livros.service.ClienteService;
import framework.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Cliente, Long> implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public JpaRepository<Cliente, Long> getRepository() {
        return clienteRepository;
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> result = getRepository().findAll();
        Collections.sort(result);
        return result;
    }

    @Override
    public List<Cliente> findByNome(String nome) {
        return clienteRepository.findAllByNomeIgnoreCase(nome);
    }

    @Override
    public void preSave(Cliente cliente) {
        System.out.println("Passei pelo pre-save, o ID era nulo");
    }

    @Override
    public void postSave(Cliente cliente) {
        System.out.println(String.format("Passei pelo post save, o ID é %d", cliente.getId()));
    }
}
