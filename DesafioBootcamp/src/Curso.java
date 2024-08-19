public class Curso extends Conteudo {

    // Variaveis
    private int cargaHoraria;


    // Get's and Set's    
    public int getCargaHoraria() {
        return cargaHoraria;
    }    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' + ", cargaHoraria=" + getCargaHoraria() + '}';
    }

}
