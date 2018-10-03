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
		do {	
		System.out.println("numbers in order " + arrayNums[i]);
        System.out.println("Print numbers last to first");
			
		
        System.out.println("to quit press 999!" );
		quit = input.nextInt();
		total = total + arrayNums[i];
		i = i + i;
	}while(quit!= 999);
	 System.out.println("Total >> " + total);
	}

}
