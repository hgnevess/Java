package aplicacao;
import entidades.Livro;
public class PrincipalLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("Ponto de Impacto", "Dan Brwon", 2012, 55.99);

        System.out.println("Livro 1: " + livro1.titulo + ", " + livro1.getAutor() + ", " + livro1.getAnoPublicacao() + ", " + livro1.getPreco());
        System.out.println("Livro 2: " + livro2.titulo + ", " + livro2.getAutor() + ", " + livro2.getAnoPublicacao() + ", " + livro2.getPreco());
        System.out.println("Livro 3: " + livro3.titulo + ", " + livro3.getAutor() + ", " + livro3.getAnoPublicacao() + ", " + livro3.getPreco());
    }
}