import java.util.HashMap;
import java.util.Map;

public class Banco {
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
        System.out.println("O saldo global é: " + total);
    }

}
