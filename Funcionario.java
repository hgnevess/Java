package entidades;

public class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void addAumento(double valor) {
        this.salario += valor;
    }
    public double ganhoAnual() {
        return this.salario * 12;
    }
    public String getNome() {
        return this.nome;
    }
}