public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("DIO", "111", "Juridica");
        Cliente c2 = new Cliente("Gabriel", "112", "Fisica");

        Conta cc1 = new Conta(c1);
        Conta cc2 = new Conta(c2);
        cc2.sacar(500, true);
        cc2.depositar(10000, true);
        cc2.depositar(5000, true);
        cc2.sacar(10000, true);

        cc1.extrato();
        cc2.transferir(cc1, 3000);
        cc1.extrato();


    }
}
