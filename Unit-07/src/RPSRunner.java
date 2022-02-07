//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
		
		//add in a do while loop after you get the basics up and running
		
		
			String player = "";
			RockPaperScissors game = new RockPaperScissors();
			
			
			while (response.equals("y")) {
				out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
				player = keyboard.next().substring(0,1);
				game.setPlayers(player);
				out.print(game);
				out.print("\n\nDo you want to play again?");
				response = keyboard.next();
				out.print("\n");
			}
	}
}



