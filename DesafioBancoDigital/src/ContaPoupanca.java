public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
		super(cliente, "Conta Poupanca");
	}

	@Override
	public void extrato() {
        System.out.println("### EXTRATO CONTA POUPANCA ###");
		super.extrato();
	}

	
}
