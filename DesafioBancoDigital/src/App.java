public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();

        for (int i = 0; i < 25; i++) {
            Cliente cliente = new Cliente(GeradorDeDados.gerarNomeAleatorio(), GeradorDeDados.gerarCpfCnpjAleatorio(), GeradorDeDados.gerarTipoPessoaAleatorio());
            if(i % 2 == 0){
                Conta conta = new ContaPoupanca(cliente);
                banco.adicionarConta(conta);
                conta.depositar(GeradorDeDados.gerarDepositoAleatorio(), false);
            }else{
                Conta conta = new ContaCorrente(cliente);
                conta.depositar(GeradorDeDados.gerarDepositoAleatorio(), false);
                banco.adicionarConta(conta);
            }            
        }

        // banco.exibirTodasAsContas();
        // banco.exibirSaldoGlobal();
        // banco.exibirNomeClientes();
        // banco.exibirQuantidadeContas();

    }
}
