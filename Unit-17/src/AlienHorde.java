//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		if (aliens.size() > 0) {
			for (Alien a : aliens) {
				a.draw(window);
			}
		}
	}

	public void moveEmAll()
	{
		for (Alien b : aliens) {
                b.move("RIGHT"); 
        }
		for (Alien b : aliens) {
            if (b.getX() >= 740) {
                b.move("LEFT");
            }
            if (b.getX() <= 0) {
                b.move("RIGHT");
            }
        }
	}
	


	public void removeDeadOnes(List<Ammo> shots)
	{
		for (Alien b : aliens) {
			for ( Ammo a : shots) {
				if (a.getX() == b.getX() && a.getY() == b.getY()) {
					b.setPos(-1000, -1000);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
