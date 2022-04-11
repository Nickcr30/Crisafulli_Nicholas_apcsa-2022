 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	 public Ball(Color col)
	  {
		  super(200,200, col);
		  
		  xSpeed = 4;
		  ySpeed = 2;
	  }
	 
	public Ball(int x, int y) {
		super(x,y,Color.BLACK);
		xSpeed =2;
		ySpeed = 2;
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height, Color.BLACK);
		
		xSpeed = 2;
		ySpeed = 2;
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		xSpeed = 2;
		ySpeed = 2;
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSped, int ySped) {
		super(x,y,width,height,color);
		xSpeed = xSped;
		ySpeed = ySped;
	}
	
	
	
	
	
	
	
	   
   //add the set methods
   public void setXSpeed(int x){
	   xSpeed = x;
   }
   
   public void setYSpeed(int y){
	   ySpeed = y;
   }
	
	

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window, Ball.super.getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball b = (Ball) obj;
		if (b.getXSpeed() != xSpeed) {
			return false;
		}
		if (b.getYSpeed() != ySpeed) {
			return false;
		}


		return true;
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	
   //add a toString() method
	public String toString()
	  {
		  return super.toString() + " " + xSpeed + " " + ySpeed;
	  }
}