package com.test.zolostays.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Inputs for snake head,snake bottom,ladder head and ladder bottom
 * @author JOLLY
 *
 */
public class LadderAndSnakePosition {

	static Scanner sc = new Scanner(System.in);
	static List<Integer> position = new ArrayList<Integer>();
	static List<ArrayList<Integer>> inputs = new ArrayList<ArrayList<Integer>>();
   
   static public List<ArrayList<Integer>> snakeLadderPosition() {
	   
	   int n = sc.nextInt();

	   for(int k=0;k<n;k++)
	   {
	   for(int i =0 ;i<4;i++)
	   {
		   position.add(sc.nextInt());
		   
	   }
	   }
	   inputs.add(new ArrayList<Integer>(position));
	   return inputs;
   }
}
