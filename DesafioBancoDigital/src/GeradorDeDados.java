import java.util.List;
import java.util.Random;

public class GeradorDeDados {

    private static final Random RANDOM = new Random();
    private static final List<String> NOMES = List.of("Ana", "Carlos", "Maria", "João", "Pedro", "Laura", "Lucas", "Beatriz", "Fernanda", "Roberto");
    private static final List<String> TIPOS_PESSOA = List.of("Juridica", "Fisica");

    private static String gerarNomeAleatorio() {
        return NOMES.get(RANDOM.nextInt(NOMES.size()));
    }

    private static int gerarNumeroAleatorio() {
        return RANDOM.nextInt(900) + 100; // Gera um número entre 100 e 999
    }

    private static String gerarTipoPessoaAleatorio() {
        return TIPOS_PESSOA.get(RANDOM.nextInt(TIPOS_PESSOA.size()));
    }

    public static void gerarEExibirDados(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            String nome = gerarNomeAleatorio();
            int numero = gerarNumeroAleatorio();
            String tipoPessoa = gerarTipoPessoaAleatorio();
            
            System.out.println("Nome: " + nome + ", Número: " + numero + ", Tipo de Pessoa: " + tipoPessoa);
        }
    }
}
