import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        while (true) {
            System.out.println("""
                            |--------------------------|
                            |   SISTEMA DA BIBLIOTECA  |
                            |--------------------------|
                            |          OPÇÕES          |
                            |                          |
                            | 1 - Livros               |
                            | 2 - Usuários             |
                            | 3 - Funcionários         |
                            | 4 - Encerrar             |
                            |--------------------------|
                            """);

            String opcao = scanner.next();

            switch (opcao) {
                case "1":
                    boolean opc = true;
                    while (opc) {
                        System.out.println("""
                            |--------------------------|
                            |          LIVROS          |
                            |--------------------------|
                            |          OPÇÕES          |
                            |                          |
                            | 1 - Listar Livros        |
                            | 2 - Cadastrar Livro      |
                            | 3 - Alterar Livro        |
                            | 4 - Remover Livro        |
                            | 5 - Emprestar Livro      |
                            | 6 - Recolher Livro       |
                            | 7 - Voltar               |
                            |--------------------------|
                            """);

                        switch (scanner.next()) {
                            case "1":
                                Livro.listarLivros(livros);
                                break;

                            case "2": // Cadastro de Livro
                                scanner.nextLine(); // Consumir quebra de linha
                                System.out.println("Título do livro:");
                                String titulo = scanner.nextLine();

                                System.out.println("Autor:");
                                String autor = scanner.nextLine();

                                System.out.println("Ano de publicação:");
                                int ano = scanner.nextInt();
                                scanner.nextLine(); // Consumir quebra de linha

                                System.out.println("Gênero:");
                                String genero = scanner.nextLine();

                                livros.add(new Livro(titulo, autor, ano, genero));
                                System.out.println("Livro cadastrado com sucesso!");
                                break;

                            case "3": // Alterar Livro
                                System.out.println("Digite o título do livro a alterar:");
                                scanner.nextLine();
                                String tituloAlterar = scanner.nextLine();
                                for (Livro l : livros) {
                                    if (l.getTitulo().equalsIgnoreCase(tituloAlterar)) {
                                        System.out.println("Novo Autor:");
                                        l.setAutor(scanner.nextLine());
                                        System.out.println("Novo Ano:");
                                        l.setAno(scanner.nextInt());
                                        scanner.nextLine();
                                        System.out.println("Novo Gênero:");
                                        l.setGenero(scanner.nextLine());
                                        System.out.println("Livro alterado com sucesso!");
                                        break;
                                    }
                                }
                                break;

                            case "4": // Remover Livro
                                System.out.println("Digite o título do livro a remover:");
                                scanner.nextLine();
                                String tituloRemover = scanner.nextLine();
                                livros.removeIf(l -> l.getTitulo().equalsIgnoreCase(tituloRemover));
                                System.out.println("Livro removido com sucesso!");
                                break;

                            case "5": // Emprestar Livro (ainda precisa do usuário)
                                System.out.println("Digite o título do livro:");
                                scanner.nextLine();
                                String tituloEmprestar = scanner.nextLine();
                                for (Livro livro : livros) {
                                    if (livro.getTitulo().equalsIgnoreCase(tituloEmprestar)) {
                                        livro.emprestarLivro();
                                    }
                                }
                                break;

                            case "6": // Recolher Livro (empréstimos ainda não implementados completamente)
                                System.out.println("Função ainda não implementada.");
                                break;

                            case "7": // Voltar ao menu principal
                                opc=false;
                        }
                    }
                    break;

                case "2":
                    opc=true;
                    while (opc) {
                        System.out.println("""
                            |--------------------------|
                            |         USUÁRIOS         |
                            |--------------------------|
                            |          OPÇÕES          |
                            |                          |
                            | 1 - Listar Usuários      |
                            | 2 - Cadastrar Usuário    |
                            | 3 - Alterar Usuário      |
                            | 4 - Histórico de Livros  |
                            | 5 - Emprestar Livro      |
                            | 6 - Recolher Livro       |
                            | 7 - Voltar               |
                            |--------------------------|
                            """);

                        switch (scanner.next()) {
                            case "1":
                                for (Usuario usuario : usuarios) {
                                    usuario.exibirInformacoes();
                                }
                                break;

                            case "2": // Cadastro de Usuário
                                scanner.nextLine();
                                System.out.println("Nome:");
                                String nomeU = scanner.nextLine();

                                System.out.println("CPF:");
                                String cpfU = scanner.nextLine();

                                System.out.println("Matrícula:");
                                String matriculaU = scanner.nextLine();

                                usuarios.add(new Usuario(nomeU, cpfU, matriculaU));
                                System.out.println("Usuário cadastrado com sucesso!");
                                break;

                            case "3": // Alterar Usuário
                                System.out.println("Digite o CPF do usuário a alterar:");
                                scanner.nextLine();
                                String cpfAlterarU = scanner.nextLine();
                                for (Usuario u : usuarios) {
                                    if (u.getCpf().equals(cpfAlterarU)) {
                                        System.out.println("Novo Nome:");
                                        u.setNome(scanner.nextLine());
                                        System.out.println("Usuário alterado com sucesso!");
                                        break;
                                    }
                                }
                                break;

                            case "7": // Voltar ao menu principal
                                opc = false;
                        }
                    }
                    break;

                case "3":
                    opc=true;
                    while (opc) {
                        System.out.println("""
                            |--------------------------|
                            |       FUNCIONÁRIOS       |
                            |--------------------------|
                            |          OPÇÕES          |
                            |                          |
                            | 1 - Listar Funcionários  |
                            | 2 - Cadastrar Funcionário|
                            | 3 - Alterar Funcionário  |
                            | 4 - Remover Funcionário  |
                            | 5 - Voltar               |
                            |--------------------------|
                            """);

                        switch (scanner.next()) {
                            case "1":
                                for (Funcionario funcionario : funcionarios) {
                                    funcionario.exibirInformacoes();
                                }
                                break;

                            case "2": // Cadastro de Funcionário
                                scanner.nextLine();
                                System.out.println("Nome:");
                                String nomeF = scanner.nextLine();

                                System.out.println("CPF:");
                                String cpfF = scanner.nextLine();

                                System.out.println("Cargo:");
                                String cargo = scanner.nextLine();

                                System.out.println("Salário:");
                                double salario = scanner.nextDouble();

                                funcionarios.add(new Funcionario(nomeF, cpfF, cargo, salario));
                                System.out.println("Funcionário cadastrado com sucesso!");
                                break;

                            case "5": // Voltar ao menu principal
                                opc=false;
                        }
                    }
                    break;


                case "4":
                    System.out.println("Sistema encerrado.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
