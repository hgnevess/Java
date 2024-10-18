package aplicacao;
import entidades.*;

public class PrincipalLojaProduto {
    public static void main(String[] args) {
        Produto produto = new ProdutoImpl("Arroz", 10);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());

        produto.adicionarQuantidade(5);
        System.out.println("Quantidade após adicionar: " + produto.getQuantidade());

        produto.removerQuantidade(3);
        System.out.println("Quantidade após remover: " + produto.getQuantidade());
    }
}