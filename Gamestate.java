//verify cards are less than 21
//save each new card to database as it is generated
//ace- 1 or 11   if 11 can fit, it is 11
//SOMEBODY PLEASE IMPROVE THE WIN CONDITIONS - Jerry

import java.util.*;

public class Gamestate
{
	ArrayList<Integer> playerHand;
	ArrayList<Integer> dealerHand;
	int playerTotal;
	int dealerTotal;
	boolean pStand;

	public Gamestate() 
	{
		playerHand = new ArrayList<Integer>();
		dealerHand = new ArrayList<Integer>();
	}
	// static ArrayList<Integer> this.playerHand = new ArrayList<Integer>();
 //    static ArrayList<Integer> this.dealerHand = new ArrayList<Integer>();

	// static int this.playerTotal = 0;

	public List<Integer> getPlayerHand() 
	{
		return this.playerHand;
	}

	public List<Integer> getDealerHand() 
	{
		return this.dealerHand;
	}

	public int getPlayerTotal()
	{
		this.playerTotal = 0;
		for(int i = 0; i < this.playerHand.size(); i++)
		{
			this.playerTotal += this.playerHand.get(i);
		}
		System.out.println("Your total is " + this.playerTotal);
	return this.playerTotal;
	}


	public int getDealerTotal()
	{
		this.dealerTotal = 0;
		for(int i = 0; i < this.dealerHand.size(); i++)
		{
			this.dealerTotal += this.dealerHand.get(i);
		}
		System.out.println("Dealer's total is " + this.dealerTotal);
	    return this.dealerTotal;
	}


	public boolean playerWins()
	{
		boolean pwin = false;
		if(this.playerTotal > this.dealerTotal && this.playerTotal <= 21 && pStand || this.playerTotal == 21 || this.dealerTotal > 21)
		{
			pwin = true;
		}
	return pwin;
	}

	public boolean dealerWins()
	{
		boolean dwin = false;
		if(this.dealerTotal > this.playerTotal && this.dealerTotal <= 21 && pStand || this.playerTotal > 21)
		{
			dwin = true;
		}
	return dwin;
	}


	public List<Integer> ace()
	{

		/*int[] something = {
			5, 4, 1, 11
		};*/
		if(this.playerTotal > 21)
		{
			for(int i = 0; i < this.playerHand.size(); i++)
			{
				if(this.playerHand.get(i) == 11)
				{
					this.playerHand.set(i, 1);
				}
			}
		}
	return this.playerHand;
	}
}