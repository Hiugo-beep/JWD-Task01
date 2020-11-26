package by.mk.mvnex.JWD_task_01.task01;

import org.junit.Assert;
import org.junit.Test;


public class LastDigitOfSquareTest {
	@Test
	public void lastDigitPositiveTest01(){
		int number = 958;
		int actual;
		int expected = 4;
		LastDigitOfSquare obj = new LastDigitOfSquare();
		actual = obj.getLastDigitOfSquare(number );
		Assert.assertEquals(expected, actual );		
	}
}
