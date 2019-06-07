/**
 * 
 */
package edu.wit.dcsn.comp2000.listapp;


/**
 * @author 
 *
 */
public class Player
	{
	public int id;
	public boolean isDealer;
	private Hand aHand;
	public int handSize;
	
	/**
	 * 
	 */
	public Player()
		{
		id++;
		this.isDealer = false;
		this.aHand = new Hand();
		this.handSize = 0;
		}
	
	public Player(boolean aDealer) {
		id++;
		this.isDealer = aDealer;
		this.aHand = new Hand();
		this.handSize = 0;
	}
	
	public String getDisplayName()
	{
		if (isDealer == true)
		{
			return "Dealer";
		}
		else {
			return "Player";
		}
	}
	public void addToHand(Card aCard)
	{
		this.aHand.add(aCard);
	}
	
	public int handSize()
	{
		return aHand.size();
	}
	
	public int getHandValue()
	{
		return aHand.totalValue();
	}
	
	public String displayHand()
	{
		String returnString = "";

		for (int i = 0; i < aHand.size(); i++)
		{
			returnString = returnString + "\t" + aHand.get(i).toString() + "\n";
		}

		System.out.println("Total Value:" + aHand.totalValue() + "\n");

		return returnString;
	}
	/**
	 * return true if the total value of hand is equal to 21
	 */
	public boolean hit() {
		return aHand.totalValue() < 16;
	}

	/**
	 * return true if the total value of hand is greater than 21
	 * @return
	 */
	public boolean bust() {
		return aHand.totalValue() > 21;
	}
	/**
	 * return true if the total value of hand equals 21
	 * @return
	 */
	public boolean stand() {
		if (isDealer)
			return aHand.totalValue() >= 17 && aHand.totalValue() <= 21;
		else {
			return aHand.totalValue() >= 16 && aHand.totalValue() <= 21;	
		}
	}

	/**
	 * return player's decision: hit, stand or Bust
	 * @return
	 */
	public String decision() {
		String returnStr = null;
		if(hit()) 
			returnStr = "Hit";
		else if(stand())
			returnStr = "Stand";
		else 
			returnStr = "Bust";
		return returnStr;
	}
	
	public int compareTo (Hand hand) {
		int returnInt;
		if(this.aHand.totalValue() - hand.totalValue() > 0) {
			returnInt = 1;
		}else if (this.aHand.totalValue() - hand.totalValue() == 0)
			returnInt = 0;
		else
			returnInt = -1;
		return returnInt;
	}
	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}

	}