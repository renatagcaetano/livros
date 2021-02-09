package br.com.viasoft.livros.dto;

import br.com.viasoft.livros.model.Produto;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ProdutoFormularioDTO {
    @NotEmpty(message = "Insira o nome do livro, por favor.")
    private String nome;
    @NotEmpty(message = "Insira o nome do autor, por favor.")
    private String autor;
    private String imagem;

    public Produto toProduto() {
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setAutor(this.autor);
        produto.setImagem(this.imagem);

        return produto;
    }
}
