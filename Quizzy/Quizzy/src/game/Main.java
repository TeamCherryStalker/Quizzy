package game;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
public class Main
{
	static int n = 0;
	static int i = 0;
	static int random = ThreadLocalRandom.current().nextInt(0, 2);
	static String[] question = Data.perguntas[random]; 
	static String[] answer = Data.opcoes[random];
	static int[] correct = Data.respostas[random];
	static String[] imagem = Data.imagens[random];
	static JFrame frame = new JFrame("Quizzy");
	static int repeat = 0;
	
	public static void main(String[] args) 
	{	
		UI buttons = new UI(question[i], answer[i + n++], answer[i + n++], answer[i + n++],
				   answer[i + n++], answer[i + n], imagem[i] ,correct[i]);
		
		//System.out.println(Main.random);
		
		ImageIcon image = new ImageIcon("5n8pc3p8hwm91.png");
		
		frame.setSize(1280, 800);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setIconImage(image.getImage());
		
		frame.add(buttons.title);
		frame.add(buttons.start);
		frame.add(buttons.pergunta);
		for(JButton button : buttons.buttons)
		{
			frame.add(button);
		}
		frame.add(buttons.rank);
		
		frame.setVisible(true);
	}
}