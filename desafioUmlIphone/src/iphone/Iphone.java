package iphone;
import ipod.ReprodutorMusical;
import navegador.Navegador;
import telefone.Telefone;

public class Iphone implements ReprodutorMusical, Navegador, Telefone{

	@Override
	public void ligar() {
		System.out.println("Ligando para o contato");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação de fulano");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a página no navegador");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");
		
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando a música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}
}
