//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.BLACK;
		
		
	}
	
	public Block(int x, int y, Color col)
	{
		xPos = x;
		
		yPos = y;
		
		width = 10;
		
		height = 10;
		
		color = col;
	}
	
	public Block(int x, int y)
	{
		xPos = x;
		
		yPos = y;
		
		width = 10;
		
		height = 10;
		
		color = Color.white;
	}

	public Block(int x, int y, int wid, int hei)
	{
		xPos = x;
		
		yPos = y;
		
		width = wid;
		
		height = hei;
		
		color = Color.white;
	}
	
	public Block(int x, int y, int wid, int hei, Color col)
	{
		xPos = x;
		
		yPos = y;
		
		width = wid;
		
		height = hei;
		
		color = col;

	}

	
 
	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
		
	}

	@Override
	public void setX(int x) {
		xPos = x;
		
	}

	@Override
	public void setY(int y) {
		yPos = y;
		
	}
	
   public void setColor(Color col)
   {
	   color = col;

   }
   
   
   public void setHeight(int h) {
	   height = h;
   }
   
   
   public void setWidth(int w) {
	   width = w;
	   
	   
	   
   }

   public void draw(Graphics window)
   {
   	
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{	
		Block s = (Block) obj;
		if (s.getX() != xPos) {
			return false;
		}
		if (s.getY() != yPos) {
			return false;
		}
		if (s.getWidth() != width) {
			return false;
		}
		if (s.getHeight() != height) {
			return false;
		}
		if (s.getColor() != color) {
			return false;
		}


		return true;
	}

	

	

	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}   

   public int getWidth() {
	   return width;
   }
   
   public int getHeight() {
	   return height;
   }
   
   public Color getColor() {
	   return color;
   }
    

   //add a toString() method  - x , y , width, height, color
   public String toString() {
	   return "xPos : " + xPos + " yPos : " + yPos + " width : " +width+" height : "+height+" color : " + color;
   }
}