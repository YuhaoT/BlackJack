/**
 * 
 */
package edu.wit.dcsn.comp2000.listapp;


/**
 * @author 
 *
 */
public class Deck extends Pile
{
	/**
	 * 
	 */
	public Deck()
	{
		for (Rank aRank : Rank.values())
		{
			for (Suit aSuit : Suit.values())
			{
				super.add(new Card(aSuit, aRank));
			}
		}

		shuffle();
	}

	private void shuffle()
	{
		for ( int i = super.size()-1; i > 0; i-- ) {
			int rand = (int)(Math.random()*(i+1));
			Card temp = super.get(i);
			super.set(i, super.get(rand));
			super.set(rand, temp);
		}
	}

	public Card drawCard()
	{
		Card returnCard = super.get(0);
		super.remove(returnCard);
		
		return returnCard;		
	}

	public String toString()
	{
		String formattedString = "Total Cards: " + super.size() + "\n";
		for (int i = 0; i < super.size(); i++)
		{
			formattedString = formattedString + super.get(i).toString() + "\n";
		}
		return formattedString;
	}


	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
	}

}
