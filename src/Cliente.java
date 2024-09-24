public class Cliente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Roberto Carlos", 5000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria Silva", 3000.0);

        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);
        contaCorrente.transferir(contaPoupanca, 1000.0);

        System.out.println("Saldo conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());
    }
}
