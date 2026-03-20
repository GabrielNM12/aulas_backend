public class Gerente extends FuncionarioBase {

    public Gerente(String nome, double salario) {
       super(nome,salario); 
    }

    public double calcularBonus() {
        return this.salario * 0.2;
    }
}
