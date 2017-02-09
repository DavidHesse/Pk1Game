package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel
{
	public boolean inGame = true;
	public int lives = 3;
	private HomeScreen menu;
	public enum STATE{menu, game};
	public STATE state = STATE.menu;
	private int x, y;
	
	public Board() 
	{
		

	//	menu = new HomeScreen();
		
		
		add(new Player(x, y));
		
	}


	

	
	
	
}
