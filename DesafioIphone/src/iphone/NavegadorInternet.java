package iphone;

public class NavegadorInternet implements Iphone {

    private String url = "";

    public void exibirPagina(String url){
        setUrl(url);
        System.out.println("Exibindo a página: " + getUrl());
    }
    
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }

    // get e sets

    protected String getUrl() {
        return url;
    }

    protected void setUrl(String url) {
        this.url = url;
    }

}
