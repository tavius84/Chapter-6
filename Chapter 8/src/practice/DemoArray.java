package practice;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salaries = {6.15, 6.55, 10.25, 16.85 };		
		double total= 0;
		
		System.out.println("Salaries one by one are: ");
		//System.out.println(salaries[0]);
		//System.out.println(salaries[1]);
		//System.out.println(salaries[2]);
		//System.out.println(salaries[3]);
		for(int i = 0; i < salaries.length; i= i +1) {
			System.out.println(salaries[i]);
			total = total + salaries[i];
		}
		System.out.println("Total: " + total);
}
}