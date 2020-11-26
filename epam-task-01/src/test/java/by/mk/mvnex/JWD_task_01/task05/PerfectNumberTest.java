package by.mk.mvnex.JWD_task_01.task05;

import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class PerfectNumberTest  {
	private int number;
	boolean expected;
	@Parameters
	public static Collection<Object[]> powValues(){
		return Arrays.asList(new Object[][]{
			{496, true},
			{497,false}
		});
	}
	public PerfectNumberTest(int number , boolean expected) {
		this.number = number;
		this.expected = expected;
	}
	@Test
	public void PerfectNumberTest01(){
		boolean actual;
		PerfectNumber obj = new PerfectNumber();
		actual = obj.writeIsPerfectNumber(number);
		Assert.assertEquals(expected, actual);			
	}
}