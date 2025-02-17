public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String cargo, double salario) {
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nCargo: " + cargo +
                "\nSalário: R$ " + salario);
    }
}
