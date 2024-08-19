import java.time.LocalDate;

public class Mentoria extends Conteudo{

    // Variaveis
    private LocalDate data;


    // Get's and Set's    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' + ", data=" + getData() + '}';
    }

}
