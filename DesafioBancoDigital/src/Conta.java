public class Conta {

    /* Variaveis */
    private double saldo;
    private int numeroConta;
    private int numeroAgencia;
    private Cliente cliente;

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
    
    /* ToString */
    @Override
    public String toString() {
        return "Conta [saldo: " + getSaldo() + ", numeroConta: " + getNumeroConta() + ", numeroAgencia: " + getNumeroAgencia()
                + ", cliente: " + getCliente() + "]";
    }
    
    
    /* Construtor */    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
