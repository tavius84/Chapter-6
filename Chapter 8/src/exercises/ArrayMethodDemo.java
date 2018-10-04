package exercises;

import java.util.Scanner;

public class ArrayMethodDemo {

	public static void main(String[] args)
	   {
	      int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	      int ceilingValue;
	      
	      display(numbers);
	      System.out.println();
	      reverse(numbers);
	      System.out.println();
	      sum(numbers);
	      System.out.println();
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a ceiling value >> ");
	      ceilingValue = input.nextInt();
	      System.out.println();
	      greaterThanAverage(numbers);
	   }
	   
	   public static void display(int[] arr)
	   {
	      int i;
	      System.out.print("The numbers in the array are >> ");
	      for(i = 0; i < arr.length; ++i)
	         System.out.print(" " + arr[i]);
	   }
	   
	   public static void reverse(int[] arr)
	   {
	      int i;
	      System.out.print("The numbers in the array in reverse order are >>");
	      for(i = 9; i >= 0; --i)
	         System.out.print(" " + arr[i]);
	   }
	   
	   public static void sum(int[] arr)
	   {
	      int i;
	      int sum = 0;
	      System.out.print("The total sum of the numbers in the array is >> ");
	      for(i = 0; i < arr.length; ++i)
	         sum = sum + arr[i];
	      System.out.print(sum);
	   }
	   
	   
	   public static void greaterThanAverage(int[] arr)
	   {
	      int i, sum = 0;
	      double avg;
	      for(i = 0; i < arr.length; ++i)
	        sum = sum + arr[i];
	      avg = sum / 10;
	      System.out.println("The average of the numbers in the array is >> " + avg);
	      System.out.print("All numbers in the array that are greather than the average of the numbers is >> ");
	      for(i = 0; i < arr.length; ++i)
	      {
	         if(arr[i] > avg)
	            System.out.print(" " + arr[i]);
	      }

}
}
