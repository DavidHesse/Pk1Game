package game;

import java.awt.EventQueue;
import javax.swing.JFrame;

/*
 * Main Method
 */


public class Dodgeyballer extends JFrame
{
	
	public Dodgeyballer()
	{
		add(new Board());
		
		JFrame frame = new JFrame("Dodgeyballer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500); 
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	public static void main(String args[])
	{
		new Dodgeyballer();
	}
}
