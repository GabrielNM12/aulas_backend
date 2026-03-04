public class Funcionario {
    
    String nome;
    String cargo;
    double salario;

    public Funcionario() {
        this.nome = "Desconhecido";
        this.cargo = "Sem Cargo";
        this.salario = 0.0;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.cargo = "Sem Cargo";
        this.salario = 0.0;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentualAumento) {
        this.salario += this.salario * (percentualAumento / 100);
    }

    public void aumentarSalario(int valorAdicional) {
        this.salario += valorAdicional;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("-------------------------");
    }
}
