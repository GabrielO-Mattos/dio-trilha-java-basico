import java.text.NumberFormat;
import java.util.Locale;

public class Conta {

    /* Variaveis */
    private double saldo;
    private int numeroConta;
    private int numeroAgencia;
    private String tipoConta;
    private Cliente cliente;
    private NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIA = 1;

    /* Get's and Set's */
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    
    /* ToString */
    @Override
    public String toString() {
        return "Conta [saldo: " + getSaldo() + ", numeroConta: " + getNumeroConta() + ", numeroAgencia: " + getNumeroAgencia()
                + ", cliente: " + getCliente() + "]";
    }
    
    
    /* Construtor */    
    public Conta(Cliente cliente, String tipoConta) {
        this.cliente = cliente;
        this.numeroAgencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIA++;
        this.tipoConta = tipoConta;
    }

    /* Funcoes */
    public void depositar(double valor, boolean exibirMensagem) {
        this.saldo += valor;
        if(exibirMensagem){
            System.out.println("### DEPOSITO ###");
            System.out.println("Deposito: " + formatoMoeda.format(valor));
            System.out.println("Novo saldo: " + formatoMoeda.format(getSaldo()));
            System.out.println();
        }
    }
    
    public void sacar(double valor, boolean exibirMensagem){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            if (exibirMensagem) {   
                System.out.println("### SAQUE ###");
                System.out.println("Saque: " + formatoMoeda.format(valor));
                System.out.println("Novo saldo: " + formatoMoeda.format(getSaldo()));
                System.out.println();
            }
        }else{
            System.out.println("### SAQUE ###");
            System.out.println("Saldo insuficiente, operacao cancelada!");
            System.out.println();
        }
    }

    public void transferir(Conta contaDestino, double valor){
        if (valor <= this.saldo) {
            this.sacar(valor, false);
            contaDestino.depositar(valor, false);
            System.out.println("### TRANSFERENCIA ###");
            System.out.println("Transferencia: " + formatoMoeda.format(valor));
            System.out.println("Novo saldo: " + formatoMoeda.format(getSaldo()));
            System.out.println();
        }else{
            System.out.println("### TRANSFERENCIA ###");
            System.out.println("Saldo insuficiente, operacao cancelada!");
            System.out.println();
        }
    }

    public void extrato(){
        System.out.println("### EXTRATO ###");
        System.out.println("Numero da agencia: " + getNumeroAgencia());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Tipo da conta: " + getTipoConta());
        System.out.println("Nome do cliente: " + getCliente().getNome());
        System.out.println("Saldo: " + formatoMoeda.format(getSaldo()));
        System.out.println();
    }
}
