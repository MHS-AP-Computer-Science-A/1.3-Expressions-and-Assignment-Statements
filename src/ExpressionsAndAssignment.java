
public class ExpressionsAndAssignment {

	public static void main(String[] args) {
		//Java follows the order of operations
		int number = 6;
		int result = (3 + number) - 5 * 2;
		System.out.println("Demo order of operations: " + result);
		
		//Mod gives the remainder after division
		int result2 = number % 2;
		System.out.println("Demo 6 % 2: " + result);
		
		int grade1 = 90;
		int grade2 = 85;
		
		//Integer division
		double average = (grade1 + grade2) / 2;
		System.out.println("Average with integer division: " + average);
		
		//Precise division
		average = (grade1 + grade2) / 2.0;
		System.out.println("Average with precise division: " + average);
		
		//Compound assignment
		int x = 0;
		x++;   //x = x + 1
		x--;   //x = x - 1
		x+=5;  //x = x + 5
		x-=5;  //x = x - 5
		x*=5;  //x = x * 5
		x/=5;  //x = x / 5;
		

	}

}
