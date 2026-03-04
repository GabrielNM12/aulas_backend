public class ContaCorrente {
    
    private String titular;
    private String numeroConta;
    private double saldo;
    private double limite;

    public ContaCorrente(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void mostrarInfo() {
        System.out.printf("Nome do titular: %s\n", getTitular());
        System.out.printf("Número da conta: %s\n", getNumeroConta());
        System.out.printf("Saldo: %.2f\n", getSaldo());
        System.out.printf("Limite: %.2f\n", getLimite());
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Valor de saque inválido.");
        }
    }

    public void emitirSaldo() {
        System.out.printf("Saldo atual: %.2f\n", getSaldo());
    }
}
