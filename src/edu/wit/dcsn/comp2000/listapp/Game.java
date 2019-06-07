package edu.wit.dcsn.comp2000.listapp;

public class Game {

	public static void main(String[] args) {
	
		Deck aDeck = new Deck();
		System.out.println("A shuffled deck has been created \n");
		
		
		Player player = new Player(false);
		Player dealer = new Player(true);
		
		dealer.addToHand(aDeck.drawCard());
		player.addToHand(aDeck.drawCard());
		
		dealer.addToHand(aDeck.drawCard());
		player.addToHand(aDeck.drawCard());
		
		System.out.println(dealer.getDisplayName() + " has " + dealer.handSize() + " card(s)");
		System.out.println(dealer.displayHand());
		
		System.out.println(player.getDisplayName() + " has " + player.handSize() + " card(s)");
		System.out.println(player.displayHand());
		
		if (player.decision() == "Hit")
		{
			do 
			{
				System.out.println(player.getDisplayName() + " has decided to " + player.decision() + "\n");
				
				player.addToHand(aDeck.drawCard());
				
				System.out.println(player.getDisplayName() + " has " + player.handSize() + " card(s)");
				System.out.println(player.displayHand());
				
			}while(player.decision() == "Hit");
		}
		
		System.out.println(player.getDisplayName() + " has decided to " + player.decision() + " with " + player.getHandValue() + " points\n");
		
		if (dealer.decision() == "Hit")
		{
			do 
			{
				System.out.println(dealer.getDisplayName() + " has decided to " + dealer.decision() + "\n");
				
				dealer.addToHand(aDeck.drawCard());
				
				System.out.println(dealer.getDisplayName() + " has " + dealer.handSize() + " card(s)");
				System.out.println(dealer.displayHand());
			}while(dealer.decision() == "Hit");
		}
		
		System.out.println(dealer.getDisplayName() + " has decided to " + dealer.decision() + " with " + dealer.getHandValue() + " points\n");
		
		if (dealer.getHandValue() == player.getHandValue())
		{
			System.out.println("Both the Dealer and Player have the same Hand Value so the result is a tie \n");
		}else if (dealer.decision() == "Stand" && player.decision() == "Stand")
		{
			if (dealer.getHandValue() > player.getHandValue())
			{
				System.out.println(dealer.getDisplayName() + " has won with " + dealer.getHandValue() + " points\n");
			}else if (dealer.getHandValue() < player.getHandValue())
			{
				System.out.println(player.getDisplayName() + " has won with " + player.getHandValue() + " points\n");
			}
		}else if (dealer.decision() == "Bust" && player.decision() == "Bust")
		{
			System.out.println("Both players have Busted, therefore the Dealer wins automatically." );
		}
		else if (dealer.decision() == "Bust" && player.decision() == "Stand")
		{
			System.out.println(player.getDisplayName() + " has won with " + player.getHandValue() + " points\n");
		}else if (player.decision() == "Bust" && dealer.decision() == "Stand")
		{
			System.out.println(dealer.getDisplayName() + " has won with " + dealer.getHandValue() + " points\n");
		}
		else {
			System.out.println(dealer.displayHand());
			System.out.println(player.displayHand());
		}
			
		
		
		
		
			
		
	}

}
