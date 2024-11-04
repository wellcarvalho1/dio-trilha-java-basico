public class Dispositivos {

    public interface ReprodutorMusical {
        void tocar();

        void pausar();

        void selecionarMusica(String musica);
    }

    public interface AparelhoTelefonico {
        void ligar(String numero);

        void atender();

        void iniciarCorreioVoz();
    }

    public interface NavegadorNaInternet {
        void exibirPagina(String url);

        void adicionarNovaAba();

        void atualizarPagina();
    }
}
