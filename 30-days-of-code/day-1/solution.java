
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        

        /* Declare second integer, double, and String variables. */
        int i2 = scan.nextInt();
        double sum1 = scan.nextDouble();
        scan.nextLine(); //This releases the bufferreader
    /*if not s2 will read what in buffer is allocated (I             think)*/
        String  s2= scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
        /* Print the sum of the double variables on a new line. */
		System.out.println(sum1+d);
       
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

         System.out.println(s.concat(s2)); 

       
        scan.close();
    }
}
