//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		
		if (ray.length > 1) {
			for (int i = 0; i < ray.length; i++) {
				if (ray[i] > ray[ray.length-1]) {
					sum += ray[i];
				}
			}
		} else {
			sum = -1;
		}
		if (sum == 0) {
			sum = -1;
		}
		return sum;
	}
}