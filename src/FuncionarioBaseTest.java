public class FuncionarioBaseTest {
    public static void main(String[] args) {
        FuncionarioBase funcionarioBase = new FuncionarioBase("Fabio", 1000);
        Gerente gerente = new Gerente("Daniel", 1000);
        Vendedor vendedor = new Vendedor("Laura", 1000);

        System.out.printf("Funcionário: %s; Bonus: R$%.2f\n", funcionarioBase.nome,funcionarioBase.calcularBonus());
        System.out.printf("Funcionário: %s; Bonus: R$%.2f\n", gerente.nome,gerente.calcularBonus());
        System.out.printf("Funcionário: %s; Bonus: R$%.2f\n", vendedor.nome,vendedor.calcularBonus());
    }
}
