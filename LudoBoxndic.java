package com.test.zolostays.first;

/**
 * Initializing the ludoBox using default constructor
 * @author JOLLY
 *
 */
public class LudoBoxndic {

	static int[] ludoBox;
	
	public  LudoBoxndic()
	{
		ludoBox = new int[99];
	    
	    for(int i=1;i<ludoBox.length;i++)
	    {
	    	ludoBox[i] = i;
	    }
	}
	

}
