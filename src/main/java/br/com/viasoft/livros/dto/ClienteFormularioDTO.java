package br.com.viasoft.livros.dto;

import br.com.viasoft.livros.model.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class ClienteFormularioDTO {
    private Long id;
    @NotEmpty(message = "Indira seu nome, por favor.")
    private String nome;
    @NotEmpty(message = "Insira seu CPF, por favor.")
    private String cpf;
    @NotEmpty(message = "Insira seu email, por favor.")
    private String email;
    @NotEmpty(message = "Insira seu endereço, por favor.")
    private String endereco;

    public Cliente toCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(this.id);
        cliente.setNome(this.nome);
        cliente.setCpf(this.cpf);
        cliente.setEmail(this.email);
        cliente.setEndereco(this.endereco);

        return cliente;
    }

    public ClienteFormularioDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.endereco = cliente.getEndereco();
    }
}
