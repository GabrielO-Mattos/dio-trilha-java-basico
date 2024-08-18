import java.util.HashMap;
import java.util.Map;
import java.text.NumberFormat;
import java.util.Locale;

public class Banco {

    private NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private Map<String, Conta> contas;
    
    public Banco() {
        this.contas = new HashMap<>();
    }

    public void adicionarConta(Conta conta){
        contas.put(Integer.toString(conta.getNumeroConta()), conta);
    }

    public void removerConta(String numeroConta) {
        contas.remove(numeroConta);
    }

    public Conta buscarConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public void exibirTodasAsContas() {
        for (Conta conta : contas.values()) {
            System.out.println(conta);
        }
    }

    public void exibirSaldoGlobal(){
        double total = 0;
        for (Conta conta : contas.values()) {
            total += conta.getSaldo();
        }
        System.out.println("O saldo global é: " + formatoMoeda.format(total));
    }

    public void exibirNomeClientes(){
        for (Conta conta : contas.values()) {
            System.out.println(conta.getCliente().getNome());
        }
    }

    public void exibirQuantidadeContas(){
        System.out.println("Quantidade de contas: " + contas.size());
        System.out.println("Quantidade de contas correntes: " + contas.entrySet().stream().filter(entry -> "Conta Corrente".equals(entry.getValue().getTipoConta())).count());
        System.out.println("Quantidade de contas poupanca: " + contas.entrySet().stream().filter(entry -> "Conta Poupanca".equals(entry.getValue().getTipoConta())).count());
    }

}
