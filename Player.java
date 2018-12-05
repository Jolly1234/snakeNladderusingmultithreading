package com.test.zolostays.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** Assumptions
 * 1) Both the players are at position 1 of ludoboard.
 * 2) Enter the pitfalls.
 * 
 * @author JOLLY
 *
 */
public class Player extends Thread{
	int prevpos =1 ;
    int currentpos = 1;
    static LadderAndSnakePosition inputl = new LadderAndSnakePosition();
    static List<ArrayList<Integer>> inputs= inputl.snakeLadderPosition();
     
	public void run() {
 		try {
 			startGame();
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
   }
   
	/**
	 * starting the game , rolling the dice which will generate random numbers between 1-6.
	 * @throws InterruptedException
	 */
	public void startGame() throws InterruptedException
  	{
	  
  	  Random dice = new Random();
  	  while(currentpos != 100)
  	  {
  		int diceValue = dice.nextInt(6)+1;
  		currentpos = currentpos + diceValue;
  		
  		//JAVA 8 FOR EACH METHOD LAMBA EXPRESSIONS
  		
  		List<Integer> inputl = new ArrayList<Integer>();
  		  inputl.forEach(inputs-> {
  			     List<Integer> input = new ArrayList<Integer>();
  				 if(!input.isEmpty())
  	              {
  	                  for(int i=1,j=1; i < input.size(); i++)
  	                  {
  	                      if (currentpos == input.get(j)) {
  	              			currentpos = input.get(j-1);
  	              		} else if (currentpos == input.get(j+1)) {
  	              			currentpos = input.get(j+2);
  	              		}
  	                  }
  	              }
  				  });
  		
  		if(currentpos > 100)
  		{
  			currentpos = currentpos-diceValue;
  		}
  		
  		System.out.println(Thread.currentThread().getName()+ "     "+ diceValue + "        " + prevpos + "            " + currentpos);

  		prevpos = currentpos;
  		if(currentpos == 100)
  		{
  			System.out.println(Thread.currentThread().getName() + "WINS");
  		    System.exit(0);
  		}
  		else
  		{
  		Thread.sleep(500);
  		}
  	}
  	}
}
