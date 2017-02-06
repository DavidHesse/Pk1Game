package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel
{
	
	public Board() 
	{
		setSize(500,500);
		setLocation(null);
		setVisible(true);
		setBackground(Color.GRAY);
		
		add(new Player());
	
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawRect(0,0,500,500);
		g.setColor(Color.GRAY);
		g.fillRect(0,0,500,500);
		
	}
	
	
}
