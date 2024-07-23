public class MeuIphone {
    public static void main(String[] args){
        iPhone meuIphone = new iPhone();

        //ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("David Kushner - Daylight");

        //AparelhoTelefonico
        meuIphone.ligar("3499314837");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        //NavegadorInternet
        meuIphone.exibirPagina("https://www.yahoo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
