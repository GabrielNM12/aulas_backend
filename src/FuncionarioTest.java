public class FuncionarioTest {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario("Ana");
        Funcionario funcionario3 = new Funcionario("Pedro", "Desenvolvedor");
        Funcionario funcionario4 = new Funcionario("Maria", "Gerente", 5000.0);

        funcionario4.aumentarSalario(50f);
        funcionario1.aumentarSalario(200);

        funcionario1.exibirDados();
        funcionario2.exibirDados();
        funcionario3.exibirDados();
        funcionario4.exibirDados();
    }
}
