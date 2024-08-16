package iphone;

public class AparelhoTelefonico {

    private String telefone = null;

    public void ligar(String telefone){
        setTelefone(telefone);
        System.out.println("Ligando para o telefone: " + getTelefone());
    }

    public void atender(){
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    // get e sets

    protected String getTelefone() {
        return telefone;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
