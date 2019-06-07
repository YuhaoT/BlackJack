/**
 * 
 */
package edu.wit.dcsn.comp2000.listapp;

import java.util.ArrayList;

/**
 * @author 
 *
 *
 */
public class Pile
{
	private ArrayList<Card> cards;
	
	public Pile()
	{
		cards = new ArrayList<>();
	}
	/**
	 * 
	 */
	public void add(Card aCard)
	{
		cards.add(aCard);
	}
	
	public boolean remove(Card aCard)
	{
		return cards.remove(aCard);
	}
	
	public void set(int index, Card aCard)
	{
		cards.set(index, aCard);
	}
	
	public Card get(int index)
	{
		return cards.get(index);
	}
	
	public int size()
	{
		return cards.size();
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		
	}

}
