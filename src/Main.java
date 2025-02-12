import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        switch (scanner.next()) {
            case "1":
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
                            |--------------------------|
                            """);
                break;
            case "2":
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
                            |--------------------------|
                            """);
                break;
            case "3":
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
                            |--------------------------|
                            """);
                break;
            default:
                throw new IllegalStateException("Insira uma opção válida: " + scanner.next());
        }
    }
}
