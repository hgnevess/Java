package entidades;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoRestaurante {
    private List<String> itens;
    private List<Double> precos;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.precos = new ArrayList<>();
    }

    @Override
    public void adicionarItem(String item, double preco) {
        itens.add(item);
        precos.add(preco);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }
}