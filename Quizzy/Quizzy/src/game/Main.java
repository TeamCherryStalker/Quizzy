package game;
public class Main 
{
	public static void main(String[] args) 
	{
		int n = 0;
		for (int i = 0; i < Data.perguntas.length; i++) 
		{
			Methods.question(Data.perguntas[i], Data.opcoes[i + n++], Data.opcoes[i + n++], Data.opcoes[i + n++],
						   Data.opcoes[i + n++], Data.opcoes[i + n], 0, Data.respostas[i]);
		}
		System.out.println("Sua pontuação final é: " + Data.points + "\nParabéns!!!");
	}
}