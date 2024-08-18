public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("DIO", "111", "Juridica");
        Cliente c2 = new Cliente("Gabriel", "112", "Fisica");

        Conta cc = new Conta(c2);

        // System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(cc.toString());

    }
}
