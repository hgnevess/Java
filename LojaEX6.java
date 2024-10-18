package entidades;

public abstract class LojaEX6 {
    private String cnpj;
    private String razaoSocial;
    private boolean aberta;

    public LojaEX6(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }
    public void abrir() {
        if (aberta) {
            aberta = true;
            System.out.println("A loja foi aberta.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }
    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja foi fechada.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }
    public String getCnpj() {
        return cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public boolean isAberta() {
        return aberta;
    }
}

