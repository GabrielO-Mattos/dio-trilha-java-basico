package iphone;

public class ReprodutorMusical implements Iphone {

    private String musica = null;

    public void selecionarMusica(String musica){
        setMusica(musica);
        System.out.println("Selecionando a música: " + getMusica());
    }

    public void tocar(){

        if (getMusica() == null) {
            System.out.println("Tocando a música atual");
        }else{
            System.out.println("Tocando a música atual" + getMusica());
        }

    }

    public void pausar(){

        if (getMusica() == null) {
            System.out.println("Pausando a música atual");
        }else{
            System.out.println("Pausando a música atual" + getMusica());
        }
        
    }

    // get e sets

    protected String getMusica() {
        return musica;
    }

    protected void setMusica(String musica) {
        this.musica = musica;
    }

}
