package by.mk.mvnex.JWD_task_01.task09;


import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class ParametrsOfCircleAreaTest  {
	private double expected;
	private double r;
	@Parameters
	public static Collection<Object[]> powValues(){
		
		return Arrays.asList(new Object[][]{
			{3, 28.274333},
			{-1, 0}
		});
	}
	public ParametrsOfCircleAreaTest(double r , double expected) {
		this.r = r;
		this.expected = expected;
	}
	@Test
	public void ParametrsOfCircleAreaTest01(){
		double actual;
		ParametersOfCircle obj = new ParametersOfCircle();
		actual = obj.getAreaOfCircle(r);
		Assert.assertEquals(expected, actual, 10e-6);
	}
}
