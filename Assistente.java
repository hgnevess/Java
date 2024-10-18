package entidades;

public class Assistente extends Funcionario {
    private double bonus_fixo = 500.0;
    public Assistente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonus_fixo;
    }
}