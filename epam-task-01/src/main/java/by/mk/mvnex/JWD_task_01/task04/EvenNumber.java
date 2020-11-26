package by.mk.mvnex.JWD_task_01.task04;

public class EvenNumber {
	public boolean writeIsHalfOfTheNumbersEven (int[] numbers ){
		boolean isEvenNumberOfTwoOrMore;
		int counter = getNumberEven(numbers );
		isEvenNumberOfTwoOrMore = counter > 1;
		System.out.println(isEvenNumberOfTwoOrMore );
		return isEvenNumberOfTwoOrMore;
	}
	
	private int getNumberEven(int[] numbers ) {
		int counter = 0;
		for(int i = 0; i < 4; i++ ) {
			boolean isEven = numbers[i]%2 == 0;
			if(isEven ) {
				counter ++;
			}
			if(counter > 1 ) break;
		}
		return counter;
	}
}
