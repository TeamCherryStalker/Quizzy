package game;
public class Main 
{
	public static void main(String[] args) 
	{
		Questions write = new Questions();
		Data coisas = new Data(); 
		for(int i = 0; i < coisas.perguntas.length;i++)
		{
			write.question(coisas.perguntas[i], coisas.opcoes[i], coisas.opcoes[i+1], coisas.opcoes[i+2], coisas.opcoes[i+3], coisas.opcoes[i+4], 0, coisas.respostas[i]);
		}
	}
}
