package iPhone_Interfaces;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

	// Aparelho Telefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}
	
	// Reprodutor Musical
	@Override
	public void tocarMusica() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
	}

	// Navegador de Internet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

}
