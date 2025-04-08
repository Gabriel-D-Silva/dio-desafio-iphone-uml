package iPhone_Interfaces;

public class Main {

	public static void main(String[] args) {
		Iphone meuCelular = new Iphone();

        // Testando funcionalidades
		meuCelular.selecionarMusica("Bohemian Rhapsody");
		meuCelular.tocarMusica();
		meuCelular.pausarMusica();

		meuCelular.ligar("94 98100-0001");
		meuCelular.atender();
		meuCelular.iniciarCorreioVoz();

		meuCelular.exibirPagina("https://dio.me");
		meuCelular.adicionarNovaAba();
		meuCelular.atualizarPagina();
	}

}
