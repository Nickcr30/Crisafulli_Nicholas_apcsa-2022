//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


 //add the other Paddle constructors

   public Paddle(int x, int y)
   {
 	  super(x, y);
 	  
 	  speed = 2;
   }

   public Paddle(int x, int y, int sped)
   {
 	super(x, y);
 	
 	speed = sped;
   }

   public Paddle(int x, int y, int width, int height)
   {
 	  super(x, y, width, height);
 	  
 	  speed = 2;
   }

   public Paddle(int x, int y, int width, int height, Color col)
   {
 	  super(x, y, width, height, col);
 	  
 	  speed = 2;
   }

   public Paddle(int x, int y, int width, int height, int paddleSpeed)
   {
 	  super(x, y, width, height);
 	  
 	  speed = paddleSpeed;
   }
   
   public Paddle(int x, int y, int width, int height, Color col, int paddleSpeed)
   {
 	  super(x, y, width, height, col);
 	  
 	  speed = paddleSpeed;
   }
   
   public int getSpeed()
   {
 	 return speed;
   }

   public void moveUpAndDraw(Graphics window)
   {
 	  	//draw a white box at old paddle location
 	    draw(window,Color.WHITE);

 	    setY(getY()-speed);
 	    
 	    //draw the paddle at its new location
 	    draw(window, super.getColor());

   }

   public void moveDownAndDraw(Graphics window)
   {
 	  	//draw a white box at old paddle location
 	    draw(window,Color.WHITE);

 	    setY(getY()+speed);
 	    
 	    //draw the paddle at its new location
 	    draw(window, super.getColor());

   }

   //add get methods
   

   //add a toString() method
}