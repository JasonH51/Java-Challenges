package Challenges;

public class OperatorChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numOne = 20d;
		double numTwo = 80d;
		
		double total = (numOne + numTwo) * 100d;
		
		boolean remainder = total == 0 ? true : false;
		
		if (!remainder) {
			System.out.println("Got some remainder here");
		} 
		System.out.println(remainder);
	}

}
