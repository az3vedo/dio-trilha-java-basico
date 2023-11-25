import iphone.Iphone;

public class Main {
	public static void main(String[] args) {
		Iphone celular = new Iphone();
		
		celular.selecionarMusica();
		celular.tocar();
		celular.pausar();
		
		celular.atender();
		celular.ligar();
		
		celular.tocar();
		
		celular.exibirPagina();
		celular.adicionarNovaAba();
	}
}
