package by.mk.mvnex.JWD_task_01.task09;


import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class ParametrsOfCircleCircumferenceTest  {
	private double expected;
	private double r;
	@Parameters
	public static Collection<Object[]> powValues(){
		
		return Arrays.asList(new Object[][]{
			{3, 18.849555},
			{-1, 0}
		});
	}
	public ParametrsOfCircleCircumferenceTest(double r , double expected) {
		this.r = r;
		this.expected = expected;
	}
	@Test
	public void ParametrsOfCircleCircumferenceTest01(){
		double actual;
		ParametersOfCircle obj = new ParametersOfCircle();
		actual = obj.getСircumference(r);
		Assert.assertEquals(expected, actual, 10e-6);
	}
}


