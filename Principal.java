package aplicacao;
import entidades.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Henrique", 17, "Avenida Santa Madre Cabrine, 627", "988016776");


        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
}
