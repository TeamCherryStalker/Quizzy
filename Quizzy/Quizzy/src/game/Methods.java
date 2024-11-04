package game;
import java.util.*;
// Classe responsável por armazena todos os métodos que utilizaremos no projeto
public class Methods 
{
	static Scanner teclado = new Scanner(System.in);
	// Função responsável criar uma pergunta do quiz e suas respostas
	public static void question(String text, String answer_1, String answer_2, String answer_3, String answer_4, String answer_5, int number, int right)
	{
		System.out.println(text);
		System.out.println(answer_1 + "\n" + answer_2 + "\n" + answer_3 + "\n" + answer_4 + "\n" + answer_5 + "\n");
		number = teclado.nextInt();
	        // Código responsável por pontuar quem acertar e resetar o combo quando errar
		  if(number == right)
		  {
			  Data.points += 10;
			  Data.combo++;
		  }
		  else
		  {
			  Data.combo = 0;
		  }
		// Código que pontua com base no combo
		  if(Data.combo == 3)
		  {
			  Data.points += 100;
			  Data.combo = 0;
		  }
	}
}
