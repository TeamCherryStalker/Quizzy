package game;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;
public class UI implements ActionListener
{
	JPanel rank;
	JButton start;
	JButton[] buttons = new JButton[5];
	JLabel title, pergunta, congrats;
	ImageIcon icon;
	int Y = 0;
	
	UI(String text, String answer_1, String answer_2, String answer_3, String answer_4, String answer_5, String picture,int X)
	{
		Y = X;
		
		icon = new ImageIcon(picture);
		
		title = new JLabel();
		title.setText("Quizzy");
		title.setBounds(385, -150, 600, 600);
		title.setFont(new Font("Comic Sans MS", Font.BOLD, 150));
		title.setForeground(new Color(0x008F39));
		
		start = new JButton();
		start.setBounds(533, 350, 200, 100);
		start.addActionListener(this);
		start.setText("Start");
		start.setFocusable(false);
		start.setFont(new Font("Arial", Font.BOLD, 40));
		
		pergunta = new JLabel();
		pergunta.setText("<html><body style='width: 700px;'>" + text + "</body></html>");
		pergunta.setBounds(215, -400, 1000, 1000);
		pergunta.setHorizontalTextPosition(JLabel.CENTER);
		pergunta.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		pergunta.setForeground(new Color(0x008F39));
		pergunta.setVisible(false);
		
		buttons[0] = new JButton();
		buttons[0].setBounds(100, 250, 340, 180);
		buttons[0].setHorizontalTextPosition(JButton.CENTER);
		buttons[0].addActionListener(this);
		buttons[0].setText("<html><body style='width: 200px;'>" + answer_1 + "</body></html>");
		buttons[0].setFocusable(false);
		buttons[0].setFont(new Font("Verdana", Font.PLAIN, 22));
		buttons[0].setVisible(false);
		
		buttons[1] = new JButton();
		buttons[1].setBounds(825, 250, 340, 180);
		buttons[1].setHorizontalTextPosition(JButton.CENTER);
		buttons[1].addActionListener(this);
		buttons[1].setText("<html><body style='width: 200px;'>" + answer_2 + "</body></html>");
		buttons[1].setFocusable(false);
		buttons[1].setFont(new Font("Verdana", Font.PLAIN, 22));
		buttons[1].setVisible(false);
		
		buttons[2] = new JButton();
		buttons[2].setBounds(100, 450, 340, 180);
		buttons[2].setHorizontalTextPosition(JButton.CENTER);
		buttons[2].addActionListener(this);
		buttons[2].setText("<html><body style='width: 200px;'>" + answer_3 + "</body></html>");
		buttons[2].setFocusable(false);
		buttons[2].setFont(new Font("Verdana", Font.PLAIN, 22));
		buttons[2].setVisible(false);
		
		buttons[3] = new JButton();
		buttons[3].setBounds(825, 450, 340, 180);
		buttons[3].setHorizontalTextPosition(JButton.CENTER);
		buttons[3].addActionListener(this);
		buttons[3].setText("<html><body style='width: 200px;'>" + answer_4 + "</body></html>");
		buttons[3].setFocusable(false);
		buttons[3].setFont(new Font("Verdana", Font.PLAIN, 22));
		buttons[3].setVisible(false);
		
		buttons[4] = new JButton();
		buttons[4].setBounds(462, 350, 340, 180);
		buttons[4].setHorizontalTextPosition(JButton.CENTER);
		buttons[4].addActionListener(this);
		buttons[4].setText("<html><body style='width: 200px;'>" + answer_5 + "</body></html>");
		buttons[4].setFocusable(false);
		buttons[4].setFont(new Font("Verdana", Font.PLAIN, 22));
		buttons[4].setVisible(false);
		
		congrats = new JLabel();
		congrats.setBounds(230, -100, 300, 300);
		congrats.setForeground(new Color(0x857564));
		congrats.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		
		rank = new JPanel();
		rank.setBounds(0,0, 1280, 800);
		rank.setBackground(new Color(0x123456));
		rank.setVisible(false);
		rank.add(congrats);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == start)
		{
			start.setVisible(false);
			title.setVisible(false);
			
			pergunta.setVisible(true);
			for(JButton button : buttons)
			{
				button.setVisible(true);
			}
		}
		
