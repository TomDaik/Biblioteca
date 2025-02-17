import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{

    private String matricula;
    private List<Livro> livrosEmprestados = new ArrayList<Livro>();

    public Usuario(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' emprestado com sucesso para " + getNome());
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            System.out.println("Livro '" + livro.getTitulo() + "' devolvido com sucesso.");
        } else {
            System.out.println("O livro não está emprestado para este usuário.");
        }
    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() +
                           "\nCPF: " + getCpf());
    }
}
