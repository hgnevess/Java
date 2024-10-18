package aplicacao;
import entidades.*;

public class PrincipalTesteHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Henrique", 5000);
        assistente.addAumento(500);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: " + assistente.ganhoAnual());
    }
}