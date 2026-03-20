public class Vendedor extends FuncionarioBase {

    public Vendedor(String nome, double salario) {
       super(nome,salario); 
    }

    public double calcularBonus() {
        return this.salario * 0.1;
    }
}

