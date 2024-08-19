public abstract class Conteudo {

    // Variaveis
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;


    // Get's and Set's    
    public String getTitulo() {
        return titulo;
    }    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    
    public String getDescricao() {
        return descricao;
    }    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    // Funcoes
    public abstract double calcularXp();

}