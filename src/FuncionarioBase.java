public class FuncionarioBase {
    
    String nome;
    double salario;

    public FuncionarioBase(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return this.salario * 0.05;
    }
}
