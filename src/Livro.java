import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;

    public Livro() {
    }

    public Livro(String titulo, String autor, int ano, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Título: " +titulo +
                "\nAutor: " + autor +
                "\nAno: " + ano +
                "\nGênero: " + genero + "\n";
    }

    public static void listarLivros(ArrayList<Livro> livros){
        if(livros.isEmpty()){
            System.out.println("Não há livros cadastrados");
        }
        else {
            for (Livro livro : livros)
                System.out.println(livro);
        }
        System.out.println("Fim da lista de livros");
    }

    public void emprestarLivro(){
        System.out.println("Emprestado com sucesso!");
    };
}
