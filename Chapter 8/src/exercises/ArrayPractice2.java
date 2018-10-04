package exercises;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arrayNums = new double[20];
		Scanner input = new Scanner(System.in);
		int quit = 0;
		double total = 0;
		int i = 0;
		double average = 0;
		
		do {	
			
				System.out.println("Enter a number >> ");
				total = total + arrayNums[i];
				arrayNums[i] = input.nextDouble();
				average = (total/ arrayNums.length);
				System.out.println("Press 999 to quit.");
				quit = input.nextInt();

          
		
		
	}while(quit!= 999);
	System.out.println("Total >> " + total);	
		
	}

}
