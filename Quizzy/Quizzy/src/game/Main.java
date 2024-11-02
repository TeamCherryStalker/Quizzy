package game;
// Classe principal responsável por rodar o jogo
public class Main 
{
	// Import das outras classes
	static Methods write = new Methods();
	static Data coisas = new Data();
	// Função que gera as perguntas no console
	public static void main(String[] args) 
	{
		int n = 0;
		for (int i = 0; i < coisas.perguntas.length; i++) 
		{
			write.question(coisas.perguntas[i], coisas.opcoes[i + n++], coisas.opcoes[i + n++], coisas.opcoes[i + n++],
				       coisas.opcoes[i + n++], coisas.opcoes[i + n], 0, coisas.respostas[i]);
		}
	}
}
