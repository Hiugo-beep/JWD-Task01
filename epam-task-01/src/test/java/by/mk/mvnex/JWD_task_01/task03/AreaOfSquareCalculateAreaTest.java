package by.mk.mvnex.JWD_task_01.task03;

import org.junit.*;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class )
public class AreaOfSquareCalculateAreaTest {
	private double areaS1;
	private double expected;
	@Parameters
	public static Collection<Object[]> powValues(){
		return Arrays.asList(new Object[][]{
			{72, 9},
			{9.3, 1.1625},
			{-9, 0}
		});
	}
	public AreaOfSquareCalculateAreaTest(double areaS1,double expected ) {
		this.areaS1 = areaS1;
		this.expected = expected;
	}
	@Test
	public void AreaOfSquareTest01(){
		double actual;
		AreaOfSquare obj = new AreaOfSquare();
		actual = obj.getAreaSquare(areaS1);	
		Assert.assertEquals(actual, expected, 1e-6);
	}
} 