package by.mk.mvnex.JWD_task_01.task01;


public class LastDigitOfSquare {
	public int getLastDigitOfSquare(int number) {
		int lastDigit = getLastDigit(number);
		int numberSquare = getSquare(lastDigit);
		int lastDigitOfSquare = getLastDigit(numberSquare);
		return lastDigitOfSquare;
	}	
	private int getLastDigit(int num) {
		return num%10;
	}
	private int getSquare(int num) {
		return num*num;
	}
}
