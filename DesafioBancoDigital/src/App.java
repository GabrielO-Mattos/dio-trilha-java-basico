public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("DIO", "123456789", "Juridica");
        Cliente c2 = new Cliente("Gabriel", "123456789", "Fisica");

        System.out.println(c1.getNome() + c1.getCnpj() + c1.getCpf());
        System.out.println(c2.getNome() + c2.getCnpj() + c2.getCpf());

    }
}
