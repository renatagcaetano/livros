package br.com.viasoft.livros.dto;

import br.com.viasoft.livros.model.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class ProdutoFormularioDTO {
    private Long id;
    @NotEmpty(message = "Insira o nome do livro, por favor.")
    private String nome;
    @NotEmpty(message = "Insira o nome do autor, por favor.")
    private String autor;
    private String imagem;

    public Produto toProduto() {
        Produto produto = new Produto();
        produto.setId(this.id);
        produto.setNome(this.nome);
        produto.setAutor(this.autor);
        produto.setImagem(this.imagem);

        return produto;
    }

    public ProdutoFormularioDTO(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.autor = produto.getAutor();
        this.imagem = produto.getImagem();
    }
}
