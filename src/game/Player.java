package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Player extends JPanel 
{
	private int x, y;
	public boolean ingame = true;
	public int lives = 3;
	
	public Player(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		JPanel player = new JPanel();	//Player Panel
		setSize(5,5);
		setVisible(true);
		setBackground(Color.BLACK);
		setLocation(x,y);
		
		
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
				setY(getY() + 5);
				repaint();
				System.out.println("y");

			}
			
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				setY(getY() - 5);
				repaint();
				System.out.println("y");
			}
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				setX(getX() - 5);
				repaint();
				System.out.println("x");
			}
				
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				setX(getX() + 5);
				repaint();
				System.out.println("x");
			}
		}
		
		public void keyReleased(KeyEvent e) {}
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
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	
	
}
