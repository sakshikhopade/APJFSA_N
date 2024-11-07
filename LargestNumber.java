package core_java;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 10;
		int num3 = 15;

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("The largest number is: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("The largest number is: " + num2);
		} else {
			System.out.println("The largest number is: " + num3);
		}


	}

}
 
//OUTPUT 
// The largest number is: 15