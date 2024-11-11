package test;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener 
{
	JButton button;
	JLabel label;
	
	MyFrame()
	{
		
		ImageIcon icon = new ImageIcon("pixilart-drawing (1).png");
		ImageIcon cock = new ImageIcon("colorful-cock-sketch-vector-27126656.jpg");
		
		label = new JLabel();
		label.setIcon(cock);
		label.setBounds(0, 0, 500, 500);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(120, 150, 250, 100);
		button.addActionListener(this);
		button.setText("Cocks <3");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans MS", Font.ITALIC, 24));
		button.setIconTextGap(-10);
		button.setForeground(Color.red);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			System.out.println("BoysLoveeeeeeeeeeee!!!!");
			button.setVisible(false);
			label.setVisible(true);
			
		}
	}
}