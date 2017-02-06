package game;

public class Balls 
{
	public double BallX, BallY;
	private double vx, vy;
	private int radius;
	
	public Balls()
	{
		BallX = Math.random() * 400 - 0.5 ;
		vx = Math.random() * 1 - 0.5;
			
		BallY = Math.random() * 400 - 0.5;
		vy = Math.random() * 1 - 0.5;
		
		radius = 1;
	
	}
	
	public void bounceOffHorizontalWalls()
	{
		vy = -vy;
	}
	
	

	public void bounceOffVerticalWalls()
	{
		vx = -vx;
	}
	
	public void moveTheBall()
	{
		if (Math.abs(BallY + vy) + radius > 500.0) 
			bounceOffVerticalWalls();
		if (Math.abs(BallX + vx) + radius > 500.0)
			bounceOffHorizontalWalls();
		BallX = BallX + vx;
		BallY = BallY + vy;
	}
	
}
