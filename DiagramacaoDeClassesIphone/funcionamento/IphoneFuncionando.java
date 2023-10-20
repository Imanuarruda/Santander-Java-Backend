package funcionamento;
import modelagem.EstruturaIphone;

public class IphoneFuncionando {
	 public static void main(String[] args) {
        var iPhone = new EstruturaIphone();
        
        System.out.println("\n# Funções do Aparelho Telefônico");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioDeVoz();

        System.out.println("\n# Funções do Navegador de Internet");
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        System.out.println("\n# Funções do Reprodutor Musical");
        iPhone.adicionarNovaAba();
        iPhone.exibirPagina();
        iPhone.atualizarPagina();
	 }
}