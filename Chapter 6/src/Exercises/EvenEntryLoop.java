package Exercises;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numChoice = 0;
		Scanner input = new Scanner(System.in);
		do { System.out.println("Pick a number now! >>");
		    numChoice = input.nextInt();
		if (numChoice % 2 == 0) {
			System.out.println("GoodJob!");	
		}
		else 
			System.out.println(" error 404");
		
			
		} while (numChoice != 999);
		
	}

}
