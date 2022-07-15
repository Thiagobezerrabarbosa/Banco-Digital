public class Main {
    public static void main(String[] args) {
        Cliente thiago = new Cliente();
        thiago.setNome("Thiago Bezerra Barbosa");


        Conta cc = new ContaCorrente(thiago);
        Conta poupanca = new ContaPoupanca(thiago);

        cc.depositar(300);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
