public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);

    }

    @Override
    public void transferir(Conta destino, double valor) {
        
        if (getSaldo() >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada para " + destino.getTitular());
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }
    
}
