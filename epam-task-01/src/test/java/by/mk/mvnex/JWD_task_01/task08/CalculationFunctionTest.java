package by.mk.mvnex.JWD_task_01.task08;


import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class )
public class CalculationFunctionTest  {
	private double expected;
	private double x;
	@Parameters
	public static Collection<Object[]> powValues(){
		
		return Arrays.asList(new Object[][]{
			{3, 9},
			{0, -0.166666},
			{1.8171205928321,0}
		});
	}
	public CalculationFunctionTest(double x , double expected) {
		this.x = x;
		this.expected = expected;
	}
	@Test
	public void CalculationFunctionTest01(){
		double actual;
		CalculationFunction obj = new CalculationFunction();
		actual = obj.calculationFunction(x);
		Assert.assertEquals(expected, actual, 10e-6);
	}
}
