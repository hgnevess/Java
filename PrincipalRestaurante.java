package aplicacao;
import entidades.*;
public class PrincipalRestaurante {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Hambúrguer", 15.50);
        pedido.adicionarItem("Batata Frita", 8.00);
        pedido.adicionarItem("Pizza", 5.00);

        System.out.println("Valor total do pedido: R$ " + pedido.calcularTotal());
    }
}