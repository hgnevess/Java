package entidades;

public interface PedidoRestaurante {
    void adicionarItem(String item, double preco);
    double calcularTotal();
}