package by.mk.mvnex.JWD_task_01.task05;

import java.util.ArrayList;

public class PerfectNumber {
	public boolean writeIsPerfectNumber (int number ) {
		boolean isPerfectNumber;
		boolean numberEqualToZero = number  == 0;
		boolean numberIsNegative = number <0;
		if(numberEqualToZero ) {
			return false;
		}
		if(numberIsNegative ) {		
		number = Math.abs(number );
		}
		ArrayList<Integer> divisors = getDivisorsOfNumber(number );
		int sum = getSumDivisors(divisors );
		isPerfectNumber = number == sum;
		System.out.println(isPerfectNumber );
		return isPerfectNumber;
	}

	private ArrayList<Integer> getDivisorsOfNumber(int number ) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		divisors.add(1 );
		int newDivisor = 1;
		while(newDivisor!= number/2 ) {
			newDivisor++;
			if(number%newDivisor == 0 ) { 
				divisors.add(newDivisor);
			}	
		}
		return divisors;
	}
	
	private int getSumDivisors(ArrayList<Integer> divisors ) {
		int sum = 0;
		for(int i =0;i< divisors.size();i++ ) {
			sum+=divisors.get(i );
		}
		return sum;
	}
}
/*
 * or 
 * public boolean writeIsPerfectNumber (int number ) {
 * 		boolean isPerfectNumber;
 * 		isPerfectNumber = number == 6 || number == 28 || number == 496
 * 		 		|| number == 8128 || number == 33550336;
 * 		System.out.println( isPerfectNumber);
 * 		return  isPerfectNumber;
 * }
 */

	
