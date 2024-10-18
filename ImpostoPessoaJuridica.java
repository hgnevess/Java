package entidades;

public class ImpostoPessoaJuridica implements Imposto {
    private double rendaAnual;

    public ImpostoPessoaJuridica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public double calcularImposto() {
        return rendaAnual * 0.10;
    }
}