package iphone;

public class AparelhoTelefonico implements Iphone {

    private int telefone = 0;

    public void exibirPagina(int telefone){
        setTelefone(telefone);
        System.out.println("Telefone: " + getTelefone());
    }

    public void atender(){
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    // get e sets

    protected int getTelefone() {
        return telefone;
    }

    protected void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
