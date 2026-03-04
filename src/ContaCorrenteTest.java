public class ContaCorrenteTest {
    
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente("12345", "Rodrigo");

        contaCorrente.setSaldo(1000.00);
        contaCorrente.setLimite(500.00);

        contaCorrente.depositar(200.00);
        contaCorrente.sacar(3000.00);

        contaCorrente.emitirSaldo();

        contaCorrente.mostrarInfo();
        
    }
}
