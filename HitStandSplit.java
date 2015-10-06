import java.util.*;

public class HitStandSplit
{

    static List<Integer> deck = Dealer.createAndShuffleDeck();
    
    public static String choice(Gamestate gamestate)
    {
        //This scanner is used for the user input for hit stand or split
        Scanner inputchoice = new Scanner(System.in);
        System.out.println("Cuh, whatchu want? Hit me up with yo choice of hit, stand, or quit?");
        //This part is for taking the next input and will make it a string
        String hchoice = inputchoice.nextLine();
        //This is an else if tree where it decides what the user has inputed and performs the correct tasks
        if(hchoice.equals("hit"))
        {
            System.out.println("Like your chances pretty boy? 'ight, I got chu.");
            playerHit(gamestate);
            System.out.println("You draw a " + deck.get(0));
            deck.remove(0);
        }
        else if(hchoice.equals("quit"))
        {
                System.exit(0);
        } 
        else if(hchoice.equals("stand")) 
        {
            System.out.println("What a wuss. I be takin yo' money tonight.");
            stand();
        }
        /*else if(hchoice.equals("split")) 
        {
            System.out.println("Better off 2 fo' 1.");
        }*/
        else if(hchoice.equals("You know what cuh, F dis"))
        {
            System.out.println("I am very sorry for your poor experience here at BalLErZ Cuhsino\n"+
                                "the staff wishes that your next visit will be more\n"+
                                "..................................................\n"+
                                "..................................................\n"+
                                "..................................................\n");
            try
            {
                Thread.sleep(5000);
            }catch (InterruptedException e)
            {

            }
                System.out.println("ACEceptable!!!!!!!!!!!!!!\n"+
                                    "Jus' kiddin' screw you bruh");
                System.exit(0);
            } 
            else
            {
                System.out.println("Homie, we ain't playin' no games up in here.\n" +
                "Get outta here or hit me up once mo");
            }
        return hchoice;
    }

    public static List<Integer> playerHit(Gamestate gamestate)
    {
        List<Integer> playerHand = gamestate.getPlayerHand();
        playerHand.add(deck.get(0));

        return playerHand;
    }

    public static List<Integer> dealerHit(Gamestate gamestate)
    {
        List<Integer> dealerHand = gamestate.getDealerHand();
        dealerHand.add(deck.get(0));
        System.out.println("Dealer draws a " + deck.get(0));

        return dealerHand;
    }

    public static boolean stand()
    {
        boolean pStand = true;
        return pStand;
    }
    /*public static int split()
    {
    }*/
}