/**
 * Comp 2000-01 Data Structure  
 * Group Project -- List 03 
 * Yuhao He
 */
package edu.wit.dcsn.comp2000.listapp;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 
 *
 */
public class Card implements Comparable<Card>
{
	public final Rank rank;
	public final Suit suit;


	/**
	 * 
	 */
	public Card(Suit aSuit, Rank aRank )
	{
		rank = aRank;
		suit = aSuit;
	}

	public String toString() {
		return this.suit.getDisplayName() + " " +this.rank.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/**
	 * compare two cards. 
	 * return 1 if this card has a higher Rank or Suit
	 * return -1 if its Rank or Suit less than aCard
	 * return 0 if they share the same Rank and Suit
	 */
	@Override
	public int compareTo( Card aCard )
	{
		int value = 0;
		if(this.rank.getPoints() > aCard.rank.getPoints())
			value = 1;
		else if(this.rank.getPoints() < aCard.rank.getPoints())
			value = -1;
		else if(this.suit.compareTo(aCard.suit) == 1)
			value = 1;
		else if(this.suit.compareTo(aCard.suit) == -1)
			value = -1;
		else 
			value = 0;
		return value;
	}


	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		for (Suit aSuit : Suit.values()) {
			for(Rank aRank : Rank.values()) {
				Card aCard = new Card(aSuit, aRank);
				cards.add(aCard);
			} // end Rank
		} // end Suit

		Random rand = new Random();
		Card card1 = cards.get(rand.nextInt(52));
		Card card2 = cards.get(rand.nextInt(52));

		System.out.printf("%s compares to %s is %d%n", card1.toString(), card2.toString(), card1.compareTo(card2));



	}

}
