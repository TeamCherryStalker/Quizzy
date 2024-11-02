package game;
import java.util.*;
public class Methods 
{
	public static void question(String text, String answer_1, String answer_2, String answer_3, String answer_4, String answer_5, int number, int right)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println(text);
		System.out.println(answer_1 + "\n" + answer_2 + "\n" + answer_3 + "\n" + answer_4 + "\n" + answer_5 + "\n");
		number = teclado.nextInt();
		if(number == right)
		{
			Data.points += 10;
			Data.combo++;
		}
		else
		{
			Data.combo = 0;
		}
		
		if(Data.combo == 3)
		{
			Data.points += 100;
			Data.combo = 0;
		}
		//teclado.close();
	}
}