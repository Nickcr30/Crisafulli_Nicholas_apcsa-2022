//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{ 
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double num = Math.random();
		num = num*3;
		if (num <1) {
			compChoice = "R";
		} if (num >= 1 && num < 2) {
			compChoice = "P";
		} if (num >= 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice)) {
			winner = "Draw";
		} if( (playChoice.equals("R") && compChoice.equals("P") ) || (playChoice.equals("P") && compChoice.equals("S")) || (playChoice.equals("S") && compChoice.equals("R") ) ) {
			winner = "Computer";
		} else {
			winner = "Player";
		}
		
		return winner;
	}

	public String toString()
	{
		String output="";
		if (determineWinner().equals("Draw")) {
			output = "!Draw Game!";
		} if (determineWinner().equals("Player")) {
			output = "!Player wins ";
			if (playChoice.equals("R")) {
				output += "<<Rock Breaks Scissors>>!";
			} if (playChoice.equals("P")) {
				output += "<<Paper Covers Rock>>!";
			} else {
				output += "<<Scissors Cuts Paper>>!";
			}
			
		} else {
			output = "!Computer wins ";
			if (compChoice.equals("R")) {
				output += "<<Rock Breaks Scissors>>!";
			} if (compChoice.equals("P")) {
				output += "<<Paper Covers Rock>>!";
			} else {
				output += "<<Scissors Cuts Paper>>!";
			}
		}
		
		return "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + output;
	}
}