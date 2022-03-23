//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		int index = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[index];
				index++;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String[] temp = new String[vals.length];
		for (int p = 0; p < vals.length; p++) {
			temp[p] = vals[p];
		}
		
		String value = "";
		int greatest = 0;
		String most = "";
		
		for (int i = 0; i < temp.length; i++) {
			int count = 1;
			value = temp[i];
			if (value.equals("")) {
				
			} else {
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[j].equals(value)) {
						count++;
						temp[j] = "";
					}
				}
				if (count > greatest) {
					greatest = count;
					most = temp[i];
				}
			}									

		}
		return most + " occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}