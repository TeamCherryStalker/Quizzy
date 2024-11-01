package game;
import java.util.*;
public class Questions 
{
	public void question(String text, String answer_1, String answer_2, String answer_3, String answer_4, String answer_5, int number, int right)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println(text);
		System.out.println(answer_1 + "\n" + answer_2 + "\n" + answer_3 + "\n" + answer_4 + "\n" + answer_5 + "\n");
		number = teclado.nextInt();
		if(number == right)
		{
			System.out.println("Você acertou!!!");
		}
		else
		{
			System.out.println("Você errou...");
		}
		//teclado.close();
	}
}