/**
 * 
 */
package edu.wit.dcsn.comp2000.listapp;


/**
 * @author 
 *
 */
public class Hand extends Pile
	{

	/**
	 * 
	 */
	public Hand()
		{
		super();
		}
	
	/**
	 * Calculate the total value of points 
	 * and altPoints of the cards respectively;
	 * return the total value of points if
	 * the total value of altPoints greater than 21
	 * @return
	 */
	public int totalValue() {
		int value = 0, altValue = 0;
		
		for(int i = 0; i < super.size(); i++) {
			value = super.get(i).rank.getPoints() + value;
			altValue = super.get(i).rank.getAltPoints() + altValue;
		}
		return (21 - altValue < 0)? value : altValue;
	}


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		Suit aSuit = Suit.CLUBS;
		
		Card card1 = new Card(aSuit, Rank.ACE);
		Card card2 = new Card(aSuit, Rank.EIGHT);
		Card card3 = new Card(aSuit, Rank.KING);
		
		Hand hand1= new Hand();
		Hand hand2 = new Hand();
		
		hand1.add(card1);;
		hand1.add(card2);
		
		System.out.printf("The totoal value of hand1 is %d%n", hand1.totalValue());
		
		hand2.add(card1);
		hand2.add(card3);
		System.out.printf("The totoal value of hand2 is %d%n", hand2.totalValue());
		
		
		

		}

	}