package entidades;

public class ProdutoImpl implements Produto {
    private String nome;
    private int quantidade;

    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    @Override
    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }
}
