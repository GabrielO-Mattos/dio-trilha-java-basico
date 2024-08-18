import java.util.List;
import java.util.Random;

public class GeradorDeDados {

    private static final Random RANDOM = new Random();
    private static final List<String> NOMES = List.of("Ana", "Carlos", "Maria", "Joao", "Pedro", "Laura", "Lucas", "Beatriz", "Fernanda", "Roberto");
    private static final List<String> TIPOS_PESSOA = List.of("Juridica", "Fisica");

    public static String gerarNomeAleatorio() {
        return NOMES.get(RANDOM.nextInt(NOMES.size()));
    }

    public static String gerarCpfCnpjAleatorio() {
        return Integer.toString(RANDOM.nextInt(900) + 100);
    }

    public static String gerarTipoPessoaAleatorio() {
        return TIPOS_PESSOA.get(RANDOM.nextInt(TIPOS_PESSOA.size()));
    }

    public static double gerarDepositoAleatorio(){
        return Math.round(RANDOM.nextDouble() * 1000 * 100.0) / 100.0;
    }

}
