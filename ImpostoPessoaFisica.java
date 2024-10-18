package classes;

import entidades.Imposto;

public class ImpostoPessoaFisica implements Imposto {
    private double rendaAnual;

    public ImpostoPessoaFisica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public double calcularImposto() {
        return rendaAnual * 0.20;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }
}