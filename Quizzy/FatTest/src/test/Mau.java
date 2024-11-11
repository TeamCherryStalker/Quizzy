package test;
import javax.swing.*;
import java.awt.*;
public class Mau 
{
	public static void main(String[] args) 
	{
		/*
		// Frame 
			JFrame frame = new JFrame("FatTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(null);
			frame.setSize(950,750);
		
		// All labels
			JLabel labelBrown = new JLabel(), labelCyan = new JLabel(), labelGreen = new JLabel();
			labelGreen.setText("I'm here!!!");
			labelCyan.setText("And I'm here!!!");
			labelBrown.setText("I kill dogs just for fun...");
			
		// The label of the green panel
			labelGreen.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			labelGreen.setBounds(0,100,250,250);
			
		// The label of the cyan panel
			labelCyan.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			labelCyan.setBounds(25,-110,250,250);
			
		// The label of the brown panel
			labelBrown.setFont(new Font("Verdana", Font.ITALIC, 40));
			labelBrown.setBounds(10,0,500, 500);
			
		// Green panel
			JPanel greenPanel = new JPanel();
			greenPanel.setBackground(new Color(0x336745));
			greenPanel.setBounds(0, 0, 250, 250);
			greenPanel.setLayout(null);
		
		// Cyan panel
			JPanel cyanPanel = new JPanel();
			cyanPanel.setBackground(new Color(0x668897));
			cyanPanel.setBounds(250, 0, 250, 250);
			cyanPanel.setLayout(null);
		
		// Brown panel
			JPanel brownPanel = new JPanel();
			brownPanel.setBackground(new Color(0x994235));
			brownPanel.setBounds(0, 250, 500, 500);
			brownPanel.setLayout(null);
		
		// Frame added stuff
			brownPanel.add(labelBrown);
			cyanPanel.add(labelCyan);
			greenPanel.add(labelGreen);
			frame.add(greenPanel);
			frame.add(cyanPanel);
			frame.add(brownPanel);
		
		// Make the frame visible
			frame.setVisible(true);
		*/
		
		new MyFrame();
	}
}