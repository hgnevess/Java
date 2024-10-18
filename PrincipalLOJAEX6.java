package aplicacao;
import entidades.*;

public class PrincipalLOJAEX6 {
    public static void main(String[] args) {

        LojaComercialEX6 lojaComercial = new LojaComercialEX6("21354678/0001","SuperMercado");
        lojaComercial.abrir();
        lojaComercial.fechar();
        lojaComercial.abrir();
        lojaComercial.fechar();

    }
}