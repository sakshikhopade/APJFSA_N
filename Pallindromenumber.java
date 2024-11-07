package core_java;

public class Pallindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare Parameters 
		int N =2332;
		int rev = 0;  
		int temp = N;

		while(N!=0) {
			int rem = N%10;       //LOGIC FOR PALLINDROME NUMBER
			rev = rev*10+rem;
			N = N/10;
		}

		if(temp == rev) {
			System.out.println("Given No is a Pallindrome Number");
		}
		else
			System.out.println("Given No is not a Pallindrome Number");	

	}

}

//OUTPUT 
//Given No is a Pallindrome Number
