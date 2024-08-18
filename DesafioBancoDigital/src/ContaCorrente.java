public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
		super(cliente, "Conta Corrente");
	}

	@Override
	public void extrato() {
		System.out.println("### EXTRATO CONTA CORRENTE ###");
		super.extrato();
	}
	
}
