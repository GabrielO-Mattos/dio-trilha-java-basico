public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("DIO", "123456789", "Juridica");
        Cliente c2 = new Cliente("Gabriel", "123456789", "Fisica");
        // Cliente c3 = new Cliente("Gabriel2", "123456789", "Fisica");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        

    }
}
