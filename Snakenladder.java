package com.test.zolostays.first;

/**
 * Starting the game 
 * Players are being treated as threads.
 * @author JOLLY
 *
 */
public class Snakenladder extends Thread  {
	
    public static void main(String argc[])
    {
    	LudoBoxndic gameBegins = new LudoBoxndic();
    
	    
	    Player p1 = new Player();
	    Player p2 = new Player();
    	System.out.println("USER" + "     " + "DICE NO."+ " " + "PREVIOUS STATE" + " " + "CURRENT STATE");
    	p1.start();
    	p1.setName("USER-1");
    	
    	p2.start();
    	p2.setName("USER-2");

    	
    	
    }
    
}
