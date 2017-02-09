package game;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Homescreen with jbuttons: "Play", "Exit", "Steueroperationen" (or controls), "Spiel erklärt" (or Gameplay explained), "Highscore"
 * 
 * 
 */



public class HomeScreen extends JPanel
{	
	
	public void render(Graphics g)
	{
		g.drawString("Dodgeyballer", Dodgeyballer.WIDTH / 2, 50);
	}
	
	
}
