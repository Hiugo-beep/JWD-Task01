package by.mk.mvnex.JWD_task_01.task07;

import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class NearestPointToOriginTest  {
	private Point A;
	private Point B;
	private int expected;
	@Parameters
	public static Collection<Object[]> powValues(){
		
		return Arrays.asList(new Object[][]{
			{new Point (5,7),new Point (-2,7), -1},
			{new Point (3,-2),new Point (17,7), 1},
			{new Point (3,5.5),new Point(3,5.5),0}
		});
	}
	public NearestPointToOriginTest(Point A,Point B , int expected) {
		this.A = A;
		this.B = B;
		this.expected = expected;
	}
	@Test
	public void NearestPointToOriginTest01(){
		int actual;
		NearestPointToOrigin obj = new NearestPointToOrigin();
		actual = obj.checkAIsNearesPoint(A,B);
		Assert.assertEquals(expected, actual);
	}
}
