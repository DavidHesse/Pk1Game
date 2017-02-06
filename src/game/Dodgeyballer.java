package game;

import java.awt.EventQueue;
import javax.swing.JFrame;

/*
 * Main Method
 */


public class Dodgeyballer extends JFrame
{
	
	private void Dodgeyballer()
	{
		add(new Board());
		add(new HomeScreen());
		setTitle("DodgeyBaller");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				Dodgeyballer ex = new Dodgeyballer();
				ex.setVisible(true);
			}
		});

	}
}
