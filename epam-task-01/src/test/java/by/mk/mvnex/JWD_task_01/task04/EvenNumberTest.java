package by.mk.mvnex.JWD_task_01.task04;

import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class EvenNumberTest {
	private int[] numbers;
	boolean expected;
	@Parameters
	public static Collection<Object[]> powValues(){
		int[] numbers1 = {1,3,9,8} ;
		int[] numbers2 = {1,2,4,3} ;
		return Arrays.asList(new Object[][]{
			{numbers1, false},
			{numbers2,true}
		});
	}
	public EvenNumberTest(int[] numbers , boolean expected) {
		this.numbers = numbers;
		this.expected = expected;
	}
	@Test
	public void EvenNumberTest01(){
		boolean actual;
		EvenNumber obj = new EvenNumber();
		actual = obj.writeIsHalfOfTheNumbersEven(numbers);
		Assert.assertEquals(expected, actual);			
	}
}