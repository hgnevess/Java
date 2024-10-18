package aplicacao;

import entidades.*;

public class PrincipalGerenciadorVeiculos {
    public static void main(String[] args) {
        Veiculo v1 = new Caminhao("EJT7645", 2010, 14);
        v1.exibirInformacoes();

        System.out.println("------------------------------------");

        Veiculo v2 = new Onibus("EDX1693", 2011, 40);
        v2.exibirInformacoes();


    }
}