package aplicacao;
import entidades.*;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        Operacao soma = new Soma(2,3);
        Operacao subtracao = new Subtracao(10,9);
        Operacao divisao = new Divisao(100,10);
        Operacao multiplicacao = new Multiplicacao(10,10);

        System.out.println("A soma é: " + soma.calcular(2,3));
        System.out.println("A subtração é: " + subtracao.calcular(10,9));
        System.out.println("A divisão é: " + divisao.calcular(100,10));
        System.out.println("A multiplicação é: " + multiplicacao.calcular(10,10));


    }
}