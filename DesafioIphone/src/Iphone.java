import iphone.AparelhoTelefonico;
import iphone.NavegadorInternet;
import iphone.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {

        AparelhoTelefonico tel = new AparelhoTelefonico();
        tel.atender();
        tel.iniciarCorreioVoz();
        tel.ligar("+55(00) 98765-4321");

        NavegadorInternet pag = new NavegadorInternet();
        pag.adicionarNovaAba();
        pag.exibirPagina("https://web.dio.me/home");
        pag.atualizarPagina();

        ReprodutorMusical mus = new ReprodutorMusical();
        mus.tocar();
        mus.pausar();
        mus.selecionarMusica("Imagine Dragons x J.I.D - Enemy");
        mus.tocar();
        mus.pausar();

    }
}