		else if(e.getSource() == buttons[Y])
		{
			try 
			{
				Main.i++;
				icon = new ImageIcon(Main.imagem[Main.i]);
				pergunta.setIcon(icon);
				pergunta.setText("<html><body style='width: 700px;'>" + Main.question[Main.i] + "</body></html>");
				buttons[0].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[1].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[2].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[3].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[4].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n]+ "</body></html>");
				Y = Main.correct[Main.i];
				Data.points += 10;
				Data.combo++;
				if(Data.combo == 3)
				{
					Data.points += 100;
					Data.combo = 0;
				}
			} catch(Exception e1)
			{
				Data.points += 10;
				Data.combo++;
				if(Data.combo == 3)
				{
					Data.points += 100;
					Data.combo = 0;
				}
				Main.i = 1;
				Main.n = 0;
				if(Main.random < 2 && Main.random >= 0)
				{
					Main.repeat++;
					Main.random++;
					Main.question = Data.perguntas[Main.random];
					Main.answer = Data.opcoes[Main.random];
					Main.correct = Data.respostas[Main.random];
					Main.imagem = Data.imagens[Main.random];
					//System.out.println(Main.random);
					Main.frame.repaint();
				}
				else
				{
					Main.repeat++;
					Main.random -= 2;
					Main.question = Data.perguntas[Main.random];
					Main.answer = Data.opcoes[Main.random];
					Main.correct = Data.respostas[Main.random];
					Main.imagem = Data.imagens[Main.random];
					//System.out.println(Main.random);
					Main.frame.repaint();
				}
				if(Main.repeat == Data.opcoes.length)
				{
					pergunta.setVisible(false);
					for(JButton button : buttons)
					{
						button.setVisible(false);
					}
					congrats.setText("Sua pontuação é de " + Data.points + " pontos.");
					rank.setVisible(true);
				}
			}
		}
		else
		{
			try 
			{
				Main.i++;
				icon = new ImageIcon(Main.imagem[Main.i]);
				pergunta.setIcon(icon);
				pergunta.setText("<html><body style='width: 700px;'>" + Main.question[Main.i] + "</body></html>");
				buttons[0].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[1].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[2].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[3].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n++]+ "</body></html>");
				buttons[4].setText("<html><body style='width: 200px;'>" + Main.answer[Main.i + Main.n]+ "</body></html>");
				Y = Main.correct[Main.i];
				Data.combo = 0;
			} catch(Exception e1)
			{
				Data.combo = 0;
				Main.i = -1;
				Main.n = 0;
				if(Main.random < 2 && Main.random >= 0)
				{
					Main.repeat++;
					Main.random++;
					Main.question = Data.perguntas[Main.random];
					Main.answer = Data.opcoes[Main.random];
					Main.correct = Data.respostas[Main.random];
					Main.imagem = Data.imagens[Main.random];
					//System.out.println(Main.random);
					Main.frame.repaint();
				}
				else
				{
					Main.repeat++;
					Main.random -= 2;
					Main.question = Data.perguntas[Main.random];
					Main.answer = Data.opcoes[Main.random];
					Main.correct = Data.respostas[Main.random];
					Main.imagem = Data.imagens[Main.random];
					//System.out.println(Main.random);
					Main.frame.repaint();
				}
				if(Main.repeat == Data.opcoes.length)
				{
					pergunta.setVisible(false);
					for(JButton button : buttons)
					{
						button.setVisible(false);
					}
					congrats.setText("Sua pontuação é de " + Data.points + " pontos.");
					rank.setVisible(true);
				}
			}
		}
	}
}