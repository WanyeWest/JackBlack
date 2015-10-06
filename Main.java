//ai brainlessly draws cards. i got lazy - Jerry

import java.util.*;

public class Main
{
	static List<Integer> deck = Dealer.createAndShuffleDeck();

	public static void main(String[] args)
	{
		boolean game = true;
		System.out.println("Sup cuh, welcome to Blackjack. Grab yo' seat and let's hit dis up G!");
		Gamestate gamestate = new Gamestate();

		while(game)
		{
			HitStandSplit.choice(gamestate);
			gamestate.getPlayerTotal();
			if(gamestate.getDealerTotal() < 17)
			{
				HitStandSplit.dealerHit(gamestate);
			}
			gamestate.getDealerTotal();
			gamestate.ace();
			if(gamestate.playerWins())
			{
				System.out.println("You win");
				break;
			}
			else if(gamestate.dealerWins())
			{
				System.out.println("Dealer wins");
				break;
			}
		}	
	}
}