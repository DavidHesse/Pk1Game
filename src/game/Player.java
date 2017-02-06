package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Player extends JPanel 
{
	private int x = 300, y = 300;
	public boolean ingame = true;
	public int lives = 3;
	
	public Player()
	{
		JPanel player = new JPanel();	//Player Panel
		setSize(5,5);
		setVisible(true);
		setBackground(Color.BLACK);
		setLocation(x,y);
		
	}	
	
	public void drawPlayer(Graphics g)
	{
		if (ingame = true)
		{
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(x, y, 5, 5);
			g.drawRect(x, y, 5, 5);
		}
		
	}
	
	public void checkCollision()
	{
		if(x == Dodgeyballer.WIDTH )
		{
			death();
		}
		
		if(y == Dodgeyballer.HEIGHT)
		{
			death();
		}
		
	}
	
	public void death()
	{
		lives--;
		if (lives == 0)
		{
			ingame = false;
		}
	}

	public class playerMovements implements KeyListener 
	{
		public void keyTyped(KeyEvent e) {}

		public void keyPressed(KeyEvent e) 
		{
			if (e.getKeyCode() == KeyEvent.VK_UP) 
			{
				y = y + 1;
				repaint();
			}
			
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				y = y - 1;
				repaint();
			}
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				x = x - 1;
				repaint();
			}
				
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				x = x + 1;
				repaint();
			}

		}

		public void keyReleased(KeyEvent e) 
		{
			// TODO Auto-generated method stub

		}

	}

}
