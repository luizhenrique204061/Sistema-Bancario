public abstract class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depósito
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para saque
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método abstrato para transferir (polimorfismo)
    public abstract void transferir(Conta destino, double valor);
}
