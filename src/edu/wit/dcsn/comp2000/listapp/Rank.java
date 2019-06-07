/*
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: List App
 * Summer, 2018
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course). Further, you
 * may not post or otherwise share this code with anyone other than current
 * students in my sections of this course. Violation of these usage restrictions
 * will be considered a violation of the Wentworth Institute of Technology
 * Academic Honesty Policy.
 */

/**
 * An enumeration of card ranks.
 * 
 * @author David M Rosenberg - Tu 3/16/2016
 */
package edu.wit.dcsn.comp2000.listapp;

public enum Rank
    {
//  Element     Display Name    Graphic     Points      Alt Points  Priority    Alt Priority
    ACE     (   "Ace",          "A",        1,          11,         1,          14 ),
    TWO     (   "Duece",        "2",        2,          2,          2,          2 ),
    THREE   (   "Three",        "3",        3,          3,          3,          3 ),
    FOUR    (   "Four",         "4",        4,          4,          4,          4 ),
    FIVE    (   "Five",         "5",        5,          5,          5,          5 ),
    SIX     (   "Six",          "6",        6,          6,          6,          6 ),
    SEVEN   (   "Seven",        "7",        7,          7,          7,          7 ),
    EIGHT   (   "Eight",        "8",        8,          8,          8,          8 ),
    NINE    (   "Nine",         "9",        9,          9,          9,          9 ),
    TEN     (   "Ten",          "10",       10,         10,         10,         10 ),
    JACK    (   "Jack",         "J",        10,         10,         10,         10 ),
    QUEEN   (   "Queen",        "Q",        10,         10,         10,         10 ),
    KING    (   "King",         "K",        10,         10,         10,         10 )
    ;

    private final String displayName;
    private final String graphic;
    private final int points;
    private final int altPoints;
    private final int priority;
    private final int altPriority;
    

    /**
     * 
     * @param rankDisplayName
     * @param rankGraphic
     * @param rankPoints
     * @param rankAltPoints
     * @param rankPriority
     * @param rankAltPriority
     */
    private Rank( String rankDisplayName, 
                  String rankGraphic, 
                  int rankPoints, 
                  int rankAltPoints, 
                  int rankPriority, 
                  int rankAltPriority )
        {
        displayName =   rankDisplayName;
        graphic =       rankGraphic;
        points =        rankPoints;
        altPoints =     rankAltPoints;
        priority =      rankPriority;
        altPriority =   rankAltPriority;
        } // end constructor

    
    /**
     * 
     * @return
     */
    public int getAltPoints()
        {
        return altPoints;
        } // end getAltPoints
    
    
    /**
     * 
     * @return
     */
    public int getAltPriority()
        {
        return altPriority;
        } // end getAltPriority
    
    
    /**
     * 
     * @return
     */
    public String getDisplayName()
        {
        return displayName;
        } // end getDisplayName
    
    
    /**
     * 
     * @return
     */
    public String getGraphic()
        {
        return graphic;
        } // end getGraphic
    
    
    /**
     * 
     * @return
     */
    public int getPoints()
        {
        return points;
        } // end getPoints
    
    
    /**
     * 
     * @return
     */
    public int getPriority()
        {
        return priority;
        } // end getPriority
    
    
    /**
     * 
     */
    @Override
    public String toString()
        {
        return graphic ;
        }
    
    
    /**
     * 
     * @param args
     */
    public static void main( String[] args )
        {
        // display column headers
        System.out.printf( "%-5s %-8s %-8s %-15s %-15s %-6s   %-10s   %-10s %-15s%n", 
                            "#",
                            "Rank",
                            "Graphic",
                            "Name",
                            "Display Name",
                            "Points",
                            "Alt Points",
                            "Priority",
                            "Alt Priority");
        
        // display each element of the enumeration
        for ( Rank aRank : Rank.values() )
            {
            System.out.printf( "%-5d %-8s %-8s %-15s %-15s %-6d   %-10d   %-10d %-15d%n", 
                                aRank.ordinal(),
                                aRank,
                                aRank.graphic,
                                aRank.name(),
                                aRank.displayName,
                                aRank.points,
                                aRank.altPoints,
                                aRank.priority,
                                aRank.altPriority );
            }
        }

    } // end Rank