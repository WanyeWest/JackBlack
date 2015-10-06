import java.util.*;

public class Dealer
{
	static int suit = 4;
	static int[] rank = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		
	static int ranks = rank.length;
	static int n = suit * ranks;

	public static List<Integer> createAndShuffleDeck()
	{
		int[] initialdeck = new int[n];
		for(int i = 0; i < ranks; i++)
		{
			for (int j = 0; j < suit; j++)
			{
				initialdeck[suit * i + j] = rank[i];
			}		
		}
		for(int i = 0; i < n; i++) 
		{
			int r = i + (int) (Math.random() * (n - i));
			int t = initialdeck[r];
			initialdeck[r] = initialdeck[i];
			initialdeck[i] = t;
		}

		ArrayList<Integer> newDeck = new ArrayList<Integer>(initialdeck.length);
		for(int a = 0; a < initialdeck.length; a++)
		{
			newDeck.add(initialdeck[a]);
		}

		return newDeck;

	}
	/*
	for (int i = 0; i < n; i++)
	{
		System.out.println(newDeck[i]);	
	}
	*/
}