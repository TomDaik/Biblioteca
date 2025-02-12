import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{

    private String matricula;
    private List<Livro> livrosEmprestados = new ArrayList<Livro>();

    public Usuario(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() +
                           "\nCPF: " + getCpf());
    }
}
