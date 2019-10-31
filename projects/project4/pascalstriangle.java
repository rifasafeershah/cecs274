/**
 * The pascalstriangle.java program is used to recreate the pascal's triangle.
 * Recursion Project
 * INPUTS: number of rows
 * OUTPUT: pascal's triangle
 */

import java.util.Scanner;

public class pascalstriangle {
	
	//prints out the amount of rows user answered
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
	    int rows = input.nextInt();
	    if (rows == 0) {
	    	System.out.print("0");
	    }
	    else {
	    	 print(rows);
	    }
	    input.close();
	    }
	
	//the numbers in the middle of the pascal's triangle
	public static void print(int n) {
       for (int i = 0; i < n; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(pascal(i, j) + " ");
           }
           System.out.println();
           }
       }
	
	//the first and the last number
	public static int pascal(int i, int j) {
       if (j == 0) {
    	   return 1;
    	   }
       else if (j == i) {
           return 1;
           }
       else {
           return pascal(i - 1, j - 1) + pascal(i - 1, j);
           }
       }
}
