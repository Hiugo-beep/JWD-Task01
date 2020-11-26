package by.mk.mvnex.JWD_task_01.task02;

import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class NumberOfDaysInMonthTest {
	private int year;
	private int monthNumber;
	private int expected;
	@Parameters
	public static Collection<Object[]> powValues(){
		return Arrays.asList(new Object[][]{
			{1940, 2, 29},
			{1900, 2, 28},
			{2049, 11, 30},
			{2049, -5, 0}
		});
	}
	public NumberOfDaysInMonthTest(int year, int monthNumber,int expected ) {
		this.year = year;
		this.monthNumber = monthNumber;
		this.expected = expected;
	}
	@Test
	public void numberOfDaysInMonthTest01(){
		int actual;
		NumberOfDaysInMonth obj = new NumberOfDaysInMonth();
		actual = obj.getNumberOfDaysInMonth(year, monthNumber);
		Assert.assertEquals(expected, actual);			
	}
}