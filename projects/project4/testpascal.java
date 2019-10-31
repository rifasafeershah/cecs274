/**
 * The pascalstriangle.java program is used to recreate the pascal's triangle.
 * INPUTS: number of rows
 * OUTPUT: pascal's triangle
 */

import java.util.Scanner;

public class testpascal {
	private static Scanner scanner;

	public static void main(String[] args) {
	       scanner = new Scanner(System.in);
	       System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
	       int row = scanner.nextInt();
	       print(row);
	   }
   public static void print(int n) {
       for (int i = 0; i < n; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(pascal(i, j) + " ");
           }
           System.out.println();
       }
   }

   public static int pascal(int i, int j) {
       if (j == 0) {
           return 1;
       } else if (j == i) {
           return 1;
       } else {
           return pascal(i - 1, j - 1) + pascal(i - 1, j);
       }

   }
}
